package drg.dtt.vn.controller;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import drg.dtt.vn.action.SendToGatewayAction;
import drg.dtt.vn.data.DataTask;
import drg.dtt.vn.keys.ResponseKeys;
import drg.dtt.vn.keys.ThongTinGuiHoSoKey;
import drg.dtt.vn.model.nghiepvu.JsonDataModel;
import drg.dtt.vn.model.nghiepvu.Result;
import drg.dtt.vn.model.nghiepvu.ThongTinCoSo;
import drg.dtt.vn.model.report.DataConfigModel;
import drg.dtt.vn.model.report.Report;
import drg.dtt.vn.model.report.ThongTinGuiHoSo;
import drg.dtt.vn.model.report.TongHopChiTiet;
import drg.dtt.vn.model.report.TongHopThongKe;
import drg.dtt.vn.repository.report.ThongTinGuiHoSoRepository;
import drg.dtt.vn.repository.report.TongHopThongKeRepository;
import drg.dtt.vn.services.ChiTietThuocService;
import drg.dtt.vn.services.ChiTietVatTuService;
import drg.dtt.vn.services.DataConfigService;
import drg.dtt.vn.services.ReportService;
import drg.dtt.vn.services.TongHopChiTietService;
import drg.dtt.vn.services.TongHopService;
import drg.dtt.vn.utils.Base64Utils;
import drg.dtt.vn.utils.DateUtil;
import drg.dtt.vn.utils.HashFunction;
import drg.dtt.vn.utils.VariableStatic;
import drg.dtt.vn.utils.XSDUtil;

@RequestMapping("api/4210")
@Controller
public class SyncController {

	private static final Logger log = LoggerFactory.getLogger(SyncController.class);
	private String secretCode = "d28c03e13b00406836067e4da582765d";


	@Autowired
	private ThongTinGuiHoSoRepository thongTinGuiHoSoRepository;
	
	@Autowired
	private TongHopThongKeRepository tongHopThongKeRepository;
	
	@Autowired
	private TongHopChiTietService tongHopChiTietService;
	
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private DataConfigService dataConfig;
	
	@Autowired
	private TongHopService tongHopService;
	
	@Autowired
	private ChiTietThuocService thuocService;
	
	@Autowired
	private ChiTietVatTuService vatTuService;
	

	@PostMapping(path = "/recive")
	public ResponseEntity<?> recive(
			@RequestParam(value = "activecode", required = true) String activecode,
			@RequestParam @Min(1) @Max(100) int soluong,
			@RequestParam(value = "jsonData", required = true) String jsonData,
			@RequestParam int loaihs,
			@RequestParam(value = "maCoSo") String maCoSo
			) {
		String code = "";
		String description = "";
		String encode = "";
		if(loaihs==1) {
			loaihs =-10;
		}else {
			loaihs =-15;
		}
		try {
			if (activecode != null && !activecode.isEmpty()) {
				if (VariableStatic.activeCode.containsKey(activecode)) {
					ThongTinGuiHoSo thongTinGuiHoSo = thongTinGuiHoSoRepository.getActivecode(activecode);
					if(thongTinGuiHoSo.getTrangthai() == ThongTinGuiHoSoKey.ACTIVE) {
						if(soluong > 0) {
							DataTask.insert(jsonData, maCoSo, tongHopService, vatTuService, thuocService, reportService);
							code = ResponseKeys.OK;
						}
					}else {
						code = ResponseKeys.USER_IS_NOTACTIVE;
						description = "Tai khoan chua duoc kich hoat";
					}
				} else {
					code = ResponseKeys.ACTIVE_CODE_NOT;
					description = "activeCode khong ton tai hoac bi khoa";
				}
			} else {
				code = ResponseKeys.ACTIVE_CODE_NULL;
				description = "activeCode null or empty";
			}
			log.info("code===:" + code+"   "+description);
		} catch (Exception e) {
			code = ResponseKeys.SYSTEM;
			description = "Loi he thong";
			log.error(e.getMessage());
		}
		try {
			Result result = new Result();
			result.setCode(code);
			result.setDescription(description);
			String resultStr = XSDUtil.parseToString(result, Result.class);
			encode = Base64Utils.encode(resultStr);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return ResponseEntity.ok(encode);
	}

	@PostMapping(path = "/register")
	public ResponseEntity<?> register(@RequestParam(value = "value", required = true) String value) {
		String encode = "";
		Result result = new Result();
		Gson gson = new Gson();
		try {
			ThongTinCoSo thongTinCoSo = gson.fromJson(Base64Utils.decode(value), ThongTinCoSo.class);
			String activecode = thongTinCoSo.getMa() + String.valueOf(UUID.randomUUID());
			MessageDigest digest = MessageDigest.getInstance("MD5");
			byte[] bytes = digest.digest(activecode.getBytes());
			StringBuilder hashActivecode = new StringBuilder();
			for (byte b : bytes) {
				hashActivecode.append(String.format("%02x", b));
			}

			VariableStatic.activeCode.put(hashActivecode.toString(), 0);
			double sleppTimeDefault = 5;
			ThongTinGuiHoSo thongTinGuiHoSo = new ThongTinGuiHoSo(thongTinCoSo.getMa(), thongTinCoSo.getTen(),
					thongTinCoSo.getNguoiLienHe(), thongTinCoSo.getEmail(), thongTinCoSo.getDienThoai(),
					hashActivecode.toString(), ThongTinGuiHoSoKey.NOT_ACTIVE, 0, sleppTimeDefault, thongTinCoSo.getGiamDocBV(),
					thongTinCoSo.getDiaChi(), thongTinCoSo.getTuyen()
					);
			thongTinGuiHoSoRepository.save(thongTinGuiHoSo);

			log.info("value===:" + value);
			result.setCode(ResponseKeys.OK);
			result.setDescription("success");
			result.setMsgId(hashActivecode.toString());
			String resultStr = XSDUtil.parseToString(result, Result.class);
			encode = Base64Utils.encode(resultStr);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return ResponseEntity.ok(encode);
	}

	@PostMapping(path = "/activeordeactive")
	public ResponseEntity<?> activeordeactive(@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
			@RequestParam(value = "activecode", required = true) String activecode,
			@RequestParam(value = "trangthai", required = true) String trangthai) {

		String code = "";
		String description = "";

		List<String> fileds = new ArrayList<String>();
		fileds.add(activecode);
		fileds.add(trangthai);
		HashFunction hashFunction = new HashFunction();
		String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
		if (!maXacThuc.equals(maXacThuchash)) {
			code = ResponseKeys.MAXACTHUC_NOT;
			description = "Ma xac thuc khong dung";
		} else {
			try {
				ThongTinGuiHoSo thongTinGuiHoSo = thongTinGuiHoSoRepository.getActivecode(activecode);
				if (thongTinGuiHoSo != null) {
					// kich hoat
					if (String.valueOf(ThongTinGuiHoSoKey.ACTIVE).equals(trangthai)) {
						thongTinGuiHoSo.setTrangthai(ThongTinGuiHoSoKey.ACTIVE);
						thongTinGuiHoSoRepository.save(thongTinGuiHoSo);
						VariableStatic.activeCode.put(thongTinGuiHoSo.getActivecode(), thongTinGuiHoSo.getTonggui());
						code = ResponseKeys.OK;
					} else if(String.valueOf(ThongTinGuiHoSoKey.IN_ACTIVE).equals(trangthai)){
						thongTinGuiHoSo.setTrangthai(ThongTinGuiHoSoKey.IN_ACTIVE);
						thongTinGuiHoSo.setTonggui(VariableStatic.activeCode.get(thongTinGuiHoSo.getActivecode()));
						thongTinGuiHoSoRepository.save(thongTinGuiHoSo);
						VariableStatic.activeCode.remove(thongTinGuiHoSo.getActivecode());
						code = ResponseKeys.OK;
					}
				} else {
					code = ResponseKeys.ACTIVE_CODE_NOT;
					description = "activeCode khong ton tai";
				}

			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
		String result = "{\"code\":\"" + code + "\",\"description\":\"" + description + "\"}";

		return ResponseEntity.ok(result);
	}

	@PostMapping(path = "/countdonvi")
	public ResponseEntity<Integer> countdonvi(@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
			@RequestParam(value = "ma", required = true) String ma,
			@RequestParam(value = "trangthai", required = true) int trangThai) {

		List<String> fileds = new ArrayList<String>();
		fileds.add(ma);
		fileds.add(trangThai + "");
		HashFunction hashFunction = new HashFunction();
		String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
		int count = 0;
		if (!maXacThuchash.equals(maXacThuc)) {
			new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
		} else {
			if (trangThai == -1) {
				count = thongTinGuiHoSoRepository.countAllByM_T_E_D_A_T(ma);
			} else {
				count = thongTinGuiHoSoRepository.countOneByM_T_E_D_A_T(ma, trangThai);
			}
		}
		return new ResponseEntity<Integer>(count, HttpStatus.OK);
	}

	@PostMapping(path = "/finddonvi")
	public @ResponseBody List<ThongTinGuiHoSo> finddonvi(
			@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
			@RequestParam(value = "ma", required = true) String ma,
			@RequestParam(value = "trangthai", required = true) int trangThai,
			@RequestParam(value = "limit", required = true) int limit,
			@RequestParam(value = "offset", required = true) int offset) {
		List<ThongTinGuiHoSo> thongTinGuiHoSos = new ArrayList<ThongTinGuiHoSo>();
		List<String> fileds = new ArrayList<String>();
		fileds.add(ma);
		fileds.add(trangThai + "");
		fileds.add(limit + "");
		fileds.add(offset + "");
		HashFunction hashFunction = new HashFunction();
		String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
		if (maXacThuchash.equals(maXacThuc)) {
			if (trangThai == -1) {
				thongTinGuiHoSos = thongTinGuiHoSoRepository.findAllByM_T_E_D_A_T(ma, offset, limit);
			} else {
				thongTinGuiHoSos = thongTinGuiHoSoRepository.findOneByM_T_E_D_A_T(ma, trangThai, offset, limit);
			}
		}
		return thongTinGuiHoSos;
	}

	@GetMapping(path = "/check")
	public ResponseEntity<?> check() {
		Result result = new Result();
		result.setCode(ResponseKeys.OK);
		result.setDescription("success");
		String resultStr = XSDUtil.parseToString(result, Result.class);
		String encode = "";
		try {
			encode = Base64Utils.encode(resultStr);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return ResponseEntity.ok(encode);
	}
	
	/// api report
	
	@PostMapping(path = "/countreport")
	public ResponseEntity<Integer> countreport(
			@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
			@RequestParam(value = "maCoSo", required = true) String maCoSo,
			@RequestParam(value = "maLk", required = true) String maLk,
			@RequestParam(value = "nam", required = true) int nam,
			@RequestParam(value = "thang", required = true) int thang,
			@RequestParam(value = "tuNgay", required = true) String tuNgay,
			@RequestParam(value = "denNgay", required = true) String denNgay
			
			) {

		List<String> fileds = new ArrayList<String>();
		fileds.add(maCoSo);
		HashFunction hashFunction = new HashFunction();
		String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
		int count = 0;
		if (!maXacThuchash.equals(maXacThuc)) {
			new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
		} else {
		}
		Date tuNgayD = DateUtil.parseStringToDate("9999-01-01", "yyyy-MM-dd");
		Date denNgayD = DateUtil.parseStringToDate("9999-01-01", "yyyy-MM-dd");
		if(StringUtils.isNotEmpty(tuNgay)) {
			tuNgayD = DateUtil.parseStringToDate(tuNgay, "yyyy-MM-dd");
		}
		if(StringUtils.isNotEmpty(denNgay)) {
			denNgayD = DateUtil.parseStringToDate(denNgay, "yyyy-MM-dd");
		}
		count =reportService.countAllByCS_LK_NAM_THANG(maCoSo, maLk, nam, thang, tuNgayD, denNgayD);
		return new ResponseEntity<Integer>(count, HttpStatus.OK);
	}

	@PostMapping(path = "/searchreport")
	public @ResponseBody List<Report> searchreport(
			@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
			@RequestParam(value = "maCoSo", required = true) String maCoSo,
			@RequestParam(value = "maLk", required = true) String maLk,
			@RequestParam(value = "nam", required = true) int nam,
			@RequestParam(value = "thang", required = true) int thang,
			@RequestParam(value = "tuNgay", required = true) String tuNgay,
			@RequestParam(value = "denNgay", required = true) String denNgay,
			@RequestParam(value = "limit", required = true) int limit,
			@RequestParam(value = "offset", required = true) int offset
			
			) {
		List<Report> listReport = new ArrayList<Report>();
		List<String> fileds = new ArrayList<String>();
		fileds.add(maCoSo);
		HashFunction hashFunction = new HashFunction();
		String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
		if (maXacThuchash.equals(maXacThuc)) {
		}
		
		Date tuNgayD = DateUtil.parseStringToDate("9999-01-01", "yyyy-MM-dd");
		Date denNgayD = DateUtil.parseStringToDate("9999-01-01", "yyyy-MM-dd");
		if(StringUtils.isNotEmpty(tuNgay)) {
			tuNgayD = DateUtil.parseStringToDate(tuNgay, "yyyy-MM-dd");
		}
		if(StringUtils.isNotEmpty(denNgay)) {
			denNgayD = DateUtil.parseStringToDate(denNgay, "yyyy-MM-dd");
		}
		listReport = reportService.getAllByCS_LK_NAM_THANG(maCoSo, maLk, nam, thang,tuNgayD, denNgayD, offset, limit);
		return listReport;
	}
	
	
	
	@PostMapping("/getConfig")
	 public ResponseEntity<?> getConfig( @RequestParam String ma){
		ThongTinGuiHoSo thongTin = thongTinGuiHoSoRepository.getValueByMa(ma);
		double value = 1;
		if(thongTin != null) {
			value = thongTin.getTime_sleep();
		}
		return ResponseEntity.ok(value);
	 }
	
	@PostMapping("/thongtincoso")
	 public @ResponseBody ResponseEntity<?> getThongTinCoSo( @RequestParam String ma){
		ThongTinGuiHoSo value = thongTinGuiHoSoRepository.getValueByMa(ma);
		String activecode = "";
		if(value != null) {
			activecode = value.getActivecode();
		}
		return ResponseEntity.ok(activecode);
	 }
	
	
	/// api report
	
		@PostMapping(path = "/countTongHop")
		public ResponseEntity<Integer> countTongHop(
				@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
				@RequestParam(value = "maCoSo", required = true) String maCoSo,
				@RequestParam(value = "nam", required = true) int nam,
				@RequestParam(value = "thang", required = true) int thang) {

			List<String> fileds = new ArrayList<String>();
			fileds.add(maCoSo);
			HashFunction hashFunction = new HashFunction();
			String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
			int count = 0;
			if (!maXacThuchash.equals(maXacThuc)) {
				new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
			} else {
			}
			count =tongHopThongKeRepository.countAllByCS_LK_NAM_THANG(maCoSo, nam, thang);
			return new ResponseEntity<Integer>(count, HttpStatus.OK);
		}

		@PostMapping(path = "/searchTongHop")
		public @ResponseBody List<TongHopThongKe> searchTongHop(
				@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
				@RequestParam(value = "maCoSo", required = true) String maCoSo,
				@RequestParam(value = "nam", required = true) int nam,
				@RequestParam(value = "thang", required = true) int thang,
				@RequestParam(value = "limit", required = true) int limit,
				@RequestParam(value = "offset", required = true) int offset
				
				) {
			List<TongHopThongKe> listReport = new ArrayList<TongHopThongKe>();
			List<String> fileds = new ArrayList<String>();
			fileds.add(maCoSo);
			HashFunction hashFunction = new HashFunction();
			String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
			if (maXacThuchash.equals(maXacThuc)) {
			}
			listReport = tongHopThongKeRepository.getAllByCS_LK_NAM_THANG(maCoSo, nam, thang, offset, limit);
			return listReport;
		}
		
		
		/// api report
		
		@PostMapping(path = "/countChiTietSync")
		public ResponseEntity<Integer> countChiTietSync(
				@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
				@RequestParam(value = "maCoSo", required = true) String maCoSo) {

			List<String> fileds = new ArrayList<String>();
			fileds.add(maCoSo);
			HashFunction hashFunction = new HashFunction();
			String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
			int count = 0;
			if (!maXacThuchash.equals(maXacThuc)) {
				new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
			} else {
			}
			count =reportService.countChiTietSync(maCoSo);
			return new ResponseEntity<Integer>(count, HttpStatus.OK);
		}

		@PostMapping(path = "/getChiTietSync")
		public @ResponseBody List<Report> getChiTietSync(
				@RequestParam(value = "maXacThuc", required = true) String maXacThuc,
				@RequestParam(value = "maCoSo", required = true) String maCoSo,
				@RequestParam(value = "limit", required = true) int limit
				
				) {
			List<Report> listReport = new ArrayList<Report>();
			List<String> fileds = new ArrayList<String>();
			fileds.add(maCoSo);
			HashFunction hashFunction = new HashFunction();
			String maXacThuchash = hashFunction.hashAllFields(fileds, secretCode);
			if (maXacThuchash.equals(maXacThuc)) {
			}
			listReport = reportService.getChiTietSync(maCoSo, limit);
			try {
				long minId = listReport.get(0).getId();
				long maxId= listReport.get(listReport.size() -1).getId();
				
				reportService.updateTrangThai(maCoSo, minId, maxId);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			return listReport;
		}
		
		@PostMapping("/getDataConfig")
		 public ResponseEntity<?> getDataConfig( @RequestParam String ma){
			List<DataConfigModel> listConfig = null;
			try {
				listConfig = dataConfig.getAll();
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			return ResponseEntity.ok(listConfig);
		 }
		
		
		
}

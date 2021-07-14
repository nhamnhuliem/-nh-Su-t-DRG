package drg.dashboard.portlet;

import drg.dashboard.business.DashboardBYTBusiness;
import drg.dashboard.constants.DrgDashboardPortletKeys;
import drg.dashboard.entity.ChiPhiHoatDongEntity;
import drg.dashboard.entity.DinhSuatChiTietEntity;
import drg.dashboard.entity.DinhSuatEntity;
import drg.dashboard.entity.DrgEntity;
import drg.dashboard.entity.TinhThanhData;
import drg.dashboard.util.DrgJsonUtils;
import drg.dashboard.util.LanguageUtil;
import drg.dashboard.util.LiferayOrganizationUtil;
import drg.moh.service.model.RpDashboardChiPhiBinhQuan;
import drg.moh.service.model.RpDashboardCphd;
import drg.moh.service.model.RpDashboardDRG;
import drg.moh.service.model.RpDashboardDinhSuatChiTiet;
import drg.moh.service.model.RpDashboardDstc;
import drg.moh.service.service.RpDashboardChiPhiBinhQuanLocalServiceUtil;
import drg.moh.service.service.RpDashboardCphdLocalServiceUtil;
import drg.moh.service.service.RpDashboardDRGLocalServiceUtil;
import drg.moh.service.service.RpDashboardDinhSuatChiTietLocalServiceUtil;
import drg.moh.service.service.RpDashboardDstcLocalServiceUtil;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.collections4.CollectionUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author DTT-NHANVIEN
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=DrgDashboard",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DrgDashboardPortletKeys.DRGDASHBOARD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DrgDashboardPortlet extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		String resourceID = resourceRequest.getResourceID();
		if ("getChartData".equals(resourceID)) {
			try {
				getChartData(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getChartChiPhiHDData".equals(resourceID)) {
			try {
				getChartChiPhiHDData(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getChartDinhSuat".equals(resourceID)) {
			try {
				getChartDinhSuat(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getDinhSuatChiTiet".equals(resourceID)) {
			try {
				getDinhSuatChiTiet(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getChartCMIData".equals(resourceID)) {
			try {
				getChartCMIData(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getDRGData".equals(resourceID)) {
			try {
				getDRGData(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getReportSoLuongBenhNhanDRG".equals(resourceID)) {
			try {
				getReportSoLuongBenhNhanDRG(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("getReportSoLuongBenhNhanDinhSuat".equals(resourceID)) {
			try {
				getReportSoLuongBenhNhanDinhSuat(resourceRequest, resourceResponse);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void getReportSoLuongBenhNhanDinhSuat(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		int getBy = ParamUtil.getInteger(resourceRequest, "getBy");
		
		String maDonVi = LiferayOrganizationUtil.getCustomField(orgId,
				"MA_DONVI");
		List<RpDashboardDstc> list = RpDashboardDstcLocalServiceUtil.getReportSoLuongBenhNhanDinhSuat(maDonVi, 1, getBy);
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		JSONArray soLuongThucTe = JSONFactoryUtil.createJSONArray();
		JSONArray soLuongQuyDinh = JSONFactoryUtil.createJSONArray();
		JSONArray labels = JSONFactoryUtil.createJSONArray();
		if(list != null && list.size() >0 ){
			for (RpDashboardDstc rp : list) {
				soLuongThucTe.put(rp.getSoLuot());
				soLuongQuyDinh.put(rp.getQuyDs());
				labels.put(rp.getTenTinh());
			}
			
			jsonObject.put("soLuongThucTe", soLuongThucTe);
			jsonObject.put("soLuongQuyDinh", soLuongQuyDinh);
			jsonObject.put("labels", labels);
		}
		
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(jsonObject.toString());
		
	}

	private void getReportSoLuongBenhNhanDRG(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		int getBy = ParamUtil.getInteger(resourceRequest, "getBy");
		
		String maDonVi = LiferayOrganizationUtil.getCustomField(orgId,
				"MA_DONVI");
		List<RpDashboardDstc> list = RpDashboardDstcLocalServiceUtil.getReportSoLuongBenhNhanDRG(maDonVi, 1, getBy);
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		JSONArray soLuongThucTe = JSONFactoryUtil.createJSONArray();
		JSONArray soLuongQuyDinh = JSONFactoryUtil.createJSONArray();
		JSONArray labels = JSONFactoryUtil.createJSONArray();
		if(list != null && list.size() >0 ){
			for (RpDashboardDstc rp : list) {
				soLuongThucTe.put(rp.getSoLuot());
				soLuongQuyDinh.put(rp.getQuyDs());
				labels.put(rp.getTenTinh());
			}
			
			jsonObject.put("soLuongThucTe", soLuongThucTe);
			jsonObject.put("soLuongQuyDinh", soLuongQuyDinh);
			jsonObject.put("labels", labels);
		}
		
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(jsonObject.toString());
		
	}

	private void getDRGData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		int nam = ParamUtil.getInteger(resourceRequest, "nam");
		int mucBaoCao = ParamUtil.getInteger(resourceRequest, "muc");
		double min = ParamUtil.getDouble(resourceRequest, "pMin");
		double max = ParamUtil.getDouble(resourceRequest, "pMax");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		// starting build REPORT
		// CHI PHI HOAT DONG
		String joDinhSuat = getReportDrg(orgId, mucBaoCao, nam,min, max);
		if (joDinhSuat != null) {
			dataObject.put("baoHiem", joDinhSuat);
		}

		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());

	}

	/***
	 * Lay bao cao chung
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @throws IOException
	 * @throws SystemException
	 */
	private void getChartData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		String maDonVi = ParamUtil.getString(resourceRequest, "maDonVi");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		// starting build REPORT
		// CHI PHI THANH PHAN
		JSONArray jaChiPhiThanhPhan = getReportChiPhiThanhPhan(maDonVi);
		if (jaChiPhiThanhPhan != null) {
			dataObject.put("chiPhiData", jaChiPhiThanhPhan);
		}

		// CHI PHI BINH QUAN
		JSONArray jaChiPhiBinhQuan = getChiPhiBinhQuan(maDonVi);
		if (jaChiPhiBinhQuan != null) {
			dataObject.put("chiPhiBinhQuan", jaChiPhiBinhQuan);
		}


		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());

	}

	/***
	 * Bao cao dinh suat co ban
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @throws IOException
	 * @throws SystemException
	 */
	private void getChartDinhSuat(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		int nam = ParamUtil.getInteger(resourceRequest, "nam");
		int mucBaoCao = ParamUtil.getInteger(resourceRequest, "muc");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		// starting build REPORT
		// CHI PHI HOAT DONG
		String joDinhSuat = getReportDinhSuat(orgId, mucBaoCao, nam);
		if (joDinhSuat != null) {
			dataObject.put("dinhSuat", joDinhSuat);
		}

		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());

	}

	/***
	 * Bao cao dinh suat co ban
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @throws IOException
	 * @throws SystemException
	 */
	private void getDinhSuatChiTiet(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		String maDv = ParamUtil.getString(resourceRequest, "maDv");
		int thang = ParamUtil.getInteger(resourceRequest, "thang");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		String joDinhSuat = getDinhSuatChiTiet(orgId, maDv, thang);
		if (joDinhSuat != null) {
			dataObject.put("dinhSuatChiTiet", joDinhSuat);
		}
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());

	}

	private void getChartChiPhiHDData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		int nam = ParamUtil.getInteger(resourceRequest, "nam");
		int mucBaoCao = ParamUtil.getInteger(resourceRequest, "muc");
		int type = ParamUtil.getInteger(resourceRequest, "type");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		// starting build REPORT
		// CHI PHI HOAT DONG
		String strChiPhiHoatDong = getReportChiPhiHoatDong(orgId, mucBaoCao,
				nam, type);
		if (strChiPhiHoatDong != null) {
			dataObject.put("chiPhiHoatDongObject", strChiPhiHoatDong);
		}

		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());
	}

	private void getChartCMIData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		new DashboardBYTBusiness().getChartCMIData(resourceRequest,
				resourceResponse);
	}

	/***
	 * Lay du lieu dinh suat
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getReportDinhSuat(long orgId, int mucBaoCao, int nam) {
		List<RpDashboardDstc> lstDinhSuat = null;
		try {
			int type = 0; // . 1: quyen tw | 0: quyen don vi
			String strOrgCode = LiferayOrganizationUtil.getCustomField(orgId,
					"MA_DONVI");
			lstDinhSuat = RpDashboardDstcLocalServiceUtil
					.getReportDinhSuatTieuChuan(strOrgCode, type);
			if (lstDinhSuat != null && lstDinhSuat.size() > 0) {

				DinhSuatEntity dsEntity = new DinhSuatEntity();
				double[] arrDinhSuatThucTe = new double[lstDinhSuat.size()];
				double[] arrDinhSuatTieuChuan = new double[lstDinhSuat.size()];
				int[] arrSoLuongBenhNhan = new int[lstDinhSuat.size()];
				int i = 0;
				for (RpDashboardDstc ds : lstDinhSuat) {
					arrDinhSuatThucTe[i] = ds.getChiPhi();
					arrDinhSuatTieuChuan[i] = ds.getQuyDs();
					arrSoLuongBenhNhan[i] = ds.getSoLuot();
					i++;

				}
				dsEntity.setDinhSuatThucTe(arrDinhSuatThucTe);
				dsEntity.setDinhSuatTieuChuan(arrDinhSuatTieuChuan);
				dsEntity.setSoLuongBenhNhan(arrSoLuongBenhNhan);
				return new Gson().toJson(dsEntity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/***
	 * Lay du lieu dinh suat chi tiet
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getDinhSuatChiTiet(long orgId, String maDv,
			int thang) {
		List<RpDashboardDinhSuatChiTiet> lstDinhSuat = null;
		try {
			int type = 0; // . 1: quyen tw | 0: quyen don vi
			String maDonVi = "";
			if(maDv != null && maDv.length() > 0){
				maDonVi = maDv;
			}else{
				maDonVi = LiferayOrganizationUtil.getCustomField(orgId,
						"MA_DONVI");
			}
			lstDinhSuat = RpDashboardDinhSuatChiTietLocalServiceUtil.getDinhSuatChiTiet(maDonVi, type, thang);
			if (lstDinhSuat != null && lstDinhSuat.size() > 0) {

				DinhSuatChiTietEntity dsEntity = new DinhSuatChiTietEntity();
				String[] labels = new String[lstDinhSuat.size()];
				long[] maDonVis = new long[lstDinhSuat.size()];
				double[] arrDinhSuat = new double[lstDinhSuat.size()];
				int i = 0;
				for (RpDashboardDinhSuatChiTiet ds : lstDinhSuat) {
					labels[i] = ds.getTenTinh();
					arrDinhSuat[i] = ds.getDinhSuat();
					maDonVis[i] = ds.getId();
					
					i++;

				}
				dsEntity.setMaDonVi(maDonVis);
				dsEntity.setLabels(labels);
				dsEntity.setDinhSuat(arrDinhSuat);
				return new Gson().toJson(dsEntity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/***
	 * Lay du lieu chi phi hoat dong
	 * 
	 * @param orgId
	 * @param mucBaoCao
	 * @param nam
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getReportChiPhiHoatDong(long orgId, int mucBaoCao,
			int nam, int typeOrder) {
		List<RpDashboardCphd> lstChiPhiHoatDong = null;
		JsonObject innerObject = new JsonObject();
		try {
			// type order
			String orderBy = "ORDER BY _chiphi DESC";
			if (typeOrder > 0) {
				switch (typeOrder) {
				case 1:
					orderBy = "ORDER BY _chiphi DESC";
					break;
				case 2:
					orderBy = "ORDER BY _dinhsuat DESC";
					break;
				case 3:
					orderBy = "ORDER BY _drg DESC";
					break;
				default:
					break;
				}
			}
			// 1. phi dich vu
			// 2. Dinh Suat
			// 3. DRG

			int type = 0; // . 1: quyen tw | 0: quyen don vi
			String strOrgCode = LiferayOrganizationUtil.getCustomField(orgId,
					"MA_DONVI");
			lstChiPhiHoatDong = RpDashboardCphdLocalServiceUtil
					.getReportChiPhiHoatDong(strOrgCode, type, orderBy);

			if (lstChiPhiHoatDong != null && lstChiPhiHoatDong.size() > 0) {
				ChiPhiHoatDongEntity chiPhiHoatDongEntity = new ChiPhiHoatDongEntity();
				TinhThanhData[] arrTinhThanh = new TinhThanhData[lstChiPhiHoatDong
						.size()];
				String[] arrTinhThanhId = new String[lstChiPhiHoatDong.size()]; // other
				String[] arrLabelTinhThanh = new String[lstChiPhiHoatDong
						.size()]; // label
				Double[] drgData = new Double[lstChiPhiHoatDong.size()]; // other
				Double[] dinhSuatData = new Double[lstChiPhiHoatDong.size()]; // other
				Double[] phiDichVuData = new Double[lstChiPhiHoatDong.size()]; // other
				int i = 0;
				for (RpDashboardCphd phihd : lstChiPhiHoatDong) {
					arrTinhThanh[i] = new TinhThanhData(phihd.getId(),
							phihd.getTenTinh());
					arrTinhThanhId[i] = String.valueOf(phihd.getId());
					arrLabelTinhThanh[i] = String.valueOf(phihd.getTenTinh());

					Double drgValue = phihd.getDrg();
					Double dinhSuatValue = phihd.getDinhSuat();
					Double phiDichVuValue = phihd.getChiPhi();
					drgData[i] = (drgValue == null ? 0 : drgValue * 100);
					dinhSuatData[i] = (dinhSuatValue == null ? 0
							: dinhSuatValue * 100);
					phiDichVuData[i] = (phiDichVuValue == null ? 0
							: phiDichVuValue * 100);
					i++;
				}

				// set data
				// object data
				JsonArray arrayLabels = new JsonArray();
				for (String retCol : arrLabelTinhThanh) {
					arrayLabels.add(new JsonPrimitive(retCol));
				}
				innerObject.add("labels", arrayLabels);

				JsonArray arrayTinhThanh = new JsonArray();
				for (TinhThanhData retCol : arrTinhThanh) {
					JsonObject objTinhThanh = new JsonObject();
					objTinhThanh.add("id", new JsonPrimitive(retCol.getId()));
					objTinhThanh.add("key", new JsonPrimitive(retCol.getKey()));
					arrayTinhThanh.add(objTinhThanh);
				}
				innerObject.add("tinhThanh", arrayTinhThanh);
				// TODO: da chay //
				if (typeOrder > 0) {
					switch (typeOrder) {
					case 1:
						// phi dich vu
						innerObject.add("phiDichVu", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "dichvu.label"),
										phiDichVuData, "#d9534f",
										arrTinhThanhId));
						// drg
						innerObject.add("drg", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "drg.label"), drgData,
										"#f0ad4e", arrTinhThanhId));
						// dinh suat
						innerObject
								.add("dinhSuat", DrgJsonUtils
										.buildDataChiPhiHoatDong(LanguageUtil
												.getValue("Language",
														"dinhsuat.label"),
												dinhSuatData, "#337ab7",
												arrTinhThanhId));
						break;
					case 2:
						// dinh suat
						innerObject
								.add("dinhSuat", DrgJsonUtils
										.buildDataChiPhiHoatDong(LanguageUtil
												.getValue("Language",
														"dinhsuat.label"),
												dinhSuatData, "#337ab7",
												arrTinhThanhId));
						// phi dich vu
						innerObject.add("phiDichVu", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "dichvu.label"),
										phiDichVuData, "#d9534f",
										arrTinhThanhId));
						// drg
						innerObject.add("drg", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "drg.label"), drgData,
										"#f0ad4e", arrTinhThanhId));
						break;
					case 3:
						// drg
						innerObject.add("drg", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "drg.label"), drgData,
										"#f0ad4e", arrTinhThanhId));
						// phi dich vu
						innerObject.add("phiDichVu", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "dichvu.label"),
										phiDichVuData, "#d9534f",
										arrTinhThanhId));
						// dinh suat
						innerObject
								.add("dinhSuat", DrgJsonUtils
										.buildDataChiPhiHoatDong(LanguageUtil
												.getValue("Language",
														"dinhsuat.label"),
												dinhSuatData, "#337ab7",
												arrTinhThanhId));
						break;
					default:
						// phi dich vu
						innerObject.add("phiDichVu", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "dichvu.label"),
										phiDichVuData, "#d9534f",
										arrTinhThanhId));
						// drg
						innerObject.add("drg", DrgJsonUtils
								.buildDataChiPhiHoatDong(LanguageUtil.getValue(
										"Language", "drg.label"), drgData,
										"#f0ad4e", arrTinhThanhId));
						// dinh suat
						innerObject
								.add("dinhSuat", DrgJsonUtils
										.buildDataChiPhiHoatDong(LanguageUtil
												.getValue("Language",
														"dinhsuat.label"),
												dinhSuatData, "#337ab7",
												arrTinhThanhId));
						break;
					}
				}

				// end
				return innerObject.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unused")
	private static JSONArray getReportChiPhiThanhPhan(String maDonVi) {
		try {
			List<RpDashboardCphd> list = RpDashboardCphdLocalServiceUtil.getChiPhiThanhPhan(maDonVi, 1);

			if (list != null && list.size() > 0) {
				JSONArray chiPhiArray = JSONFactoryUtil.createJSONArray();
				chiPhiArray.put(list.get(0).getChiPhi());
				chiPhiArray.put(list.get(0).getDinhSuat());
				chiPhiArray.put(list.get(0).getDrg());
				return chiPhiArray;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unused")
	private static JSONArray getChiPhiBinhQuan(String maDonVi) {
		try {
			List<RpDashboardChiPhiBinhQuan> listChiPhiBinhQuan = RpDashboardChiPhiBinhQuanLocalServiceUtil.getChiPhiBinhQuan(maDonVi, 1);

			if (listChiPhiBinhQuan != null && listChiPhiBinhQuan.size() > 0) {
				JSONArray chiPhiArray = JSONFactoryUtil.createJSONArray();
				chiPhiArray.put(listChiPhiBinhQuan.get(0).getChiPhi());
				chiPhiArray.put(listChiPhiBinhQuan.get(0).getBinhQuan());
				return chiPhiArray;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	/***
	 * Lay du lieu BAO HIEM DRG
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getReportDrg(long orgId, int mucBaoCao, int nam, double pMin, double pMax) {
		List<RpDashboardDRG> lstDrg = null;
		try {
			int type = 0; // . 1: quyen tw | 0: quyen don vi
			double min = pMin<=0 ? 0 : pMin;
			double max =  pMax<=0 ? 0 : pMax;
			String strOrgCode = LiferayOrganizationUtil.getCustomField(orgId,
					"MA_DONVI");
			List<String> listBaoHiemGoc = RpDashboardDRGLocalServiceUtil
					.getDRGItems(strOrgCode, min, max, type);
			if (CollectionUtils.isEmpty(listBaoHiemGoc)) {
				return null;
			}
			lstDrg = RpDashboardDRGLocalServiceUtil
					.getDRGData(strOrgCode, min, max, type);
			if (CollectionUtils.isNotEmpty(lstDrg)) {
				List<DrgEntity> lstDrgEntity = new ArrayList<DrgEntity>();
				
				for (String baoHiemGoc : listBaoHiemGoc) {
					if (baoHiemGoc == null || "".equals(baoHiemGoc)) {
						continue;
					}
					int index = 1;
					DrgEntity entity = new DrgEntity();
					entity.setLabel(baoHiemGoc);
					entity.setFill(false);
					entity.setPointRadius(5);
					entity.setPointHoverRadius(10);
					entity.setShowLine(false);
					 int red = new Random().nextInt(255);
					 int green = new Random().nextInt(255);
					 int blue = new Random().nextInt(255);
					 entity.setBorderColor("rgba(" + red + ", " + green
					 + ", "+blue+", 1)");
					 entity.setBackgroundColor("rgba(" + red + ", " + green
							 + ", "+blue+", 1)");
					Double[] dataPoints = new Double[12];
					Arrays.fill(dataPoints, null);
					for (RpDashboardDRG data : lstDrg) {
						if(index>12){
							break;
						}
						if (data.getDrg() == null || "".equals(data.getDrg())) {
							continue;
						}

						if (!baoHiemGoc.equalsIgnoreCase(data.getDrg())
								|| data.getThang() == null) {
							continue;
						}
						int thang = 0;
						try {
							thang = Integer.valueOf(data.getThang());
						} catch (Exception e) {
							e.printStackTrace();
							thang = 0;
						}

						if (thang <= 0) {
							continue;
						}

						if (data.getValue() > 0) {
							dataPoints[thang - 1] = data.getValue();
							index++;
						}
						
					}

					entity.setData(dataPoints);
					lstDrgEntity.add(entity);
				}
				return new Gson().toJson(lstDrgEntity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
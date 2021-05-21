package com.dtt.lgsp.app.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dtt.lgsp.entities.GIAMDINHHS;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO.DANHSACHHOSO.HOSO;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO.DANHSACHHOSO.HOSO.FILEHOSO;
import com.dtt.lgsp.entities.xml4210.DSACHCHITIETDVKT;
import com.dtt.lgsp.entities.xml4210.DSACHCHITIETDVKT.CHITIETDVKT;
import com.dtt.lgsp.entities.xml4210.DSACHCHITIETTHUOC;
import com.dtt.lgsp.entities.xml4210.DSACHCHITIETTHUOC.CHITIETTHUOC;
import com.dtt.lgsp.entities.xml4210.TONGHOP;
import com.dtt.lgsp.model.ChiTietThuoc;
import com.dtt.lgsp.model.ChiTietVatTu;
import com.dtt.lgsp.model.HoSo;
import com.dtt.lgsp.model.ThongKe;
import com.dtt.lgsp.model.TongHop;
import com.google.gson.Gson;



public class XML4210Parser {
	private static  Logger log = LoggerFactory.getLogger(XML4210Parser.class);
	
	public static HoSo getJsonData(String content){
		HoSo hoSo = null;
		GIAMDINHHS gd =  getGIAMDINHHS(content);
		if(gd != null) {
			if(gd.getTHONGTINHOSO() !=null 
					&& gd.getTHONGTINHOSO().getDANHSACHHOSO()!=null 
					&& gd.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO()!= null
					&& gd.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO().size()>0
					
					) {
				for (HOSO hs:gd.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO()) {
					if(hs.getFILEHOSO() != null 
							&& hs.getFILEHOSO().size()>0) {
						TongHop th = null;
						List<ChiTietThuoc> thuoc = null;
						List<ChiTietVatTu> vt = null;
						ThongKe thongKe = null;
						
						TONGHOP xml1 =null;
						DSACHCHITIETTHUOC xml2 = null;
						DSACHCHITIETDVKT xml3 = null;
						for (FILEHOSO f:hs.getFILEHOSO() ) {		
							try {
								if(xml1 == null) {
									xml1= getXML1(f);
									if(xml1 != null) {
										th = getTongHop(xml1);
										thongKe = getThongKe(xml1);
									}
								}
								if(xml2 == null && xml1 != null) {
									xml2= getXML2(f);
									if(xml2 != null) {
										thuoc = getThuoc(xml2);
									}
								}
								if(xml3 == null && xml1 != null) {
									xml3= getXML3(f);
									
									if(xml3 != null) {
										vt = getVatTu(xml3);
									}
								}
								
								
							}catch (Exception e) {
								log.error(e.getMessage());
							}
						}
						if(th != null && thongKe != null) {
							hoSo = new HoSo(th, thuoc, vt, thongKe);
						}
						
					}
				}
			}
		}
		return hoSo;
	}
	
	//
	
	private static ThongKe getThongKe(TONGHOP xml1) {
		return new ThongKe(xml1.getTHANGQT(), xml1.getNAMQT(), xml1.getMALK(), xml1.getTTONGCHI(), xml1.getTBHTT());
	}
	
	private static TongHop getTongHop(TONGHOP th) {
		TongHop tongHop = null;
		try {
			if(th != null) {
				tongHop = new TongHop(th.getMALK(), th.getSTT(), th.getMABN(), th.getHOTEN(), th.getNGAYSINH(), th.getGIOITINH(), th.getDIACHI(),
						th.getMATHE(), th.getMADKBD(), th.getGTTHETU(), th.getGTTHEDEN(), th.getMIENCUNGCT(), th.getTENBENH(), th.getMABENH(),
						th.getMABENHKHAC(), th.getMALYDOVVIEN(), th.getMANOICHUYEN(), th.getMATAINAN(), th.getNGAYVAO(), th.getNGAYRA(),
						th.getSONGAYDTRI(), th.getKETQUADTRI(), th.getTINHTRANGRV(), th.getNGAYTTOAN(), th.getTTHUOC(), th.getTVTYT(), th.getTTONGCHI(), 
						th.getTBNTT(), th.getTBNCCT(), th.getTBHTT(), th.getTNGUONKHAC(), th.getTNGOAIDS(), th.getNAMQT(), th.getTHANGQT(), th.getMALOAIKCB(), 
						th.getMAKHOA(), th.getMACSKCB(), th.getMAKHUVUC(), th.getMAPTTTQT(), th.getCANNANG(), new Date(), 1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tongHop;
	}
	
	private static List<ChiTietThuoc> getThuoc(DSACHCHITIETTHUOC xml2) {
		List<ChiTietThuoc> listChiTietThuoc = new ArrayList<ChiTietThuoc>();
		try {
			if(xml2!=null) {
				List<CHITIETTHUOC> lstChiTietThuoc = xml2.getCHITIETTHUOC();
				if(lstChiTietThuoc!=null && lstChiTietThuoc.size()>0) {
					for (CHITIETTHUOC chiTietThuoc : lstChiTietThuoc) {
						ChiTietThuoc chiTietThuocModel = new ChiTietThuoc(chiTietThuoc.getMALK(),
								chiTietThuoc.getSTT(), chiTietThuoc.getMATHUOC(),
								chiTietThuoc.getMANHOM(), chiTietThuoc.getTENTHUOC(),
								chiTietThuoc.getDONVITINH(), chiTietThuoc.getHAMLUONG(), chiTietThuoc.getDUONGDUNG(),
								chiTietThuoc.getLIEUDUNG(), chiTietThuoc.getSODANGKY(), chiTietThuoc.getTTTHAU(),
								chiTietThuoc.getPHAMVI(), chiTietThuoc.getTYLETT(), 
								chiTietThuoc.getSOLUONG(), chiTietThuoc.getDONGIA(), chiTietThuoc.getTHANHTIEN(),
								chiTietThuoc.getMUCHUONG(), chiTietThuoc.getTNGUONKHAC(),
								chiTietThuoc.getTBNTT(), chiTietThuoc.getTBHTT(), chiTietThuoc.getTBNCCT(),
								chiTietThuoc.getTNGOAIDS(), chiTietThuoc.getMAKHOA(), chiTietThuoc.getMABACSI(),
								chiTietThuoc.getMABENH(), chiTietThuoc.getNGAYYL(), chiTietThuoc.getMAPTTT(), 
								new Date(), 1, "");
						listChiTietThuoc.add(chiTietThuocModel);
					}
					
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return listChiTietThuoc;
	}
	
	private static List<ChiTietVatTu> getVatTu(DSACHCHITIETDVKT xml3) {
		List<ChiTietVatTu> listChiTietVatTu = new ArrayList<ChiTietVatTu>();
		try {
			if(xml3 !=null) {
				List<CHITIETDVKT> listVatTu = xml3.getCHITIETDVKT();
				if(listVatTu != null && listVatTu.size() > 0) {
					for (CHITIETDVKT vt : listVatTu) {
						ChiTietVatTu chiTietVt = new ChiTietVatTu(vt.getMALK(), vt.getSTT(), vt.getMADICHVU(), vt.getMAVATTU(), 
								vt.getMANHOM(), vt.getGOIVTYT(), vt.getTENVATTU(), vt.getTENDICHVU(), vt.getDONVITINH(), vt.getPHAMVI(), 
								vt.getSOLUONG(), vt.getDONGIA(), vt.getTTTHAU(), vt.getTYLETT(), vt.getTHANHTIEN(), vt.getTTRANTT(), vt.getMUCHUONG(),
								vt.getTNGUONKHAC(), vt.getTBNTT(), vt.getTBHTT(), vt.getTBNCCT(), vt.getTNGOAIDS(), vt.getMAKHOA(), vt.getMAGIUONG(), 
								vt.getMABACSI(), vt.getMABENH(), vt.getNGAYYL(), vt.getNGAYKQ(), vt.getMAPTTT(), new Date(), 1, "");
						listChiTietVatTu.add(chiTietVt);
					}
				}
			}
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		return listChiTietVatTu;
	}
	
	private static TONGHOP getXML1(FILEHOSO f) throws Exception {
		if( f!= null 
				&& f.getLOAIHOSO().trim().equalsIgnoreCase("XML1")
				&& f.getNOIDUNGFILE() != null 
				&& f.getNOIDUNGFILE().trim().length()>0) {
			return  (TONGHOP)XSDUtil.parseToObject(Base64Utils.decode(f.getNOIDUNGFILE().trim()), TONGHOP.class);
			
		}
		return null;
	}
	
	private static DSACHCHITIETTHUOC getXML2(FILEHOSO f) throws Exception {
		if( f!= null 
				&& f.getLOAIHOSO().trim().equalsIgnoreCase("XML2")
				&& f.getNOIDUNGFILE() != null 
				&& f.getNOIDUNGFILE().trim().length()>0) {
			String xml2String =f.getNOIDUNGFILE().trim();
			xml2String= Base64Utils.decode(xml2String);
			return  (DSACHCHITIETTHUOC)XSDUtil.parseToObject(xml2String, DSACHCHITIETTHUOC.class);
			
		}
		return null;
	}
	
	private static DSACHCHITIETDVKT getXML3(FILEHOSO f) throws Exception {
		if( f!= null 
				&& f.getLOAIHOSO().trim().equalsIgnoreCase("XML3")
				&& f.getNOIDUNGFILE() != null 
				&& f.getNOIDUNGFILE().trim().length()>0) {
			String xml3Strinng =f.getNOIDUNGFILE().trim();
			xml3Strinng= Base64Utils.decode(xml3Strinng);
			return  (DSACHCHITIETDVKT)XSDUtil.parseToObject(xml3Strinng, DSACHCHITIETDVKT.class);
			
		}
		return null;
	}
	
	
	
	
	public static GIAMDINHHS getGIAMDINHHS(String xml) {
		try {
			if(xml 
					!= null && xml.trim().length()>0) {
				GIAMDINHHS gd = (GIAMDINHHS)XSDUtil
						.parseToObject2(xml, GIAMDINHHS.class);
				return gd;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//log.info(xml);
		}
		return null;
	}
	
	

}

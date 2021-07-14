package drg.moh.service.service.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;

import drg.moh.service.model.RpDashboardDstc;
import drg.moh.service.model.impl.RpDashboardDstcImpl;
import drg.moh.service.service.persistence.RpDashboardDstcFinder;


public class RpDashboardDstcFinderImpl extends RpDashboardDstcFinderBaseImpl implements RpDashboardDstcFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardDstcFinderImpl.class.getName());
	private static final String getReportDinhSuatTieuChuan = RpDashboardDstcFinderImpl.class.getName() + ".getReportDinhSuatTieuChuan";
	private static final String getReportSoLuongBenhNhanDRG = RpDashboardDstcFinderImpl.class.getName() + ".getReportSoLuongBenhNhanDRG";
	private static final String getReportSoLuongBenhNhanDinhSuat = RpDashboardDstcFinderImpl.class.getName() + ".getReportSoLuongBenhNhanDinhSuat";
	
	
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	/***
	 * 
	 * @param orgId
	 * @param type 1: quyen cap 0 | 0: quyen don vi
	 * @param start
	 * @param end
	 * @return
	 */
	public List<RpDashboardDstc> getReportDinhSuatTieuChuan(String orgId, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportDinhSuatTieuChuan);
			
			strQuery = strQuery.replace("[$ORG_ID$]", "?");
			params.add(type+";"+orgId);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDstc", RpDashboardDstcImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDstc> oList= (List<RpDashboardDstc>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	
	public List<RpDashboardDstc> getReportSoLuongBenhNhanDRG(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportSoLuongBenhNhanDRG);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi + ";" + getBy);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDstc", RpDashboardDstcImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDstc> oList= (List<RpDashboardDstc>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public List<RpDashboardDstc> getReportSoLuongBenhNhanDinhSuat(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportSoLuongBenhNhanDinhSuat);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi + ";" + getBy);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDstc", RpDashboardDstcImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDstc> oList= (List<RpDashboardDstc>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

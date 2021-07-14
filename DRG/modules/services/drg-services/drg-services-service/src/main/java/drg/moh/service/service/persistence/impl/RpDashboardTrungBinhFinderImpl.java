package drg.moh.service.service.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;

import drg.moh.service.service.persistence.RpDashboardTrungBinhFinder;


public class RpDashboardTrungBinhFinderImpl extends RpDashboardTrungBinhFinderBaseImpl implements RpDashboardTrungBinhFinder {
	private static Log log = LogFactoryUtil.getLog(RpDashboardTrungBinhFinderImpl.class.getName());
	
	private static final String getTrungBinh4DinhSuat = RpDashboardTrungBinhFinderImpl.class.getName() + ".getTrungBinh4DinhSuat";
	private static final String getTrungBinh4Drg = RpDashboardTrungBinhFinderImpl.class.getName() + ".getTrungBinh4Drg";
	private static final String getTrungBinh4CMI = RpDashboardTrungBinhFinderImpl.class.getName() + ".getTrungBinh4CMI";
	private static final String getTrungBinh4ChiPhi = RpDashboardTrungBinhFinderImpl.class.getName() + ".getTrungBinh4ChiPhi";
	
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public String getTrungBinh4DinhSuat(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getTrungBinh4DinhSuat);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			return String.valueOf(query.uniqueResult()) ;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public String getTrungBinh4Drg(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getTrungBinh4Drg);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			return String.valueOf(query.uniqueResult()) ;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public String getTrungBinh4CMI(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getTrungBinh4CMI);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			return String.valueOf(query.uniqueResult()) ;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public String getTrungBinh4ChiPhi(String maDonVi, int type, int getBy){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getTrungBinh4ChiPhi);
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			return String.valueOf(query.uniqueResult()) ;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

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

import drg.moh.service.model.RpDashboardCmi;
import drg.moh.service.model.impl.RpDashboardCmiImpl;
import drg.moh.service.service.persistence.RpDashboardCmiFinder;

public class RpDashboardCmiFinderImpl extends RpDashboardCmiFinderBaseImpl implements RpDashboardCmiFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardCmiFinderImpl.class.getName());
	private static final String getReportCmiTW = RpDashboardCmiFinderImpl.class.getName() + ".getReportCmiTW";
	private static final String getReportCmiTinh = RpDashboardCmiFinderImpl.class.getName() + ".getReportCmiTinh";
	private static final String getReportCmiHuyen = RpDashboardCmiFinderImpl.class.getName() + ".getReportCmiHuyen";
	
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
	public List<RpDashboardCmi> getReportCmiTW(long orgId, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportCmiTW);
			
			strQuery = strQuery.replace("[$ORG_ID$]", "?");
			params.add(type+";"+orgId);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCmi", RpDashboardCmiImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCmi> oList= (List<RpDashboardCmi>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	/***
	 * 
	 * @param orgId
	 * @param type 1: quyen cap 0 | 0: quyen don vi
	 * @param start
	 * @param end
	 * @return
	 */
	public List<RpDashboardCmi> getReportCmiTinh(long orgId, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportCmiTinh);
			
			strQuery = strQuery.replace("[$ORG_ID$]", "?");
			params.add(type+";"+orgId);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCmi", RpDashboardCmiImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCmi> oList= (List<RpDashboardCmi>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	/***
	 * 
	 * @param orgId
	 * @param type 1: quyen cap 0 | 0: quyen don vi
	 * @param start
	 * @param end
	 * @return
	 */
	public List<RpDashboardCmi> getReportCmiHuyen(long orgId, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportCmiHuyen);
			
			strQuery = strQuery.replace("[$ORG_ID$]", "?");
			params.add(type+";"+orgId);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCmi", RpDashboardCmiImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCmi> oList= (List<RpDashboardCmi>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

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

import drg.moh.service.model.RpDashboardCphd;
import drg.moh.service.model.impl.RpDashboardCphdImpl;
import drg.moh.service.service.persistence.RpDashboardCphdFinder;

public class RpDashboardCphdFinderImpl extends RpDashboardCphdFinderBaseImpl implements RpDashboardCphdFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardCphdFinderImpl.class.getName());
	private static final String getReportChiPhiHoatDong = RpDashboardCphdFinderImpl.class.getName() + ".getReportChiPhiHoatDong";
	private static final String getChiPhiThanhPhan = RpDashboardCphdFinderImpl.class.getName() + ".getChiPhiThanhPhan";
	
	
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
	public List<RpDashboardCphd> getReportChiPhiHoatDong(String orgId, int type, String order){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportChiPhiHoatDong);
			
			strQuery = strQuery.replace("[$ORG_ID$]", "?");
			params.add(type+";"+orgId);
			
			if(order!=null && !"".equals(order)){
				strQuery = strQuery.replace("[$ORDER_BY$]", order);
//				params.add(order);
			}
			
			strQuery = strQuery.replace("[$ORDER_BY$]", "");
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCphd", RpDashboardCphdImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCphd> oList= (List<RpDashboardCphd>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	/**
	 * 
	 * @param maDonVi
	 * @param type
	 * @return
	 */
	public List<RpDashboardCphd> getChiPhiThanhPhan(String maDonVi, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getChiPhiThanhPhan);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCphd", RpDashboardCphdImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCphd> oList= (List<RpDashboardCphd>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

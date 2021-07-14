package drg.moh.service.service.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;

import drg.moh.service.model.RpDashboardDRG;
import drg.moh.service.model.impl.RpDashboardDRGImpl;
import drg.moh.service.service.persistence.RpDashboardDRGFinder;


public class RpDashboardDRGFinderImpl extends RpDashboardDRGFinderBaseImpl implements RpDashboardDRGFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardDRGFinderImpl.class.getName());
	private static final String getDRGData = RpDashboardDRGFinderImpl.class.getName() + ".getDRGData";
	private static final String getDRGItems = RpDashboardDRGFinderImpl.class.getName() + ".getDRGItems";
	
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	public List<RpDashboardDRG> getDRGData(String maDonVi, double min, double max, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getDRGData);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			
			if(min<=0) {
				min = 0.5;
			}
			if(max<=0) {
				max = 1;
			}
			params.add(type+";"+maDonVi+";"+min+";"+max);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDRG", RpDashboardDRGImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDRG> oList= (List<RpDashboardDRG>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public List<String> getDRGItems(String maDonVi,double min, double max, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getDRGItems);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			if(min<=0) {
				min = 0.5;
			}
			if(max<=0) {
				max = 1;
			}
			params.add(type+";"+maDonVi+";"+min+";"+max);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addScalar("_drg", Type.STRING);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<String> oList= (List<String>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

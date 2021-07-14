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

import drg.moh.service.model.DashboardBaoHiem;
import drg.moh.service.model.impl.DashboardBaoHiemImpl;
import drg.moh.service.service.persistence.DashboardBaoHiemFinder;


public class DashboardBaoHiemFinderImpl extends DashboardBaoHiemFinderBaseImpl implements DashboardBaoHiemFinder{
	private static Log log = LogFactoryUtil.getLog(DashboardBaoHiemFinderImpl.class.getName());
	private static final String getBaoHiemData = DashboardBaoHiemFinderImpl.class.getName() + ".getBaoHiemData";
	private static final String getDrgBaoHiem = DashboardBaoHiemFinderImpl.class.getName() + ".getDrgBaoHiem";
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public List<DashboardBaoHiem> getBaoHiemData(long orgId,int muc, int nam){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getBaoHiemData);
			params.add(orgId);
			params.add(muc);
			params.add(nam);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("DashboardBaoHiem", DashboardBaoHiemImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<DashboardBaoHiem> oList= (List<DashboardBaoHiem>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return oList;
		} catch (Exception e) {
			log.error(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public List<String> getDrgBaoHiem(long orgId,int muc, int nam){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getDrgBaoHiem);
			params.add(orgId);
			params.add(muc);
			params.add(nam);
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addScalar("drg_ma",Type.STRING);
			for(Object obj : params){
				qPos.add(obj);
			}
			
			
			List<String> oList= (List<String>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return oList;
		} catch (Exception e) {
			log.error(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

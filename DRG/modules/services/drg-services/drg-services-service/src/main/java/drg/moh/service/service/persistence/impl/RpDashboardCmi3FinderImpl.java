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

import drg.moh.service.model.RpDashboardCmi3;
import drg.moh.service.model.impl.RpDashboardCmi3Impl;
import drg.moh.service.service.persistence.RpDashboardCmi3Finder;

public class RpDashboardCmi3FinderImpl extends RpDashboardCmi3FinderBaseImpl implements RpDashboardCmi3Finder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardCmi3FinderImpl.class.getName());
	private static final String getReportCmiCoSo = RpDashboardCmi3FinderImpl.class.getName() + ".getReportCmiCoSo";
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public List<RpDashboardCmi3> getReportCmiCoSo(String maDonVi, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportCmiCoSo);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCmi3", RpDashboardCmi3Impl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCmi3> oList= (List<RpDashboardCmi3>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

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

import drg.moh.service.model.RpDashboardDstcChiTiet;
import drg.moh.service.model.impl.RpDashboardDstcChiTietImpl;
import drg.moh.service.service.persistence.RpDashboardDstcChiTietFinder;

public class RpDashboardDstcChiTietFinderImpl  extends RpDashboardDstcChiTietFinderBaseImpl implements RpDashboardDstcChiTietFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardDstcChiTietFinderImpl.class.getName());
	private static final String getReportDinhSuatChiTiet = RpDashboardDstcChiTietFinderImpl.class.getName() + ".getReportDinhSuatChiTiet";
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
	public List<RpDashboardDstcChiTiet> getReportDinhSuatChiTiet(long tinhId, int type, int thang){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getReportDinhSuatChiTiet);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+tinhId+";"+thang);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDstcChiTiet", RpDashboardDstcChiTietImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDstcChiTiet> oList= (List<RpDashboardDstcChiTiet>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

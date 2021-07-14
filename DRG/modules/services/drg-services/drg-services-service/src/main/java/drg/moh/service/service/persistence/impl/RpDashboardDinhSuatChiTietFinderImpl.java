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

import drg.moh.service.model.RpDashboardDinhSuatChiTiet;
import drg.moh.service.model.impl.RpDashboardDinhSuatChiTietImpl;
import drg.moh.service.service.persistence.RpDashboardDinhSuatChiTietFinder;


public class RpDashboardDinhSuatChiTietFinderImpl extends RpDashboardDinhSuatChiTietFinderBaseImpl implements RpDashboardDinhSuatChiTietFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardDinhSuatChiTietFinderImpl.class.getName());
	private static final String getDinhSuatChiTiet = RpDashboardDinhSuatChiTietFinderImpl.class.getName() + ".getDinhSuatChiTiet";
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public List<RpDashboardDinhSuatChiTiet> getDinhSuatChiTiet(String maDonVi, int type, int thang){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getDinhSuatChiTiet);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi + ";" + thang);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardDinhSuatChiTiet", RpDashboardDinhSuatChiTietImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardDinhSuatChiTiet> oList= (List<RpDashboardDinhSuatChiTiet>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

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

import drg.moh.service.model.RpDashboardChiPhiBinhQuan;
import drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanImpl;
import drg.moh.service.service.persistence.RpDashboardChiPhiBinhQuanFinder;

public class RpDashboardChiPhiBinhQuanFinderImpl extends RpDashboardChiPhiBinhQuanFinderBaseImpl implements RpDashboardChiPhiBinhQuanFinder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardChiPhiBinhQuanFinderImpl.class.getName());
	private static final String getChiPhiBinhQuan = RpDashboardChiPhiBinhQuanFinderImpl.class.getName() + ".getChiPhiBinhQuan";
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public List<RpDashboardChiPhiBinhQuan> getChiPhiBinhQuan(String maDonVi, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getChiPhiBinhQuan);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardChiPhiBinhQuan", RpDashboardChiPhiBinhQuanImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardChiPhiBinhQuan> oList= (List<RpDashboardChiPhiBinhQuan>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

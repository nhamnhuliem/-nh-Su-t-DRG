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

import drg.moh.service.model.RpDashboardCmi2;
import drg.moh.service.model.impl.RpDashboardCmi2Impl;
import drg.moh.service.service.persistence.RpDashboardCmi2Finder;


public class RpDashboardCmi2FinderImpl extends RpDashboardCmi2FinderBaseImpl implements RpDashboardCmi2Finder{
	private static Log log = LogFactoryUtil.getLog(RpDashboardCmi2FinderImpl.class.getName());
	private static final String getBaoCaoCmiBo_Tinh = RpDashboardCmi2FinderImpl.class.getName() + ".getBaoCaoCmiBo_Tinh";
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	
	public List<RpDashboardCmi2> getBaoCaoCmiBo_Tinh(String maDonVi, int type){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getBaoCaoCmiBo_Tinh);
			
			strQuery = strQuery.replace("[$PARAMETER$]", "?");
			params.add(type+";"+maDonVi);
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("RpDashboardCmi2", RpDashboardCmi2Impl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<RpDashboardCmi2> oList= (List<RpDashboardCmi2>) QueryUtil.list(query, getDialect(), -1, -1);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
}

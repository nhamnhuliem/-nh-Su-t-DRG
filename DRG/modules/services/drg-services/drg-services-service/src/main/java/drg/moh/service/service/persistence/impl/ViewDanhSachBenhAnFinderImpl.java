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

import drg.moh.service.model.ViewDanhSachBenhAn;
import drg.moh.service.model.impl.ViewDanhSachBenhAnImpl;
import drg.moh.service.service.persistence.ViewDanhSachBenhAnFinder;


public class ViewDanhSachBenhAnFinderImpl  extends ViewDanhSachBenhAnFinderBaseImpl implements ViewDanhSachBenhAnFinder{
	private static Log log = LogFactoryUtil.getLog(ViewDanhSachBenhAnFinderImpl.class.getName());
	private static final String countBaoCaosByOrg_Nam = ViewDanhSachBenhAnFinderImpl.class.getName() + ".countBaoCaosByOrg_Nam";
	private static final String getBaoCaosByOrg_Nam = ViewDanhSachBenhAnFinderImpl.class.getName() + ".getBaoCaosByOrg_Nam";
	
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
	public List<ViewDanhSachBenhAn> getBaoCaosByOrg_Nam(long orgId,int nam, int start, int end){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),getBaoCaosByOrg_Nam);
			
			if(orgId > 0){
				strQuery = strQuery.replace("[$ORG_ID$]", "AND bc.organization_id = ?");
				params.add(orgId);
			}else{
				strQuery = strQuery.replace("[$ORG_ID$]", "");
			}
			
			if(nam > 0){
				strQuery = strQuery.replace("[$NAM$]", "AND bc.nam = ?");
				params.add(nam);
			}else{
				strQuery = strQuery.replace("[$NAM$]", "");
			}
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			query.addEntity("ViewDanhSachBenhAn", ViewDanhSachBenhAnImpl.class);
		
			for(Object obj : params){
				qPos.add(obj);
			}
			
			List<ViewDanhSachBenhAn> oList= (List<ViewDanhSachBenhAn>) QueryUtil.list(query, getDialect(), start, end);
			return oList;
			
		} catch(Exception e){
			log.equals(e);
		} finally{
			closeSession(session);
		}
		return null;
	}
	
	public int countBaoCaosByOrg_Nam(long orgId, int nam){
		Session session= null;
		try {
			List<Object> params = new ArrayList<Object>();
			String strQuery = _customSQL.get(getClass(),countBaoCaosByOrg_Nam);
			
			if(orgId > 0){
				strQuery = strQuery.replace("[$ORG_ID$]", "AND bc.organization_id = ?");
				params.add(orgId);
			}else{
				strQuery = strQuery.replace("[$ORG_ID$]", "");
			}
			
			if(nam > 0){
				strQuery = strQuery.replace("[$NAM$]", "AND bc.nam = ?");
				params.add(nam);
			}else{
				strQuery = strQuery.replace("[$NAM$]", "");
			}
			
			session= openSession();
			SQLQuery query = session.createSQLQuery(strQuery);
			QueryPos qPos = QueryPos.getInstance(query);
			
			
			
			for(Object obj : params){
				qPos.add(obj);
			}
			
			return Integer.valueOf(String.valueOf(query.uniqueResult()));
		}finally{
			closeSession(session);
		}
	}
}

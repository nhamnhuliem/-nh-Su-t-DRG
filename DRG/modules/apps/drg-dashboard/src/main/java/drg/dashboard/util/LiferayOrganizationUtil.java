package drg.dashboard.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;

public class LiferayOrganizationUtil {
	private static Log log = LogFactoryUtil.getLog(LiferayOrganizationUtil.class.getName());
	private static int dayOfYear = 0;
	private static Map<String,Organization> oMap =null;
	
	
	
	
	private static Map<String,Organization> getOMap(){
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		if(oMap == null || dayOfYear != day){
			dayOfYear = day;
			oMap = new HashMap<String, Organization>();
		}
		
		if(oMap != null && oMap.size()<=0){
			List<Organization> oTrees =  new ArrayList<Organization>();
			try{
				oTrees = OrganizationLocalServiceUtil.getOrganizations(-1, -1);
			
			if(oTrees != null){
				for (Organization organization : oTrees) {
					oMap.put(String.valueOf(organization.getOrganizationId()), organization);
				}
			}
			}catch(Exception e){}
		}
		return oMap;
	}
	

	public static List<Organization> getOrganizations(long[] organizationIds){
		
		if(organizationIds != null && organizationIds.length>0){
			List<Organization> oList = new ArrayList<Organization>();
			for (long organizationId : organizationIds) {
				try{
					Organization o = getOMap().get(String.valueOf(organizationId));
					if(o != null){
						oList.add(o);
					}
				}catch(Exception e){}
			}
			return oList;
		}
		
		return null;
	}
	
	public static String getCustomField(long organizationId,String customField){
		try {
			Organization organization =OrganizationLocalServiceUtil.fetchOrganization(organizationId);
			if(organization != null){
				Serializable serializable=organization.getExpandoBridge().getAttribute(customField, false);
				if(serializable != null){
					return serializable.toString();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static long getOrganizationId(User user){
		try{
			long[] orgIds = user.getOrganizationIds();
			if(orgIds != null && orgIds.length >0){
				return orgIds[0];
			}
		}catch(Exception e){}
		return 0;
	}
	
	public static String getOrganizationName(User user){
		try{
			List<Organization> oList = user.getOrganizations();
			if(oList != null && oList.size() >0){
				return oList.get(0).getName();
			}
		}catch(Exception e){}
		return "";
	}
	
	public static String getOrganizationName(long organizationId){
		try{
			Organization org = getOMap().get(String.valueOf(organizationId));
			if(org != null){
				return org.getName();
			}
		}catch(Exception e){}
		return "";
	}
	
	
	public static List<Organization> getTreesOrganization(long[] organizationIds,boolean baoGomCaCapCon){
		return getTreesOrganization(organizationIds,baoGomCaCapCon,"..");
		
	}
	
	public static List<Organization> getTreesOrganization(long[] organizationIds,boolean baoGomCaCapCon,String characters){
		List<Organization> oList = new ArrayList<Organization>();
		if(organizationIds != null && organizationIds.length>0){
			for (long organizationId : organizationIds) {
				Organization o = getOMap().get(String.valueOf(organizationId));
				oList.add(o);
				if(baoGomCaCapCon){
					oList = getTreesOrganization(o.getCompanyId(),o.getOrganizationId(),oList,1,characters);
				}
			}
		}
		return oList;
		
	}
	
	
	private static long getRootOrganizationReport(long coquanQuanlyNguoiDungId){
		try{
			Organization org = getOMap().get(String.valueOf(coquanQuanlyNguoiDungId));
			if(org != null){
				String choPhep = getCustomField(org.getOrganizationId(), "CHOPHEP_XEMBAOCAO_TOCHUC_CHA");
				if(choPhep != null && choPhep.equals("true")){
					if(org.getParentOrganizationId()>0){
						log.debug("INFO return parent organization: "+org.getParentOrganizationId());
						return getRootOrganizationReport(org.getParentOrganizationId());
					}
				}else{
					log.debug("INFO return value organization: "+coquanQuanlyNguoiDungId);
				}
			}
		}catch(Exception e){
			
		}
		return coquanQuanlyNguoiDungId;
	}
	
	
	
	public static List<Organization> getTreesOrganizationPublic(long companyId, long parentOrganizationId, List<Organization> listOutPut){
		try {			
		
			listOutPut = getTreesOrganization(companyId, parentOrganizationId, listOutPut);
			if(listOutPut != null){
				List<Organization> oList = new ArrayList<Organization>();
				for (Organization org : listOutPut) {
					Serializable isCongBo= org.getExpandoBridge().getAttribute("KHONGDUOCCONGBO");
					if(isCongBo == null 
							|| isCongBo.toString().equals("false") 
							|| isCongBo.toString().equals("0")){
						oList.add(org);
					}
					
				}
				return oList;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOutPut;
	}
	
	
	
	public static List<Organization> getTreesOrganization(long companyId, long parentOrganizationId, List<Organization> listOutPut){
		try {			
			List<Organization> list =  null;
			if(parentOrganizationId ==0){
				list =OrganizationLocalServiceUtil.getOrganizations(companyId, parentOrganizationId);
			}else{
				Organization parent = getOMap().get(String.valueOf(parentOrganizationId));
				if(parent != null){
					list = parent.getSuborganizations();
				}
			}
			int depth=1;
			if(list != null && list.size() >0){
				for(Organization org : list){
					org.setName(org.getName());
					listOutPut.add(org);
					if(org.getSuborganizations()!= null && org.getSuborganizations().size()>0){
						getTreesOrganization(companyId, org.getOrganizationId(), listOutPut,depth,"..");
					}
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return listOutPut;
	}
	
	
	private static List<Organization> getTreesOrganization(long companyId, long parentOrganizationId, List<Organization> listOutPut,int depth,String c){
		try {			
			List<Organization> list =  null;
			if(parentOrganizationId ==0){
				list =OrganizationLocalServiceUtil.getOrganizations(companyId, parentOrganizationId);
			}else{
				Organization parent = getOMap().get(String.valueOf(parentOrganizationId));
				if(parent != null){
					list = parent.getSuborganizations();
				}
			}
			depth++;
			if(list != null && list.size() >0){
				for(Organization org : list){
					if(c != null && c.trim().length()>0){
						org.setName(getCharactorByDepth(depth,c)+org.getName());
					}
					listOutPut.add(org);
					getTreesOrganization(companyId, org.getOrganizationId(), listOutPut,depth,c);
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return listOutPut;
	}
	public static List<Organization> getTreesOrganization(long companyId,long parentOrganizationId){
		 List<Organization> result = new ArrayList<Organization>();
		 return getTreesOrganization(companyId, parentOrganizationId, result);
		
	}

	
	
	
	private static String getCharactorByDepth(int depth,String c){
		if(depth<=1){
			return "";
		}else{
			StringBuffer result = new StringBuffer("");
			for(int i=1;i<depth;i++){
				result.append(c);
			}
			return result.toString();
			
		}		
		
	}
	
}

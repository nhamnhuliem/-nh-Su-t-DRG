package drg.dashboard.business;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;


import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;

import drg.dashboard.util.LiferayOrganizationUtil;
import drg.moh.service.model.RpDashboardCmi2;
import drg.moh.service.model.RpDashboardCmi3;
import drg.moh.service.model.RpDashboardDRG;
import drg.moh.service.service.RpDashboardCmi2LocalServiceUtil;
import drg.moh.service.service.RpDashboardCmi3LocalServiceUtil;
import drg.moh.service.service.RpDashboardDRGLocalServiceUtil;

public class DashboardBYTBusiness {
	public void getChartCMIData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			SystemException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		String maDonVi = LiferayOrganizationUtil.getCustomField(orgId, "MA_DONVI");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		if(maDonVi.length() < 3){
			
			List<RpDashboardCmi2> listObject = RpDashboardCmi2LocalServiceUtil.getBaoCaoCmiBo_Tinh(maDonVi, 1); 
			
			if(listObject != null && listObject.size() > 0){
				Gson gson = new Gson();
				dataObject.put("ChartCMIData", gson.toJson(listObject)) ;
			}
		}else{
			List<RpDashboardCmi3> listObject = RpDashboardCmi3LocalServiceUtil.getReportCmiCoSo(maDonVi, 1);
			
			if(listObject != null && listObject.size() > 0){
				Gson gson = new Gson();
				dataObject.put("ChartCMIData", gson.toJson(listObject)) ;
			}
		}

		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());

	}

	public void getDRGData(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {
		long orgId = ParamUtil.getLong(resourceRequest, "orgId");
		double min = ParamUtil.getDouble(resourceRequest, "pMin");
		double max = ParamUtil.getDouble(resourceRequest, "pMax");
		String maDonVi = LiferayOrganizationUtil.getCustomField(orgId, "MA_DONVI");
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		
		List<RpDashboardDRG> listObject = RpDashboardDRGLocalServiceUtil.getDRGData(maDonVi,min,max, 1);
		Gson gson = new Gson();
		dataObject.put("DRGData", gson.toJson(listObject)) ;
		
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		writer.write(dataObject.toString());
		
		
	}
}

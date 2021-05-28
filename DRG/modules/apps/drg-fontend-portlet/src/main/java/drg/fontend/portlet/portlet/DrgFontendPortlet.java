package drg.fontend.portlet.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import drg.fontend.portlet.constants.DrgFontendPortletKeys;
import drg.moh.service.model.ThongKeBaoCao;
import drg.moh.service.service.ThongKeBaoCaoLocalServiceUtil;

/**
 * @author nhanvien-DTT
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=DRG",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=DrgFontend",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DrgFontendPortletKeys.DRGFONTEND,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DrgFontendPortlet extends MVCPortlet {
	private static Log log = LogFactoryUtil.getLog(DrgFontendPortlet.class);
	@Override
	public void doView(RenderRequest renderRequest,
					   RenderResponse renderResponse) throws IOException, PortletException {

		renderRequest.setAttribute(
				ThongKeBaoCaoConfiguration.class.getName(),
				_mainPortletConfiguration);

		super.doView(renderRequest, renderResponse);
	}

	public String getReport1(Map labels) {
		return (String) labels.get(_mainPortletConfiguration.report1());
	}
	public String getReport2(Map labels) {
		return (String) labels.get(_mainPortletConfiguration.report2());
	}
	public String getReport3(Map labels) {
		return (String) labels.get(_mainPortletConfiguration.report3());
	}
	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_mainPortletConfiguration = ConfigurableUtil.createConfigurable(
				ThongKeBaoCaoConfiguration.class, properties);
	}

	private volatile ThongKeBaoCaoConfiguration _mainPortletConfiguration;
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException{
		String resourceID = resourceRequest.getResourceID();
		if("getThongKeBaoCaoHoSo".equals(resourceID)){
			try {
				getThongKeBaoCaoHoSo(resourceRequest, resourceResponse);
			} catch (SystemException e) {
				log.error(e);
			}
		}
	}
	private void getThongKeBaoCaoHoSo(ResourceRequest resourceRequest, ResourceResponse resourceResponse){
		int nam = ParamUtil.getInteger(resourceRequest, "nam");
		List<ThongKeBaoCao> thongkes = new ArrayList<ThongKeBaoCao>();
		if(nam > 0){
			thongkes = ThongKeBaoCaoLocalServiceUtil.findByNam(nam);
		}else{
			thongkes = ThongKeBaoCaoLocalServiceUtil.findByNam(2021);
		}
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		for(ThongKeBaoCao thongke : thongkes){
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("thang", thongke.getThang());
			jsonObject.put("giatri", thongke.getTongHoSo());
			jsonArray.put(jsonObject);
		}
		resourceResponse.setContentType("text/html");
		PrintWriter writer;
		try {
			writer = resourceResponse.getWriter();
			writer.write(jsonArray.toString());
		} catch (IOException e) {
			log.error(e);
		}
		
	}
}
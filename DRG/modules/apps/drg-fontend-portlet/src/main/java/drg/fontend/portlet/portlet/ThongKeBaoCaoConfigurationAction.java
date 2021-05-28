package drg.fontend.portlet.portlet;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import drg.fontend.portlet.constants.DrgFontendPortletKeys;

/**
 * Created by son on 19.05.2021.
 */
@Component(
    configurationPid = "MainPortletConfiguration",
    configurationPolicy = ConfigurationPolicy.OPTIONAL,
    immediate = true,
    property = {
        "javax.portlet.name=" +  DrgFontendPortletKeys.DRGFONTEND
    },
    service = ConfigurationAction.class
)
public class ThongKeBaoCaoConfigurationAction extends DefaultConfigurationAction {

    @Override
    public void processAction(
            PortletConfig portletConfig, ActionRequest actionRequest,
            ActionResponse actionResponse)
            throws Exception {

        String report1 = ParamUtil.getString(actionRequest, "report1");
        setPreference(actionRequest, "report1", report1);
        
        String report2 = ParamUtil.getString(actionRequest, "report2");
        setPreference(actionRequest, "report2", report2);
       
        String report3 = ParamUtil.getString(actionRequest, "report3");
        setPreference(actionRequest, "report3", report3);
        
        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Override
    public void include(
            PortletConfig portletConfig, HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws Exception {

        httpServletRequest.setAttribute(
                ThongKeBaoCaoConfiguration.class.getName(),
                _mainPortletConfiguration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _mainPortletConfiguration = ConfigurableUtil.createConfigurable(
        		ThongKeBaoCaoConfiguration.class, properties);
    }

    private volatile ThongKeBaoCaoConfiguration _mainPortletConfiguration;
}

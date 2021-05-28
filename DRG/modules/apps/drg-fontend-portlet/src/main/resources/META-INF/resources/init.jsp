<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="drg.fontend.portlet.portlet.ThongKeBaoCaoConfiguration"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
ThongKeBaoCaoConfiguration configuration =
(ThongKeBaoCaoConfiguration)
 renderRequest.getAttribute(ThongKeBaoCaoConfiguration.class.getName());

String report1 = "";
String report2 = "";
String report3 = "";
if (Validator.isNotNull(configuration)) {
	report1 = portletPreferences.getValue("report1", configuration.report1());
	report2 = portletPreferences.getValue("report2", configuration.report2());
	report3 = portletPreferences.getValue("report3", configuration.report3());
}
%>
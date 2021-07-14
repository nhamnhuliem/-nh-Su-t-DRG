<%@page import="drg.dashboard.util.LiferayOrganizationUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>

<script src="<%= request.getContextPath() %>/js/Chart.bundle.js"></script>
<script src="<%= request.getContextPath() %>/js/chartjs-plugin-labels.js"></script>
<portlet:defineObjects />

<%
	long orgId = ParamUtil.getLong(request, "orgId");
	long thang = ParamUtil.getLong(request, "thang");
	String maDv = ParamUtil.getString(request, "maDonVi");
	String tenDonVi = ParamUtil.getString(request, "tenDonVi");
%>
<portlet:renderURL var="chiTietDinhSuatUrl">
	<portlet:param name="jspPage" value="/chitiet_dinhsuat.jsp"/>
	<portlet:param name="maDonVi" value="__MA_DONVI__"/>
	<portlet:param name="tenDonVi" value="__tenDonVi__"/>
	<portlet:param name="thang" value="<%=String.valueOf(thang) %>"/>
</portlet:renderURL>
<div id= "warning" class="alert alert-warning" style="display: none" role="alert">
  Không có dữ liệu!
</div>
<div id="chart">
	<div class="row">
		<div class="col-md-12">
			<h3 class="tle1"><%=LiferayOrganizationUtil.getOrganizationName(orgId).length() > 0 ? LiferayOrganizationUtil.getOrganizationName(orgId) : tenDonVi %></h3>
		</div>
	
	</div>
	<canvas id="DinhSuatCharBarChiTiet" width="400" height="auto"></canvas>
</div>
<br/>
<button type="button" class="btn btn-primary" onclick="Liferay.Util.getOpener().closePopup('chiTiet');">Đóng lại</button>
<c:if test="<%=tenDonVi.length() > 0 %>">
	<button type="button" class="btn btn btn-default" onclick="window.history.back();"><i class="fa fa-undo" aria-hidden="true"></i>Quay lại</button>
</c:if>

<liferay-portlet:resourceURL var="getDinhSuatChiTiet" id="getDinhSuatChiTiet" copyCurrentRenderParameters="<%=false %>"></liferay-portlet:resourceURL>
<script>

$(document).ready(function(){
	getDinhSuatChiTiet(<%=orgId%>,<%=thang%>);
});
function getDinhSuatChiTiet(orgId, thang){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>thang': thang,
			'<portlet:namespace/>maDv': "<%=maDv%>"
	};
	$.ajax({
		url : '<%=getDinhSuatChiTiet%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data.dinhSuatChiTiet != undefined){
				var dinhSuatData = JSON.parse(data.dinhSuatChiTiet);
				var backgroundColor = [];
				for(var i = 0; i < dinhSuatData.dinhSuat.length; i ++){
					backgroundColor[i] = "rgba("+ Math.floor(Math.random() * Math.floor(255)) +", "+ Math.floor(Math.random() * Math.floor(255))+", "+Math.floor(Math.random() * Math.floor(255))+", 1)";
				}
				generateDinhSuatChart(dinhSuatData,backgroundColor);
			}else{
				$("#warning").show();
				$("#chart").hide();
			}
			
		},
		error : function(data) {
			console.info("error");
		}
	});
}



function generateDinhSuatChart(dinhSuatData,backgroundColor){
	var dinhSuarCanvas = document.getElementById('DinhSuatCharBarChiTiet');
	var DinhSuatCharBar = document.getElementById('DinhSuatCharBarChiTiet').getContext('2d');
	var DinhSuatCharBarChiTiet = new Chart(DinhSuatCharBar, {
	    type: 'horizontalBar',
	    data: {
	        labels: dinhSuatData.labels,
			datasets: [
				{
					label: "Phí dịch vụ",
					data: dinhSuatData.dinhSuat ,
					borderWidth: 1,
					backgroundColor: backgroundColor,
					maDonVi : dinhSuatData.maDonVi
				}
			]
	    },
	    options: {
	        scales: {
				xAxes: [{
	                stacked: true
	            }],
	            yAxes: [{
	                stacked: true,
					ticks: {
	                    beginAtZero: true
	                }
	            }]
				
	        },
			legend: {
				display: false
			}
	    }
	});
	
	dinhSuarCanvas.onclick = function(evt) {
	    var activePoints = DinhSuatCharBarChiTiet.getElementsAtEvent(evt);
	    if (activePoints[0] && <%=tenDonVi.length() == 0 %>) {
	      var chartData = activePoints[0]['_chart'].config.data;
	      var idx = activePoints[0]['_index'] + 1;
	      var maDonVi = chartData.datasets[0].maDonVi[idx];
	      var tenDonVi = chartData.labels[idx-1];
	      var url = "<%=chiTietDinhSuatUrl.toString()%>";
	      url = url.replace("__MA_DONVI__",maDonVi).replace("__tenDonVi__",tenDonVi);
	      location.href = url;
	    }
	};

}
</script>

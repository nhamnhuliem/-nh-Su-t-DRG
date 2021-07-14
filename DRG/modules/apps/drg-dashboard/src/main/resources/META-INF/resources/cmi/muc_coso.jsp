<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../init.jsp" %>


<script src="<%= request.getContextPath() %>/js/Chart.bundle.js"></script>
<script src="<%= request.getContextPath() %>/js/chartjs-plugin-labels.js"></script>
<portlet:defineObjects />

<%
	long orgId = ParamUtil.getLong(request, "orgId");
%>

	<div  class="col-md-5 dashboard-box">
		<h3 class="tle1">CHỈ SỐ TÍCH HỢP NHÓM TRƯỜNG HỢP BỆNH (CMI)</h3>
		<canvas id="CMIChartBar" width="400" height="180"></canvas>
	</div>

<liferay-portlet:resourceURL var="getChartCMIData" id="getChartCMIData" copyCurrentRenderParameters="<%=false %>"></liferay-portlet:resourceURL>
<script>
$(document).ready(function(){
	getChartCMIData(<%=orgId%>);
});

function getChartCMIData(orgId){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>type': 1
	};
	$.ajax({
		url : '<%=getChartCMIData%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			cmiChartBar(JSON.parse(data.ChartCMIData));
		},
		error : function(data) {
			console.info("error");
		}
	});
}

function cmiChartBar(chartCMIData){
	var CMIBar = document.getElementById('CMIChartBar').getContext('2d');
	var CMIChartBar = new Chart(CMIBar, {
	    type: 'bar',
		data: {
			labels: ["CMI tỉnh ","CMI tuyến", "CMI Cơ sở"],
			datasets: [{
				label: 'CMI',
				data: [chartCMIData[0]._cmiTinh,chartCMIData[0]._cmiTuyen, chartCMIData[0]._cmiCoSo],
				borderColor: 'rgba(255, 99, 132, 1)',
				borderWidth: 1,
				backgroundColor: 'rgba(255, 99, 132, 0.2)',
			}]
		},
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero: true,
	                    stepSize: 0.2
	                }
	            }]
	        },
			legend: {
				position: 'bottom',
				display: false
			},
		    animation: {
				duration: 1,
				onComplete: function() {
				var chartInstance = this.chart,
				  ctx = chartInstance.ctx;

				ctx.font = Chart.helpers.fontString(Chart.defaults.global.defaultFontSize, Chart.defaults.global.defaultFontStyle, Chart.defaults.global.defaultFontFamily);
				ctx.textAlign = 'center';
				ctx.textBaseline = 'bottom';
				ctx.fillStyle = '#07629f';


				this.data.datasets.forEach(function(dataset, i) {
				  var meta = chartInstance.controller.getDatasetMeta(i);
				  meta.data.forEach(function(bar, index) {
					var data = dataset.data[index];
					ctx.fillText(data, bar._model.x, bar._model.y - 2);
				  });
				});
			  }
			}
	    }
	});
}

</script>		

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
<div  class="col-md-11 dashboard-box">
	<h5 class="tle1">CHỈ SỐ TÍCH HỢP NHÓM TRƯỜNG HỢP BỆNH (CMI)</h5>
	<canvas id="CMIChartBar" width="400" height="150"></canvas>
</div>

<liferay-portlet:resourceURL var="getChartCMIData" id="getChartCMIData" copyCurrentRenderParameters="<%=false %>"></liferay-portlet:resourceURL>
<script>

$(document).ready(function(){
	getChartCMIData(<%=orgId%>);
	
	///Carousel
	 $('#Carousel').carousel({
	    interval: 5000
	 })
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
function cmiChartBar(cmiChartData){
	var CMIBar = document.getElementById('CMIChartBar').getContext('2d');
	var CMIChartBar = new Chart(CMIBar, {
	    type: 'bar',
	    data: {
	        datasets: [
			//cmi max, min bo
			{
			    label: 'CMI cao nhất',
			    data: [cmiChartData[0]._cmiTrungMax,cmiChartData[0]._cmiTrungMax,cmiChartData[0]._cmiTrungMax,, , , ,, , , ,],
			    type: 'line',
				borderColor: 'rgb(255, 99, 132)',
				backgroundColor: 'transparent',
				pointRadius: 0
			},{
			    label: 'CMI thấp nhất',
			    data: [cmiChartData[0]._cmiTrungMin,cmiChartData[0]._cmiTrungMin,cmiChartData[0]._cmiTrungMin,  , , , ,, , , ,],
			    type: 'line',
				borderColor: 'rgb(54, 162, 235)',
				backgroundColor: 'transparent',
			    pointRadius: 0
			}
			,
	        //// cmi max, min tw           
	        {
	            label: 'CMI cao nhất',
	            data: [,, , cmiChartData[1]._cmiTrungMax,cmiChartData[1]._cmiTrungMax,cmiChartData[1]._cmiTrungMax, , , , , ,],
	            type: 'line',
				borderColor: 'rgb(255, 99, 132)',
				backgroundColor: 'transparent',
				pointRadius: 0
	        },{
	            label: 'CMI thấp nhất',
	            data: [,,,  cmiChartData[1]._cmiTrungMin,cmiChartData[1]._cmiTrungMin,cmiChartData[1]._cmiTrungMin, , , ,, ],
	            type: 'line',
				borderColor: 'rgb(54, 162, 235)',
				backgroundColor: 'transparent',
	            pointRadius: 0
	        },
	        //// cmi max, min tuyen tinh
	        {
	            label: 'CMI cao nhất',
	            data: [,,,  , , , cmiChartData[2]._cmiTrungMax,cmiChartData[2]._cmiTrungMax,cmiChartData[2]._cmiTrungMax, , ,],
	            type: 'line',
				borderColor: 'rgb(255, 99, 132)',
				backgroundColor: 'transparent',
				pointRadius: 0
	        },{
	            label: 'CMI thấp nhất',
	            data: [,,,  , , , cmiChartData[2]._cmiTrungMin,cmiChartData[2]._cmiTrungMin,cmiChartData[2]._cmiTrungMin, , ,],
	            type: 'line',
				borderColor: 'rgb(54, 162, 235)',
				backgroundColor: 'transparent',
	            pointRadius: 0
	        },
	     // cmi max, min co so
	        {
	            label: 'CMI cao nhất',
	            data: [,,,, , , ,, , cmiChartData[3]._cmiTrungMax,cmiChartData[3]._cmiTrungMax,cmiChartData[3]._cmiTrungMax],
	            type: 'line',
				borderColor: 'rgb(255, 99, 132)',
				backgroundColor: 'transparent',
				pointRadius: 0
	        },{
	            label: 'CMI thấp nhất',
	            data: [,,,  , , , ,, , cmiChartData[3]._cmiTrungMin,cmiChartData[3]._cmiTrungMin,cmiChartData[3]._cmiTrungMin],
	            type: 'line',
				borderColor: 'rgb(54, 162, 235)',
				backgroundColor: 'transparent',
	            pointRadius: 0
	        },
	        
	        // type bar
	        {
	            label: 'CMI',
	            data: ['',cmiChartData[0]._cmiTrungBinh,,  , cmiChartData[1]._cmiTrungBinh, , , cmiChartData[2]._cmiTrungBinh, , , cmiChartData[3]._cmiTrungBinh,],
				backgroundColor: 'rgba(255, 159, 64, 0.2)',
	            borderColor: 'rgba(255, 159, 64, 1)',
				borderWidth: 1
	        }
			],
	        labels: ['',cmiChartData[0]._cmiTenTuyen,'', '', cmiChartData[1]._cmiTenTuyen, '', '', cmiChartData[2]._cmiTenTuyen, '', '', cmiChartData[3]._cmiTenTuyen, '']
	    },
	    options: {
	        scales: {
	            xAxes: [{
	                gridLines: {
						drawOnChartArea: false
					  },
	            }],
				yAxes: [{
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
}

</script>		

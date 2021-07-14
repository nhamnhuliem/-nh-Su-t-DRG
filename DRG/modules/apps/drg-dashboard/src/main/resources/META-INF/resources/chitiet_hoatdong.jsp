<%@page import="drg.dashboard.util.LiferayOrganizationUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>


<script src="<%= request.getContextPath() %>/js/Chart.bundle.js"></script>
<script src="<%= request.getContextPath() %>/js/chartjs-plugin-labels.js"></script>
<portlet:defineObjects />

<%
	long orgId = ParamUtil.getLong(request, "orgId");
	int muc =GetterUtil.getInteger(LiferayOrganizationUtil.getCustomField(orgId, "MUC_DONVI"));
%>

<div class="row">
	<div class="col-md-12">
		<h3 class="tle1">CHI PHÍ HOẠT ĐỘNG CƠ SỞ <%=LiferayOrganizationUtil.getOrganizationName(orgId) %></h3>
	</div>

</div>
<label>Xem theo:</label>
<button type="button" onclick="updateChart(this,1,<%=orgId%>);"
					class="btn btn-danger">Phí dịch vụ</button>
				<button type="button" onclick="updateChart(this,2,<%=orgId%>);"
					class="btn btn-primary">Định suất</button>
				<button type="button" onclick="updateChart(this,3,<%=orgId%>);"
					class="btn btn-warning">DRG</button>
<br/>
<canvas id="chiPhiChartLine" width="777" height=""></canvas>
<br/>
<button type="button" class="btn btn-primary" onclick="Liferay.Util.getOpener().closePopup('chiTiet');">Đóng lại</button>

<liferay-portlet:resourceURL var="getChartChiPhiHDData" id="getChartChiPhiHDData" copyCurrentRenderParameters="<%=false %>"></liferay-portlet:resourceURL>
<script>

$(document).ready(function(){
	getChartChiPhiHDData(<%=orgId%>,0,0);
	
	///Carousel
	 $('#Carousel').carousel({
	    interval: 5000
	 })
});

function getChartChiPhiHDData(orgId, nam, muc){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>type': 1
	};
	$.ajax({
		url : '<%=getChartChiPhiHDData%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data.chiPhiHoatDongObject != undefined){
				var chiPhiHoatDongObject = JSON.parse(data.chiPhiHoatDongObject);
				if(chiPhiHoatDongObject != undefined){
					var drg;
					var phiDichVu;
					var dinhSuat;
					var chiPhiHoatDongDatas;
					var labels = chiPhiHoatDongObject.labels;
					var heightItem = (2300/58)*labels.length;
					$("#chiPhiChartLine").attr("height",heightItem);
					phiDichVu = chiPhiHoatDongObject.phiDichVu;
					dinhSuat = chiPhiHoatDongObject.dinhSuat;
					drg =chiPhiHoatDongObject.drg;
					
					chiPhiHoatDongDatas = [drg,phiDichVu,dinhSuat];
					chiPhiHoatDongChartLine(chiPhiHoatDongDatas,labels);;
				}
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
}

var chiPhiChartLine;

function chiPhiHoatDongChartLine(chiPhiHoatDongDatas,labels){
	var chiPhiLineCanvas = document.getElementById('chiPhiChartLine');
	var chiPhiLine = chiPhiLineCanvas.getContext('2d');
	chiPhiChartLine = new Chart(chiPhiLine, {
		type: 'horizontalBar',
		data: {
			labels: labels,
			datasets: chiPhiHoatDongDatas
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
				display: false,
				position: 'bottom'
			}
		}
	});
}

function updateChart(elm,type,orgId) {
	chiPhiChartLine.destroy();
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>type': type
	};
	$.ajax({
		url : '<%=getChartChiPhiHDData%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data != ""){
				var chiPhiHoatDongObject = JSON.parse(data.chiPhiHoatDongObject);
				if(chiPhiHoatDongObject != undefined){
					var drg;
					var phiDichVu;
					var dinhSuat;
					var chiPhiHoatDongDatas;
					var labels = chiPhiHoatDongObject.labels;
					var heightItem = (2300/58)*labels.length;
					$("#chiPhiChartLine").attr("height",heightItem);
					phiDichVu = chiPhiHoatDongObject.phiDichVu;
					dinhSuat = chiPhiHoatDongObject.dinhSuat;
					drg =chiPhiHoatDongObject.drg;
					
					if(type==1){
						chiPhiHoatDongDatas = [phiDichVu,drg,dinhSuat];
					}else if(type==2){
						chiPhiHoatDongDatas = [dinhSuat,phiDichVu,drg];
					}else if(type==3){
						chiPhiHoatDongDatas = [drg,phiDichVu,dinhSuat];
					}else{
						chiPhiHoatDongDatas = [phiDichVu,drg,dinhSuat];
					}
					
					var tinhThanh = chiPhiHoatDongObject.tinhThanh;
					chiPhiHoatDongChartLine(chiPhiHoatDongDatas,labels);;
					OEPFillSelectData($('#<portlet:namespace/>orgId'), 
							tinhThanh, "id", "key",
							'<liferay-ui:message key="--- Chọn ---"/>');
					
				}
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
	
}
</script>		

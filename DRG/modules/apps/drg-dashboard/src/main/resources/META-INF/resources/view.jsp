<%@page import="drg.dashboard.util.LiferayOrganizationUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ include file="init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="<%=request.getContextPath()%>/js/Chart.bundle.js"></script>
<script src="<%=request.getContextPath()%>/js/chartjs-plugin-labels.js"></script>
<script src="<%=request.getContextPath()%>/js/hammer.min.js"></script>
<script src="<%=request.getContextPath()%>/js/chartjs-plugin-zoom.js"></script>
<script src="<%=request.getContextPath()%>/js/chartjs-plugin-annotation.min.js"></script>



<%
	long orgId = ParamUtil.getLong(request, "orgId",LiferayOrganizationUtil.getOrganizationId(user));
	int muc =GetterUtil.getInteger(LiferayOrganizationUtil.getCustomField(orgId, "MUC_DONVI"));
	double dDrgMin = 0;
	double dDrgMax = 0;
	String maDonVi = LiferayOrganizationUtil.getCustomField(orgId, "MA_DONVI");
%>

<style>
.MB20 {
	width: 100% !important;
}

.dashboard-box {
	border: 1px solid #ccc;
	margin: 10px 0px 10px 30px;
	padding: 10px;
	box-shadow: 0px 1px 3px rgba(0, 0, 0, 0.1);
}

.dashboard-o {
	margin: 0px 0px 10px 30px;
	padding: 0px;
}

.chart-legend li span {
	display: inline-block;
	width: 12px;
	height: 12px;
	margin-right: 5px;
}

.chart-legend {
	height: 250px;
	overflow: auto;
}

.chart-legend li {
	cursor: pointer;
}

.strike {
	text-decoration: line-through !important;
}

.float-left {
	float: left;
}
</style>

<portlet:renderURL var="chiTietHoatDongUrl"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="jspPage"
		value="/chitiet_hoatdong.jsp" />
	<portlet:param name="orgId" value="__ORG_ID___" />
</portlet:renderURL>
<portlet:renderURL var="chiTietDinhSuatUrl"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="jspPage"
		value="/chitiet_dinhsuat.jsp" />
	<portlet:param name="orgId" value="<%=String.valueOf(orgId)%>" />
	<portlet:param name="thang" value="__THANG___" />
</portlet:renderURL>

<portlet:renderURL var="chiTietDRGUrl"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="jspPage"
		value="/chitiet_drg.jsp" />
	<portlet:param name="thang" value="__THANG___" />
</portlet:renderURL>

<portlet:renderURL var="viewCapConUrl">
	<portlet:param name="jspPage"
		value="/view.jsp" />
	<portlet:param name="orgId" value="__ORG_ID___" />
</portlet:renderURL>

<h1 style="text-align: center; color: #193a8d"><%=LiferayOrganizationUtil.getOrganizationName(orgId)%></h1>
<hr />

<!--  -->
<div class="main" style="margin: 10px;">
	<c:if test="<%=muc <=2%>">
	
			<div class="row">
				<div class="col-md-6 dashboard-o">
					<div class="row">
						<c:if test="<%=muc ==1%>">
							<liferay-util:include
								page="/cmi/muc_bo.jsp"
								servletContext="<%=application %>">
								<liferay-util:param name="orgId"
									value="<%=String.valueOf(orgId)%>" />
							</liferay-util:include>
						</c:if>
						<c:if test="<%=muc ==2%>">
							<liferay-util:include
								page="/cmi/muc_thanhpho.jsp"
								servletContext="<%=application %>">
								<liferay-util:param name="orgId"
									value="<%=String.valueOf(orgId)%>" />
							</liferay-util:include>
						</c:if>
					</div>
	
					<div class="row">
						<div class="col-md-11 dashboard-box">
							<h5 class="tle1">ĐỊNH SUẤT TIÊU CHUẨN VÀ THỰC TẾ</h5>
							<canvas id="dinhSuatChart" width="777" height="350"></canvas>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 dashboard-box">
							<h5 class="tle1">SỐ TIỀN BẢO HIỂM TỪNG DRG SO VỚI TRUNG BÌNH
								DRG</h5>
							<label>Giá trị trung bình: </label> <input type="text"
								id="<portlet:namespace/>DrgMin"
								onchange="<portlet:namespace/>filterDrg();"
								placeholder="Giá trị thấp nhất" /> - <input type="text"
								id="<portlet:namespace/>DrgMax"
								onchange="<portlet:namespace/>filterDrg();"
								placeholder="Giá trị cao nhất" />
							<canvas id="baoHiemChart" width="777" height="350"></canvas>
						</div>
						<div class="col-md-6">
							<div class="row"></div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-5 dashboard-box">
							<h5 class="tle1">CÁC THÀNH PHẦN CHI PHÍ</h5>
							<canvas id="chiPhiThanhPhanChart" width="320" height="250"></canvas>
						</div>
						<div class="col-md-5 dashboard-box" style="margin-left: 8%;">
							<h5 class="tle1">PHÍ DỊCH VỤ BÌNH QUÂN</h5>
							<canvas id="chiPhiBinhQuanChart" width="320" height="250"></canvas>
						</div>
					</div>
				</div>
				<div class="col-md-5 dashboard-box">
					<div class="row">
						<div class="col-md-9">
							<h5 class="tle1">CHI PHÍ TỪNG CƠ SỞ HOẠT ĐỘNG</h5>
						</div>
						<div class="col-md-3">
							<select class="form-control" onchange="viewCapCon();"
								name='<portlet:namespace/>orgId' id="<portlet:namespace/>orgId">
							</select>
						</div>
					</div>
					<label>Xem theo:</label>
					<button type="button" onclick="updateChart(this,1,<%=orgId%>);"
						class="btn btn-danger">Phí dịch vụ</button>
					<button type="button" onclick="updateChart(this,2,<%=orgId%>);"
						class="btn btn-primary">Định suất</button>
					<button type="button" onclick="updateChart(this,3,<%=orgId%>);"
						class="btn btn-warning">DRG</button>
					<br />
					<canvas id="chiPhiHDChartLine" width="777" height="350"></canvas>
	
				</div>
			</div>
	</c:if>
	<c:if test="<%=muc > 2%>">
		<div class="row">
			<liferay-util:include page="/cmi/muc_coso.jsp" servletContext="<%=this.getServletContext()%>">
				<liferay-util:param name="orgId" value="<%=String.valueOf(orgId)%>" />
			</liferay-util:include>
			<div class="col-md-5 dashboard-box">
				<h5 class="tle1">ĐỊNH SUẤT</h5>
				<canvas id="dinhSuatChart" width="777" height="350"></canvas>
			</div>
		</div>
	
		<div class="row">
			<div class="col-md-5 dashboard-box">
				<h5 class="tle1">SỐ TIỀN BẢO HIỂM TỪNG DRG SO VỚI TRUNG BÌNH DRG
				</h5>
	
				<label>Giá trị trung bình: </label> <input type="text"
					id="<portlet:namespace/>DrgMin"
					onchange="<portlet:namespace/>filterDrg();"
					placeholder="Giá trị thấp nhất" /> - <input type="text"
					id="<portlet:namespace/>DrgMax"
					onchange="<portlet:namespace/>filterDrg();"
					placeholder="Giá trị cao nhất" />
				<canvas id="baoHiemChart" width="777" height="350"></canvas>
			</div>
			<div class="col-md-3 dashboard-box">
				<h5 class="tle1">CÁC THÀNH PHẦN CHI PHÍ</h5>
				<canvas id="chiPhiThanhPhanChart" width="320" height="280"></canvas>
			</div>
			<div class="col-md-3 dashboard-box">
				<h5 class="tle1">PHÍ DỊCH VỤ</h5>
				<canvas id="chiPhiBinhQuanChart" width="320" height="280"></canvas>
			</div>
		</div>
	</c:if>

	<div class="row">
		<div  class="col-md-6 dashboard-o" >
			<div class="row">
				<div class="col-md-11 dashboard-box">
					<div class="row">
						<div  class="col-md-7">
							<h5 class="tle1">SỐ LƯỢNG BỆNH NHÂN DRG</h5>
						</div>
						<div  class="col-md-5">
							<button type="button" onclick="updateBenhNhanDRGChart(this,1);" class="btn-bn-drg btn btn-success btn-sm">Ngày</button>
							<button type="button" onclick="updateBenhNhanDRGChart(this,2);" class="btn-bn-drg btn btn-default btn-sm">Tuần</button>
							<button type="button" onclick="updateBenhNhanDRGChart(this,3);" class="btn-bn-drg btn btn-default btn-sm">Tháng</button>
							<button type="button" onclick="updateBenhNhanDRGChart(this,4);" class="btn-bn-drg btn btn-default btn-sm">Quý</button>
							
						</div>
						<canvas id="soLuongBenhNhanDRG" width="200" height="100"></canvas>
					</div>
				</div>
			</div>
		</div>
		<div  class="col-md-5 dashboard-box">
			<div class="row">
				<div  class="col-md-6">
					<h5 class="tle1">SỐ LƯỢNG BỆNH NHÂN ĐỊNH SUẤT</h5>
				</div>
				<div  class="col-md-6">
					<button type="button" onclick="updateBenhNhanDSChart(this,1);" class="btn-bn-ds btn btn-success btn-sm">Ngày</button>
					<button type="button" onclick="updateBenhNhanDSChart(this,2);" class="btn-bn-ds btn btn-default btn-sm">Tuần</button>
					<button type="button" onclick="updateBenhNhanDSChart(this,3);" class="btn-bn-ds btn btn-default btn-sm">Tháng</button>
					<button type="button" onclick="updateBenhNhanDSChart(this,4);" class="btn-bn-ds btn btn-default btn-sm">Quý</button>
				</div>
				<canvas id="soLuongBenhNhanDinhSuat" width="200" height="83"></canvas>
			</div>
		</div>
	</div>
<!--  -->
</div>
<liferay-portlet:resourceURL var="getChartData" id="getChartData"
	copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>
<liferay-portlet:resourceURL var="getChartChiPhiHDData"
	id="getChartChiPhiHDData" copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>
<liferay-portlet:resourceURL var="getChartDinhSuat"
	id="getChartDinhSuat" copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>
<liferay-portlet:resourceURL var="getDRGData" id="getDRGData"
	copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>

<liferay-portlet:resourceURL var="getReportSoLuongBenhNhanDinhSuat" id="getReportSoLuongBenhNhanDinhSuat"
	copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>
<liferay-portlet:resourceURL var="getReportSoLuongBenhNhanDRG" id="getReportSoLuongBenhNhanDRG"
	copyCurrentRenderParameters="<%=false%>"></liferay-portlet:resourceURL>

<script>

var d = new Date();
var nam = d.getFullYear();

$(document).ready(function(){
	getChartData(<%=orgId%>,<%=maDonVi%>);
	getChartChiPhiHDData(<%=orgId%>,nam,<%=muc%>);
	getChartDinhSuat(<%=orgId%>,nam,<%=muc%>);
	getDRGData(<%=orgId%>,<%=dDrgMin%> ,<%=dDrgMax%>); 
	
	getReportSoLuongBenhNhanDRG(<%=orgId%>,1).then( (data) => generateSoLuongBenhNhanDRG(data) );
	getReportSoLuongBenhNhanDinhSuat(<%=orgId%>,1).then( (data) => generateSoLuongBenhNhanDinhSuat(data) );
	///Carousel
	 $('#Carousel').carousel({
	    interval: 5000
	 })
});

async function getReportSoLuongBenhNhanDRG(orgId, getBy){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>getBy': getBy
	};
	var result = await $.ajax({
		url : '<%=getReportSoLuongBenhNhanDRG%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			return data;
			if(data != undefined){
				
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
	return result;
}

async function getReportSoLuongBenhNhanDinhSuat(orgId, getBy){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>getBy': getBy
	};
	var result = await $.ajax({
		url : '<%=getReportSoLuongBenhNhanDinhSuat%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data != undefined){
				
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
	return result;
}


function viewCapCon(){
	var orgId = $("#<portlet:namespace/>orgId").val();
	var url = "<%=viewCapConUrl%>";
	url = url.replace("__ORG_ID___",orgId);
	location.href= url;
}
function getDRGData(orgId, min, max){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>pMin': min,
			'<portlet:namespace/>pMax': max,
	};
	$.ajax({
		url : '<%=getDRGData%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data.baoHiem != undefined){
				var drgObject = JSON.parse(data.baoHiem);
				drgBaoHiemPoint(drgObject);
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
}
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
			console.log(data);
			if(data.chiPhiHoatDongObject != undefined){
				var chiPhiHoatDongObject = JSON.parse(data.chiPhiHoatDongObject);
				if(chiPhiHoatDongObject != undefined){
					var drg;
					var phiDichVu;
					var dinhSuat;
					var chiPhiHoatDongDatas;
					var labels = chiPhiHoatDongObject.labels;
					var heightItem = (2300/58)*labels.length;
					$("#chiPhiHDChartLine").attr("height",heightItem);
					phiDichVu = chiPhiHoatDongObject.phiDichVu;
					dinhSuat = chiPhiHoatDongObject.dinhSuat;
					drg =chiPhiHoatDongObject.drg;
					
					chiPhiHoatDongDatas = [drg,phiDichVu,dinhSuat];
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
function getChartDinhSuat(orgId, nam, muc){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>nam': nam,
			'<portlet:namespace/>muc': muc 
	};
	$.ajax({
		url : '<%=getChartDinhSuat%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data.dinhSuat != undefined){
				var dinhSuat = JSON.parse(data.dinhSuat);
				generateDinhSuatChart(dinhSuat);
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
}


function getChartData(orgId, maDonVi){
	var params = {
			'<portlet:namespace/>orgId': orgId,
			'<portlet:namespace/>maDonVi': maDonVi
	};
	$.ajax({
		url : '<%=getChartData%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			if(data != ""){
				if(data.chiPhiBinhQuan != undefined){
					generateChiPhiBinhQuanChart(data.chiPhiBinhQuan);
				}
				if(data.chiPhiData != undefined){
					generateChiPhiThanhPhanChartPie(data.chiPhiData);
				}
			}					
		},
		error : function(data) {
			console.info("error");
		}
	});
}
function OEPFillSelectData(selElement, data, keyFieldName, valueFieldName, blankOptionText){
	$(selElement).empty();
	$(selElement).append($('<option>', {
		value: "",
		text: blankOptionText
	}));
	for(var i = 0; i < data.length; i++){
		$(selElement).append($('<option>', {
			value: data[i][keyFieldName],
			text: data[i][valueFieldName]
		}));
	}
}

</script>

<script>

function xemChiTiet(url){
	openDialogOEPAdv('chiTiet','Chi tiết', url, '800', '1000');
}

//start generatechiPhiThanhPhanChart
function generateChiPhiThanhPhanChartPie(chartData){
	var chiPhiPie = document.getElementById('chiPhiThanhPhanChart').getContext('2d');
	var chiPhiThanhPhanChart = new Chart(chiPhiPie, {
	    type: 'pie',
	    data: {
	        labels: ['Phí dịch vụ', 'Định suất', 'DRG'],
	        datasets: [{
	            label: '# of Votes',
	            data: chartData,
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255, 99, 132, 1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	    	plugins: {
	            datalabels: {
	                color: 'blue',
	                labels: {
	                    title: {
	                        font: {
	                            weight: 'bold'
	                        }
	                    },
	                    value: {
	                        color: 'green'
	                    }
	                }
	            }
	        },
	        animation:{
				animateRotate:true
			},
			legend: {
				position: 'bottom'
			}
	    }
	});
	
}
// end chiPhiHDChartLine

// start hoatDongBarLine

function generateDinhSuatChart(dinhSuatData){
	var dinhSuatCanvas = document.getElementById('dinhSuatChart');
	var dinhSuatCanvasChart = dinhSuatCanvas.getContext('2d')
	var dinhSuatChart = new Chart(dinhSuatCanvasChart, {
	    type: 'bar',
	    data: {
	        datasets: [{
	            label: 'Định suất tiêu chuẩn',
	            data: dinhSuatData.dinhSuatTieuChuan,
	            type: 'line',
				borderColor: 'rgb(255, 99, 132)',
				backgroundColor: 'transparent',
	            order: 1,
				yAxisID: 'A'
	        },{
	            label: 'Định suất thực tế',
	            data: dinhSuatData.dinhSuatThucTe,
				backgroundColor: 'rgba(54, 162, 235, 1)',
	            borderColor: 'rgba(54, 162, 235, 1)',
				borderWidth: 1,
	            order: 2,
				yAxisID: 'A'
	        }, {
	            label: 'Số lượng bệnh nhân',
	            data: dinhSuatData.soLuongBenhNhan,
	            type: 'line',
				borderColor: 'rgba(255, 159, 64, 0.2)',
				backgroundColor: 'rgba(255, 159, 64, 0.5)',
	            // this dataset is drawn on top
	            order: 3,
				yAxisID: 'B',
				pointRadius: 0
	        }],
	        labels: ['T1', 'T2', 'T3', 'T4', 'T5', 'T6', 'T7', 'T8', 'T9', 'T10', 'T11', 'T12']
	    },
	    options: {
	        scales: {
	            yAxes: [{
					id: 'A',
					type: 'linear',
					position: 'left',
					scaleLabel: {
						labelString: 'Đồng',
						display: true,
						fontColor: 'blue'
					},
					ticks: {
	                    beginAtZero: true,
						fontColor: 'blue',
						userCallback: function(value, index, values) {
							value = value.toString();
							value = value.split(/(?=(?:...)*$)/);
							value = value.join('.');
							return value;
						}
	                }
				  }, {
					id: 'B',
					type: 'linear',
					position: 'right',
					scaleLabel: {
						labelString: 'Người',
						display: true,
						fontColor: 'orange'
					},
					gridLines: {
						drawOnChartArea: false
					  },
					  ticks: {
	                    beginAtZero: true,
						fontColor: 'orange',
						userCallback: function(value, index, values) {
							value = value.toString();
							value = value.split(/(?=(?:...)*$)/);
							value = value.join('.');
							return value;
						}
	                }
				  }]
	        },
			legend: {
				position: 'bottom'
			},
			tooltips: {
				callbacks: {
					label: function(tooltipItem, data) {
						return  Number(tooltipItem.yLabel).toFixed(0).replace(/./g, function(c, i, a) {
							return i > 0 && c !== "." && (a.length - i) % 3 === 0 ? "." + c : c;
						});
					}
				}
			}
	    }
	});
	
	dinhSuatCanvas.onclick = function(evt) {
	    var activePoints = dinhSuatChart.getElementsAtEvent(evt);
	    if (activePoints[0]) {
	      var chartData = activePoints[0]['_chart'].config.data;
	      var thang = activePoints[0]['_index'] + 1;
	      var url = "<%=chiTietDinhSuatUrl.toString()%>";
	      url = url.replace("__THANG___",thang);
	      xemChiTiet(url);
	    }
	};
}	
//end hoatDongBarLine


/// start generateChiPhiBinhQuanChart
function generateChiPhiBinhQuanChart(data){
		var hoatDongPie = document.getElementById('chiPhiBinhQuanChart').getContext('2d');
		var chiPhiBinhQuanChart = new Chart(hoatDongPie, {
		    type: 'pie',
		    data: {
		        labels: ['CP bình quân Phí dịch vụ', 'CP bình quân Bệnh viên'],
		        datasets: [{
		            label: '# of Votes',
		            data: data,
		            backgroundColor: [
		                'rgba(255, 99, 132, 0.2)',
		                'rgba(54, 162, 235, 0.2)'
		            ],
		            borderColor: [
		                'rgba(255, 99, 132, 1)',
		                'rgba(54, 162, 235, 1)'
		            ],
		            borderWidth: 1
		        }]
		    },
		    options: {
		    	plugins: {
		            datalabels: {
		                color: 'blue',
		                labels: {
		                    title: {
		                        font: {
		                            weight: 'bold'
		                        }
		                    },
		                    value: {
		                        color: 'green'
		                    }
		                }
		            }
		        },
		        animation:{
					animateRotate:true
				},
				legend: {
					position: 'bottom'
				}
		    }
		});
	}

//end generateHoatDongPie

//start hoatDongDRGLine
var hoatDongDRGLine;
	function drgBaoHiemPoint(data){
		hoatDongDRGLine = document.getElementById('baoHiemChart').getContext('2d');
		hoatDongDRGLine = new Chart(hoatDongDRGLine, {
			type: 'line',
			data: {
				labels: ['T1', 'T2', 'T3', 'T4', 'T5', 'T6', 'T7', 'T8', 'T9', 'T10', 'T11', 'T12'],
				datasets:data
			},
			options: {
				responsive: true,
				title: {
					display: true,
				},
				legend: {
					display: false,
					position  : 'bottom'
				},
				elements: {
					point: {
						pointStyle: "circle"
					}
				},
				 onClick: function(evt, element) {
					console.log(element)
			      	var activePoints = hoatDongDRGLine.getElementAtEvent(evt);
			      	console.log(activePoints[0]);
			    }
			}
		});
	<%-- 	document.getElementById('baoHiemChart').onclick = function(evt) {
			console.log(evt);
		    var activePoints = hoatDongDRGLine.getElementsAtEvent(evt);
		    if (activePoints[0] && <%=muc%> < 2) {
		      var chartData = activePoints[0]['_chart'].config.data;
		      var idx = activePoints[0]['_index'];
		      var thang = activePoints[0]['_index'] + 1;
		      console.log(activePoints[0]);

		      //alert(maDrg);
		      var url = "<%=chiTietDRGUrl.toString()%>";
		      url = url.replace("__THANG___",thang);
		     // xemChiTiet(url);
		    }
		}; --%>
		
	}
	
// end hoatDongDRGLine
// chi phi hoat dong
var chiPhiHDChartLine;

function chiPhiHoatDongChartLine(chiPhiHoatDongDatas,labels){
	var chiPhiLineCanvas = document.getElementById('chiPhiHDChartLine');
	var chiPhiLine = chiPhiLineCanvas.getContext('2d');
	chiPhiHDChartLine = new Chart(chiPhiLine, {
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
			},
			 onClick: function(evt, element) {
				console.log(element);
		      	var activePoints = chiPhiHDChartLine.getElementAtEvent(evt);
		        if (activePoints[0] && <%=muc%> < 2) {
		  	      var chartData = activePoints[0]['_chart'].config.data;
		  	      var idx = activePoints[0]['_index'];
		  	      var value = chartData.datasets[0].other[idx];
		  	      var url = "<%=chiTietHoatDongUrl.toString()%>";
		  	      url = url.replace("__ORG_ID___",value);
		  	      xemChiTiet(url);
		  	    }
		    }
		}
	});
}

function updateChart(elm,type,orgId) {
	chiPhiHDChartLine.destroy();
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
					$("#chiPhiHDChartLine").attr("height",heightItem);
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

function <portlet:namespace/>filterDrg() {
	var min = $("#<portlet:namespace/>DrgMin");
	var max = $("#<portlet:namespace/>DrgMax");
	var  dMin = parseFloat(!min.val() ? 0 : min.val());
	var  dMax = parseFloat(!max.val() ? 0 : max.val());
	if(dMin>dMax){
		console.log('khong hop he');
		return;
	}
	
	hoatDongDRGLine.destroy();
	getDRGData(<%=orgId%>,dMin,dMax);
}



$(document).ready(function(){
	$(function(){
	 
	    $(document).on( 'scroll', function(){
	 
	    	if ($(window).scrollTop() > 100) {
				$('.scroll-top-wrapper').addClass('show');
			} else {
				$('.scroll-top-wrapper').removeClass('show');
			}
		});
	 
		$('.scroll-top-wrapper').on('click', scrollToTop);
	});
	 
	function scrollToTop() {
		verticalOffset = typeof(verticalOffset) != 'undefined' ? verticalOffset : 0;
		element = $('body');
		offset = element.offset();
		offsetTop = offset.top;
		$('html, body').animate({scrollTop: offsetTop}, 500, 'linear');
	}
});

//end chi phi hoat dong

Chart.plugins.register({
	afterDraw: function(chart) {
  	if (chart.data.datasets.length === 0) {
    	// No data is present
      var ctx = chart.chart.ctx;
      var width = chart.chart.width;
      var height = chart.chart.height
      chart.clear();
      
      ctx.save();
      ctx.textAlign = 'center';
      ctx.textBaseline = 'middle';
      ctx.font = "16px normal 'Helvetica Nueue'";
      ctx.fillText('No data to display', width / 2, height / 2);
      ctx.restore();
    }
  }
});



async function updateBenhNhanDRGChart(elm,type){
	buttonActive("btn-bn-drg",elm);
	 
	 await getReportSoLuongBenhNhanDRG(<%=orgId%>,type).then(
			 function(data){
				soLuongBenhNhanDRG.data.datasets[0].data = data.soLuongQuyDinh;
				soLuongBenhNhanDRG.data.datasets[1].data = data.soLuongThucTe;
				soLuongBenhNhanDRG.data.labels = data.labels;
			 }
	);
	soLuongBenhNhanDRG.update();
}

async function updateBenhNhanDSChart(elm,type){
	buttonActive("btn-bn-ds",elm);
	
	 await getReportSoLuongBenhNhanDinhSuat(<%=orgId%>,type).then(
			 function(data){
				 soLuongBenhNhanDinhSuat.data.datasets[0].data = data.soLuongQuyDinh;
				 soLuongBenhNhanDinhSuat.data.datasets[1].data = data.soLuongThucTe;
				 soLuongBenhNhanDinhSuat.data.labels = data.labels;
			 }
	);
	 soLuongBenhNhanDinhSuat.update();
}

function buttonActive(className,elm){
	$("." + className).each(function(){
	    $(this).removeClass("btn-success");
	})
	$(elm).addClass("btn-success");
}

var soLuongBenhNhanDRG;
function generateSoLuongBenhNhanDRG(soLuongBNData){
	var soLuongBenhNhanDRGCanVas = document.getElementById('soLuongBenhNhanDRG').getContext('2d');
	soLuongBenhNhanDRG = new Chart(soLuongBenhNhanDRGCanVas, {
	    type: 'bar',
	    data: {
	        datasets: [{
	            label: 'Số lượng theo quy định',
	            data: soLuongBNData.soLuongQuyDinh,
	            type: 'line',
				borderColor: 'rgba(255, 99, 132, 1)',
				backgroundColor: 'transparent',
	            pointBackgroundColor: 'rgba(255, 99, 132, 1)',
				pointRadius: 5
	        },{
	            label: 'Số lượng thực tế',
	            data: soLuongBNData.soLuongThucTe,
				backgroundColor: ['rgba(54, 162, 235, 0.2)','rgba(54, 162, 235, 0.2)','rgba(54, 162, 235, 0.2)','rgba(255, 159, 64, 0.2)'],
	            borderColor: ['rgba(54, 162, 235, 1)','rgba(54, 162, 235, 1)','rgba(54, 162, 235, 1)','rgba(255, 159, 64, 1)'],
				borderWidth: 1,
	            order: 2
	        }],
	        labels: soLuongBNData.labels
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero: true,
	                    userCallback: function(value, index, values) {
							value = value.toString();
							value = value.split(/(?=(?:...)*$)/);
							value = value.join('.');
							return value;
						}
	                }
	            }]
	        },
			legend: {
				position: 'bottom'
			},
			tooltips: {
				callbacks: {
					label: function(tooltipItem, data) {
						return  Number(tooltipItem.yLabel).toFixed(0).replace(/./g, function(c, i, a) {
							return i > 0 && c !== "." && (a.length - i) % 3 === 0 ? "." + c : c;
						});
					}
				}
			}
	    }
	});
}

var soLuongBenhNhanDinhSuat;
function generateSoLuongBenhNhanDinhSuat(soLuongBNData){
	var soLuongBenhNhanDinhSuatCanvas = document.getElementById('soLuongBenhNhanDinhSuat').getContext('2d');
	 soLuongBenhNhanDinhSuat = new Chart(soLuongBenhNhanDinhSuatCanvas, {
	    type: 'bar',
	    data: {
	        datasets: [{
	            label: 'Số lượng theo quy định',
	            data: soLuongBNData.soLuongQuyDinh,
	            type: 'line',
				borderColor: 'rgba(255, 99, 132, 1)',
				backgroundColor: 'transparent',
	            pointBackgroundColor: 'rgba(255, 99, 132, 1)',
				pointRadius: 5
	        },{
	            label: 'Số lượng thực tế',
	            data: soLuongBNData.soLuongThucTe,
				backgroundColor: ['rgba(54, 162, 235, 0.2)','rgba(54, 162, 235, 0.2)','rgba(54, 162, 235, 0.2)','rgba(255, 159, 64, 0.2)'],
	            borderColor: ['rgba(54, 162, 235, 1)','rgba(54, 162, 235, 1)','rgba(54, 162, 235, 1)','rgba(255, 159, 64, 1)'],
				borderWidth: 1,
	            order: 2
	        }],
	        labels: soLuongBNData.labels
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero: true,
	                    userCallback: function(value, index, values) {
							value = value.toString();
							value = value.split(/(?=(?:...)*$)/);
							value = value.join('.');
							return value;
						}
	                }
	            }]
	        },
			legend: {
				position: 'bottom'
			},
			tooltips: {
				callbacks: {
					label: function(tooltipItem, data) {
						return  Number(tooltipItem.yLabel).toFixed(0).replace(/./g, function(c, i, a) {
							return i > 0 && c !== "." && (a.length - i) % 3 === 0 ? "." + c : c;
						});
					}
				}
			}
	    }
	});
}

</script>


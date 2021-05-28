<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<portlet:resourceURL id="getThongKeBaoCaoHoSo" var="getThongKeBaoCaoHoSoURL">
</portlet:resourceURL>
<section class="bg-slide">
	<div class="container">
		<div class="row">
			<div class="col-md-10 offset-md-1">
			  <div class="carousel slide sq-crousal4 mb-3 min-vh-20" data-ride="carousel" id="sq-crousal4">
				<!-- Bottom Carousel Indicators -->
				<ol class="carousel-indicators top90">
				  <li data-target="#sq-crousal4" data-slide-to="0" class="active"></li>
				  <li data-target="#sq-crousal4" data-slide-to="1"></li>
				  <li data-target="#sq-crousal4" data-slide-to="2"></li>
				</ol>

				<!-- Carousel Slides / Quotes -->
				<div class="carousel-inner">
					<h3 class="tle text-white text-center my-4">Thông báo <span class="line"></span></h3>
				  <!-- Quote 1 -->
				  <div class="carousel-item active">
					<div class="row">
						<div class="col-md-10 offset-md-1 text-center">
							<div class="feedback-text pl-3">
								<p class="font-18 text-white"><%=report1%></p>
							</div>
						</div>
					  </div>
				  </div>
				  <!-- Quote 2 -->
				  <div class="carousel-item">
						<div class="row">
								<div class="col-md-10 offset-md-1 text-center">
									<div class="feedback-text pl-3">
								<p class="font-18 text-white"><%=report2%></p>
							</div>
								</div>
							</div>
				  </div>
				  <!-- Quote 3 -->
				  <div class="carousel-item">
					<div class="row">
							<div class="col-md-10 offset-md-1 text-center">
								<div class="feedback-text pl-3">
								<p class="font-18 text-white"><%=report3%></p>
							</div>
							</div>
						</div>
				  </div>
				</div>

				<!-- Carousel Buttons Next/Prev -->
				 <!-- Left and right controls -->
				  <!--<a class="carousel-control-prev" href="#sq-crousal4" data-slide="prev">
					<span class="fa fa-angle-left"></span>
				  </a>
				  <a class="carousel-control-next" href="#sq-crousal4" data-slide="next">
					<span class="fa fa-angle-right"></span>
				  </a>-->
			  </div>                          
			</div>
		  </div>
		<div class="text-right">
		<div class="btn-group">
			<button type="button" class="btn dropdown-toggle text-white" data-toggle="dropdown">
			   Chọn năm
			</button>
			<div class="dropdown-menu dropdown-menu-right">
			  <a class="dropdown-item" href="javascript:void(0)" onclick='getThongKeHoSo(2021)'>2021</a>
			  <a class="dropdown-item" href="javascript:void(0)" onclick='getThongKeHoSo(2020)'>2020</a>
			  <a class="dropdown-item" href="javascript:void(0)" onclick='getThongKeHoSo(2019)'>2019</a>
			  <a class="dropdown-item" href="javascript:void(0)" onclick='getThongKeHoSo(2018)'>2018</a>
			</div>
		  </div>
		</div>
		<div class="uk-position-relative uk-visible-toggle uk-light" tabindex="-1" uk-slider>

			<ul class="uk-slider-items uk-child-width-1-2 uk-child-width-1-4@m uk-grid" id="<portlet:namespace/>ul_row_thongke">
				
			</ul>

			<a class="uk-position-center-left uk-position-small uk-hidden-hover" href="#" uk-slidenav-previous uk-slider-item="previous"></a>
			<a class="uk-position-center-right uk-position-small uk-hidden-hover" href="#" uk-slidenav-next uk-slider-item="next"></a>

		</div>
	</div>
</section>
<script>
window.onload = function() {
	setTimeout(function(){ getThongKeHoSo(2021); }, 1000);
}
function getThongKeHoSo(nam){
	var params = {
			'<portlet:namespace/>nam':			nam
		};
	$.ajax({
		url : '<%=getThongKeBaoCaoHoSoURL%>',
		data : params,
		type: 'POST',
		dataType : "json",
		success : function(data) {
			$("#<portlet:namespace/>ul_row_thongke").empty();
			for (var i = 0; i < data.length; i++) {
				var html = '<li id="<portlet:namespace/>upload_row_thongke">';
						html += '<div class="uk-panel">'
							if(data[i].giatri > 0){
								html += '<span class="h150 d-block bg-xanh" ></span>';
							}else{
								html += '<span class="h150 d-block shadow bg-white-50" ></span>'
							}							
								html += '<div class="uk-position-center uk-panel">'
									html += '<h1 class="text-white font-weight-bold">'+data[i].giatri+'</h1>'
									html += '<p class="text-primary text-center">Tháng '+data[i].thang+'</p>'
								html += '</div>'
						html += '</div>'
					html += '</li>'
				$("#<portlet:namespace/>ul_row_thongke").append(html);
	        }
		},
		error : function(data) {
			console.info("error");
		}
	});
}
/* function addItemThongKe(thang,giatri){
	
	var html = document.getElementById("<portlet:namespace/>upload_row_thongke").outerHTML;
	html = html.replace('__thang__', thang);
	html = html.replace('__giatri__', giatri);
	if(giatri > 0){
		html = html.replace('__CSSCLASS__', 'bg-xanh');
	}else{
		html = html.replace('__CSSCLASS__', "shadow bg-white-50");
	}
	$("#<portlet:namespace/>ul_row_thongke").append(html);
} */
</script>
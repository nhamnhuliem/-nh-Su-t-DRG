<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>
	<link href="${theme_display.getPathThemeCss()}/style.css" rel="stylesheet">
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<script src="${theme_display.getPathThemeJavaScript()}/uikit.min.js"></script>
	<script src="${theme_display.getPathThemeJavaScript()}/uikit-icons.min.js"></script>
	<script src="${theme_display.getPathThemeJavaScript()}/jquery-3.3.1.min.js"></script>
	<script src="${theme_display.getPathThemeJavaScript()}/popper.min.js"></script>
	<script src="${theme_display.getPathThemeJavaScript()}/bootstrap-4.3.1.js"></script>
	<@liferay_util["include"] page=top_head_include />
</head>

<body>

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<div id="wrapper">
	<header class="bg-xanh d-none d-lg-block">
		<div class="container">
			<div class="row py-2 align-items-center">
				<div class="col-10 mr-auto">
					<a class="float-left" href=""><img class="mr-3" src="${site_logo}" height="75" alt="${logo_description}"></a>
					<h5 class="text-white text-uppercase mt-3">Cổng công bố thông tin thanh quyết toán bảo hiểm <br>
	theo phương thức chi trả mới Định suất & DRG
					</h5>
					
				</div>
				<div class="col-auto">
					<#if !is_signed_in>
						<a style="text-decoration: none;color: #f1eded;" data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow"><i class="fas fa-sign-in-alt"></i> ${sign_in_text}</a>
					<#else>
						<ul class="navbar-nav">
							<#assign
								myPlaces = user.getOrganizations()				
								isCanBo ="0"
							/>
							<#list myPlaces as myPlace>
								<#assign
									isCanBo ="1"
								/>
								<#break>
							</#list>
							<li class="nav-item dropdown">
							  <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
							  <i class="fas fa-user-circle fa-2x"></i>
							  </a>
							  <div class="dropdown-menu">
								<a class="dropdown-item" href="${community_default_private_url}">Xử lý nghiệp vụ</a>
								 <div class="dropdown-divider"></div>
								<a class="dropdown-item" href="${sign_out_url}">Thoát</a>
							  </div>
							</li>
					</#if>
				</div>
			</div>
		</div>		
	</header>
	<#if has_navigation && is_setup_complete>
		<#include "${full_templates_path}/navigation.ftl" />
	</#if>
	<section id="content">
		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>

	<footer class="bg-xanh py-5">
		  <div class="container">
			  <h5 class="text-uppercase text-white">Hệ thống hỗ trợ ra quyết định quản trị phương thức chi trả</h5>
			  <h6 class="text-white">Bản quyền thuộc Bộ Y Tế</h6>
			  <ul class="list-unstyled text-primary mb-0">
			  	<li> <i class="fas fa-map-marker-alt mr-2"></i>Số 138A Giảng Võ - Ba Đình - Hà Nội</li>
				  <li><i class="fas fa-phone-alt mr-2"></i>0246.273.2.273 <span class="mx-4">|</span> <i class="fas fa-fax mr-2"></i>0243.8464.051</li>
			  </ul>
		  </div>
	</footer>
</div>
	<script>
	    $(document).ready( function() {
	    	$(".input-container").prop("disabled", false); 
	    });
	</script>
</body>

</html>
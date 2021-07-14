<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
	<div class="container">		
		<a class="navbar-brand d-none d-block d-lg-none py-0" href="/trang-chu">
			<img class="mr-3 float-left" src="${company_logo}" height="46" alt="">					
		</a>
	  	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> 
		  <span class="navbar-toggler-icon"></span> 
		</button>
	  <div class="collapse navbar-collapse" id="navbarSupportedContent1">
	    <ul class="navbar-nav mr-auto">
	    	<#list nav_items as nav_item>
				<#assign
					nav_item_attr_has_popup = ""
					nav_item_css_class = "nav-item"
					nav_item_layout = nav_item.getLayout()
				/>
	
				<#if nav_item.isSelected()>
					<#assign
						nav_item_attr_has_popup = "aria-haspopup='true'"
						nav_item_css_class = "nav-item active"
					/>
				</#if>
				<li class="${nav_item_css_class}" id="layout_${nav_item.getLayoutId()}" role="presentation">
					<a aria-labelledby="layout_${nav_item.getLayoutId()}" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} class="nav-link" role="menuitem"><@liferay_theme["layout-icon"] layout=nav_item_layout /><i id ="menu_${nav_item.getLayoutId()}"></i> ${nav_item.getName()}</a>
				</li>
			</#list>
	    </ul>
	  </div>
	</div>	
</nav>
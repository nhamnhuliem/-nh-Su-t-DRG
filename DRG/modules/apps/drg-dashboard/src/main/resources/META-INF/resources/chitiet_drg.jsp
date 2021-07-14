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
	long orgId = ParamUtil.getLong(request, "orgId",LiferayOrganizationUtil.getOrganizationId(user));
	int muc =GetterUtil.getInteger(LiferayOrganizationUtil.getCustomField(orgId, "MUC_DONVI"));
	int thang = ParamUtil.getInteger(request, "thang");
	String maDrg = ParamUtil.getString(request, "maDrg");
%>
	<main class="container-fluid bg-xam">
			<section class="container">
				<div class="main">
					<div>
						<h3 class="tle1">DANH SÁCH HỒ SƠ THEO DRG</h3>
						<h3>DRG: <%=maDrg %> - Tháng: <%=thang %></h3>
						<table class="oep-table table-bordered table-hover table-striped table-responsive table-byte">
							<thead class="table-yte">
								<tr>
									<th style="width: 5%;">STT</th>
									<th style="width: 15%;">Tỉnh thành phố</th>
									<th style="width: 20%;">DRG</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="text-center">1</td>
									<td>Hà Nội</td>
									<td class="text-center">30.500.000</td>
								</tr>
								<tr>
									<td class="text-center">2</td>
									<td>Hồ Chí Minh</td>
									<td class="text-center">20.500.000</td>
								</tr>
								<tr>
									<td class="text-center">3</td>
									<td>Cần Thơ</td>
									<td class="text-center">12.500.000</td>
								</tr>
								
							</tbody>
						</table>
						
					</div>
				<!-- Kết  thúc danh sách DVC -->
				</div>
			</section>
		</main>



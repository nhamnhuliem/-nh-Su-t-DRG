<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>

<%@ include file="./init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
                           var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
                           var="configurationRenderURL" />

<aui:form action="<%= configurationActionURL %>" method="post" name="fm" style="padding: 30px;">

    <aui:input name="<%= Constants.CMD %>" type="hidden"
               value="<%= Constants.UPDATE %>" />

    <aui:input name="redirect" type="hidden"
               value="<%= configurationRenderURL %>" />
    <div class="form-group">
	    <label for="report1">Nội dung thông báo 1:</label>
	    <textarea class="form-control" id="<portlet:namespace/>report1" name="<portlet:namespace/>report1" rows="3"><%= report1 %></textarea>
	</div>
	<div class="form-group">
	    <label for="report2">Nội dung thông báo 2:</label>
	    <textarea class="form-control" id="<portlet:namespace/>report2" name="<portlet:namespace/>report2" rows="3"><%= report2 %></textarea>
	</div>
    <div class="form-group">
	    <label for="report3">Nội dung thông báo 3:</label>
	    <textarea class="form-control" id="<portlet:namespace/>report3" name="<portlet:namespace/>report3" rows="3"><%= report3 %></textarea>
	</div>
    <input class="btn btn-success" type="submit" value="Lưu lại">
</aui:form>
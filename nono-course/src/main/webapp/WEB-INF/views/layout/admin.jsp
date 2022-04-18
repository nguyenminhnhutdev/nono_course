<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Page - Admin</title>

<!-- Css -->
    <link rel="stylesheet" href="/nono-course/assets/admin/dist/styles.css">
    <link rel="stylesheet" href="/nono-course/assets/admin/dist/all.css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,400i,600,600i,700,700i" rel="stylesheet">



</head>

<body>
	<%@include file="/WEB-INF/views/layout/admin/header_admin.jsp"%>
	<decorator:body />
	
	<script src="/nono-course/assets/admin/main.js"></script>
</body>

</html>
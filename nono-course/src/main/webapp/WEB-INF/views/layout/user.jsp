<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>

<head>
<!-- Basic -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Site Metas -->
<link rel="icon" href="images/fevicon.png" type="image/gif" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />

<title>Nono-Course</title>


<!-- bootstrap core css -->
<%-- <link href="<c:url value = "/assets/user/css/bootstrap.css"</c:url>" rel="stylesheet"/> --%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
<!-- fonts style -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:400,600,700&display=swap"
	rel="stylesheet" />

<!-- font awesome style -->
<%-- <link href="<c:url value = "/assets/user/css/font-awesome.min.css" </c:url>" rel="stylesheet" /> --%>
<!-- Custom styles for this template --> 
<link href="<c:url value = "/assets/user/css/style.css"></c:url>" rel="stylesheet" />


<!-- responsive style -->
<%-- <link href="<c:url value = "/assets/user/css/responsive.css"</c:url>" rel="stylesheet" />
  --%>
</head>

<body>
	
	<%@include file="/WEB-INF/views/layout/partial-user/header.jsp"%>
	<decorator:body />
	<%@include file="/WEB-INF/views/layout/partial-user/footer.jsp"%>

	


	<!-- jQery -->
	<script src="/nono-course/assets/user/js/jquery-3.4.1.min.js"></script>
	<!-- bootstrap js -->
	<script src="/nono-course/assets/user/js/bootstrap.js"></script>
	<!-- custom js -->
	<script src="/nono-course/assets/user/js/custom.js"></script>
	<!-- Google Map -->
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap"></script>
	<!-- End Google Map -->

</body>

</html>

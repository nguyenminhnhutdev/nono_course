<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>Nono_Course</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon" />

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap"
	rel="stylesheet" />

<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet" />

<!-- Libraries Stylesheet -->
<%-- <link href="<c:url value = "/assets/user/lib/animate/animate.min.css" </c:url>" rel="stylesheet" /> --%>
<link
	href="<c:url value = "/assets/user/lib/owlcarousel/assets/owl.carousel.min.css"></c:url>"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="<c:url value = "/assets/user/css/style.css"></c:url>"
	rel="stylesheet" />
</head>

<body>


	<%@include file="/WEB-INF/views/layout/partial-user/header.jsp"%>
	<decorator:body />
	<%@include file="/WEB-INF/views/layout/partial-user/footer.jsp"%>

	
	<!-- Carousel Start -->
	

	

	<!-- Back to Top -->
	<a href="#" class="btn btn-primary back-to-top"><i
		class="fa fa-angle-double-up"></i></a>

	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
	<script
		src="<c:url value = "/assets/user/lib/easing/easing.min.js"></c:url>"></script>
	<script
		src="<c:url value = "/assets/user/lib/owlcarousel/owl.carousel.min.js"></c:url>"></script>

	<!-- Contact Javascript File -->
	<script
		src="<c:url value = "/assets/user/mail/jqBootstrapValidation.min.js"></c:url>"></script>
	<script src="<c:url value = "/assets/user/mail/contact.js"></c:url>"></script>

	<!-- Template Javascript -->
	<script
		src="<c:url value = "/assets/user/js/main.js"></c:url>js/main.js"></script>
</body>
</html>

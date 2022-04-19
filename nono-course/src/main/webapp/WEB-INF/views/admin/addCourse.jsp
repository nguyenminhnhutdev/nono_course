<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<body>

	<link href="<c:url value = "/assets/user/css/style-login.css"></c:url>"
		rel="stylesheet" />
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"
		integrity="sha512-5A8nwdMOWrSz20fDsjczgUidUBR8liPYU+WymTZP1lmY9G6Oc7HlZv156XqnsgNUzTyMefFTcsFH/tnJE/+xBg=="
		crossorigin="anonymous" />

	<!-- Form without bootstrap -->
	<div class="auth-wrapper">
		<div class="auth-container">
			<div class="auth-action-left">
				<div class="auth-form-outer">
					<h2 class="auth-form-title"></h2>
					<div class="auth-external-container">
						<div class="auth-external-list">
							<ul>
								<li><a href="#"><i class="fa fa-google"></i></a></li>
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
							</ul>
						</div>
						<p class="auth-sgt"></p>
					</div>
					<form:form action="savecorse" method="post" modelAttribute="coures" class="login-form">
					 <form:hidden path="IdCourse"/>
					
						<form:input path="NameCourse"  type="text" class="auth-form-input"
							placeholder="Tên khóa học"/> 
							<form:input path="IdCategory"
							class="auth-form-input" placeholder="Loại khóa học"/>
							
							
							
						<div class="input-icon">
							<form:input path="Author"
							class="auth-form-input" placeholder="Tác giả"/>
						</div>
						<form:input path="Image"
							class="auth-form-input" placeholder="Hình Ảnh"/>
							
							<form:input path="Type"
							class="auth-form-input" placeholder="kiểu"/>
							
							<form:input path="Price"
							class="auth-form-input" placeholder="Giá"/>
							
						</span>
						</label>
						<div class="footer-action">
							<input type="submit" value="Thêm khóa học" class="auth-submit">
							
						</div>
					</form:form>
				</div>
			</div>
			<div class="auth-action-right">
				<div class="auth-image">
					<img src="/nono-course/assets/user/img/demo.png" alt="login">
				</div>
			</div>
		</div>
	</div>
	<script src="/nono-course/assets/user/js/common.js"></script>
</body>



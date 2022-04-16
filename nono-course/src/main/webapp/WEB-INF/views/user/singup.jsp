<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

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
					<h2 class="auth-form-title">Tạo tài khoản</h2>
					<div class="auth-external-container">
						<div class="auth-external-list">
							<ul>
								<li><a href="#"><i class="fa fa-google"></i></a></li>
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
							</ul>
						</div>
						<p class="auth-sgt">Sử dụng Email để đăng ký:</p>
					</div>
					<form class="login-form">
						<input type="text" class="auth-form-input"
							placeholder="Tên tài khoản"> <input type="email"
							class="auth-form-input" placeholder="Email">
						<div class="input-icon">
							<input type="matkhau" class="auth-form-input"
								placeholder="Mật khẩu"> <i
								class="fa fa-eye show-password"></i>
						</div>
						<input type="matkhau" class="auth-form-input"
							placeholder="Xác nhận mật khẩu"> <label
							class="btn active"> <input type="checkbox" name='email1'
							checked> <i class="fa fa-square-o"></i><i
							class="fa fa-check-square-o"></i> <span> Tôi đồng ý với
								các <a href="#">điều khoản</a> và <a href="#">chính sách bảo
									mật</a>.
						</span>
						</label>
						<div class="footer-action">
							<input type="submit" value="Đăng ký" class="auth-submit">
							<a href="/nono-course/login" class="auth-btn-direct">Đăng nhập</a>
						</div>
					</form>
				</div>
			</div>
			<div class="auth-action-right">
				<div class="auth-image">
					<img src="/nono-course/assets/user/images/demo.png" alt="login">
				</div>
			</div>
		</div>
	</div>
	<script src="/nono-course/assets/user/js/common.js"></script>
</body>



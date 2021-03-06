<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<div class="container-fluid">
	<div
		class="row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex">
		<div class="col-lg-4">
			<a href="" class="text-decoration-none"> <span
				class="h1 text-uppercase text-primary bg-dark px-2">NOno</span> <span
				class="h1 text-uppercase text-dark bg-primary px-2 ml-n1">course</span>
			</a>
		</div>
		<div class="col-lg-4 col-6 text-left">
			<form action="">
				<div class="input-group">
					<input type="text" class="form-control"
						placeholder="Tìm kiếm khóa học..." />
					<div class="input-group-append">
						<span class="input-group-text bg-transparent text-primary">
							<i class="fa fa-search"></i>
						</span>
					</div>
				</div>
			</form>
		</div>
		<div class="col-lg-4 col-6 text-right">
			<p class="m-0">Thông tin liên hệ:</p>
			<h5 class="m-0">083 683 4345</h5>
		</div>
	</div>
</div>
<!-- Topbar End -->

<!-- Navbar Start -->
<div class="container-fluid bg-dark mb-30">
	<div class="row px-xl-5">
		<div class="col-lg-3 d-none d-lg-block">
			<a
				class="btn d-flex align-items-center justify-content-between bg-primary w-100"
				data-toggle="collapse" href="#navbar-vertical"
				style="height: 65px; padding: 0 30px">
				<h6 class="text-dark m-0">
					<i class="fa fa-bars mr-2"></i>Danh Mục
				</h6> <i class="fa fa-angle-down text-dark"></i>
			</a>
			<nav
				class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light"
				id="navbar-vertical" style="width: calc(100% - 30px); z-index: 999">
				<div class="navbar-nav w-100">
					<div class="nav-item dropdown dropright">
					
					
					
					<c:forEach var ="item" items="${ categorys }" >
						<a href='<c:url value="/product/${item.idCategory}"></c:url> '  class = "nav-item nav-link">${item.nameCategory} </a> 
					</c:forEach>
						<!-- <a href="#" class="nav-link dropdown-toggle"
							data-toggle="dropdown">Dresses <i
							class="fa fa-angle-right float-right mt-1"></i></fa>
						<div
							class="dropdown-menu position-absolute rounded-0 border-0 m-0">
							<a href="" class="dropdown-item">Men's Dresses</a> <a href=""
								class="dropdown-item">Women's Dresses</a> <a href=""
								class="dropdown-item">Baby's Dresses</a>
						</div> -->
					</div>
				</div>
			</nav>
		</div>
		<div class="col-lg-9">
			<nav
				class="navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0">
				<a href="" class="text-decoration-none d-block d-lg-none"> <span
					class="h1 text-uppercase text-dark bg-light px-2">Multi</span> <span
					class="h1 text-uppercase text-light bg-primary px-2 ml-n1">Shop</span>
				</a>
				<button type="button" class="navbar-toggler" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-between"
					id="navbarCollapse">
					<div class="navbar-nav mr-auto py-0">
						<a href="/nono-course" class="nav-item nav-link active">Trang
							chủ</a> <a href="/nono-course/product-page/1" class="nav-item nav-link">Khóa học</a> <a
							href="detail.html" class="nav-item nav-link">Kích hoạt khóa
							học</a> <a href="contact.html" class="nav-item nav-link">Khóa học
							của tôi</a>
					</div>
					<div class="navbar-nav ml-auto py-0 d-none d-lg-block">
						<a href="/nono-course/login" class="text-primary">Đăng nhập</a>/ <a
							href="/nono-course/singup" class="text-primary">Đăng ký</a> <a
							href="" class="btn px-0 ml-3"> <i
							class="fas fa-shopping-cart text-primary"></i> <span
							class="badge text-secondary border border-secondary rounded-circle"
							style="padding-bottom: 2px">0</span>
						</a>
					</div>
				</div>
			</nav>
		</div>
	</div>
</div>
<!-- Navbar End -->
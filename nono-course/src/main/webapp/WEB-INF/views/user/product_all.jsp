<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>


	<!-- Breadcrumb Start -->
	<div class="container-fluid">
		<div class="row px-xl-5">
			<div class="col-12">
				<nav class="breadcrumb bg-light mb-30">
					<a class="breadcrumb-item text-dark"
						href='<c:url value="/"></c:url> '>Trang chủ</a> <a
						class="breadcrumb-item text-dark"
						href='<c:url value="/product"></c:url> '>Khóa học</a> <span
						class="breadcrumb-item active">Tất cả khóa học</span>
				</nav>
			</div>
		</div>
	</div>
	<!-- Breadcrumb End -->


	<!-- Shop Start -->
	<div class="container-fluid">
		<div class="row px-xl-5">
			<!-- Shop Sidebar Start -->
			<div class="col-lg-3 col-md-4">
				<!-- Price Start -->
				<h5 class="section-title position-relative text-uppercase mb-3">
					<span class="bg-secondary pr-3">Lọc theo danh mục</span>
				</h5>
				<div class="bg-light p-4 mb-30">

					<form>

						<c:forEach var="item" items="${ categorys }">

							<a href='<c:url value="/product/${item.idCategory}"></c:url> '
								class="nav-item nav-link">${item.nameCategory} </a>


						</c:forEach>

					</form>
				</div>
				<!-- Price End -->

				<!-- Color Start -->

				<!-- Color End -->

				<!-- Size Start -->

				<!-- Size End -->
			</div>
			<!-- Shop Sidebar End -->


			<!-- Shop Product Start -->
			<div class="col-lg-9 col-md-8">
				<div class="row pb-3">

					<c:forEach var="item" items="${ showProducts }" varStatus="product">

						<div class="col-lg-4 col-md-6 col-sm-6 pb-1">
							<div class="product-item bg-light mb-4">
								<div class="product-img position-relative overflow-hidden">
									<img class="img-fluid w-100" src="${item.image}" alt="">
									<div class="product-action">
										<a class="btn btn-outline-dark btn-square" href=""><i
											class="fa fa-shopping-cart"></i></a> <a
											class="btn btn-outline-dark btn-square" href=""><i
											class="far fa-heart"></i></a> <a
											class="btn btn-outline-dark btn-square" href=""><i
											class="fa fa-sync-alt"></i></a> <a
											class="btn btn-outline-dark btn-square"
											href='<c:url value="/product-detail/${item.idCourse}"></c:url> '><i
											class="fa fa-search"></i></a>
									</div>
								</div>
								<div class="text-center py-4">
									<a class="h6 text-decoration-none text-truncate"
										href='<c:url value="/product-detail/${item.idCourse}"></c:url> '>${item.nameCourse }</a>
									<div
										class="d-flex align-items-center justify-content-center mt-2">
										<h5>
											<fmt:formatNumber type="number" pattern="###,###,###.##"
												value="${item.price}  " /> VNĐ
											

										</h5>

									</div>
									<div
										class="d-flex align-items-center justify-content-center mb-1">
										<small class="fa fa-star text-primary mr-1"></small> <small
											class="fa fa-star text-primary mr-1"></small> <small
											class="fa fa-star text-primary mr-1"></small> <small
											class="fa fa-star text-primary mr-1"></small> <small
											class="fa fa-star text-primary mr-1"></small> <small></small>
									</div>
								</div>
							</div>
						</div>





					</c:forEach>




					<div class="col-12">
						<nav>
							<ul class="pagination justify-content-center">
								<li class="page-item "><a class="page-link"
									href='<c:url value="/product-page/1"></c:url> '>1</a></li>
								<li class="page-item "><a class="page-link"
									href='<c:url value="/product-page/2"></c:url> '>2</a></li>
								<li class="page-item"><a class="page-link"
									href='<c:url value="/product-page/3"></c:url> '>3</a></li>
								<li class="page-item"><a class="page-link"
									href='<c:url value="/product-page/4"></c:url> '>4</a></li>
								<li class="page-item "><a class="page-link"
									href='<c:url value="/product-page/5"></c:url> '>5</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
			<!-- Shop Product End -->
		</div>
	</div>
	<!-- Shop End -->




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
	<script src="<c:url value = "/assets/user/js/main.js"></c:url>"></script>
</body>
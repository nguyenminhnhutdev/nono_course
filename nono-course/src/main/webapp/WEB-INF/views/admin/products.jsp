<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Css -->
    <link rel="stylesheet" href="./dist/styles.css">
    <link rel="stylesheet" href="./dist/all.css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,400i,600,600i,700,700i" rel="stylesheet">
    <title>Tables | Tailwind Admin</title>
</head>

<body>
<!--Container -->
<div class="mx-auto bg-grey-lightest">
    <!--Screen-->
    <div class="min-h-screen flex flex-col">
        <!--Header Section Starts Here-->
        <header class="bg-nav">
            <div class="flex justify-between">
                <div class="p-1 mx-3 inline-flex items-center">
                    <i class="fas fa-bars pr-2 text-white" onclick="sidebarToggle()"></i>
                    <h1 class="text-white p-2">Nono Course</h1>
                </div>
                <div class="p-1 flex flex-row items-center">
                    <img onclick="profileToggle()" class="inline-block h-8 w-8 rounded-full" src="https://gudlogo.com/wp-content/uploads/2019/05/logo-gau-truc-panda-31.png" alt="">
                    <a href="#" onclick="profileToggle()" class="text-white p-2 no-underline hidden md:block lg:block">Thuận Trần</a>
                    <div id="ProfileDropDown" class="rounded hidden shadow-md bg-white absolute pin-t mt-12 mr-1 pin-r">
                    </div>
                </div>
            </div>
        </header>
        <!--/Header-->

        <div class="flex flex-1">
            <!--Sidebar-->
            <aside id="sidebar" class="bg-side-nav w-1/2 md:w-1/6 lg:w-1/6 border-r border-side-nav hidden md:block lg:block">
                <div class="flex">

                </div>
                <ul class="list-reset flex flex-col">
                    <li class=" w-full h-full py-3 px-2 border-b border-light-border ">
                        <a href="home"
                           class="font-sans font-hairline hover:font-normal text-sm text-nav-item no-underline">
                            <i class="fas fa-tachometer-alt float-left mx-2"></i>
                            Trang chủ
                            <span><i class="fas fa-angle-right float-right"></i></span>
                        </a>
                    </li>
                    <li class="w-full h-full py-3 px-2 border-b border-light-border">
                        <a href="form"
                           class="font-sans font-hairline hover:font-normal text-sm text-nav-item no-underline">
                            <i class="fab fa-wpforms float-left mx-2"></i>
                            Cập nhật thông tin KH
                            <span><i class="fa fa-angle-right float-right"></i></span>
                        </a>
                    </li>
                    <li class="w-full h-full py-3 px-2 border-b border-light-border bg-white">
                        <a href="products"
                            class="font-sans font-hairline hover:font-normal text-sm text-nav-item no-underline">
                            <i class="fas fa-table float-left mx-2"></i>
                            Cập nhật khóa học
                            <span><i class="fa fa-angle-right float-right"></i></span>
                        </a>
                    </li>
                    
                </ul>

            </aside>
            <!--/Sidebar-->
            <!--Main-->
            <main class="bg-white-500 flex-1 p-3 overflow-hidden">

                <div class="flex flex-col">
                    <!-- Card Sextion Starts Here -->
                    
                    <!-- /Cards Section Ends Here -->

                    <!--Grid Form-->
                    <!-- Button mở form điền thông tin khóa học -->
					<button data-modal='toppedModal'
                        class="modal-trigger bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"
                        style="width:15%">
                        Thêm khóa học
                    </button><br/>
                    <!-- Kết thúc Button -->
                    
                    <!-- Form điền thông tin khóa học -->
                    <div id='toppedModal' class="modal-wrapper">
                    	<div class="overlay close-modal"></div>
	                    <div class="modal">
	                    	<div class="modal-content shadow-lg p-5">
					            <div class="border-b p-2 pb-3 pt-0 mb-4">
					               <div class="flex justify-between items-center">
					                    Nhập thông tin khóa học mới
					                    <span class='close-modal cursor-pointer px-3 py-1 rounded-full bg-gray-100 hover:bg-gray-200'>
					                        <i class="fas fa-times text-gray-700"></i>
					                    </span>
					               </div>
					            </div>
					            <!-- Modal content -->
					            <div class="p-3">
					                <form class="w-full">
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Tên khóa học" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Mã Danh mục" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Ngày phát hành" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Tác Giả" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Ngày chỉnh sửa" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Hình ảnh" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Loại" aria-label="Full name">
							
							            </div>
							            <div class="flex items-center border-b border-b-1 border-teal-500 py-2">
							            	<input class="appearance-none bg-transparent border-none w-full text-gray-600 mr-3 py-1 px-2 lineHeight-tight focus:outline-none"
							                                               type="text" placeholder="Giá" aria-label="Full name">
							
							            </div>  
					            	</form><br/>
					            	<button class="flex-shrink-0 bg-teal-500 hover:bg-teal-dark-700 border-teal-500 hover:border-teal-dark text-sm border-4 text-white py-1 px-2 rounded"
                        			type="button" style="width:100%;margin:auto">
                    				Thêm Khóa học
                					</button>
					            </div>
					        </div>
	                    </div>
                    </div>
    				
                    
                    <!-- Kết thúc form điền khóa học -->
                    
                    <div class="flex flex-1  flex-col md:flex-row lg:flex-row mx-2">
                        <div class="mb-2 border-solid border-gray-300 rounded border shadow-sm w-full">
                            <div class="bg-gray-200 px-2 py-3 border-solid border-gray-200 border-b">
                                Thông tin các khóa học
                            </div>
                            <div class="p-3">
                                <table class="table-responsive w-full rounded">
                                
                                    <thead>
                                      <tr>
                                        <th class="border w-1/4 px-4 py-2">Hình ảnh</th>
                                        <th class="border w-1/6 px-4 py-2">Tên khóa học</th>
                                        <th class="border w-1/6 px-4 py-2">Tác giả</th>
                                        <th class="border w-1/6 px-4 py-2">Mô tả</th>
                                        <th class="border w-1/7 px-4 py-2">Giá</th>
                                        <th class="border w-1/5 px-4 py-2">Trạng thái</th>
                                      </tr>
                                    </thead>
                                    <tbody>
	                                    <c:forEach var="item" items="${ showProducts }" varStatus="index">
											<c:if test="${ index.first }">
						       
						        			</c:if>
						                               		
						        			<c:if test="${ not index.first }">
						            	
						        			</c:if>
						        			
						        			<tr>
	                                            <td class="border px-4 py-2">
	                                            	<img class="img-fluid w-100" src="${item.image }" alt="" />
	                                            </td>
	                                            <td class="border px-4 py-2">${item.nameCourse }</td>
	                                            <td class="border px-4 py-2">${item.author }</td>
	                                            <td class="border px-4 py-2">${item.banner }</td>
	                                            <td class="border px-4 py-2">${item.price }</td>
	                                            <td class="border px-4 py-2">
	                                                <a class="bg-teal-300 cursor-pointer rounded p-1 mx-1 text-white">
	                                                        <i class="fas fa-edit"></i></a>
	                                                <a class="bg-teal-300 cursor-pointer rounded p-1 mx-1 text-red-500">
	                                                        <i class="fas fa-trash"></i>
	                                                </a>
	                                            </td>
	                                        </tr>
						        		</c:forEach>    
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--/Grid Form-->
                </div>
            </main>
            <!--/Main-->
        </div>
       

    </div>

</div>

<script src="./main.js"></script>

</body>

</html>
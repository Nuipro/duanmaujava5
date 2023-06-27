<%--
  Created by IntelliJ IDEA.
  User: huong
  Date: 3/19/2023
  Time: 2:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/trangchu.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/74914272de.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="wrapper d-flex align-items-stretch">
    <nav id="sidebar">
        <div class="p-4 pt-5">
            <a href="#" class="img logo rounded-circle mb-5"
               style="background-image: url(/img/pbc-07.png);"></a>
            <ul class="list-unstyled components mb-5">
                <li>
                    <a href="/">Trang chủ</a>
                </li>
                <li class="active">
                    <a href="#ad" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Quản lý thông
                        tin</a>
                    <ul class="collapse list-unstyled" id="ad">
                        <li>
                            <a href="/khach-hang/hien-thi">Khách hàng</a>
                        </li>
                        <li>
                            <a href="/nhan-vien/hien-thi">Nhân viên</a>
                        </li>
                        <li>
                            <a href="/cua-hang/hien-thi">Cửa hàng</a>
                        </li>
                        <li>
                            <a href="/chuc-vu/hien-thi">Chức vụ</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Thông
                        tin sản phẩm</a>
                    <ul class="collapse list-unstyled" id="pageSubmenu">
                        <li>
                            <a href="/dsp/hien-thi">Dòng Sản Phẩm</a>
                        </li>
                        <li>
                            <a href="/mau-sac/hien-thi">Màu sắc</a>
                        </li>
                        <li>
                            <a href="/nxs/hien-thi">Nhà Sản Xuất</a>
                        </li>
                        <li>
                            <a href="/san-pham/hien-thi">Sản Phẩm</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="/hoa-don/hien-thi">Quản Lý Hóa Đơn</a>
                </li>
                <li>
                    <a href="/ban-hang/home">Bán Hàng</a>
                </li>
            </ul>


        </div>
    </nav>

    <!-- Page Content  -->
    <div id="content" class="p-4 p-md-5">

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">

                <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle Menu</span>
                </button>
                <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Portfolio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <h2 class="mb-4"></h2>
        <div class="">
            <jsp:include page="${view}.jsp"/>
        </div>
    </div>
</div>
<script src="/js/jquery.min.js"></script>
<script src="/js/popper.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>
</body>
</html>

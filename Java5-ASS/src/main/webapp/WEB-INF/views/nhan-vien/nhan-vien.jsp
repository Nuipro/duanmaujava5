<%--
  Created by IntelliJ IDEA.
  User: nguyenvv4
  Date: 22/01/2023
  Time: 11:31
  To change this template use File | Settings | File Templates.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

<%--<form action="/sinh-vien/search" method="post" class="container">--%>

<%--    <div class="mb-3">--%>
<%--        <label class="form-label">Ho Ten</label>--%>
<%--        <input type="text" class="form-control" name="hoTen">--%>
<%--    </div>--%>

<%--    <button type="submit" class="btn btn-primary">Search</button>--%>
<%--</form>--%>
<h2 style="align: center">Danh sách nhân viên</h2>
<form method="POST"
      action="/nhan-vien/them" name="myform" onsubmit="return validate()">
    <div class="row mt-3">
        <div class="col-6">
            <label>Mã</label>
            <input type="text" name="ma" class="form-control" />
            <label for="" style="color: red">${ma_loi}</label>
        </div>
        <div class="col-6">
            <label>Họ</label>
            <input type="text" name="ho" class="form-control" />
            <label for="" style="color: red">${ho_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Tên đệm</label>
            <input type="text" name="ten_dem" class="form-control" />
            <label for="" style="color: red">${tend_loi}</label>
        </div>
        <div class="col-6">
            <label>Tên</label>
            <input type="text" name="ten" class="form-control" />
            <label for="" style="color: red">${ten_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Ngày sinh</label>
            <input type="date" name="ngay_sinh" class="form-control" />
        </div>
        <div class="col-6">
            <label>Số điện thoại</label>
            <input type="tel" name="sdt" class="form-control" />
            <label for="" style="color: red">${sdt_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Địa chỉ</label>
            <input type="text" name="dia_chi" class="form-control" />
            <label for="" style="color: red">${dc_loi}</label>
        </div>
        <div class="col-6">
            <label>Mật khẩu</label>
            <input type="password" name="mat_khau" class="form-control" />
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">

            <label>Giới Tính</label>
            <input type="radio" name="gioi_tinh" value="Nam">Nam
            <input type="radio" name="gioi_tính" value="Nữ">Nữ

        </div>
        <div class="col-6">
            <label>Trạng thái</label>
            <input type="text" name="trang_thai" class="form-control" />
        </div>
        <div class="col-6">
            <label>Chức vụ</label>
            <select class="form-select" name="id_cv">
                <c:forEach items="${cv}" var="cv">
                    <option value="${cv.id}">${cv.ten}</option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Cửa hàng</label>
            <select class="form-select" name="id_ch">
                <c:forEach items="${ch}" var="ch">
                    <option value="${ch.id}">${ch.ten}</option>
                </c:forEach>
            </select>
        </div>
    </div><div class="row mt-3">
    <div class="col-6">
        <button class="btn btn-primary">Thêm mới</button>
    </div>
    <div class="col-6"></div>
</div>
</form>
<table class="table">
    <thead>
    <tr>
        <td>Mã</td>
        <td>Tên</td>
        <td>Tên đệm</td>
        <td>Họ</td>
        <td>Giới Tính</td>
        <td>Ngày Sinh</td>
        <td>Địa chỉ</td>
        <td>Sđt</td>
        <td>Cửa hàng</td>
        <td>Chức vụ</td>
        <td>Trạng thái</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbdoy>
        <c:forEach items="${listNhanVien}" var="nhanVien">
            <tr>
                <td>${nhanVien.ma}</td>
                <td>${nhanVien.ten}</td>
                <td>${nhanVien.tenDem}</td>
                <td>${nhanVien.ho}</td>
                <td> ${nhanVien.gioiTinh} </td>
                <td>${nhanVien.ngaySinh}</td>
                <td>${nhanVien.diaChi}</td>
                <td>${nhanVien.sdt}</td>
                <td>${nhanVien.ch.ten}</td>
                <td>${nhanVien.cv.ten}</td>
                <td>${nhanVien.trangThai}</td>
                <td>
                    <a href="/nhan-vien/xoa/${nhanVien.id}" class="btn btn-primary">Xóa</a>
                        <%--                    <a class="btn btn-primary" href="#">Update</a>--%>
                    <a class="btn btn-primary" href="/nhan-vien/detail/${nhanVien.id}">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbdoy>
</table>
</body>
</html>

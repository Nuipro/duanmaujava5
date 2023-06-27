<%--
  Created by IntelliJ IDEA.
  User: huong
  Date: 3/15/2023
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

</head>
<body>
<div class="col-8 offset-2 mt-5 table-responsive">
    <h4 class="text-center">Quản lý Khách Hàng</h4>
</div>
<form action="/khach-hang/update/${kh.id}" method="post">
    <div class="row mt-3">
        <div class="col-6">
            <label>Mã</label>
            <input type="text" name="ma" class="form-control" value="${kh.ma}"/>
            <label for="" style="color: red">${ma_loi}</label>
        </div>
        <div class="col-6">
            <label>Họ</label>
            <input type="text" name="ho" class="form-control" value="${kh.ho}"/>
            <label for="" style="color: red">${ho_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Tên đệm</label>
            <input type="text" name="ten_dem" class="form-control" value="${kh.tenDem}"/>
            <label for="" style="color: red">${tend_loi}</label>
        </div>
        <div class="col-6">
            <label>Tên</label>
            <input type="text" name="ten" class="form-control" value="${kh.ten}"/>
            <label for="" style="color: red">${ten_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Ngày sinh</label>
            <input type="date" name="ngay_sinh" class="form-control" value="${kh.ngaySinh}"/>
        </div>
        <div class="col-6">
            <label>Số điện thoại</label>
            <input type="tel" name="sdt" class="form-control" value="${kh.sdt}"/>
            <label for="" style="color: red">${sdt_loi}</label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Địa chỉ</label>
            <input type="text" name="dia_chi" class="form-control" value="${kh.diaChi}"/>
            <label for="" style="color: red">${dc_loi}</label>
        </div>
        <div class="col-6">
            <label>Mật khẩu</label>
            <input type="password" name="mat_khau" class="form-control"/>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <label>Quốc gia</label>
            <select name="quoc_gia" class="form-select">
                <option value="vn">Việt Nam</option>
                <option value="en">Anh</option>
            </select>
        </div>
        <div class="col-6">
            <label>Thành phố</label>
            <select name="thanh_pho" class="form-select">
                <option value="hn">Hà Nội</option>
                <option value="ld">London</option>
            </select>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-6">
            <button type="submit" class="btn btn-primary">Cập Nhật</button>
        </div>
        <div class="col-6"></div>
    </div>

</form>
</div>
</body>
</html>

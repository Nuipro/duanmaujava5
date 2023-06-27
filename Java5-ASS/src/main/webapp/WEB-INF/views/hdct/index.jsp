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
    <h4 class="text-center">Hóa Đơn Chi Tiết</h4>
    <div class="row">
        <div class="col-6">
            <a href="" class="btn btn-success">Tạo hóa đơn</a>
        </div>
    </div>
    <table class="table table-striped mt-3">
        <thead class="table-primary">
        <tr>
            <th>Mã Hóa Đơn</th>
            <th>Ngày tạo</th>
            <th>Tên khách hàng</th>
            <th>Đơn giá</th>
            <th>Tình trạng</th>
            <th colspan="2">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ hdct }" var="hdct">
            <tr>
                <td>${ hdct.hd.ma }</td>
                <td>${ hdct.hd.ngayTao }</td>
                <td>${hdct.hd.tenNguoiNhan}</td>
                <td>${hdct.donGia}</td>
                <th>${hdct.hd.tinhTrang}</th>
                <td>
                        <%--                    <a href="/Java4_BTVN_war_exploded/khach-hang/edit?Ma=${ kh.ma }" class="btn btn-primary">Cập nhật</a>--%>
                </td>
                <td>
                        <%--                    <a href="/Java4_BTVN_war_exploded/khach-hang/delete?Ma=${ kh.ma }" class="btn btn-danger">Xóa</a>--%>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>

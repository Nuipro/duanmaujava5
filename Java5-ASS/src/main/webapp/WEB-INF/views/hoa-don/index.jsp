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
<div>
    <h2 style="align: center">Quản lý Hoá Đơn</h2>
    <button class="btn btn-danger"><a href="/ban-hang/home" style="color: black;font-weight: bold">Tạo đơn</a></button>
    <table class="table table-striped mt-3">
        <thead class="table-primary">
        <tr>
            <th scope="col">Mã</th>
            <th scope="col">Tên người nhận</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">sdt</th>
            <th scope="col">Ngày tạo</th>
            <th scope="col">Tình trạng</th>
            <th colspan="2"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ hd }" var="hd">
            <tr>
                <td>${hd.ma}</td>
                <td>${hd.tenNguoiNhan}</td>
                <td>${hd.diaChi}</td>
                <td>${hd.sdt}</td>
                <td>${hd.ngayTao}</td>
                <td>${hd.tinhTrang == 1 ? "Đã thanh toán" : "Chưa thanh toán"}</td>
                <td>
                        <a href="/hoa-don/xoa/${hd.id}" class="btn btn-danger">Xóa</a>
                    <a href="/hoa-don/detail/${hd.id}" class="btn btn-danger">Detail</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

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

    <h4 class="text-center">Quản lý Màu Sắc</h4>
    <form method="POST"
          action="/mau-sac/them" name="myform" onsubmit="return validate()">
        <div class="row mt-3">
            <div class="col-6">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control"/>
                <label for="" style="color: red">${ma_loi}</label>
            </div>
            <div class="col-6">
                <label>Tên</label>
                <input type="text" name="ten" class="form-control"/>
                <label for="" style="color: red">${ten_loi}</label>
            </div>
        </div>
        <br>
        <div class="col-6">
            <button type="submit" class="btn btn-primary">Thêm mới</button>
        </div>
    </form>
    <table class="table table-striped mt-3">
        <thead class="table-primary">
        <tr>
            <th>Mã</th>
            <th>Tên</th>
            <th colspan="2">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ ms }" var="ms">
            <tr>
                <td>${ms.ma }</td>
                <td>${ms.ten }</td>
                <td>
                    <a href="/mau-sac/detail/${ ms.id }" class="btn btn-primary">Cập nhật</a>
                </td>
                <td>
                    <a href="/mau-sac/xoa/${ ms.id }" class="btn btn-danger">Xóa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>
</html>

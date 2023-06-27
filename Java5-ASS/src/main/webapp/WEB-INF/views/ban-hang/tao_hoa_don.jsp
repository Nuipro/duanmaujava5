<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
    <form action="/ban-hang/buy" method="post">
        <div class="col-6">
            <label>Khách hàng</label>
            <select class="form-select" name="id_kh">
                <c:forEach items="${kh}" var="kh" >
                    <option value="${kh.id}">${kh.ten}</option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Nhân Viên</label>
            <select class="form-select" name="id_nv">
                <c:forEach items="${nv}" var="nv">
                    <option value="${nv.id}">${nv.ten}</option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Mã Hóa Đơn</label>
            <input type="text" name="ma" class="form-control">
        </div>
        <div class="col-6">
            <label>Ngày tạo</label>
            <input type="date" name="ngay_tao" class="form-control">
        </div>
        <br>
        <button type="submit" class="btn btn-danger">Tạo Hóa Đơn</button>
    </form>
</body>
</html>
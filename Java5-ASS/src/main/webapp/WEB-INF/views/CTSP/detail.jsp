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
    <style></style>
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
    <h2 style="align: center">Chi tiết sp</h2>
    <form action="/ctsp/update/${ctsp.id}" method="post">
        <div class="col-6">
            <label>Màu Sắc</label>
            <select class="form-select" name="id_mau_sac">
                <c:forEach items="${ms}" var="ms">
                    <option value="${ms.id}" ${ ms.id == ctsp.ms.id ? "selected" : "" }>
                            ${ms.ten}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Dòng sản phẩm</label>
            <select class="form-select" name="id_dong_sp">
                <c:forEach items="${dsp}" var="dsp">
                    <option value="${dsp.id}" ${ dsp.id == ctsp.dsp.id ? "selected" : "" }>
                            ${dsp.ten}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>NXS</label>
            <select class="form-select" name="id_nxs">
                <c:forEach items="${nxs}" var="nxs">
                    <option value="${nxs.id}" ${ nxs.id == ctsp.nxs.id ? "selected" : "" }>
                            ${nxs.ten}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Sản Phẩm</label>
            <select class="form-select" name="id_sp">
                <c:forEach items="${sp}" var="sp">
                    <option value="${sp.id}" ${ sp.id == ctsp.sp.id ? "selected" : "" }>
                            ${sp.ten}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="col-6">
            <label>Năm bảo hành</label>
            <input type="text" name="nam_bh" class="form-control" value="${ctsp.namBH}">
        </div>
        <div class="col-6">
            <label>Mô tả</label>
            <input type="text" name="mo_ta" class="form-control" value="${ctsp.moTa}">
        </div>
        <div class="col-6">
            <label>Số lượng tồn</label>
            <input type="text" name="so_luong_ton" class="form-control" value="${ctsp.soLuongTon}">
        </div>
        <div class="col-6">
            <label>Gía nhập</label>
            <input type="text" name="gia_nhap" class="form-control" value="${ctsp.giaNhap}">
        </div>
        <div class="col-6">
            <label>Gía bán</label>
            <input type="text" name="gia_ban" class="form-control" value="${ctsp.giaBan}">
        </div>
        <button type="submit">Update</button>
    </form>
</div>
</body>
</html>

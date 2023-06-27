<!doctype html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <style>
        .ad{
            width: 900px;
        }
    </style>
</head>
<body>
<form action="/ban-hang/thanhtoan" method="post">
    <p style="color: black;font-weight: bold">Thông tin đơn hàng</p>
    <input type="hidden"  name="id_hoa_don" value="${hdForm.id}">
    <table class="ad">
        <tbody>
        <tr>
            <td>Trạng thái : ${tt}</td>
            <td>Tên khách hàng: ${hdForm.kh.ten}</td>
            <td><c:if test="${  empty test }">
                <div>${ test }</div>
            </c:if></td>
        </tr>
        <tr>
            <td>Mã hóa đơn: ${hdForm.ma}</td>
            <td><c:if test="${  empty test }">
                <div>Địa chỉ: ${hdForm.kh.diaChi}</div>
            </c:if></td>
        </tr>
        <tr>
            <td></td>
            <td><c:if test="${   empty test }">
                <div>Số diện thoại: ${hdForm.kh.sdt}</div>
            </c:if></td>
        </tr>
        </tbody>
    </table>
    <a href="/ban-hang/xoa/${hdForm.id}" class="btn btn-danger">Hủy đơn</a>
    <br>
    <hr>
   <div>
       <div><h4>Sản Phẩm</h4></div>
       <table class="table table-striped mt-3">
           <thead class="table-primary">
           <tr>
               <th></th>
               <th scope="col">Tên sản phẩm</th>
               <th scope="col">Tên màu sắc</th>
               <th scope="col">Số lượng tồn</th>
               <th scope="col">Giá bán</th>
               <th colspan="2">Số Lượng</th>
           </tr>
           </thead>
           <tbody>
           <c:forEach items="${ ctsp }" var="ctsp" varStatus="i">
               <tr>
                   <td><input type="checkbox" name="id_chi_tiet_sp" value="${ctsp.id}"></td>
                   <td>${ctsp.sp.ten}</td>
                   <td>${ctsp.ms.ten}</td>
                   <td>${ctsp.soLuongTon}</td>
                   <td>${ctsp.giaBan}</td>
                   <td><input type="number" name="so_luong" min="1" value="1" style="width: 40px"></td>
               </tr>
           </c:forEach>
           </tbody>
       </table>
       <button type="submit">Thanh Toán</button>
   </div>
    <br>
    <hr>

</form>

</body>
</html>
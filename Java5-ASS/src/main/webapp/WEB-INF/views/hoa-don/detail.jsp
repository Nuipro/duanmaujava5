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
    <p style="color: black;font-weight: bold">Thông tin đơn hàng</p>
    <input type="hidden"  name="id_hoa_don" value="${hd.id}">
    <table class="ad">
        <tbody>
        <tr>
            <td>Trạng thái : ${tt}</td>
            <td>Tên khách hàng: ${hd.kh.ten}</td>
            <td><c:if test="${  empty test }">
                <div>${ test }</div>
            </c:if></td>
        </tr>
        <tr>
            <td>Mã hóa đơn: ${hd.ma}</td>
            <td><c:if test="${  empty test }">
                <div>Địa chỉ: ${hd.kh.diaChi}</div>
            </c:if></td>
        </tr>
        <tr>
            <td></td>
            <td><c:if test="${   empty test }">
                <div>Số diện thoại: ${hd.kh.sdt}</div>
            </c:if></td>
        </tr>
        </tbody>
    </table>
    <br>
    <hr>
   <div>
       <div><h4>Sản Phẩm Đã Mua</h4></div>
       <table class="table table-striped mt-3">
           <thead class="table-primary">
           <tr>
               <th scope="col">Tên sản phẩm</th>
               <th scope="col">màu sắc</th>
               <th scope="col">Số lượng</th>
               <th scope="col">Đơn giá</th>
           </tr>
           </thead>
           <tbody>
           <c:forEach items="${ hdlist }" var="hdlist" varStatus="i">
               <tr>
                   <td>${hdlist.ctsp.sp.ten}</td>
                   <td>${hdlist.ctsp.ms.ten}</td>
                   <td>${hdlist.soLuong}</td>
                   <td>${hdlist.donGia}</td>
               </tr>
           </c:forEach>
           </tbody>
           <tfoot>
           <tr>
               <td colspan="3">Tổng giá trị đơn hàng:</td>
               <td style="color: red">${totalPrice}</td>
           </tr>
           </tfoot>
       </table>
   </div>
    <br>
    <hr>

</body>
</html>
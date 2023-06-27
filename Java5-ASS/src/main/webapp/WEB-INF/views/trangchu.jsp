<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/trangchu.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">


</head>
<body>
<div>
    <div class="content">
        <div class="sanphammoi">
            <h4>Sản Phẩm Mới</h4>
            <div class="container text-center">
                <div class="row align-items-start">
                    <div class="col">
                        <c:forEach items="${ctsp}" var="ctsp">
                            <figure class="figure">
                                <p style="font-size: 18px;font-weight: bold;color: black">${ctsp.sp.ten}</p>
                                <img src="/img/aosoi.jpg" class="figure-img img-fluid rounded imgthientai" alt="...">
                                <figcaption class="figure-caption">${ctsp.giaBan}đ</figcaption>
                                <button>Thêm vào giỏ hàng</button>
                            </figure>
                        </c:forEach>
                        <br>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
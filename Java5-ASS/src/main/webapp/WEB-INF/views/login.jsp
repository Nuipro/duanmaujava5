<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
    <script src="https://kit.fontawesome.com/74914272de.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
<div class="">
    <div>
        <c:if test="${ not empty error }">
            <div class="alert alert-danger">${ error }</div>
        </c:if>
        <div class="bodymain">
            <div class="bodydangky">
                <form method="post" action="/login/login-add">
                    <h4>ĐĂNG NHẬP</h4>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Mã khách hàng</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" name="ma">
                        <div id="emailHelp" class="form-text"></div>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Mật khẩu</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" name="mat_khau">
                    </div>
                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Nhớ đăng nhập</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Đăng Nhập</button>
                </form>
            </div>
        </div>

    </div>
</div>
</body>
</html>
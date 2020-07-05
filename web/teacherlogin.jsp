<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-05-28
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Teacher Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->

    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/css/util.css">
    <link rel="stylesheet" type="text/css" href="web_page/Login_v12/css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<div class="limiter">
    <div class="container-login100" style="background-image: url('web_page/Login_v12/images/img-01.jpg');">
        <div class="wrap-login100 p-t-190 p-b-30">
            <form action="teacherlogin" method="post" class="login100-form validate-form">
                <div class="login100-form-avatar">

                </div>

                <span class="login100-form-title p-t-20 p-b-45">
						Love Oral English
					</span>

                <div class="text-center w-full p-t-25 p-b-230">
                    <a href="#" class="txt1">

                            <c:if test="${errorMsg != null}">
                                <a href="#" class="txt1" style="color: red">
                                    Wrong Password or Username
                                </a>
                            </c:if>

                    </a>
                </div>

                <div class="wrap-input100 validate-input m-b-10" data-validate = "Username is required">
                    <input class="input100" type="text" name="username" placeholder="Username">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-user"></i>
						</span>
                </div>

                <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                    <input class="input100" type="password" name="pass" placeholder="Password">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-lock"></i>
						</span>
                </div>

                <div class="container-login100-form-btn p-t-10">
                    <button class="login100-form-btn">
                        Login
                    </button>
                </div>

                <div class="text-center w-full p-t-25 p-b-230">
                    <a href="login.jsp" class="txt1" style="color: black">
                        Click to login for Student
                    </a>

                </div>

                <div class="text-center w-full p-t-25 p-b-230">
                    <a href="Adminlogin.jsp" class="txt1" style="color: black">
                        Click to login for Admin
                    </a>
                </div>






            </form>
        </div>
    </div>
</div>




<!--===============================================================================================-->
<script src="web_page/Login_v12/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="web_page/Login_v12/vendor/bootstrap/js/popper.js"></script>
<script src="web_page/Login_v12/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="web_page/Login_v12/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="web_page/Login_v12/js/main.js"></script>

</body>
</html>

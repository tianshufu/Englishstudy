<%@ page import="com.tianshu.entity.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-14
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
</head>
<title>Modify Info</title>
</head>


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<%

    request.getParameter("teacherinfo");
%>
<body class="bg-light">
<style type="text/css">
    .logo_text {
        font-family: 'Poppins', serif;
        font-size: 60px;
        font-weight: 700;
        line-height: 0.75;
        color: #2e21df;
        vertical-align: middle;
        -webkit-transition: all 200ms ease;
        -moz-transition: all 200ms ease;
        -ms-transition: all 200ms ease;
        -o-transition: all 200ms ease;
        transition: all 200ms ease;
    }
</style>
<div class="container">
    <div class="py-5 text-center">
        <div class="logo_text">
            <div class="logo_text">Loren</div>

            <!--<div  style="height: 2%"><img src="images/LOREN.PNG" height="80" width="80" alt=""></div>-->


        </div>
        <h2>Info form</h2>
        <p class="lead">Check and change your information here.</p>
    </div>

    <div class="row">

        <div class="col-md-6 offset-3 order-md-1">
            <h4 class="mb-3">Teacher Info</h4>
            <form class="needs-validation" action="${pageContext.request.contextPath}/teachermodifyinfo" novalidate>

                <div class="mb-3">
                    <label for="teachername">Teachername</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">@</span>
                        </div>
                        <input type="text" class="form-control" id="teachername" name="teachername" value=${requestScope.teacher.teacher_name} required>
                        <div class="invalid-feedback" style="width: 100%;">
                            Your username is required.
                        </div>
                    </div>
                </div>



                <div class="mb-3">
                    <label for="email">Email <span class="text-muted"></span></label>
                    <input type="email" class="form-control" id="email" name="email" value=${requestScope.teacher.email}>
                    <div class="invalid-feedback">
                        Please enter a valid email address for shipping updates.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="zoomid">Zoom id</label>
                    <input type="text" class="form-control" id="zoomid" name="zoomid" value=${requestScope.teacher.zoom_contact} required>
                    <div class="invalid-feedback">
                        Please enter your zoom id
                    </div>


                </div>



                <div class="mb-3">
                    <label for="zoompass">Zoom Password</label>
                    <input type="text" class="form-control" id="zoompass" name="zoompass" required value=${requestScope.teacher.zoom_password}>
                    <div class="invalid-feedback">
                        Please enter your zoom password
                    </div>


                </div>

                <div class="mb-3">
                    <label for="skype">Skype</label>
                    <input type="text" class="form-control" id="skype" name="skype" value=${requestScope.teacher.skype_account} required>
                    <div class="invalid-feedback">
                        Please enter your skype account
                    </div>


                </div>

                <div class="mb-3">
                    <label for="wechat">Wechat</label>
                    <input type="text" class="form-control" id="wechat" name="wechat" value=${requestScope.teacher.wechat_account} required>
                    <div class="invalid-feedback">
                        Please enter your wechat account
                    </div>


                </div>







                <hr class="mb-4">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Continue to Modify</button>
            </form>
        </div>
    </div>

    <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">&copy; 2020-2020 Loren</p>
        <ul class="list-inline">
            <li class="list-inline-item"><a href="#">Privacy</a></li>
            <li class="list-inline-item"><a href="#">Terms</a></li>
            <li class="list-inline-item"><a href="#">Support</a></li>
        </ul>
    </footer>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

</body>
</html>

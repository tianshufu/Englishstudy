<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-29
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
</head>
<title>Video Check</title>
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
        <div class="embed-responsive embed-responsive-4by3">

            <video width="320" height="240" controls>

                <source src="http://tianshufu.site/${requestScope.key}" type="video/mp4">

            </video>

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
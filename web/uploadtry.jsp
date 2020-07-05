<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-28
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Book Course</title>
</head>

<body>
<c:if test="${not empty loginError}">
    <script>
        window.addEventListener("load",function(){
            alert("${loginError}");
        })
    </script>
</c:if>

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

    <div class="py-5 text-center ">
        <div class="logo_text">
            <div class="logo_text">Loren</div>
        </div>
        <h2>Booking form</h2>
        <p class="lead">Upload your Course Video here</p>
    </div>

    <div class="row ">
        <div class="col-md-6 offset-3 order-md-1">

            <form id="upload_form" method="post" action="http://upload-z2.qiniup.com/"
                  enctype="multipart/form-data">
                <div class="form-group">
                    <input name="key" type="hidden" value=${requestScope.key}>
                    <input name="x:<custom_name>" type="hidden" value="<custom_value>">
                    <input name="token" type="hidden" value=${requestScope.token}>

                    <input name="accept" type="hidden" />
                    <input name="file" type="file" />
                    <input type="submit" value="Upload" />
                </div>
            </form>



            <footer class="my-5 pt-5 text-muted text-center text-small">
                <p class="mb-1">&copy; 2020-2020 Loren</p>
                <ul class="list-inline">
                    <li class="list-inline-item"><a href="#">Privacy</a></li>
                    <li class="list-inline-item"><a href="#">Terms</a></li>
                    <li class="list-inline-item"><a href="#">Support</a></li>
                </ul>
            </footer>

        </div>

    </div>

</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>
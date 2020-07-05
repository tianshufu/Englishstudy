<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-20
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.tianshu.entity.Admin" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<meta charset="utf-8">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Hello, world!</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="web_page/sidebar-09/css/style.css">
    <title>Finnished Class</title>
</head>
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
<body>




<div class="wrapper d-flex align-items-stretch">

    <nav id="sidebar">

        <div class="custom-menu">
            <button type="button" id="sidebarCollapse" class="btn btn-primary">
            </button>
        </div>
        <div class="img bg-wrap text-center py-4" style="background-image: url(web_page/sidebar-09/images/bg_1.jpg);">
            <div class="user-logo">
                <div class="img" ></div>

                <h3><%= (String)session.getAttribute("adminname")%></h3>

            </div>
        </div>
        <ul class="list-unstyled components mb-5">
            <li class="active">
                <a href="adminsearchcourse"><span class="fa fa-spinner mr-3"></span> Booked Class</a>
            </li>

            <li>
                <a href="adminsearchfinnishedcourse"><span class="fa fa-check-square-o mr-3 notif"></span> Finnished Class</a>
            </li>
            <li>
                <a href="adminsearchstudentinfo"><span class="fa fa-address-book mr-3"></span> Student Info</a>
            </li>

            <li>
                <a href="adminsearchcoursevideo"><span class="fa fa-video-camera mr-3"></span> Course video</a>
            </li>

            <li>
                <a href="adminsearchbooks"><span class="fa fa-book mr-3"></span> BookInfo</a>
            </li>



            <li>
                <a href="login.jsp"><span class="fa fa-sign-out mr-3"></span> Sign Out</a>
            </li>
        </ul>
    </nav>
    <div id="content" class="p-4 p-md-5 pt-5">

        <div class="container-fluid">
            <div class="py-3 col-md-12 text-center">
                <div class="logo_text">
                    <div class="logo_text">Loren</div>

                    <!--<div  style="height: 2%"><img src="images/LOREN.PNG" height="80" width="80" alt=""></div>-->


                </div>

                <h2>Finnished Course Info</h2>
                <p class="lead">Speak English Anytime Anywhere</p>
            </div>

            <div class="text-center">


                <table class="table table-striped table-responsive " style="height:800px;overflow:auto">
                <thead class="thead-dark">
                <tr>

                    <th scope="col">Studentid</th>
                    <th scope="col">Teachername</th>
                    <th scope="col">Date</th>
                    <th scope="col">Time</th>
                    <th scope="col">StudentStatue</th>
                    <th scope="col">Pronounciation</th>
                    <th scope="col">Gramma</th>
                    <th scope="col">Comment</th>




                </tr>

                </thead>

                <tbody>
                <c:forEach items="${requestScope.finnisedcourse}"   var="course" >
                    <tr>
                        <th scope="row">${course.studentid}</th>
                        <td>${course.teachername}</td>
                        <td>${course.date}</td>
                        <td>${course.timeslot}</td>
                        <td>${course.studentstatus}</td>
                        <td>${course.pronounciation}</td>
                        <td>${course.gramma}</td>
                        <td>${course.comment}</td>

                    </tr>
                </c:forEach>

                </tbody>
            </table>
            </div>
        </div>
    </div>

</div>







<!-- Optional JavaScript -->

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="web_page/sidebar-09/js/jquery.min.js"></script>
<script src="web_page/sidebar-09/js/popper.js"></script>
<script src="web_page/sidebar-09/js/bootstrap.min.js"></script>
<script src="web_page/sidebar-09/js/main.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>


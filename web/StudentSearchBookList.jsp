<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-02
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--This is the page showing the finnised class with teahcer's comment--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Books Library</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Lingua project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/bootstrap4/bootstrap.min.css">
    <link href="web_page/lingua/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/animate.css">
    <link href="web_page/lingua/plugins/video-js/video-js.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/blog.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/blog_responsive.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="web_page/sidebar-09/css/style.css">
</head>
<body>
<%
    List<String> list = new ArrayList<String>();
    list.add("/web_page/lingua/images/course_1.jpg");
    list.add("/web_page/lingua/images/course_2.jpg");
    list.add("/web_page/lingua/images/course_3.jpg");
    list.add("/web_page/lingua/images/course_4.jpg");
    list.add("/web_page/lingua/images/course_5.jpg");
    list.add("/web_page/lingua/images/course_6.jpg");
    list.add("/web_page/lingua/images/course_7.jpg");
    list.add("/web_page/lingua/images/course_8.jpg");
    list.add("/web_page/lingua/images/course_9.jpg");
    list.add("/web_page/lingua/images/course_10.jpg");
    list.add("/web_page/lingua/images/course_11.jpg");
    list.add("/web_page/lingua/images/course_12.jpg");
    list.add("/web_page/lingua/images/course_13.jpg");
    list.add("/web_page/lingua/images/course_14.jpg");
    list.add("/web_page/lingua/images/course_15.jpg");
    list.add("/web_page/lingua/images/course_16.jpg");


    pageContext.setAttribute("timeList",list);
%>

<%
    String searchdate=request.getParameter("date");
    System.out.println(searchdate);
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(calendar.DATE,0);
    date = calendar.getTime();
    SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
    String dateString = format.format(date);
    pageContext.setAttribute("datetoday",dateString);
%>

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

<div class="wrapper d-flex align-items-stretch">

    <nav id="sidebar">

        <div class="custom-menu">

        </div>
        <div class="img bg-wrap text-center py-4" style="background-image: url(web_page/sidebar-09/images/bg_1.jpg);">
            <div class="user-logo">
                <div class="img" style="background-image: url(images/logo.jpg);"></div>
                <h3><%= (String)session.getAttribute("username")%></h3>
                <span class="fa fa-usd"></span>${sessionScope.student.leftcoursenum} </a>
            </div>
        </div>
        <ul class="list-unstyled components mb-5">
            <li class="active">
                <a href="SearchStudentCourse"><span class="fa fa-home mr-3"></span> My Class</a>
            </li>
            <li>
                <a href="TeacherSearchTimeStudent?date=<%=dateString%>&pagenum=1"><span class="fa fa-hand-o-up mr-3 notif"></span> Book Class</a>
            </li>
            <li>
                <a href="studentsearchcommment"><span class="fa fa-check-square-o mr-3 notif"></span> Finnished Class</a>
            </li>
            <li>
                <a href="studentsearchbooks"><span class="fa fa-book mr-3"></span> Book Library</a>
            </li>

            <li>
                <a href="web_page/lingua/courses.html"><span class="fa fa-tags mr-3"></span> Course Introduction</a>
            </li>
            <li>
                <a href="web_page/lingua/instructors.html"><span class="fa fa-trophy mr-3"></span> Top Teachers</a>
            </li>
            <li>
                <a href="#"><span class="fa fa-cog mr-3"></span> Settings</a>
            </li>
            <li>
                <a href="#"><span class="fa fa-support mr-3"></span> Support</a>
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

                <h2>Book Info</h2>
                <p class="lead">Speak English Anytime Anywhere</p>
            </div>
            <table class="table table-striped ">
                <thead class="thead-dark" style="text-align: center">
                <tr>


                    <th scope="col">Bookname</th>
                    <th scope="col">Bookurl</th>




                </tr>

                </thead>

                <tbody style="text-align: center">

                <c:forEach items="${requestScope.bookinfo}"   var="book" >

                    <tr>

                        <td>${book.bookname}</td>
                        <td><a href=${book.bookurl}>Booklink</a></td>



                    </tr>
                </c:forEach>



                </tbody>
            </table>

        </div>
    </div>








</div>


    <script src="web_page/lingua/js/jquery-3.2.1.min.js"></script>
    <script src="web_page/lingua/styles/bootstrap4/popper.js"></script>
    <script src="web_page/lingua/styles/bootstrap4/bootstrap.min.js"></script>
    <script src="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
    <script src="web_page/lingua/plugins/easing/easing.js"></script>
    <script src="web_page/lingua/plugins/parallax-js-master/parallax.min.js"></script>
    <script src="web_page/lingua/js/blog.js"></script>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-02
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Booked Class</title>
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
    list.add("web_page/lingua/images/course_1.jpg");
    list.add("web_page/lingua/images/course_2.jpg");
    list.add("web_page/lingua/images/course_3.jpg");
    list.add("web_page/lingua/images/course_4.jpg");
    list.add("web_page/lingua/images/course_5.jpg");
    list.add("web_page/lingua/images/course_6.jpg");
    list.add("web_page/lingua/images/course_7.jpg");
    list.add("web_page/lingua/images/course_8.jpg");
    list.add("web_page/lingua/images/course_9.jpg");
    list.add("web_page/lingua/images/course_10.jpg");
    list.add("web_page/lingua/images/course_11.jpg");
    list.add("web_page/lingua/images/course_12.jpg");
    list.add("web_page/lingua/images/course_13.jpg");
    list.add("web_page/lingua/images/course_14.jpg");
    list.add("web_page/lingua/images/course_15.jpg");
    list.add("web_page/lingua/images/course_16.jpg");


    pageContext.setAttribute("timeList",list);
%>

<div class="wrapper d-flex align-items-stretch">

    <nav id="sidebar">
        <div class="custom-menu">

        </div>
        <div class="img bg-wrap text-center py-4" style="background-image: url(web_page/sidebar-09/images/bg_1.jpg);">
            <div class="user-logo">
                <div class="img" style="background-image: url(images/logo.jpg);"></div>
                <h3><%= (String)session.getAttribute("teachername")%></h3>
            </div>
        </div>
        <ul class="list-unstyled components mb-5">
            <li class="active">
                <a href="SearchTeacherCourse"><span class="fa fa-home mr-3"></span> My Class</a>
            </li>
            <li>
                <a href="teachertimanagesearch"><span class="fa fa-toggle-up mr-3 notif"></span> Open Class</a>
            </li>

            <li>
                <a href="teachersearchbooks"><span class="fa fa-book mr-3"></span> Book Library</a>
            </li>


            <li>
                <a href="web_page/lingua/instructors.html"><span class="fa fa-tags mr-3"></span> Course Introduction</a>
            </li>


            <li>
                <a href="web_page/lingua/instructors.html"><span class="fa fa-trophy mr-3"></span> Top Teachers</a>
            </li>
            <li>
                <a href="teachershowinfo"><span class="fa fa-cog mr-3"></span> Edit Info</a>
            </li>
            <li>
                <a href="#"><span class="fa fa-support mr-3"></span> Support</a>
            </li>
            <li>
                <a href="teacherlogin.jsp"><span class="fa fa-sign-out mr-3"></span> Sign Out</a>
            </li>
        </ul>

    </nav>




    <!-- Blog -->
    <div id="content" class="p-4 p-md-5 pt-5">
        <div class="blog">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="welcome_title">Class Info</div>
                    </div>
                </div>

                <div class="row blog_row">
                    <!-- Blog Posts -->
                    <c:if test="${requestScope.failed =null}">
                        <a href="#" class="txt1" style="color: red">
                            You already uploaded the video of this course, if you want to update the video, please delete the original one
                        </a>
                    </c:if>
                    <c:forEach items="${requestScope.teachercourselist}" var="teachercourse" varStatus="c" >

                        <!-- Blog Post -->
                        <div class="col-lg-6">
                            <div class="blog_post">
                                <div class="blog_image" style="background-image:url(${timeList.get(c.index)})"></div>

                                <div class="blog_title_container">
                                    <div class="blog_post_category">
                                        <a href="#">${teachercourse.studentname}</a>
                                        <a href="TeacherClassComment.jsp?coursedate=${teachercourse.date}&courseslot=${teachercourse.time}&studentname=${teachercourse.studentname}&studentid=${teachercourse.studentid}">Write Comment</a>
                                        <a href="uploadfile?coursedate=${teachercourse.date}&courseslot=${teachercourse.time}&studentname=${teachercourse.studentname}&studentid=${teachercourse.studentid}">Upload Video</a>

                                    </div>
                                    <div class="blog_post_text"><h4>${teachercourse.date},${teachercourse.time}</h4></div>
                                    <div class="blog_post_text">
                                        <p>Book:${teachercourse.books}</p>
                                        <p>Platform:${teachercourse.class_platform}</p>


                                    </div>

                                </div>
                            </div>
                        </div>

                    </c:forEach>



                </div>

                <!-- Load More -->
                <div class="row">
                    <div class="col">
                        <div class="load_more_button"><a href="#">load more</a></div>
                    </div>
                </div>
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
</div>
</body>
</html>

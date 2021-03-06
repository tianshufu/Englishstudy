<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-01
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.tianshu.entity.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<meta charset="utf-8">

<head>
    <!-- Required meta tags -->
    <title>Schedule Mannage</title>
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
</head>
<body>
<%
    List<String> list = new ArrayList<String>();
    list.add("08:30-08:55");
    list.add("09:00-09:25");
    list.add("09:30-09:55");
    list.add("10:00-10:25");
    list.add("10:30-10:55");
    list.add("11:00-11:25");
    list.add("11:30-11:55");
    list.add("12:00-12:25");
    list.add("12:30-12:55");
    list.add("13:00-13:25");
    list.add("13:30-13:55");
    list.add("14:00-14:25");
    list.add("14:30-14:55");
    list.add("15:00-15:25");
    list.add("15:30-15:55");
    list.add("16:00-16:25");
    list.add("16:30-16:55");
    list.add("17:00-17:25");
    list.add("17:30-17:55");
    list.add("18:00-18:25");
    list.add("18:30-18:55");
    list.add("19:00-19:25");
    list.add("19:30-19:55");
    list.add("20:00-20:25");
    list.add("20:30-20:55");
    list.add("21:00-21:25");
    list.add("21:30-21:55");
    list.add("22:00-22:25");
    list.add("22:30-22:55");
    list.add("23:00-23:25");

    pageContext.setAttribute("timeList",list);
%>





<div class="wrapper d-flex align-items-stretch">

    <nav id="sidebar">
        <div class="custom-menu">
            <button type="button" id="sidebarCollapse" class="btn btn-primary">
            </button>
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
    <div id="content" class="p-4 p-md-5 pt-5">

        <div class="row row-cols-5 align-content-center" id="teacher_list">
            <c:forEach items="${requestScope.teacherndaysTimeTableListmanage}" var="teacherTimeTable">
                <div class="col-md-3">
                    <div class="box box-danger">
                        <div class="box box-danger">
                            <p>${teacherTimeTable.date}</p>

                        </div>

                        <div class="box box-danger">

                            <a href="try.jsp"><p>${teacherTimeTable.teacher.teacher_name}</p></a>
                        </div>



                        <div class="box box-danger">
                            <%--Time slot already openned --%>
                            <c:forEach items="${teacherTimeTable.timeTable.values()}" varStatus="timeStatus" var="canBeOrdered">
                                <div class="list-group" role="group">
                                    <c:if test="${canBeOrdered}">
                                        <form method="post" action="${pageContext.request.contextPath}/bookCourse">
                                            <input type="hidden" name="teacherId" value="${teacherTimeTable.teacher.teacher_id}">
                                            <input type="hidden" name="teacherName" value="${teacherTimeTable.teacher.teacher_name}">
                                            <input type="hidden" name="date" value="${teacherTimeTable.date}">
                                            <input type="hidden" name="time" value="${timeList.get(timeStatus.index)}">
                                            <li class="list-group-item">
                                                <button type="submit" class="btn btn-light btn-block btn-lg ">${timeList.get(timeStatus.index)}</button>
                                            </li>


                                        </form>

                                    </c:if>
                                    <%--Time not yet open, teacher can click to open--%>
                                    <c:if test="${!canBeOrdered}">
                                        <form method="post" action="${pageContext.request.contextPath}/teacheropenconfirm">
                                            <input type="hidden" name="teacherId" value="${teacherTimeTable.teacher.teacher_id}">
                                            <input type="hidden" name="teacherName" value="${teacherTimeTable.teacher.teacher_name}">
                                            <input type="hidden" name="date" value="${teacherTimeTable.date}">
                                            <input type="hidden" name="time" value="${timeList.get(timeStatus.index)}">
                                            <input type="hidden" name="timeslotint" value="${timeStatus.index}">
                                            <li class="list-group-item">
                                                <button class="btn btn-primary btn-block btn-lg"  data-toggle="modal" data-target="#exampleModal" >${timeList.get(timeStatus.index)}</button>
                                            </li>

                                        </form>







                                        <%--modal, for teachers to comfirm open the time slot--%>

                                    </c:if>


                                </div>
                            </c:forEach>


                        </div>

                    </div>

                </div>
            </c:forEach>

        </div><!-- .row -->
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

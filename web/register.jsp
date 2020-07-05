<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-05-29
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<head>
    <!-- Required meta tags -->
    <title>Register Class</title>
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

    calendar.add(calendar.DATE,1);
    date = calendar.getTime();
    SimpleDateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
    String dateString1 = format1.format(date);
    pageContext.setAttribute("datetoday1",dateString1);


    calendar.add(calendar.DATE,1);
    date = calendar.getTime();
    SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd");
    String dateString2 = format2.format(date);
    pageContext.setAttribute("datetoday2",dateString2);


    calendar.add(calendar.DATE,1);
    date = calendar.getTime();
    SimpleDateFormat format3= new SimpleDateFormat("yyyy-MM-dd");
    String dateString3 = format3.format(date);
    pageContext.setAttribute("datetoday3",dateString3);



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
            <button type="button" id="sidebarCollapse" class="btn btn-primary">
            </button>
        </div>
        <div class="img bg-wrap text-center py-4" style="background-image: url(web_page/sidebar-09/images/bg_1.jpg);">
            <div class="user-logo">
                <div class="img" ></div>

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
            <p class="lead">Speak English Anytime AnyWhere</p>
        </div>




        <div class="btn-group col-md-12 align-content-center" role="group" aria-label="Basic example" style="height: 10%">

            <div class="col-md-3  col-xs-4 col-sm-6 ">
                <c:if test="${param.date==datetoday}">
                     <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-primary "><%=dateString %></button></a>
                </c:if>

                <c:if test="${param.date!=datetoday}">
                    <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-light "><%=dateString %></button></a>
                </c:if>

            </div>

            <div class="col-md-3  col-xs-4 col-sm-6">
                <c:if test="${param.date==datetoday1}">
                    <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString1%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-primary "><%=dateString1 %></button></a>
                </c:if>

                <c:if test="${param.date!=datetoday1}">
                    <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString1%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-light "><%=dateString1 %></button></a>
                </c:if>

            </div>


            <div class="col-md-3  col-xs-4 col-sm-6">
                <c:if test="${param.date==datetoday2}">
                    <a  style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString2%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-primary "><%=dateString2 %></button></a>
                </c:if>

                <c:if test="${param.date!=datetoday2}">
                    <a  style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString2%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-light "><%=dateString2 %></button></a>
                </c:if>

            </div>


            <div class="col-md-3  col-xs-4 col-sm-6">
                <c:if test="${param.date==datetoday3}">
                    <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString3%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-primary "><%=dateString3 %></button></a>
                </c:if>

                <c:if test="${param.date!=datetoday3}">
                    <a style="width: 100%" href="TeacherSearchTimeStudent?date=<%=dateString3%>&pagenum=${requestScope.pagenum}"> <button style="width: 100%" type="button" class="btn btn-light "><%=dateString3 %></button></a>
                </c:if>

            </div>




        </div>


        <div class="col-md-12">

            <p style="text-align:center">Click the teacher's picture to get more info about their schedule</p>
        </div>

        <div class="col-md-12">
            <nav aria-label="...">
                <ul class="pagination pagination justify-content-center" >
                    <c:if test="${requestScope.pagenum==1}">
                        <li class="page-item active" aria-current="page">
                            <span class="page-link">
                                1
                                <span class="sr-only">(current)</span>
                            </span>
                        </li>
                    </c:if>
                    <c:if test="${requestScope.pagenum!=1}">
                        <li class="page-item-"><a class="page-link" href="TeacherSearchTimeStudent?date=${param.date}&pagenum=1">1</a></li>
                    </c:if>

                    <c:if test="${requestScope.pagenum==2}">
                        <li class="page-item active" aria-current="page">
                            <span class="page-link">
                                2
                                <span class="sr-only">(current)</span>
                            </span>
                        </li>
                    </c:if>
                    <c:if test="${requestScope.pagenum!=2}">
                        <li class="page-item-"><a class="page-link" href="TeacherSearchTimeStudent?date=${param.date}&pagenum=2">2</a></li>
                    </c:if>



                </ul>
            </nav>
        </div>











        <div class="row  align-content-center" id="teacher_list">

            <c:forEach items="${requestScope.teacherTimeTableList}" var="teacherTimeTable">
            <div class="col-md-3  col-xs-4 col-sm-3">
                <div class="box box-danger">
                    <div class="box box-danger">
                        <div class="text-center">
                        <a href="teacherTimeSearchNdays?teacherid=${teacherTimeTable.teacher.teacher_id}"><img   src="${teacherTimeTable.teacher.image_url}"   class="rounded-circle" style="width: 150px;height: 150px"></a>
                        </div>
                    </div>

                    <div class="box box-danger">

                        <div class="text-center">
                            <h3> ${teacherTimeTable.teacher.teacher_name}</h3>
                        </div>

                        <div class="text-center">
                            <a href="SearchStudentCourse"><span class="fa fa-usd"></span> ${teacherTimeTable.teacher.credit} </a>
                        </div>


                    </div>

                    <div class="box box-danger">
                        <audio controls style="width: 100% ">
                            <source src="${teacherTimeTable.teacher.audio_url}" type="audio/mp3">
                        </audio>

                    </div>


                <div class="box box-danger">
                        <c:forEach items="${teacherTimeTable.timeTable.values()}" varStatus="timeStatus" var="canBeOrdered">
                            <div class="list-group" role="group">
                                <c:if test="${canBeOrdered}">
                                    <form method="post" action="${pageContext.request.contextPath}/bookCourse">
                                        <input type="hidden" name="teacherId" value="${teacherTimeTable.teacher.teacher_id}">
                                        <input type="hidden" name="teacherName" value="${teacherTimeTable.teacher.teacher_name}">
                                        <input type="hidden" name="credit" value="${teacherTimeTable.teacher.credit}">
                                        <input type="hidden" name="date" value="${teacherTimeTable.date}">
                                        <input type="hidden" name="time" value="${timeList.get(timeStatus.index)}">
                                        <li class="list-group-item">
                                            <button type="submit" class="btn btn-primary btn-block btn-lg">${timeList.get(timeStatus.index)}</button>
                                        </li>


                                    </form>

                                </c:if>
                                <c:if test="${!canBeOrdered}">
                                <li class="list-group-item">
                                    <button class="btn btn-light btn-block btn-lg disabled" >${timeList.get(timeStatus.index)}</button>
                                </li>


                                </c:if>
                            </div>
                        </c:forEach>


                </div>

                </div>

            </div>
            </c:forEach>


        </div>
        <!-- .row -->





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


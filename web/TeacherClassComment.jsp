<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-05-30
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Class Comment</title>
</head>
<body>
<h1>Course Comment</h1>
<div class="-align-center">
    <%

        String teacheridstr2=(String)session.getAttribute("teacherid");
        Integer teacherid=Integer.parseInt(teacheridstr2);
        String teachername=(String)session.getAttribute("teachername");
        String studentname = request.getParameter("studentname");
        String coursedate = request.getParameter("coursedate");     // 接收id
        String courseslot = request.getParameter("courseslot"); // 接收姓名
        String studentid=request.getParameter("studentid");

    %>
    <form type="post" action="${pageContext.request.contextPath}/teacherclasscomment" class="-align-center">
        <input type="hidden" name="teacherId" value="${requestScope.teacherId}">
        <input type="hidden" name="teacherid" value=<%=teacherid%>>
        <input type="hidden" name="studentid" value=<%=studentid%>>
        <input type="hidden" name="date" value=<%=coursedate%>>
        <input type="hidden" name="time" value=<%=courseslot%>>
        <fieldset disabled>
        <div class="form-group">
        <div>
            <label for="disabledTextInput">Student</label>
            <input type="text" id="disabledTextInput0" class="form-control" placeholder="Disabled input" value= <%=studentname%>>


        </div>
            <label for="disabledTextInput">Teacher</label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Disabled input" value= <%=teachername%>>
        </div>


        <div class="form-group">
            <label for="disabledTextInput">Course time</label>
            <input type="text" id="disabledTextInput2" class="form-control" placeholder="Disabled input" value= <%=coursedate+courseslot%>
        </div>

        </fieldset>

        <!-- The student's status-->
        <div class="form-group">
            <label for="exampleFormControlSelect1">Student Status</label>
            <select class="form-control" id="exampleFormControlSelect1" name="studentstatus">

                <option>On Time </option>
                <option>Late </option>
                <option>Absence </option>




            </select>
        </div>



        <!-- Pronounciations-->
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Pronunciation
            </label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="pronounciations"></textarea>
        </div>


         <%--Gramma--%>
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Gramma
            </label>
            <textarea class="form-control" id="exampleFormControlTextarea2" rows="3" name="gramma"></textarea>
        </div>


        <%--Comment--%>
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Comment
            </label>
            <textarea class="form-control" id="exampleFormControlTextarea3" rows="3" name="comment"></textarea>
        </div>
        <div class="form-group">
            <button class="btn btn-primary btn-lg btn-block" type="submit">Submit</button>
        </div>





</div>





</form>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>

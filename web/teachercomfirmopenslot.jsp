<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-01
  Time: 11:26
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

    <title>Confirm Open</title>
</head>
<body>
<h1>Hello, world!</h1>
<form type="post" action="${pageContext.request.contextPath}/teacheropenconfirmupdate">
    <input type="hidden" name="teacherId" value="${requestScope.teacherId}">
    <input type="hidden" name="date" value="${requestScope.date}">
    <input type="hidden" name="time" value="${requestScope.timeslotint}">
    <fieldset disabled>
        <div class="form-group">
            <label for="disabledTextInput">Teacher</label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Disabled input" value="${requestScope.teacherName}">
        </div>

        <div class="form-group">
            <label for="disabledTextInput">Course time</label>
            <input type="text" id="disabledTextInput2" class="form-control" placeholder="Disabled input" value="${requestScope.date} ${requestScope.time}">
        </div>

    </fieldset>

    <!-- The selctions of books-->


    <!-- Leave message for students-->

    <div class="form-group">
        <button class="btn btn-primary" type="submit">Comfirm</button>
        <a href="teachertimanagesearch" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Cancel</a>

    </div>



</form>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>

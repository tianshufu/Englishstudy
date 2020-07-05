<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <p class="lead">Select and fill your course info here.</p>
     </div>

    <div class="row ">
        <div class="col-md-6 offset-3 order-md-1">

            <form type="post" action="${pageContext.request.contextPath}/bookServlet">
                    <input type="hidden" name="teacherId" value="${requestScope.teacherId}">
                    <input type="hidden" name="date" value="${requestScope.date}">
                    <input type="hidden" name="time" value="${requestScope.time}">
                    <input type="hidden" name="credit" value="${requestScope.credit}">
                    <input type="hidden" name="teacherName" value="${requestScope.teacherName}">

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
                    <div class="form-group">
                        <label for="exampleFormControlSelect1">Books</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="books">

                            <option>American School Text Book Prek1,2,3,4 </option>
                            <option>American Text book K2,3,4 </option>
                            <option>Classic Junior Level7 </option>
                            <option>Exploring English 2-4 </option>
                            <option>Junior free Talk I ( 1-40 lesson) </option>
                            <option>Junior Learn and talk (1-50 lesson) </option>
                            <option>Lets Go Book 1-4 </option>
                            <option>Phonics Book 1-3 </option>
                            <option>Side by side 1 </option>
                            <option>Wonder Reading Gk Book 1-9 </option>
                            <option>Cambridge International Book 1-4 </option>
                            <option>100 topics for Business English Situation </option>
                            <option>100 Topics for Daily English </option>
                            <option>Basic Business English </option>
                            <option>Can you believe It </option>
                            <option>Chat room for teens </option>
                            <option>Cambridge International English Book1-4) </option>
                            <option>TOEFL English Speaking</option>
                            <option>IELTS top Speaking </option>
                            <option>IELTS trending topic </option>
                            <option>Free talk I (Lesson 1-40) </option>
                            <option>Free talk II ( Lesson 1-50) </option>
                            <option>New Concept Book 1-3 </option>


                        </select>
                    </div>

                    <!-- The selctions of course platform-->
                    <div class="form-group">
                        <label for="exampleFormControlSelect1">Course Platform</label>
                        <select class="form-control" id="exampleFormControlSelect3" name="course_platform">


                            <option>Zoom</option>


                        </select>
                    </div>

                    <!-- The selctions of course pace-->
                    <div class="form-group">
                        <label for="exampleFormControlSelect1">Speaking Pace</label>
                        <select class="form-control" id="exampleFormControlSelect2" name="speaking_pace">
                                <option>Fast</option>
                                <option>Medium</option>
                                <option>Slow</option>

                        </select>
                    </div>

                    <!-- Leave message for students-->
                    <div class="form-group">
                        <label for="exampleFormControlTextarea1">Leave word</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="leave_word"></textarea>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-lg btn-block" type="submit">Submit</button>
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

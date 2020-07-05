<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-12
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Register</title>
</head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

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

<script type="text/javascript">
    function checkpassword() {
        var password = document.getElementById("password").value;
        var repassword = document.getElementById("passwordconfirm").value;

        if(password == repassword) {
            document.getElementById("tishi").innerHTML="<br><font color='green'>Passwords for the two times are the same</font>";
            document.getElementById("submit").disabled = false;

        }else {
            document.getElementById("tishi").innerHTML="<br><font color='red'>Passwords for the two times are not the same!</font>";
            document.getElementById("submit").disabled = true;
        }
    }
</script>

<script type="text/javascript">
    var InterValObj; //timer变量，控制时间
    var count = 300; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    function sendMessage() {
        curCount = count;
        $("#btn1").attr("disabled", "true");
        $("#btn1").val(curCount + "seconds resend");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btn1").removeAttr("disabled");//启用按钮
            $("#btn1").val("重新发送验证码");
        } else {
            curCount--;
            $("#btn1").val(curCount + "秒后可重新发送");
        }
    }

    function validatorloginName() {
        var phone = $("#phonenum").val();
        console.log("verify the phone num---")
        if (phone !== "") {
            $.post({
                url : "${pageContext.request.contextPath}/verifyphone",  //发送请求
                type : "post",
                data : {
                    "phonenum" : phone
                },
                success : function(result) {
                    console.log(result)
                    if(result=="true")
                    {
                        document.getElementById("tishi2").innerHTML="<br><font color='green'>Phone num are available to register</font>";
                        document.getElementById("btn1").disabled = false;
                    }

                    else
                    {

                        document.getElementById("tishi2").innerHTML="<br><font color='red'>Phone num has been registered before!</font>";
                        document.getElementById("btn1").disabled = true;
                    }

                }
            });
        }




    }

    function  sendtext() {
        var sms = "";

        var phone = $("#phonenum").val();
        console.log("发起check接口---")
        if (phone !== "") {
            $.post({
                url : "${pageContext.request.contextPath}/sendSMS",  //发送请求
                type : "post",
                data : {
                    "phone" : phone
                },
                success : function(result) {
                    sms = result;
                }
            });
        } else {
            alert("请输入手机号");
            return false;
        }

    }








</script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js">


</script>


<c:if test="${not empty failed}">
    <script>
        window.addEventListener("load",function(){
            alert("${failed}");
        })
    </script>
</c:if>

<div class="container">
    <div class="py-5 text-center">
        <div class="logo_text">
            <div class="logo_text">Loren</div>

            <!--<div  style="height: 2%"><img src="images/LOREN.PNG" height="80" width="80" alt=""></div>-->


        </div>
        <h2>Register form</h2>
        <p class="lead">Welcome to join us!</p>
    </div>

    <div class="row">

        <div class="col-md-6 offset-3 order-md-1">
            <form class="needs-validation" action="studentregisteraccount" novalidate>

                <div class="mb-3">
                    <label for="username">Username</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">@</span>
                        </div>
                        <input type="text" class="form-control" id="username" name="username" placeholder="Username" required>
                        <div class="invalid-feedback" style="width: 100%;">
                            Your username is required.
                        </div>
                    </div>
                </div>



                <div class="mb-3">
                    <label for="email">Email <span class="text-muted"></span></label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="you@example.com" required>
                    <div class="invalid-feedback">
                        Please enter a valid email address for shipping updates.
                    </div>
                </div>



                <div class="mb-3">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Xras123" required>
                    <div class="invalid-feedback">
                        Please enter your  password
                    </div>


                </div>

                <div class="mb-3">
                    <label for="passwordconfirm">Password Confirm</label>
                    <input type="password" class="form-control" id="passwordconfirm" placeholder="Xras123" required onkeyup="checkpassword()">
                    <div class="invalid-feedback">
                        Please renter your password
                    </div>

                </div>
                <span id="tishi"></span></input>



                <div class="mb-3">
                    <label for="phonenum">Phone</label>
                    <input type="text" class="form-control" id="phonenum" name="phonenum" placeholder="Phone num" required onblur="validatorloginName()">
                    <div class="invalid-feedback">
                        Please enter your phone num.
                    </div>

                </div>

                <span id="tishi2"></span></input>

                <div class="mb-3">
                    <label for="code">Verificationcode</label>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <input type="code" class="form-control " id="code" name="code"
                                   placeholder="Verification code" required>
                        </div>

                        <div class="form-group col-md-4">
                            <input
                            class="btn btn-secondary" id="btn1" name="btn1" value="Send VerifyCode"
                            onclick="sendMessage();sendtext()" />
                        </div>
                    </div>

                </div>











                <hr class="mb-4">
                <button class="btn btn-primary btn-lg btn-block" type="submit" id="submit">Submit</button>
            </form>
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

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</body>

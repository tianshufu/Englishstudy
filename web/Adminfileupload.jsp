<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-27
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</head>
<title></title>

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
    (function() {

        'use strict';

        $('.input-file').each(function() {
            var $input = $(this),
                $label = $input.next('.js-labelFile'),
                labelVal = $label.html();

            $input.on('change', function(element) {
                var fileName = '';
                if (element.target.value) fileName = element.target.value.split('\\').pop();
                fileName ? $label.addClass('has-file').find('.js-fileName').html(fileName) : $label.removeClass('has-file').html(labelVal);
            });
        });

    })();

</script>

<div class="container">
    <div class="py-5 text-center">
        <div class="logo_text">
            <div class="logo_text">Loren</div>

            <!--<div  style="height: 2%"><img src="images/LOREN.PNG" height="80" width="80" alt=""></div>-->


        </div>
        <h2>Info form</h2>
        <p class="lead">Check and change your information here.</p>
    </div>

    <div class="row">
        <form action="upload" method="post"  >
            <div class="form-group">
                <input type="file" name="file" id="file" class="input-file">
                <input type="text" name="filename" id="filename" class="input-file">
                <label for="file" class="btn btn-tertiary js-labelFile">
                    <i class="icon fa fa-check"></i>
                    <span class="js-fileName">Choose a file</span>
                </label>
            </div>
            <button class="btn btn-primary btn-lg btn-block" type="submit" id="submit">Submit</button>
        </form>
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

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

</body>

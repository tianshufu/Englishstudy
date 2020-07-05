<%--
  Created by IntelliJ IDEA.
  User: futianshu
  Date: 2020-06-16
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Loren</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Lingua project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/bootstrap4/bootstrap.min.css">
    <link href="web_page/lingua/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/plugins/OwlCarousel2-2.2.1/animate.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/main_styles.css">
    <link rel="stylesheet" type="text/css" href="web_page/lingua/styles/responsive.css">
</head>
<body>

<div class="super_container">

    <!-- Header -->

    <header class="header">

        <!-- Top Bar -->
        <div class="top_bar">
            <div class="top_bar_container">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="top_bar_content d-flex flex-row align-items-center justify-content-start">
                                <div class="top_bar_phone"><span class="top_bar_title">联系:</span>+86 1387 122 8827</div>
                                <div class="top_bar_right ml-auto">

                                    <!-- Language -->
                                    <div class="top_bar_lang">
                                        <span class="top_bar_title">语言:</span>
                                        <ul class="lang_list">
                                            <li class="hassubs">
                                                <a href="#">中文<i class="fa fa-angle-down" aria-hidden="true"></i></a>
                                                <ul>
                                                    <li><a href="web_page/lingua/index.html">English</a></li>

                                                </ul>
                                            </li>
                                        </ul>
                                    </div>

                                    <!-- Social -->
                                    <div class="top_bar_social">
                                        <span class="top_bar_title social_title">关注我们</span>
                                        <ul>
                                            <li><a href="#"><i class="fa fa-weixin" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-weibo" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-qq" aria-hidden="true"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Header Content -->
        <div class="header_container">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="header_content d-flex flex-row align-items-center justify-content-start">
                            <div class="logo_container mr-auto">
                                <a href="#">
                                    <div class="logo_text">
                                        <div class="logo_text">Loren</div>

                                        <!--<div  style="height: 2%"><img src="images/LOREN.PNG" height="80" width="80" alt=""></div>-->


                                    </div>

                                </a>
                            </div>
                            <nav class="main_nav_contaner">
                                <ul class="main_nav">
                                    <li class="active"><a href="web_page/lingua/index_Chinese.html">主页</a></li>
                                    <li><a href="web_page/lingua/courses_Chinese.html">课程</a></li>
                                    <li><a href="web_page/lingua/instructors_Chinese.html">明星教师</a></li>
                                    <li class="menu_mm"><a href="web_page/lingua/blog_single.html">使用指南</a></li>
                                    <li><a href="web_page/lingua/contact_Chinese.html">联系我们</a></li>
                                    <li><a href="http://47.98.33.185:8080/Englishstudy_war%20exploded/login.jsp">登录</a></li>
                                </ul>
                            </nav>
                            <div class="header_content_right ml-auto text-right">
                                <div class="header_search">
                                    <div class="search_form_container">
                                        <form action="#" id="search_form" class="search_form trans_400">
                                            <input type="search" class="header_search_input trans_400" placeholder="Type for Search" required="required">
                                            <div class="search_button">
                                                <i class="fa fa-search" aria-hidden="true"></i>
                                            </div>
                                        </form>
                                    </div>
                                </div>

                                <!-- Hamburger -->

                                <div class="user"><a href="#"><i class="fa fa-user" aria-hidden="true"></i></a></div>
                                <div class="hamburger menu_mm">
                                    <i class="fa fa-bars menu_mm" aria-hidden="true"></i>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

    </header>

    <!-- Menu -->

    <div class="menu d-flex flex-column align-items-end justify-content-start text-right menu_mm trans_400">
        <div class="menu_close_container"><div class="menu_close"><div></div><div></div></div></div>
        <div class="search">
            <form action="#" class="header_search_form menu_mm">
                <input type="search" class="search_input menu_mm" placeholder="Search" required="required">
                <button class="header_search_button d-flex flex-column align-items-center justify-content-center menu_mm">
                    <i class="fa fa-search menu_mm" aria-hidden="true"></i>
                </button>
            </form>
        </div>
        <nav class="menu_nav">
            <ul class="menu_mm">
                <li class="menu_mm"><a href="web_page/lingua/index_Chinese.html">主页</a></li>
                <li class="menu_mm"><a href="web_page/lingua/courses_Chinese.html">主要课程</a></li>
                <li class="menu_mm"><a href="web_page/lingua/instructors_Chinese.html">明星教师</a></li>
                <li class="menu_mm"><a href="web_page/lingua/instructors_Chinese.html">使用指南</a></li>
                <li class="menu_mm"><a href="web_page/lingua/contact_Chinese.html">联系我们</a></li>
                <li class="menu_mm"><a href="http://47.98.33.185:8080/Englishstudy_war%20exploded/login.jsp">登录</a></li>

            </ul>
        </nav>
        <div class="menu_extra">
            <div class="menu_phone"><span class="menu_title">联系我们:</span>+86 1387 122 8827</div>
            <div class="menu_social">
                <span class="menu_title">follow us</span>
                <ul>
                    <li><a href="#"><i class="fa fa-weixin" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-weibo" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-qq" aria-hidden="true"></i></a></li>
                </ul>
            </div>
        </div>
    </div>

    <!-- Home -->

    <div class="home">
        <div class="home_background" style="background-image: url(images/index_background2.jpg);"></div>
        <div class="home_content">
            <div class="container">
                <div class="row">
                    <div class="col text-center">
                        <h1 class="home_title" >Love ORal ENglish</h1>

                        <div class="home_button trans_200"><a href="http://47.98.33.185:8080/Englishstudy_war%20exploded/studentregisteraccount.jsp">注册</a></div>



                </div>
            </div>
        </div>
    </div>




    <!-- Courses -->

    <div class="courses">
        <div class="courses_background"></div>
        <div class="container">
            <div class="row">
                <div class="col">
                    <h2 class="section_title text-center">热门课程</h2>
                </div>
            </div>
            <div class="row courses_row">

                <!-- Course -->
                <div class="col-lg-4 course_col" >
                    <div class="course" >
                        <div class="course_image"><img src="web_page/lingua/images/course_13.jpg" height="170"  alt=""></div>
                        <div class="course_body" style="height: 250px">
                            <div class="course_title"><a href="web_page/lingua/course.html">托福口语</a></div>
                            <div class="course_info">
                                <ul>
                                    <li><a href="web_page/lingua/instructors.html">Tony Fu</a></li>
                                    <li><a href="#">英语</a></li>
                                </ul>
                            </div>
                            <div class="course_text">
                                <p>托福是世界上最广为人知的英语考试之一。在精心设计的课程中，可以提高你的托福成绩和学习能力 </p>
                            </div>
                        </div>
                        <div class="course_footer d-flex flex-row align-items-center justify-content-start">
                            <div class="course_students"><i class="fa fa-user" aria-hidden="true"></i><span>10</span></div>
                            <div class="course_rating ml-auto"><i class="fa fa-star" aria-hidden="true"></i><span>4,5</span></div>
                            <div class="course_mark course_free trans_200"><a href="#">Free</a></div>
                        </div>
                    </div>
                </div>

                <!-- Course -->
                <div class="col-lg-4 course_col">
                    <div class="course">
                        <div class="course_image"><img src="web_page/lingua/images/course_15.jpg" height="170" alt=""></div>
                        <div class="course_body" style="height: 250px">
                            <div class="course_title"><a href="web_page/lingua/course.html">雅思口语</a></div>
                            <div class="course_info">
                                <ul>
                                    <li><a href="web_page/lingua/instructors.html">Cindy</a></li>
                                    <li><a href="#">英语</a></li>
                                </ul>
                            </div>
                            <div class="course_text">
                                <p>雅思考试也是一项举世闻名的考试。在我们的课程中，我们可以提高你的语法和沟通技巧，以便你能更好地适应雅思口语测试</p>
                            </div>
                        </div>
                        <div class="course_footer d-flex flex-row align-items-center justify-content-start">
                            <div class="course_students"><i class="fa fa-user" aria-hidden="true"></i><span>10</span></div>
                            <div class="course_rating ml-auto"><i class="fa fa-star" aria-hidden="true"></i><span>4,5</span></div>
                            <div class="course_mark course_free trans_200"><a href="#">Free</a></div>
                        </div>
                    </div>
                </div>

                <!-- Course -->
                <div class="col-lg-4 course_col">
                    <div class="course">
                        <div class="course_image"><img src="web_page/lingua/images/course_17.jpg" height="170" alt=""></div>
                        <div class="course_body" style="height: 250px">
                            <div class="course_title"><a href="web_page/lingua/course.html">自由讨论</a></div>
                            <div class="course_info">
                                <ul>
                                    <li><a href="web_page/lingua/instructors.html">Tony Fu</a></li>
                                    <li><a href="#">英语</a></li>
                                </ul>
                            </div>
                            <div class="course_text">
                                <p>在这里，你可以选择任何你想和老师交谈的话题，在提高你的英语水平的同时享受乐趣</p>
                            </div>
                        </div>
                        <div class="course_footer d-flex flex-row align-items-center justify-content-start">
                            <div class="course_students"><i class="fa fa-user" aria-hidden="true"></i><span>10</span></div>
                            <div class="course_rating ml-auto"><i class="fa fa-star" aria-hidden="true"></i><span>4,5</span></div>
                            <div class="course_mark trans_200"><a href="#">$45</a></div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- About -->

    <div class="events">
        <div class="container">
            <div class="row">
                <div class="col">
                    <h2 class="section_title text-center">关于我们</h2>
                </div>
            </div>
            <p > 您一定很关心孩子们的学习。教室+外教1-1教室，开设语音课程，学会拼写、背单词、读绘本、练习发音、掌握上下文词汇，养成主动学习、定期复习的良好习惯。然后通过分层阅读，让小学生更好地学习句型、语法、知识点。外教1比1，购买课程将有个性化学习计划，外教1比1互动课堂，锻炼听说能力，开展对话和实战，提高语言技能，为了让孩子们在很小的时候就学会英语，我们也为青少年提供成人学生的服务，帮助他们练习英语口语交流，我们还提供雅思、托福口语和其他课程，帮助他们掌握英语知识 </p>


        </div>
    </div>
</div>

<!-- Instructors Chinese-->

<div class="instructors">
    <div class="instructors_background" style="background-image:url(images/instructors_background.png)"></div>
    <div class="container">
        <div class="row">
            <div class="col">
                <h2 class="section_title text-center">明星教师</h2>
            </div>
        </div>
        <div class="row instructors_row">

            <!-- Instructor -->
            <div class="col-lg-4 instructor_col">
                <div class="instructor text-center">
                    <div class="instructor_image_container">
                        <div class="instructor_image"><img src="web_page/lingua/images/Teacher_image/GILOH%20MAAMO%20BASILIA.jpeg" alt=""></div>
                    </div>
                    <div class="instructor_name"><a href="web_page/lingua/instructors.html">Giloh Basilia

                    </a></div>
                    <div class="instructor_title">教师</div>
                    <div class="instructor_text">
                        <p>大家好，我在这里帮助学习者发展和提高口头、书面和阅读理解能力。作为一名英语教师，我的工作不仅是激发学生的热情，激发他们的英语技能，以沟通和社交他人，因为它是当今最口语化的语言。教非英语人士对我来说并不新鲜，我是本地社区手语教师的志愿者。我也很高兴有机会与这家公司合作。并保证我会尽我最大的努力来取得成功！</p>
                    </div>
                    <div class="instructor_social">
                        <ul>
                            <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <!-- Instructor -->
            <div class="col-lg-4 instructor_col">
                <div class="instructor text-center">
                    <div class="instructor_image_container">
                        <div class="instructor_image"><img src="web_page/lingua/images/Teacher_image/Cindy.png" alt=""></div>
                    </div>
                    <div class="instructor_name"><a href="web_page/lingua/instructors.html">Cindy
                    </a></div>
                    <div class="instructor_title">教师</div>
                    <div class="instructor_text">
                        <p>教学是一种高尚的职业，因为它塑造了个人。作为作为一名教师，这是一份既累又充实的工作。看到他们成长为一个更好的人，特别是看到他们提高英语水平，激励我每天都做得更好。但最重要的是，热爱这份工作是最有回报的，因为你也学会了爱你的学生就像爱你自己一样 </p>
                    </div>
                    <div class="instructor_social">
                        <ul>
                            <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <!-- Instructor -->
            <div class="col-lg-4 instructor_col">
                <div class="instructor text-center">
                    <div class="instructor_image_container">
                        <div class="instructor_image"><img src="web_page/lingua/images/Teacher_image/JESSAMAY%20GULONG%20DEL%20MONTE.jpg" alt=""></div>
                    </div>
                    <div class="instructor_name"><a href="web_page/lingua/instructors.html">Jessa May
                    </a></div>
                    <div class="instructor_title">教师</div>
                    <div class="instructor_text">
                        <p>作为一名教师，教学成了我快乐的源泉，
                            我很高兴见到一位正在提高英语水平的人。
                            这个领域激励我培养愉快的品质，以吸引每一个学生的兴趣，这样我们就可以在没有压力的情况下学习英语，同时也有鼓舞人心的环境</p>
                    </div>
                    <div class="instructor_social">
                        <ul>
                            <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>




<!-- Footer-Chinese -->

<footer class="footer">
    <div class="footer_body">
        <div class="container">
            <div class="row">

                <!-- Newsletter -->
                <div class="col-lg-3 footer_col">
                    <div class="newsletter_container d-flex flex-column align-items-start justify-content-end">
                        <div class="footer_logo mb-auto"><a href="#">Loren</a></div>
                        <div class="footer_title">订阅</div>
                        <form action="#" id="newsletter_form" class="newsletter_form">
                            <input type="email" class="newsletter_input" placeholder="邮箱" required="required">
                            <button class="newsletter_button"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></button>
                        </form>
                    </div>
                </div>

                <!-- About -->
                <div class="col-lg-2 offset-lg-3 footer_col">
                    <div>
                        <div class="footer_title">关于我们</div>
                        <ul class="footer_list">
                            <li><a href="#">课程</a></li>
                            <li><a href="#">团队</a></li>
                            <li><a href="#">加入我们</a></li>
                            <li><a href="#">联系我们</a></li>
                        </ul>
                    </div>
                </div>

                <!-- Help & Support -->
                <div class="col-lg-2 footer_col">
                    <div class="footer_title">帮助与支持</div>
                    <ul class="footer_list">
                        <li><a href="#">使用指南</a></li>
                        <li><a href="#">常见问题</a></li>

                    </ul>
                </div>

                <!-- Privacy -->
                <div class="col-lg-2 footer_col clearfix">
                    <div>
                        <div class="footer_title">隐私与条款</div>
                        <ul class="footer_list">
                            <li><a href="#">社区准则</a></li>
                            <li><a href="#">隐私</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="copyright_content d-flex flex-md-row flex-column align-items-md-center align-items-start justify-content-start">
                        <div class="cr"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
                        <div class="cr_right ml-md-auto">
                            <div class="footer_phone"><span class="cr_title">联系:</span>+86 13871228827</div>
                            <div class="footer_social">
                                <span class="cr_social_title">follow us</span>
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                    <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
</div>

<script src="web_page/lingua/js/jquery-3.2.1.min.js"></script>
<script src="web_page/lingua/styles/bootstrap4/popper.js"></script>
<script src="web_page/lingua/styles/bootstrap4/bootstrap.min.js"></script>
<script src="web_page/lingua/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="web_page/lingua/plugins/easing/easing.js"></script>
<script src="web_page/lingua/js/custom.js"></script>
</body>
</html>

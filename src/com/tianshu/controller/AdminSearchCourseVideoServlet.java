package com.tianshu.controller;

import com.tianshu.entity.Coursevideo;
import com.tianshu.utils.TeacherVideo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/adminsearchcoursevideo")
public class AdminSearchCourseVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Coursevideo coursevideo=new Coursevideo();
        TeacherVideo teacherVideo=new TeacherVideo();
        List<Coursevideo> coursevideoList=teacherVideo.Searchallstudentinfo();
        req.setAttribute("videoinfo",coursevideoList);
        req.getRequestDispatcher("AdminSearchCourseVideo.jsp").forward(req,resp);




    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}

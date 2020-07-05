package com.tianshu.controller;

import com.tianshu.entity.StudentCourseComment;
import com.tianshu.utils.AdminSearchFinnishedCourse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/adminsearchfinnishedcourse")
public class AdminSearchFinnisedCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminSearchFinnishedCourse adminSearchFinnishedCourse=new AdminSearchFinnishedCourse();
        List<StudentCourseComment> studentCourseCommentList=adminSearchFinnishedCourse.adminsearchfinnishedclass();
        req.setAttribute("finnisedcourse",studentCourseCommentList);
        req.getRequestDispatcher("AdminSearchFinnishedCourse.jsp").forward(req,resp);


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

}

package com.tianshu.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//请求转发给订购页面
@WebServlet("/bookCourse")
public class BookCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacherName = req.getParameter("teacherName");
        Integer teacherId = Integer.parseInt(req.getParameter("teacherId"));
        String creditstr=req.getParameter("credit");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        req.setAttribute("teacherId",teacherId);
        req.setAttribute("teacherName",teacherName);
        req.setAttribute("date",date);
        req.setAttribute("time",time);
        req.setAttribute("credit",creditstr);
        req.getRequestDispatcher("bookCourse.jsp").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }



}

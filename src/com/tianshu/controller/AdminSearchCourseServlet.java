package com.tianshu.controller;

import com.tianshu.entity.AdminCourseInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/adminsearchcourse")
public class AdminSearchCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        com.tianshu.utils.AdminSearchCourse adminSearchCourse= new com.tianshu.utils.AdminSearchCourse();
        AdminCourseInfo adminCourseInfo= new AdminCourseInfo();
        List<AdminCourseInfo> adminCourseInfoList=new ArrayList<>();
        adminCourseInfoList=adminSearchCourse.adminsearchcourse();
        req.setAttribute("adminsearchcourse",adminCourseInfoList);
        req.getRequestDispatcher("AdminSearchCourse.jsp").forward(req,resp);


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

}

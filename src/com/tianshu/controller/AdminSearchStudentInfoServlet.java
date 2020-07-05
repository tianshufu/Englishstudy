package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.utils.SearchStudentInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/adminsearchstudentinfo")
public class AdminSearchStudentInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SearchStudentInfo searchStudentInfo=new SearchStudentInfo();
        List<Student> studentList=searchStudentInfo.Searchallstudentinfo();
        req.setAttribute("studentinfo",studentList);
        req.getRequestDispatcher("AdminSearchStudentinfo.jsp").forward(req,resp);


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }


}

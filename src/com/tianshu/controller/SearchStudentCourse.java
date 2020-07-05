package com.tianshu.controller;


import com.tianshu.entity.Student;
import com.tianshu.entity.StudentCourse;
import com.tianshu.entity.TimeTable;
import com.tianshu.utils.BookCourse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// The servlet to get all the selected courses  information for one student
@WebServlet("/SearchStudentCourse")
public class SearchStudentCourse extends HttpServlet {

        private StudentCourse studentCourse=new StudentCourse();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req,resp);

        }

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            int studentId = ((Student)req.getSession().getAttribute("student")).getStudentid();

            com.tianshu.utils.SearchStudentCourse searchStudentCourse=new com.tianshu.utils.SearchStudentCourse();
            List<StudentCourse> studentCourses=new ArrayList<StudentCourse>();
            studentCourses=searchStudentCourse.searchstudentcourse(studentId);
            System.out.println(studentCourses);
            req.setAttribute("studentcourselist",studentCourses);
            req.getRequestDispatcher("/studentbookedcourse.jsp").forward(req,resp);
        }






}

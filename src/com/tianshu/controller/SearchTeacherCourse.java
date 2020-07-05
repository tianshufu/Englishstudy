package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.entity.StudentCourse;
import com.tianshu.entity.TeacherCourse;
import com.tianshu.utils.TeacherBookedClass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/SearchTeacherCourse")
public class SearchTeacherCourse extends HttpServlet {
    //private StudentCourse studentCourse=new StudentCourse();
    private TeacherCourse teacherCourse=new TeacherCourse();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //int studentId = ((Student)req.getSession().getAttribute("student")).getStudentid();
        HttpSession session = req.getSession();
        String teacheridstr2=(String)session.getAttribute("teacherid");
        Integer teacherid=Integer.parseInt(teacheridstr2);
        //com.tianshu.utils.SearchStudentCourse searchStudentCourse=new com.tianshu.utils.SearchStudentCourse();
        TeacherBookedClass teacherBookedClass=new TeacherBookedClass();
        List<TeacherCourse> teacherCourses=new ArrayList<TeacherCourse>();
        teacherCourses=teacherBookedClass.searchstudentcourse(teacherid);
        System.out.println(teacherCourses);
        req.setAttribute("teachercourselist",teacherCourses);
        req.getRequestDispatcher("/teacherbookedcourse.jsp").forward(req,resp);
    }
}

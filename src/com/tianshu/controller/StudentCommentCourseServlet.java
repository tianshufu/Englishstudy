package com.tianshu.controller;

import com.tianshu.entity.TimeTable;
import com.tianshu.utils.StudentClassComment;
import com.tianshu.utils.TeacherClassComment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/studentclasscomment")
public class StudentCommentCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TimeTable timeTable=new TimeTable();

        String studentidstr=req.getParameter("studentid");
        int studentid=Integer.parseInt(studentidstr);
        int teacherId=Integer.parseInt(req.getParameter("teacherid"));
        String date=req.getParameter("date");
        String time=req.getParameter("time");
        String coursescorestr=req.getParameter("rating");
        int coursescore=Integer.parseInt(coursescorestr);
        String comment=req.getParameter("studentcomment");
        StudentClassComment studentClassComment= new StudentClassComment();
        studentClassComment.InsertStudentComment(teacherId,studentid,date,time,coursescore,comment);
        req.getRequestDispatcher("SearchStudentCourse").forward(req,resp);

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }


}

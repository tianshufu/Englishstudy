package com.tianshu.controller;

import com.tianshu.entity.TeacherCourse;
import com.tianshu.entity.TimeTable;
import com.tianshu.utils.TeacherBookedClass;
import com.tianshu.utils.TeacherClassComment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/teacherclasscomment")
public class TeacherClassCommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TimeTable timeTable=new TimeTable();
        String teachername=req.getParameter("teachername");
        String studentidstr=req.getParameter("studentid");
        int studentid=Integer.parseInt(studentidstr);
        int teacherId=Integer.parseInt(req.getParameter("teacherid"));
        String date=req.getParameter("date");
        String time=req.getParameter("time");

       // String timeslotstring=timeTable.getTime(Integer.parseInt(time));
        String studentstatus=req.getParameter("studentstatus");
        String pronounciations=req.getParameter("pronounciations");
        String gramma=req.getParameter("gramma");
        String comment=req.getParameter("comment");
        TeacherClassComment teacherClassComment=new TeacherClassComment();
        teacherClassComment.InsertTeacherComment(teacherId,studentid,date,time,studentstatus,pronounciations,gramma,comment);
        teacherClassComment.Delete_Finnished_Class(teacherId,studentid,date,time);

        req.getRequestDispatcher("SearchTeacherCourse").forward(req,resp);

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       doPost(req,resp);
    }

}

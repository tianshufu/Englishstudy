package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.utils.BookCourse;
import com.tianshu.utils.TeacherSlot;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//this servlet goes from the confirm page, insert the open slot to the database and return to manage page
@WebServlet("/teacheropenconfirmupdate")
public class TeacherManageTimeConfirmUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String teacherId = req.getParameter("teacherId");
        System.out.println(teacherId);
        String date = req.getParameter("date");
        Integer intteacherid=Integer.parseInt(teacherId);
        int timeslot = Integer.parseInt(req.getParameter("time"));
        TeacherSlot teacherSlot=new TeacherSlot();
        teacherSlot.InsertTeacherTimeslot(intteacherid,date,timeslot);
        req.getRequestDispatcher("teachertimanagesearch").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }





}

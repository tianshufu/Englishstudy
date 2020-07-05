package com.tianshu.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//teacher time manage page transfer course info to confirm page
@WebServlet("/teacheropenconfirm")
public class TeacherManageTimeConfirmInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacherName = req.getParameter("teacherName");
        Integer teacherId = Integer.parseInt(req.getParameter("teacherId"));
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String timeslotint=req.getParameter("timeslotint");
        req.setAttribute("teacherId",teacherId);
        req.setAttribute("teacherName",teacherName);
        req.setAttribute("date",date);
        req.setAttribute("time",time);
        req.setAttribute("timeslotint",timeslotint);
        req.getRequestDispatcher("teachercomfirmopenslot.jsp").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}

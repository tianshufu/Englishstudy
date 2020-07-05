package com.tianshu.controller;

import com.tianshu.entity.TimeTable;
import com.tianshu.uploadfile.UploadDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/uploadfile")

public class UploadtryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String date=request.getParameter("coursedate");
        String timeslotstr=request.getParameter("courseslot");
        TimeTable timeTable=new TimeTable();
        Integer timeslot=timeTable.getTimeSlot(timeslotstr);
        String studentname=request.getParameter("studentname");
        String studentidstr=request.getParameter("studentid");
        Integer studentid=Integer.parseInt(studentidstr);
        String teacheridstr = ((String)request.getSession().getAttribute("teacherid"));

        //store the value to the session
        request.getSession().setAttribute("studentid",studentidstr);
        request.getSession().setAttribute("date",date);
        request.getSession().setAttribute("timeslot",timeslotstr);

        String key=date+timeslot+studentid+studentname+teacheridstr+".mp4";
        System.out.println("Entrykey:"+key);
        UploadDemo uploadDemo=new UploadDemo();
        String token= uploadDemo.token();
        //String token=uploadDemo.cover_coken(key);
        request.setAttribute("key",key);
        request.setAttribute("token",token);
        request.getRequestDispatcher("uploadtry.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }



}

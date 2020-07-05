package com.tianshu.controller;

import com.tianshu.utils.TeacherInfoUpdate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/teachermodifyinfo")
public class TeacherModifyInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacheridstr = ((String)req.getSession().getAttribute("teacherid"));
        int teacherid=Integer.parseInt(teacheridstr);
        String teachername=req.getParameter("teachername");
        String email=req.getParameter("email");
        String zoomid=req.getParameter("zoomid");
        String zoompass=req.getParameter("zoompass");
        String skype=req.getParameter("skype");
        String wechat=req.getParameter("wechat");

        // jdbc
        TeacherInfoUpdate teacherInfoUpdate=new TeacherInfoUpdate();
        teacherInfoUpdate.teacherinfoupdate(teacherid,teachername,email,zoomid,zoompass,skype,wechat);

        req.getRequestDispatcher("teachershowinfo").forward(req,resp);


    }



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }
}

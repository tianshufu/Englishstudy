package com.tianshu.controller;

import com.tianshu.entity.Teacher;
import com.tianshu.utils.SearchTeacherInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//this is servlet to display the teacher's current info
@WebServlet("/teachershowinfo")
public class TeacherShowInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacheridstr = ((String)req.getSession().getAttribute("teacherid"));
        int teacherid=Integer.parseInt(teacheridstr);
        SearchTeacherInfo searchTeacherInfo=new SearchTeacherInfo();
        Teacher teacher=searchTeacherInfo.searchteacherinfo(teacherid);
        System.out.println(teacher);
        req.setAttribute("teacher",teacher);
        req.getRequestDispatcher("TeacherInfoModify.jsp").forward(req,resp);

        /*
        teacher=searchTeacherInfo.searchteacherinfo(teacherid);
        String teachername=teacher.getTeacher_name();
        String teacheremail=teacher.getEmail();
        String zoomid=teacher.getZoom_contact();
        String zoompass=teacher.getZoom_password();
        String wechat=teacher.getWechat_account();
        String skype=teacher.getSkype_account();

        req.setAttribute("teachername",teachername);
        req.setAttribute("teacheremail",teacheremail);
        req.setAttribute("zoomid",zoomid);
        req.setAttribute("zoompass",zoompass);
        req.setAttribute("wechat",wechat);
        req.setAttribute("skype",skype);
        req.getRequestDispatcher("TeacherInfoModify.jsp").forward(req,resp);
        */
    }



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }





}

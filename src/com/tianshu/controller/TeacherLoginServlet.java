package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.entity.Teacher;
import com.tianshu.utils.JDBC;
import com.tianshu.utils.TeacherLoginInfoSearch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/teacherlogin")
public class TeacherLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        String username=req.getParameter("username");
        String password=req.getParameter("pass");
        TeacherLoginInfoSearch teacherLoginInfoSearch=new TeacherLoginInfoSearch();
        Teacher teacher = teacherLoginInfoSearch.teacherlogin(username,password);
        if(teacher==null){
            //登录失败
            req.setAttribute("errorMsg",true);
            try {
                req.getRequestDispatcher("/teacherlogin.jsp").forward(req,resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }else{
            //登录成功
            req.getSession().setAttribute("student",teacher);
            req.getSession().setAttribute("teachername",teacher.getTeacher_name());
            int teacherid=teacher.getTeacher_id();
            String teacheridstring=Integer.toString(teacherid);
            System.out.println("Teacherid str"+teacheridstring);
            req.getSession().setAttribute("teacherid",teacheridstring);

            try {
                resp.sendRedirect("teachertimanagesearch");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
    }
}

package com.tianshu.controller;

import com.tianshu.utils.JudgeSamePhone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/verifyphone")
public class VerifyPhoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone=req.getParameter("phonenum");
        JudgeSamePhone judgeSamePhone=new JudgeSamePhone();
        //flag: true means able to register , false means all ready registered
        boolean flag=judgeSamePhone.judgesamephone(phone);

        if(flag==true)
        {
            resp.getWriter().write("true");
        }

        //req.getRequestDispatcher("/TeacherSearchTimeStudent").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }



}


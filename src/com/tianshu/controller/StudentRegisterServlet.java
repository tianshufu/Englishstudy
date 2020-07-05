package com.tianshu.controller;

import com.tianshu.utils.StudentRegister;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/studentregisteraccount")
public class StudentRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userverifycode=req.getParameter("code");
        String sendcode=((String)req.getSession().getAttribute("verifycode"));
        String sendtimestr=((String)req.getSession().getAttribute("sendtime"));
        int sendtime=Integer.parseInt(sendtimestr);
        String currenttimestr=getStamp();
        int curtime=Integer.parseInt(currenttimestr);
        int timelag=curtime-sendtime;
        System.out.println(timelag);
        if((curtime-sendtime)<=300 &&(userverifycode.equals(sendcode)))
        {
            String username=req.getParameter("username");
            String password=req.getParameter("password");
            String phonenum=req.getParameter("phonenum");
            String email=req.getParameter("email");
            int leftclassnum=2;
            StudentRegister studentRegister= new StudentRegister();
            boolean flagsuccess=studentRegister.InsertStudentaccount(username,password,email,phonenum,leftclassnum);
            //if successfully registered
            if(flagsuccess)
            {
                req.setAttribute("success","Congratulations, you had successfully registered a account, please enter the info to login");
                req.getRequestDispatcher("login.jsp").forward(req,resp);

            }
            //if not registered, send to the register page to register again
            else {
                req.setAttribute("failed","Sorry that you did not successfully registered, please try again");
                req.getRequestDispatcher("studentregisteraccount.jsp").forward(req,resp);

            }
        }

        else
            {
                req.setAttribute("failed","Sorry that you did not successfully registered, please try again");
                req.getRequestDispatcher("studentregisteraccount.jsp").forward(req,resp);

        }





    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }

    public static String getStamp(){
        return	new SimpleDateFormat("mmss").format(new Date());
    }



}

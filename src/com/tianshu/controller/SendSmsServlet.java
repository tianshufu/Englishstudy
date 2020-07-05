package com.tianshu.controller;

import com.tianshu.utils.GetMessageCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/sendSMS")
public class SendSmsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone=req.getParameter("phone");
        GetMessageCode getMessageCode=new GetMessageCode();
        String code=getMessageCode.SendPhoneVerificationCode(phone);
        String curtimestamp=getStamp();
        req.getSession().setAttribute("sendtime",curtimestamp);
        req.getSession().setAttribute("verifycode",code);
        System.out.println("the time sending the code"+ curtimestamp);
        System.out.println("the verification code is"+ code);
        resp.getWriter().print(code);

        //req.getRequestDispatcher("/TeacherSearchTimeStudent").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }

    public static String getStamp(){
        return	new SimpleDateFormat("mmss").format(new Date());
    }

    public static void main(String[] args) {
       // SendSmsServlet sendSmsServlet=new SendSmsServlet();

        System.out.println(getStamp());
    }



}

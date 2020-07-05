package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.service.LoginService;
import com.tianshu.service.impl.LoginServiceImpl;
import com.tianshu.utils.JDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private LoginService loginService= new LoginServiceImpl();
    @Override
    /**
     * deal with the login
     */

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        String username=req.getParameter("username");
        String password=req.getParameter("pass");
        JDBC jdbc=new JDBC();
        Student student = jdbc.login(username,password);
        if(student==null){
            //登录失败
            req.setAttribute("errorMsg",true);
            try {
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }else{
            //登录成功
            req.getSession().setAttribute("student",student);
            req.getSession().setAttribute("username",username);
            try {
                String datetoday=get_today_date_i(0);
                resp.sendRedirect("TeacherSearchTimeStudent?date="+datetoday+"&pagenum=1");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
    }
    // functions to get the exact date around today
    public String get_today_date_i(int i)
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE,i);
        date = calendar.getTime();
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        return  dateString;

    }
}

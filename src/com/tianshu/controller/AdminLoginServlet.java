package com.tianshu.controller;

import com.tianshu.entity.Admin;
import com.tianshu.service.LoginService;
import com.tianshu.service.impl.LoginServiceImpl;
import com.tianshu.utils.AdminLoginInfoSearch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
    private LoginService loginService= new LoginServiceImpl();
    @Override
    /**
     * deal with the login
     */

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        String username=req.getParameter("username");
        String password=req.getParameter("pass");
        AdminLoginInfoSearch adminLoginInfoSearch=new AdminLoginInfoSearch();
        Admin admin=adminLoginInfoSearch.adminloginsearch(username,password);
        if(admin==null){
            //登录失败
            req.setAttribute("errorMsg",true);
            try {
                req.getRequestDispatcher("Adminlogin.jsp").forward(req,resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }else{
            //登录成功
            req.getSession().setAttribute("admin",admin);
            req.getSession().setAttribute("adminname",username);
            try {

                resp.sendRedirect("adminsearchcourse");
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

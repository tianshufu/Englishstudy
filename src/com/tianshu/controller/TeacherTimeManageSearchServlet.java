package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.entity.Teacher;
import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.utils.SearchTeacherTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/teachertimanagesearch")
public class TeacherTimeManageSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SearchTeacherTime searchTeacherTime = new SearchTeacherTime();
        String dateStr = "2020-05-29";
        //Teacher teacherId = ((Teacher)req.getSession().getAttribute("teacherid"));
        //System.out.println(teacherId);
        HttpSession session = req.getSession();
        String teacheridstr2=(String)session.getAttribute("teacherid");
        Integer teacherid=Integer.parseInt(teacheridstr2);


        //String teacheridstr=req.getParameter("teacherid");
        System.out.println(teacheridstr2);
        //int teacherid=Integer.parseInt(req.getParameter("teacherid"));


        System.out.println(teacherid);
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<String > next_n_days= new ArrayList<>();
        next_n_days=searchTeacherTime.get_next_days_list(4);



        for(String i : next_n_days){
            TeacherTimeTable teacherTimeTable = searchTeacherTime.fetchby_teacher_date(teacherid,i);
            teacherTimeTableList.add(teacherTimeTable);
        }
        System.out.println(teacherTimeTableList);

        req.setAttribute("teacherndaysTimeTableListmanage",teacherTimeTableList);
        req.getRequestDispatcher("teachermanagecourse.jsp").forward(req,resp);
    }
}

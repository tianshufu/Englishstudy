package com.tianshu.controller;

import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.utils.SearchTeacherTime;
import com.tianshu.utils.SearchTeacherTimeStudent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// This function gets the time schedule for a teacher for one teacher for the next n days
@WebServlet("/teacherTimeSearchNdays")
public class TeacherTimeSearchNdaysServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SearchTeacherTime searchTeacherTime = new SearchTeacherTime();
        SearchTeacherTimeStudent searchTeacherTimeStudent=new SearchTeacherTimeStudent();
        String dateStr = "2020-05-29";
        int teacherid=Integer.parseInt(req.getParameter("teacherid"));
        System.out.println(teacherid);
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<String > next_n_days= new ArrayList<>();
        next_n_days=searchTeacherTime.get_next_days_list(4);



        for(String i : next_n_days){
            TeacherTimeTable teacherTimeTable = searchTeacherTimeStudent.fetchby_teacher_date(teacherid,i);
            teacherTimeTableList.add(teacherTimeTable);
        }
        System.out.println(teacherTimeTableList);



        req.setAttribute("teacherndaysTimeTableList",teacherTimeTableList);
        req.getRequestDispatcher("registerndays.jsp").forward(req,resp);
    }

    public static void main(String[] args) {
        //Test function for getting the 4 days schedule for specific teacher
        /*
        SearchTeacherTime searchTeacherTime = new SearchTeacherTime();
        String dateStr = "2020-05-29";
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<String > next_n_days= new ArrayList<>();
        next_n_days=searchTeacherTime.get_next_days_list(4);



        for(String i : next_n_days){
            TeacherTimeTable teacherTimeTable = searchTeacherTime.fetchby_teacher_date(2,i);
            teacherTimeTableList.add(teacherTimeTable);
        }

        System.out.println(teacherTimeTableList);
        */


    }

}

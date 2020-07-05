package com.tianshu.controller;

import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.utils.SearchTeacherTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// This function gets the info for teachers schedule for specific one day!
@WebServlet("/TeacherSearchTime")
public class TeacherTimeSearchServlet extends HttpServlet {
    @Override
    /**
     * deal with the login
     */


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SearchTeacherTime searchTeacherTime = new SearchTeacherTime();
        String dateStr = get_today_date();
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<Integer> teacher_id_list= new ArrayList<>();
        teacher_id_list.add(5);
        teacher_id_list.add(3);
        teacher_id_list.add(2);
        teacher_id_list.add(1);
        teacher_id_list.add(4);
        teacher_id_list.add(6);




        for(int i : teacher_id_list){
            TeacherTimeTable teacherTimeTable = searchTeacherTime.fetchby_teacher_date(i,dateStr);
            teacherTimeTableList.add(teacherTimeTable);
        }

        System.out.println(teacherTimeTableList);



        req.setAttribute("teacherTimeTableList",teacherTimeTableList);
        req.getRequestDispatcher("register.jsp").forward(req,resp);
    }
    // function to acquire the date of today
    public String get_today_date()
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE,0);
        date = calendar.getTime();
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        return  dateString;


    }

    public static void main(String[] args) {

         TeacherTimeSearchServlet teacherTimeSearchServlet = new TeacherTimeSearchServlet();
         String datetoday=teacherTimeSearchServlet.get_today_date();
         System.out.println(datetoday);
        /*
        String dateStr = "2020-05-29";
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<Integer> teacher_id_list= new ArrayList<>();
        teacher_id_list.add(1);
        teacher_id_list.add(2);
        teacher_id_list.add(3);
        teacher_id_list.add(4);
        teacher_id_list.add(5);
        teacher_id_list.add(6);



        for(int i : teacher_id_list){
            TeacherTimeTable teacherTimeTable = searchTeacherTime.fetchby_teacher_date(i,"2020-05-29");
            teacherTimeTableList.add(teacherTimeTable);
        }



        System.out.println(teacherTimeTableList);
        */



    }
}

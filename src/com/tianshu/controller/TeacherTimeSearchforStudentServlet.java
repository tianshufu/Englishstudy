package com.tianshu.controller;

import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.utils.SearchTeacherTimeStudent;
import com.tianshu.utils.TeacherRank;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet("/TeacherSearchTimeStudent")
public class TeacherTimeSearchforStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //SearchTeacherTime searchTeacherTime = new SearchTeacherTime();
        SearchTeacherTimeStudent searchTeacherTimeStudent=new SearchTeacherTimeStudent();
        String datetoday=req.getParameter("date");
        String pagenumstr=req.getParameter("pagenum");

        System.out.println(datetoday);
        String dateStr = get_today_date();
        List<TeacherTimeTable> teacherTimeTableList = new ArrayList<TeacherTimeTable>();
        List<Integer> teacher_id_list= new ArrayList<>();
        // define the page info and how many teachers in one page
        Integer pagenum=Integer.parseInt(pagenumstr);
        Integer teachernum=4;
        TeacherRank teacherRank=new TeacherRank();
        HashMap<Integer, Integer> teacherankmap=teacherRank.getteracherrank();
        for(int j=(pagenum-1)*teachernum+1;j<=(pagenum-1)*teachernum+teachernum;j++)
        {
            if(teacherankmap.get(j)!=null)
            {
                teacher_id_list.add(teacherankmap.get(j));
            }
        }
        System.out.println(teacher_id_list);

        /*
        teacher_id_list.add(5);
        teacher_id_list.add(3);
        teacher_id_list.add(2);
        teacher_id_list.add(1);
        teacher_id_list.add(4);
        teacher_id_list.add(6);
        */



        for(int i : teacher_id_list){
            TeacherTimeTable teacherTimeTable = searchTeacherTimeStudent.fetchby_teacher_date(i,datetoday);
            teacherTimeTableList.add(teacherTimeTable);
        }

        System.out.println(teacherTimeTableList);


        req.setAttribute("pagenum",pagenum);
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
        int pagenum=2;
        for(int j=(pagenum-1)*5+1;j<=(pagenum-1)*5+5;j++)
        {
            System.out.println(j);
        }
    }



}

package com.tianshu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FilterPassedClass {



    // turn the current time to the timeslot
    public Integer current_timeslot()
    {
        SimpleDateFormat timehour = new SimpleDateFormat("HH");
        String hour=timehour.format(new Date());
        int hournum=Integer.parseInt(hour);
        SimpleDateFormat timemini = new SimpleDateFormat("mm");
        String mini=timemini.format(new Date());
        int mininum=Integer.parseInt(mini);
        int timslot= (hournum-8)*2-1+ (mininum/30);

        return timslot;

    }
    //filter the time for today, it the date equals to today, will return the slot,if not,return 0
    public Integer current_timeslot_todate(String date)
    {
        SimpleDateFormat dfdate = new SimpleDateFormat("yyyy-MM-dd");
        String datestr=dfdate.format(new Date());
        System.out.println(datestr);
        System.out.println(date);

        if(datestr.contentEquals(date))
        {
            return current_timeslot();
        }
        else
        {
            return 0;
        }

    }


    public static void main(String[] args) {
        // get the hour


        //get the date
        /*
        SimpleDateFormat dfdate = new SimpleDateFormat(" yyyy-MM-dd");
        String date=dfdate.format(new Date());
        System.out.println(date);
        */
        FilterPassedClass filterPassedClass=new FilterPassedClass();
        System.out.println(filterPassedClass.current_timeslot_todate("2020-06-11"));




    }
}

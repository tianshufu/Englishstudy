package com.tianshu.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeTable {
    private Map<Integer,String> slotTimeMap;
    private Map<String,Integer> time_timeSlotMap;

    public TimeTable() {
        slotTimeMap = new HashMap<Integer,String>();
        time_timeSlotMap=new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();
        list.add("08:30-08:55");
        list.add("09:00-09:25");
        list.add("09:30-09:55");
        list.add("10:00-10:25");
        list.add("10:30-10:55");
        list.add("11:00-11:25");
        list.add("11:30-11:55");
        list.add("12:00-12:25");
        list.add("12:30-12:55");
        list.add("13:00-13:25");
        list.add("13:30-13:55");
        list.add("14:00-14:25");
        list.add("14:30-14:55");
        list.add("15:00-15:25");
        list.add("15:30-15:55");
        list.add("16:00-16:25");
        list.add("16:30-16:55");
        list.add("17:00-17:25");
        list.add("17:30-17:55");
        list.add("18:00-18:25");
        list.add("18:30-18:55");
        list.add("19:00-19:25");
        list.add("19:30-19:55");
        list.add("20:00-20:25");
        list.add("20:30-20:55");
        list.add("21:00-21:25");
        list.add("21:30-21:55");
        list.add("22:00-22:25");
        list.add("22:30-22:55");
        list.add("23:00-23:25");
        for(int i=0;i<list.size();i++)
        {
            slotTimeMap.put(i,list.get(i));
        }
        for(int i=0;i<list.size();i++)
        {
            time_timeSlotMap.put(list.get(i),i);
        }
    }
    public String getTime(int timeSlot){
        return slotTimeMap.get(timeSlot);
    }
    public int getTimeSlot(String time){
        return time_timeSlotMap.get(time);
    }
}

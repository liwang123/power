package com.thingtrust.power.util.utils;

public class TimeType {

    public static String getTimeType(int time){
        if(time==0){
            return "一个月";
        }
        if(time==1){
            return "三个月";
        }
        return "半年";
    }


    public static int getMonths(int time){
        if(time==0){
            return 1;
        }
        if(time==1){
            return 3;
        }
        return 6;
    }


    public static String getCompletionStatus(int status){
        if(status==0){
            return "未通知未缴费";
        }
        if(status==1){
            return "已通知未缴费";
        }
        return "已缴费";
    }

    public static String getArea(int status){
        if(status==1){
            return "南阳";
        }
        if(status==2){
            return "郑州";
        }
        return "";
    }


}

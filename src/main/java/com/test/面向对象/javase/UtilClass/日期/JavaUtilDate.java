package com.test.面向对象.javase.UtilClass.日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
    Date转String
    y 代表年
    M 代表月
    d 代表日
    H 代表24进制的小时
    h 代表12进制的小时
    m 代表分钟
    s 代表秒
    S 代表毫秒

 */
public class JavaUtilDate {

    public static void main(String[] args) throws Exception {
        test4();//常用方法
        test3();//指定日期到今天过了多少天
        test2();// 计算 指定日期到 是星期几
        test1();//日期转字符串
        test();//字符串转日期
        tes();// Clendar 日期
    }


    public static void test4(){


    }
    public static void test1(){
        Date date = new Date();//当前的系统时间构建的date对象
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"); //格式化日期
        String format = sdf.format(date); //格式化 日期转字符串
        System.out.println(format);
    }

    /*
        String 转Date
     */
    public static void test(){
        String str = "2016-11-5 12:12:12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(str);//字符串转日期
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    /*
       Calendar
    */
    public static void tes(){
        //获取Calendar对象
        Calendar cd = Calendar.getInstance();
        //今天是这一周的第几天 美国将周日当作第一个  打印周五 在中国实际是周四
        System.out.println(cd.get(Calendar.DAY_OF_WEEK));

        //今天是这个月的第几天
        System.out.println(cd.get(Calendar.DAY_OF_MONTH));
    }

    /*
        指定日期到今天过了多少天
     */
    private static void test3() throws  Exception {
        //获取当前日期
        Date date = new Date();
        //字符串日期
        String str = "2003-03-25";
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String 转 Date
        Date date1 = sdf.parse(str);
        //获取前端日期的毫秒数
        long time = date.getTime();
        //获取指定日期的毫秒数
        long time1 = date1.getTime();
        //当前毫秒数减去指定日期
        long result = time-time1;
        //将毫秒转换成天数
        System.out.println(result / 1000 / 60 / 60 /24);


    }

    /*
        计算 指定日期到 是星期几
     */
    private static void test2() {
        String str = "2008-08-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String 转 date
        try {
            Date date = sdf.parse(str);
            //获取Calend
            Calendar cd = Calendar.getInstance();
            //手动指定时间 把calendar改成str
            cd.setTime(date);
            //获取是 str 是周几
            int i = cd.get(Calendar.DAY_OF_WEEK);
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
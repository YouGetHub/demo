package com.test.lambda;

import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public  class 日期 {

    public static void main(String[] args)
    {
      /*  LocalDate();//处理日期    这些类都是被final修饰，并且是线程安全的
        LocalTime();//处理时间*/
        LocalDateTime();//处理日期和时间
    }

    public static void LocalDateTime(){
        //当前日期和时间
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);
        //自定义时间
        LocalDateTime of = LocalDateTime.of(2003, 03, 25, 18, 6, 10);
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    public static void LocalTime(){
        LocalTime localTime = LocalTime.now(); //当前时间
        LocalTime localTime1 = LocalTime.now().withNano(0); //不包含毫秒

        LocalTime localTime2 = localTime.plusHours(1);//1小时后

        LocalTime parse = LocalTime.parse("06:10:30");//自定义时间
        LocalTime of = LocalTime.of(01, 10, 30);//自定义时间

        LocalTime.of(6,02,12);
        LocalTime now = LocalTime.now();
        Duration between = Duration.between(of, now);
        between.getSeconds();//相差多少秒
        between.getNano();//相差毫秒
    }

    public static void LocalDate(){
        LocalDate localDate = LocalDate.now();//今天的日期

        int year = localDate.getYear();//年
        int monthValue = localDate.getMonthValue();//月
        Month month = localDate.getMonth();//日

        String formatDate = localDate.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));//格式化日期格式

        boolean leapYear = localDate.isLeapYear();//是否是闰年
        int dayOfMonth = localDate.getDayOfMonth();//这个月有多少天

        LocalDate parse = LocalDate.parse("2015-01-23");//自定义日期
        LocalDate of = LocalDate.of(2015, 01, 23);//自定义日期

        boolean equals = parse.equals(of);//判断日期是否相等

        //获取一周后的日期
        LocalDate plus = localDate.plus(1, ChronoUnit.WEEKS);

        LocalDate of1 = LocalDate.of(2016, 1, 2);
        LocalDate now = LocalDate.now();
        Period period = Period.between(of,now);
        period.getYears();//年份相差几年
        period.getMonths();//相差几个月
        period.getDays();//月份相差多少天
    }
}
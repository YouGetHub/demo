package com.test.面向对象.枚举Runtime;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Day day = Day.yi;
        String name = day.getName();
        System.out.println(name);

        //day->枚举类型的对象，默认继承了Object
        //创建的enum类型，默认继承了Enum，Enum继承Object

        Day[] values = day.values();//获取所有的枚举对象
        System.out.println(Arrays.toString(values));

        //获取指定的枚举对象
        Day day1 = day.valueOf("yi");
        System.out.println(day1.getName()+","+day1.getIndex());

        Scanner input = new Scanner(System.in);
        String test = input.next();
        Day day2 = day.valueOf(test);
        switch (day2){
            case yi:
                System.out.println("今天敲代码");
                break;
            case er:
                System.out.println("今天吃屎");
                break;
             default:
                 System.out.println("error");
        }
    }
}

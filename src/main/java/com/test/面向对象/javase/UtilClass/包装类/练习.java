package com.test.面向对象.javase.UtilClass.包装类;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 练习{

    public static void main(String[] args) {
        print7();//统计字符序列中大写字母出现的次数
        print6();//一个字符在字符序列出现的次数
        print5();//条件删除arraysList
        print4();//for循环练习
        print3();//进制转换
        print2();//位运算符
        print1();//布尔运算符
        print();//算数运算符
    }
    /*
        统计字符序列中大写字母出现的次数
     */
    private static void print7() {
        String str = "HelloWorld";
        //统计出现的次数
        int count = 0;

        //字符串转为字符数组
        char[] chars = str.toCharArray();
        for (int i =0 ; i<chars.length; i++){
            //满足这个条件就肯定这个时大写字母
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                count++;
            }
        }
        System.out.println("大写字母出现的次数" +count);
    }

    /*
        一个字符在字符序列出现的次数
     */
    private static void print6() {
        String str = "hahasisishahaha";
        String input = "ha";

        //统计出现的次数
        int count = 0;

        //第一次出现 ha 的索引值
        int index = 0;

        // 等于-1时 数组中就没有ha
        while ((index = str.indexOf(input)) != -1) {
            //对字符序列截取， 长度为 index + ha的长度
            str = str.substring(index+input.length());
            count ++;
        }

        System.out.println(input+" 出现了 " +count);

    }
    /*
        条件删除arraysList
     */
    public static void print5(){
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("ba");
        list.add("ba");
        list.add("ba");
        list.add("ab");
        list = list.stream().filter((cc) -> cc.charAt(0) != 'b').collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    /*
        for循环练习
     */
    public static void print4(){
        /*
            1 到100 基数求和
         */
        {
            int count = 0;
            for (int i = 100; i > 0; i--) {
                if (i % 2 != 0) {
                    count = count + i;
                }
            }
            System.out.println(count);
        }
        /*
            乘法表
        */
        for (int i =1;i<=9;i++){
            for (int j = 1;j<=i; j++){
                System.out.print(j + "*" +i+"="+j*i+" ");
            }
            System.out.println();
        }
        /*
           1 到 100求和
         */
        {
            int sum = 0;
            for (int i = 100; i > 0; i--) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
    public static void print3(){
        /*
            十进制
            0 1 2 3 4 5 6 7 8 9
            二进制
            0 1
            八进制
            0 1 2 3 4 5 6 7
            十六进制
            0 1 2 3 4 5 6 7 8 9
            A B C D E F
        */

    }
    public static void print2(){
        /*
        位运算符 主要操作二进制
            & 位与 （有0则0有一则1）
            | 位或
            ^ 位异或
            ~ 取反
            >> 向右移
            >>>无符号右移
            << 向左移
         */



    }

    public static void print1(){
        /*
        布尔运算符
            &与 两边都是true 结果是true 不管前面为false 后面也执行
            |或 一边是true 结果就是true
            !非 取反 !true -> false
            ^异或 两边不一样 结果为true
            &&短路与 两边都是true 结果是true 前面为false 后面不执行
            ||短路与 一边是true 结果就是true 前面为true 后面不执行 前面为false 后面执行
        */
        System.out.println(5>4 & 5<6);//true
        System.out.println(5>4 | 5>9);//false
        System.out.println(!(5>9));//true
        System.out.println(5>6 ^ 5>9);//true
        System.out.println(5>4 && 5<6);//true
        System.out.println(5>4 && 5<6);//true
        System.out.println(5>4 || 5<9);//true

    }

    /*
     *算数运算符
     *  a++是先运算在赋值，而++a是先赋值在运算！
     */
    public static void print(){
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;//先是 a = b 然后在 b++
        c = --a;//先是 a-- 在赋值给
        b = ++a;
        a = c--;
    }
}
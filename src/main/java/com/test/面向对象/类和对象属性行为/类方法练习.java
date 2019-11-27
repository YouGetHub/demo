package com.test.面向对象.类和对象属性行为;

import java.util.Arrays;
import java.util.Scanner;

public class 类方法练习 {
    public static void main(String[] args) {

        类方法练习 test = new 类方法练习();
        test.sanJIaoXin(10, "左");//画星星，到三角，行数和方向不确定
        System.out.println(test.temp(new int[]{1, 2, 3, 4}, new int[]{4, 5, 6, 7}));//数组的元素互换
        System.out.println(test.topW(new int[]{1, 2, 3, 4, 5, 6, 7}));//数组元素头尾交换位置
        System.out.println(test.MaxMin(new int[]{7, 2, 3, 4, 5}));//数组max min
        System.out.println(test.is(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public boolean is(int a[]) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int b = input.nextInt();
            boolean result = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i] == b) {
                    result = true;
                }
            }
            return result;
        }
    }

    public String MaxMin(int[] a) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return "Max：" + max + "\nmin：" + min;
    }

    public String topW(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return "a" + Arrays.toString(a);
    }

    public String temp(int[] a, int[] b) {
        int temp[] = a;
        a = b;
        b = temp;
        return "a" + Arrays.toString(a) + "\nb" + Arrays.toString(b);
    }

    public void sanJIaoXin(long hangshu, String fangxiang) {
        //画星星，到三角，行数和方向不确定
        if (!(hangshu <= 0) & !(hangshu >= Integer.MAX_VALUE)) {
            boolean b;
            if (fangxiang.equals("左")) {
                b = true;
            } else if (fangxiang.equals("右")) {
                b = false;
            } else {
                System.out.print("error");
                return;
            }
            for (long i = 1; i <= hangshu; i++) {
                if (b == true) {
                    for (long q = 1; q <= i - 1; q++) {
                        System.out.print(" ");
                    }
                    for (long w = hangshu - i; w >= 0; w--) {
                        System.out.print("*");
                    }
                } else if (b == false) {
                    for (long w = hangshu - i; w >= 0; w--) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("你是啥比？");
        }
        /*

         *****
         ****
         ***
         **
         *

         *****
         ****
         ***
         **
         *

         */
    }
}

package com.test.面向对象.javase.UtilClass.正则表达式;

import java.util.Scanner;

public class DemoRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String next = input.next();

/*            //输入的第一个必须是 吃，第二个是括号的其中一个
            boolean matches = next.matches("吃[饭,狗,水]");*/

/*            //输入的第一个必须是 吃，第二个是非括号，其他任意一个字符
            boolean matches1 = next.matches("吃[^饭,狗,水]");*/

/*            // a 到 z 中不能输入bc
            boolean matches1 = next.matches("[a-z&&[^bc]]");*/
    }
}

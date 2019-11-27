package com.test.面向对象.javase.UtilClass.String;

public class Test {
    public static void main(String[] args) {
        String result = test("我是傻逼");//将一个字符串反转
    }

    public static String test(String str){
        char[] chars = str.toCharArray();//转为char类型数组
        for (int i=0; i<chars.length/2; i++){
            char     temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        //返回字符序列
        String s = str.valueOf(chars);
        return s;
    }
    public static void test1(){

    }
}

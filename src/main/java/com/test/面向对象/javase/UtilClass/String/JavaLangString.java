package com.test.面向对象.javase.UtilClass.String;

public class JavaLangString {

    public static void main(String[] args) {
        String string = new String("Hello world java");

        //charAt() 获取指定字符的索引 索引范围 0 到 length()-1
        char index = string.charAt(4);

        //compareTo()方法 按照字典顺序比较两个字符串 ==返回0 >返回1 <返回-1
        int b = "a".compareTo("b");

        //equals()方法 比较两个字符串的字符值
        String s7 = "haha";
        String s8 = "haha";
        boolean equals = s7.equals(s8);

        //toSting
        String s1 = string.toString();

        //concat()方法 拼接字符串  创建了新的小数组
        String concat = string.concat("666");

        //contains()方法 指定字符是否存在元素字符序列
        boolean h = string.contains("H");

        //startsWith() endsWith() 指定的字符是否是字符序列的  前缀 后缀
        boolean result3 = string.startsWith(string, 4);//前缀
        boolean result = string.endsWith("java");//后缀

        //getBytes(); 将字符串转为byte数组
        byte[] bytes2 = string.getBytes();

        //toCharArray() 将字符串转为字符数组
        char[] chars3 = string.toCharArray();

        //indexOf()方法 返回指定字符返回字符序列中第一次出现的索引  不存在返回-1
        int w = string.indexOf("w");//符序列中第一次出现的索引
        int l = string.indexOf("l", 3);//字符序列中第一次出现的索引 从指定的索引开始查找

        //isEmpty(); 判断字符串是否是空串

        //replace()方法  指定字符替换原有的字符串，并返回替换后的字符串
        String replace = string.replace('l', 'm');
        //replaceAll()方法 指定字符替换所有的原有字符，并返回替换后的字符串
        String s = string.replaceAll("Hello", "shabi");

        //按照指定的表达式将原来的字符串拆分开
        String str = "q-w-e-r-t-y";
        String[] split = str.split("-");

        //截取当亲的字符串一部分
        String substring1 = string.substring(3);//从下标3开始截取到最后
        String substring = string.substring(0, 3);//从下标0开始到3结束，没有5
        System.out.println(substring);

        //告知此字符串是否匹配给定的正则表达式
        boolean results = "15611202171".matches("0?(13|14|15|18)[0-9]{9}");

        //toLowerCase()方法 toUpperCase()方法 将字符串都转换为小写或大写
        String s2 = string.toLowerCase();//将字符串都转换为小写
        String s3 = string.toUpperCase();//将字符串都转换为大写

        //trim() 去除前后多余的空格
        String trim = string.trim();

    }
}

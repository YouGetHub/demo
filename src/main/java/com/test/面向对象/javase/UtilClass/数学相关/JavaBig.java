package com.test.面向对象.javase.UtilClass.数学相关;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class JavaBig {

    public static void main(String[] args) {
        test(); //BigInteger 存储比long更大的数
        test1(); //BigDecimal 防止对数字进行操作时 损失精度
        test2(); //DecimalFormat 将数字转换为人民币格式 或者 千分位格式
    }
    /*
           BigInteger
     */
    public static void test(){
        //创建BigInteger对象 值为String类型的100
        BigInteger bi = new BigInteger("100");
        BigInteger bi1 = new BigInteger("2");

        System.out.println(bi.add(bi1));//add() +
        System.out.println(bi.subtract(bi1));//subtract() -
        System.out.println(bi.multiply(bi1)); //multiply *
        System.out.println(bi.divide(bi1)); //divide() /
        //divideAndRemainder() 返回一个数组 包含一个除数和余数
        BigInteger[] bigIntegers = bi.divideAndRemainder(bi1);
        System.out.println(Arrays.toString(bigIntegers));
    }
    /*
        BigDecimal
     */
    public static void test1(){
        //创建对象  //值最好传入字符串类型的数字，这样计算的值更加精确 或者是BigDecimal bd2 = BigDecimal.valueOf(12);
        BigDecimal bd = new BigDecimal("2.0");
        BigDecimal bd1 = new BigDecimal("1.1");
        System.out.println(bd.subtract(bd1));
    }
    /*
        DecimalFormat
     */
    public static void test2(){
        //数字转为人民币格式
        String rmb = DecimalFormat.getCurrencyInstance().format(1688000.12);
        System.out.println(rmb);

        //自定义格式 保留两位小数
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        System.out.println(decimalFormat.format(168800.40));

        //保留四位小数 位数不够 补0
        DecimalFormat df = new DecimalFormat("###,###.0000");
        System.out.println(df.format(16888000.123));
    }

}

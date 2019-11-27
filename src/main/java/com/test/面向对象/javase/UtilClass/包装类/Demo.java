package com.test.面向对象.javase.UtilClass.包装类;

public class Demo {
    public static void main(String[] args) {
        Integer integer = new Integer(12);//包装
        int i = integer.intValue();//拆装

        int a = new Integer(12);//自动拆装

        int i1 = Integer.parseInt("123");//字符串形式的数字,转为int类型

        Integer integer1 = new Integer(12);
        Integer integer2 = new Integer(12);
        boolean equals = integer1.equals(integer2);//比较数据 true

        Integer c = 127;
        Integer b = 127;
        boolean b1 = c == b;//true

        Integer cc = 128;
        Integer bb = 128;
        boolean b2 = cc ==bb;//false，超过了静态元素的取值范围-127~ 128,会创建对象，比较地址，所以false

        Integer ee = 12;
        Integer qq = new Integer(12);
        boolean equals1 = ee.equals(qq);//都重写了父类的equals,所以比较数值
        boolean b3 = ee == qq;//false，比较的是地址,ee数据在静态元素中，返回的引用在栈中，qq数据在堆中，引用在栈中，
    }
}

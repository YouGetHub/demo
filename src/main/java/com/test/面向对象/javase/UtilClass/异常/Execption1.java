package com.test.面向对象.javase.UtilClass.异常;

public class Execption1 {
    public static void main(String[] args) {

        /*
        运行时异常
        java.lang.ArithmeticException: / by zero
        规定整数不能除以0
        int result = 10/0;
        System.out.println(result)
        */

        /*
        自定义异常
        int[] ints = new int[]{1,2};
        int index = 3;
        if (index <=ints.length){
            System.out.println(ints[index]);
        }else {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        */

        /*
        运行时异常
        NullPointerException 空指针异常 访问null值的实力方法
        String str = "abc";
        String str1 = null;
        System.out.println(str1.equals(str));
        */

        /* 运行时异常
        InputMismatchException  与输入的类型不匹配
        Scanner input = new Scanner(System.in);
        int next = input.nextInt();
        next = "123";
        */

        /*NumberFormatException 输入的元素与返回类型不匹配
        int i = Integer.parseInt("123.11");*/
    }
}

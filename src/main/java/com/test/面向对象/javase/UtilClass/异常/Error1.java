package com.test.面向对象.javase.UtilClass.异常;

public class Error1 {
    public void print(){
        System.out.println("print");
        print1();
    }

    public void print1(){
        System.out.println("print1");
        print();
    }
    public static void main(String[] args) {
        /*
        会报java.lang.StackOverflowError 栈内存溢出，两个方法来回调用，
        Error1 error1 = new Error1();
        error1.print();
        */

        /*
        java.lang.OutOfMemoryError 对内存溢出，
        int[] arr = new int[Integer.MAX_VALUE];
        */


    }
}

package com.test.面向对象.javase.UtilClass.集合.collection.List;

import java.util.Stack;

public class Stack1 {
    //LIFO先进后出
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int size = stack.size();//有效元素长度
        //获取并删除
        Integer pop = stack.pop();
        //获取不删除
        Integer peek = stack.peek();
        //指定元素返回栈中元素第几个
        int search = stack.search("2");

        System.out.println(stack.toString());

    }
}

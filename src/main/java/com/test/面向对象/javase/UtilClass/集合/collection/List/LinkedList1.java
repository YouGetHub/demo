package com.test.面向对象.javase.UtilClass.集合.collection.List;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        deque();//双向链表 - Deque  除了实现了List接口外，LinkedList还实现了双向链表结构Deque，可以很方便的在头尾插入删除数据
    }

    public static void deque (){
        //LinkedList是一个双向链表结构的list
        LinkedList<String> list =new LinkedList<String>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的元素
        list.addLast("123");

        //在最前面插入新的元素
        list.addFirst("hh");

        //查看最前面的元素
        String first = list.getFirst();
        //查看最后面的元素
        String last = list.getLast();

        //取出最前面的元素
        String s = list.removeFirst();

        //取出最后面的元素
        String s1 = list.removeLast();
    }
}

package com.test.面向对象.javase.UtilClass.集合.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        //队列通常以FIFO先进先出的方式来排序各个元素，新元素拆入在队列的末尾
        Queue<String> queue= new LinkedList<>();
        //offer() 插入队列加在队列的最后面
        queue.offer("hh");
        queue.offer("12");

        //删除
        boolean remove = queue.remove("hh");
        System.out.println(remove);

        //取出第一个元素，并删除
        String poll = queue.poll();

        //获取队列的头，但不删除
        String element = queue.element();

        //peek() 查看第一个元素，但是不取出来
        String peek = queue.peek();
    }
}

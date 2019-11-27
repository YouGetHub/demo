package com.test.面向对象.javase.UtilClass.集合.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args) {
        //自然排序，值不能重复,底层是HashMap,Hash的值就是HashMap的key
        HashSet<Integer> set = new HashSet<>();
        //add 存入的元素是由hashCode决定的，
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(1);

        //删除元素
        boolean remove = set.remove(4);

        //存与取顺序不一样
        //iterator
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

package com.test.面向对象.javase.UtilClass.集合.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    //实现SortedSet接口，可以对元素自然排序，要求元素中的数据是可比较的
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((p1,p2) -> p1.compareTo(p2));
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}

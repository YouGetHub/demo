package com.test.面向对象.javase.UtilClass.集合.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* Collection接口
* */
public class CollectionAPI {

    public static void main(String[] args) {
        collectionAPITest();
    }

    public static void collectionAPITest(){
        Collection coll = new ArrayList();
        coll.size();//返回集合中元素的个数
        coll.add("123");//添加元素
        coll.isEmpty();//集合中的元素是否为空
        coll.clear();//清空集合元素
        coll.contains("123");//判断集合是否包含指定元素
        coll.retainAll(coll);//保存两个集合都包含的元素
        coll.remove("123");//删除元素
        coll.toArray();//将集合转换为数组
        //使用iterator迭代器遍历集合
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}

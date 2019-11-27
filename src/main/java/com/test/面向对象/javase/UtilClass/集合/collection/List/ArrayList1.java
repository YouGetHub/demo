package com.test.面向对象.javase.UtilClass.集合.collection.List;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        String age;
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //排序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;// 正序
//                return o2 - o1;// 降序
            }
        });

        //删除集合中所有的元素
        int size1 = list.size();
        for (int i =0;i<size1;i++){
            list.remove(0);
        }

        //增强for遍历集合
        for (Integer list1 : list){
            System.out.println(list1);
        }

        //for遍历集合
        for (int i = 0; i<list.size(); i++){
            int str = list.get(i);
            System.out.println(str);
        }
        //Iterator迭代器遍历集合
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int next = iterator.next();
        }

        //contains() 判断是否存在
        boolean result = list.contains(123);

        //get() 获取指定索引位置的值
        int str = list.get(0);

        //indexOf() 获取元素所在集合的索引
        int index = list.indexOf(123);

        //remove() 删除
        boolean remove = list.remove("123");//指定元素删
        int result1 = list.remove(0);//指定索引位置删

        //set() 指定索引位置替换元素
        list.set(0, 456);

        //size() 获取集合有效元素个数
        int size = list.size();

        //集合转换为数组
        Object[] objects = list.toArray();

        //将另一个集合的元素，加入该集合里
        list.addAll(list);

        //清空集合元素
        list.clear();

    }
}

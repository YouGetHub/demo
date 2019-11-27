package com.test.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaForach {

    public static void main(String[] args) {
        list();//遍历List
    }

    public static void list(){
        List<Integer> list = new ArrayList<>();
        for (int i = 5; i>0; i--){
            list.add(i);
        }
        //Lambda+Foreach遍历集合
        list.forEach( i -> System.out.println(i));
        list.forEach(System.out :: println);//方法引用 只有一条语句才可以使用

        //排序
        Collections.sort(list,(o1,o2)->{return o1.compareTo(o2);});
        System.out.println(list);
    }
}

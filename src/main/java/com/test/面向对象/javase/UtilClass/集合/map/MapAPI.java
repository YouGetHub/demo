package com.test.面向对象.javase.UtilClass.集合.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAPI {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("邹浩宇",23);
        map.put("小明",18);
        map.put("小刚",20);
        map.put(null,null);//可以为null
        map.put("小明",20);//添加元素时，键存在，使用新的值替换原来的值
        map.size();//<键,值>的数量
        map.get("邹浩宇");//取值
        map.replace("邹浩宇",20);//替换
        map.remove("邹浩宇");//删除
        map.remove("小明",18);//删除
        map.containsKey("小明");//是否包含键
        map.containsValue(20);//是否包含值
        Set<String> con = map.keySet();//把所有键元素返回一个集合
        Collection<Integer> values = map.values();//把所有值元素返回一个集合
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//返回所有Entry的集合
        for ( Map.Entry<String,Integer> entryNext :entrySet){
            System.out.println(entryNext.getKey()+"--->"+entryNext.getValue());
        }

    }
}

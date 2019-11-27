package com.test.面向对象.javase.UtilClass.集合.map;

import java.util.*;

public class 练习 {

    public static void main(String[] args) {
        test();//统计每个字符出现的次数
        test1();//统计邮箱的个数
        test2();//HashMap排序
    }

    public static void test2 (){
        HashMap<Integer,User> map = new HashMap<>();
        map.put(1,new User("小兰",18));
        map.put(2,new User("小刚",16));
        map.put(3,new User("小明",20));
        //通过treeMap排序
        TreeMap<Integer,User> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(map.get(o2).age,map.get(o1).age);
            }
        });
        map.forEach((k,v) ->{
            treeMap.put(k,v);
        });
        treeMap.forEach((k,v)->{
            System.out.print(k+":"+v);
        });
    }

    public static void test1(){
        String strTest = "123@qq.com,231@163.com,122@souhu.com,122@souhu.com,122@souhu.com,122@qq.com";
        //拆分邮箱
        String[] split = strTest.split("[,@]");
        //把map在保存到Set里面
        Set<Map<String,String>> set = new HashSet<>();
        //遍历邮箱存到HashMap 123 ，qq.com
        for (int i=0; i<split.length;i+=2){
            Map<String,String> stringMap = new HashMap<>();
            stringMap.put(split[i],split[i+1]);
            set.add(stringMap);
        }
        //使用HashMap统计数量
        HashMap<String,Integer> map = new HashMap<>();
        for (int i =1;i<split.length;i+=2){
            if (!map.containsKey(split[i])){
                map.put(split[i],1);
            }else {
                Integer integer = map.get(split[i]);
                map.put(split[i],integer+1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> ky:entrySet){
            System.out.println(ky.getKey()+"--->"+ky.getValue());

        }

    }


    public static void test(){
        String str = "qwertyuioppoiuytasdfghjjhgvbnmmnbvvcclkjhgbvczxcvghk";
        Map<Character,Integer> map = new HashMap<>();
        //遍历字符序列
        for (int i =0; i<str.length(); i++){
            //获取每个字母
            char c = str.charAt(i);
            //将获取的字母存放在HashMap中，如果key不存在，value +1
            if (! map.containsKey(c)){
                map.put(c,1);
            }else{
                //如果存在，取出原有的value在+1
                Integer integer = map.get(c);
                map.put(c,integer+1);
            }
        }
        //遍历HashMap
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> ky : entries){
            System.out.println(ky.getKey()+"-->" + ky.getValue());
        }
    }
}
class User{
    public String name;
    public int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

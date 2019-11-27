package com.test.lambda;

import java.util.*;

/*
* 主要解决空指针 ，支持函数式编程
* */
public class Optional1 {

    public static void main(String[] args) {
        List<LambdaStream> list = new ArrayList<>();
        list.add(new LambdaStream("xiaoming" , 18));
        list.add(new LambdaStream("xiaohong" , 20));
        list.add(new LambdaStream("xiaogang" , 16));
        list.add(new LambdaStream("xiaolan" , 19));

        //计算年龄在16以上的总和
        long count = list.stream().mapToInt(LambdaStream::getAge).filter((age) -> age > 16).sum();
        Optional<Integer> reduce = list.stream().map(LambdaStream::getAge).filter(age -> age > 16).reduce((a, b) -> a + b);
        reduce.orElse( 0);//reduce没有值的话，会打印0 ，防止空指针
        System.out.println(reduce.get());

        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"=.=");
        map.put(1002,"zxc");
        map.put(1003,"asd");
        String opt = Optional.ofNullable(map.get(1004)).orElse("无");
        System.out.println(opt);
    }
}
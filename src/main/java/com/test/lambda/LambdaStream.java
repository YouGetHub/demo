package com.test.lambda;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaStream {

    public static void main(String[] args) {
        List<LambdaStream> list = new ArrayList<>();
        list.add(new LambdaStream("xiaoming", 18));
        list.add(new LambdaStream("xiaohong", 20));
        list.add(new LambdaStream("xiaogang", 16));
        list.add(new LambdaStream("xiaolan", 19));
        //查找集合元素中age 大于18的 并且按照降序排序
        //使用Stream实现
        list = list.stream()
                .filter((lambdaStream) -> lambdaStream.getAge() > 18)//过滤
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))//排序
                .sorted(Comparator.comparing(LambdaStream::getAge).reversed())//reversed降序
                .collect(Collectors.toList());//转为list

        //age 最大值 Optional jdk8新增， 主要用来解决空指针
        Optional<Integer> reduce1 = list.stream().map(LambdaStream::getAge).reduce(Integer::max);
        System.out.println(reduce1.get());


        //让所有人的age都加10
        List<Integer> result1 = list.stream().map(LambdaStream::getAge).map(age -> age + 10).collect(Collectors.toList());

        //计算age的总和
        long reduce = list.stream().map(LambdaStream::getAge).reduce(0, (o1, o2) -> o1 + o2);

        //获取集合中所有的name的length
        List<Integer> result = list.stream().map(LambdaStream::getName).map(String::length).collect(Collectors.toList());

        //遍历集合
        list.forEach(lambdaStream -> System.out.println(lambdaStream.getName() + "---" + lambdaStream.getAge()));
        System.out.println(list.toString());
    }


    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LambdaStream() {
    }

    public LambdaStream(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "LambdaStream{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

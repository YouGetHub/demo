package com.test.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * 创建流
 * */
public class 创建流 {

    public static void main(String[] args) {
        String[] str = {"i", "love", "you"};
        //将数组bian变成流
        Stream.of(str).map(String::toUpperCase).forEach(System.out::print);

        //计算总和
        int[] ints = {123, 123};
        int sum = Arrays.stream(ints).sum();

        Stream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);//limit(10)获取前10条数据
    }
}

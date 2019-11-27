package com.test.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/*
* IntegerStream  DoubleStream LongStream
* */
public class 数字流 {

    public static void main(String[] args) {
        List<LambdaStream> list = new ArrayList<>();
        list.add(new LambdaStream("xiaoming", 18));
        list.add(new LambdaStream("xiaohong", 20));
        list.add(new LambdaStream("xiaogang", 16));
        list.add(new LambdaStream("xiaolan", 19));

        //计算age总和 将Stream流映射成IntStream
        int sum = list.stream().mapToInt(LambdaStream::getAge).sum();

        //计算age平均分 Stream流映射成DoubleStream
        OptionalDouble average = list.stream().mapToDouble(LambdaStream::getAge).average();

        //生成0-100之间的int数
        IntStream intStream = IntStream.rangeClosed(0, 100);
        int[] ints = intStream.toArray();//转为数组

        //1到100之间的和
        int sum1 = IntStream.rangeClosed(1, 100).sum();

        //计算1-100之间的偶数个数
        long intStream1 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).count();
        System.out.println(intStream1);
    }
}
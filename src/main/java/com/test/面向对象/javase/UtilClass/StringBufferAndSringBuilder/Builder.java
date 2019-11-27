package com.test.面向对象.javase.UtilClass.StringBufferAndSringBuilder;

public class Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();//默认长度16
        StringBuilder builder1 = new StringBuilder(20);//自定义长度
        StringBuilder builder2 = new StringBuilder("我爱你，哈哈哈");//字符串长度+默认16

        //返回底层数组的容量
        int capacity = builder2.capacity();

        //将字符串以追加到序列。
        builder2.append("依然爱你");

        //返回字符序列中指定索引的元素
        char c = builder2.charAt(2);

        //移除指定索引字符序列
        StringBuilder delete = builder2.delete(3, 5);

        //移除指定索引的元素
        builder2.deleteCharAt(6);

        /*将字符从此序列复制到目标字符数组 dst。要复制的第一个字符在索引 srcBegin 处；
        要复制的最后一个字符在索引 srcEnd-1 处。要复制的字符总数为 srcEnd-srcBegin。
        要复制到 dst 子数组的字符从索引 dstBegin 处开始，结束于以下索引：*/
        char[] chars = new char[builder2.length()];
        builder2.getChars(0, builder2.length() - 1, chars, 0);

        //返回字符序列中指定元素第一次出现的索引
        int i = builder2.indexOf("我");
        //从索引出开始返回字符序列中指定元素第一次出现的索引
        builder2.indexOf("哈", 2);

        //指定索引元素，插入字符序列
        builder2.insert(4, "傻逼");

        //返回字符数
        builder2.length();

        //指定开始到结束的位置，替换元素
        builder2.replace(3, 6, "haha");

        //字符序列反转
        builder2.reverse();

        //返回此序列中数据的字符串表示形式
        String s = builder2.toString();

        // 设置字符序列的长度
        builder2.setLength(30);
        int capacity1 = builder2.capacity();
        System.out.println(capacity1);

        //尝试减少用于字符序列的存储空间。
        builder2.trimToSize();
    }
}

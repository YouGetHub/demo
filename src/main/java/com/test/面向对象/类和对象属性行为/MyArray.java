package com.test.面向对象.类和对象属性行为;

import java.util.Arrays;

public class MyArray {

    //给数组默认容量值
    private static final int ARRAYMOREN = 10;

    private int[] array = null;

    //创建对象时指定长度
    public MyArray(int ARRAYMOREN){
        array = new int[ARRAYMOREN];//默认初始容量为2
    }
    //创建对象时默认长度
    public MyArray(){
        array = new int[ARRAYMOREN];//默认初始容量为2
    }


    //记录数组元素的个数
    public static int size = 0;


    //数组扩容
    private void CopyArray(int size){
        if (array.length-size>=0){
            //原数组扩容
            array = Arrays.copyOf(array,array.length*2);
        }
    }

    //add
    public boolean add(int inputAdd){
        //添加元素时，先判断数组容量是否足够，不够的就扩容
        CopyArray(size);
        array[size] = inputAdd;
        size++;
        return true;
    }

    //delete
    public int remove(int index) {
        if ((index >= 0) & (index < size)) {
            //删除元素，将要删除的元素和数组最后一个元素换位置，然后数组size减1
            int result = array[index];
            array[size] = array[index];
            size--;
            return result;
        } else {
            throw new ArrayIndexOutOfBoundsException("数组下表超出");
        }
    }

    //update
    public void update(int index,int date){
        if ((index >= 0) & (index < size)) {
            array[index] = date;
        }else {
            throw new ArrayIndexOutOfBoundsException("数组下标超出");
        }
    }
    //select
    public void get () {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //根据下表获取元素
    public int getIndex (int index){
        if ((index >= 0) & (index < size)) {
            int result = array[index];
            return result;
        } else {
            try {
                throw new ArrayIndexOutOfBoundsException("下标超出");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return index;
    }

    //length
    public int length () {
        return size;
    }
}

package com.test.kaoshi;

import java.util.Arrays;

public class MyTest {
    private static final int MONEY =20;
    User[] arr = null;
    public MyTest(){
        arr = new User[2];
    }

    private int size =0;

    public void add(User user){
        if (size==arr.length){
            arr = Arrays.copyOf(arr,arr.length*2);
        }
        arr[size] = user;
        size++;
    }

    public void remove(String name){
        for (int i =0; i<size;i++){
            if (arr[i].name.equals(name)){
                User temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
                --size;
                break;
            }
        }
    }
    public void update(String name,String book,int count){
        for (int i=0;i<size;i++){
            if (arr[i].name == name){
                arr[i].book = book;
                arr[i].count = count;
            }
        }
    }
    public void getUser(){
        for (int i =0;i<size;i++){
            System.out.println(arr[i].name+"  你购买的书是 " +arr[i].book+"  购买数量"+arr[i].count+"  单价为"+MONEY+"  应付"+arr[i].count*MONEY);
        }
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.add(new User("邹浩宇","海底liangwanli,",1));
        myTest.add(new User("浩宇","海底liangwanli",1));
        myTest.add(new User("张三","海底liangwanli",1));
        myTest.update("张三","追风人",5);
//        myTest.remove("邹浩宇");
        myTest.getUser();
    }
}

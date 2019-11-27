package com.test.面向对象.数组;

import java.util.Arrays;
import java.util.Objects;

/*
* 实现数组
* */
public class ArrayUtil {
    User[] arr ;

    //初始化数组容量默认为2
    public ArrayUtil(){
        arr = new User[2];
    }

    //用于数组的规范
    int size = 0;

    //add
    public void add(User user){
        //判断数组是否超出，如果超出就给数组扩容，默认是数组的2倍
        if (size == arr.length){
           arr = Arrays.copyOf(arr,arr.length*2);
        }
        arr[size] = user;//保存到数组
        size++;//每添加一个size+1
    }

    //delete
    public void delete(User user){
        for (int i =0; i<size;i++){
            if (arr[i].equals(user)){
                User temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
                size--;
                break;
            }
        }
    }

    //sum
    public void sumAge(){
        int sum = 0;
        for (int i =0;i<size;i++){
            System.out.println(arr[i].name+"--"+arr[i].money);
            sum = arr[i].money+sum;
        }
        System.out.println(sum);
    }
}
class User{
    String name;
    int money;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return money == user.money &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
class ArrayTest{
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.add(new User("邹浩宇",18));
        arrayUtil.add(new User("邹浩宇",18));
        arrayUtil.add(new User("邹浩宇",18));
        arrayUtil.sumAge();
    }

}
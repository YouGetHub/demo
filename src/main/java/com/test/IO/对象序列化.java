package com.test.IO;


import java.io.*;

public class 对象序列化 {

    public static void main(String[] args) {
        ObjectOutputStream();//输出流 把对象序列化到流中
        ObjectInputStream();//输入流 可以从文件读取 01 序列，把这组 01 序列转换为对象（反序列化）
    }
    /*
        反序列化
     */
    public static void ObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\bb.txt"));
            Object o = ois.readObject();
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
        把对象序列化到硬盘
     */
    public static void ObjectOutputStream(){
        Person person = new Person();
        person.setName("邹浩宇");
        person.setAge(18);
        ObjectOutputStream ois = null;
        try {
            ois = new ObjectOutputStream(new FileOutputStream("D:\\bb.txt",true));
            ois.writeObject(person);
            ois.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}


class Person implements Serializable {
    String name;
    int age;

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}

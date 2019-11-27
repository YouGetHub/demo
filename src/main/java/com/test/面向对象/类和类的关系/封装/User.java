package com.test.面向对象.类和类的关系.封装;

public class User {
    //属性
    private String name;
    private int age;

    public void setAge(int age) {
        if (age<0){
            System.out.println("你还没出世呢");
            this.name = "";
        }else if(age>120) {
            System.out.println("你怎不去当神仙啊");
            this.name =  "";
        }else{
            this.age = age;
        }
    }
    public int getAge() {return age;}
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
}

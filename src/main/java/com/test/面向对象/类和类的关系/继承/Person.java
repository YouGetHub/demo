package com.test.面向对象.类和类的关系.继承;

public class Person extends Dog {
    public Person() {
        System.out.println("我是子类");
    }

    //子类也可以创建属于自己的属性和方法
    public String phone;

    public void DaPhone(){
        System.out.println(this.name +"的手机号是" +this.phone+",在打电话");
    }

    //重写了父类的方法，可以自己设置想要的内容
    @Override
    public void eat() {
        System.out.println(this.name+"在大口大口的吃饭");
    }

    public static void main(String[] args) {
        //调用父类（Dog）的方法
        Person person = new Person();
        person.hashCode();
        person.name ="小兰";
        person.phone = "15611202171";
        //这个调用的是子类重写父类的方法
        person.eat();
        person.DaPhone();

    }
}
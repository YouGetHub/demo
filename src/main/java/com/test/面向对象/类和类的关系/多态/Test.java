package com.test.面向对象.类和类的关系.多态;

public class Test {
    public static void main(String[] args) {
        Person person = new Teacher();//自动转换，向上转型
        person.eat();//子类重写父类的方法，所以执行子类的eat
        Teacher teacher = (Teacher)person;//自动转换，向下转型
        teacher.eat();
    }
}

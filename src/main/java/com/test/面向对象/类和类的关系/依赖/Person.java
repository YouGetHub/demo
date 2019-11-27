package com.test.面向对象.类和类的关系.依赖;
//屠夫杀猪
public class Person {
    //屠夫的属性
    public String name;//名字
    public PersonDao personDao;//屠夫刀的

    public Person() {
    }

    public Person(String name, PersonDao personDao) {
        this.name = name;
        this.personDao = personDao;
    }

    //屠夫杀猪的行为
    public void sha(Pig pig){
        System.out.println("屠夫"+this.name+"开始杀猪");
        //调用屠夫刀的方法
        personDao.dong();
        //开始杀猪
        pig.Jiao();

    }
}

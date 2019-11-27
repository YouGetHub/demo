package com.test.面向对象.javase.UtilClass.反射.方法构造方法;

import java.lang.reflect.Method;

public class PersonClass {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Method e = personClass.getMethod("eat", String.class);//如果方法带有参数，通过参数类型对应的class来找寻
//        Method e = personClass.getMethod("eat");
        {
            //公共的方法
            Person p= (Person) personClass.newInstance();
            //给方法的参数列表赋值
            String s = (String) e.invoke(p,"哈哈哈");
            System.out.println(s);
        }

        {

        }



        {
            e.getName();//获取方法的名字
            e.getModifiers();//获取方法修饰符
            e.getReturnType();//获取方法返回值类型
            e.getParameterAnnotations();//获取方法参数列表类型
            e.getExceptionTypes();//获取方法抛出异常类型
        }
    }
}

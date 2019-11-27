package com.test.面向对象.javase.UtilClass.反射.类包属性;

/*反射用来描述所有的类，所有的类有相同的特征，属性，方法，构造…
        类是用来描述一组对象的
        反射用来描述一组类的
        Class	描述class 类本身
        Package		描述类所属的包
        Field	描述类中的属性
        Method		描述类中的方法
        Constructor	描述类的构造方法
        Annotation	用来描述类中的注解@Override 注解可以放置在（类上，属性上，方法上，构造方法上，参数上）

        获取class
        Class clazz = Class.forName(“包名,类名”);
        Class clazz = 类名.class;
	    Class clazz = 对象引用.getClass();//Object类中的方法
    Class类常用的方法（描述class 类本身）
                getModifiers() 获取类的 权限修饰符，特征修饰符，
                每个修饰符用整数表示 0 1 2 4 8 16 32 64 128 256 512 1024
                0-default 	1-public 	2-private 	4-protected
                8-static	16-final	32-synchronized	64-volatile
                128-transient		256-native	512-interfce		1024-abstract
	        getName()获取类的名字
            getSimpleName() 获取类的简单名字
            getPackage();//获取类所在包名
            getSuperclass();//获取父类
            getInterfaces();//获取父接口
            clazz.newInstance();//调用当前类的空的构造方法创建对象,如果重写构造方法会报错，找不到
     Field 常用方法	（描述类中的属性）
            Object o = clazz.newInstance();//调用当前类的空的构造方法创建对象,如果重写构造方法会报错，找不到
            Field name1 = clazz.getField("name");//获取类中的属性
            name1.getName();//如果传过来的有值，直接getName获取值
            name1.getModifiers();//获取属性修饰符
            name1.getType();//获取属性的参数类型*/


import java.lang.reflect.Field;

public class getClass {
    //类有自己的结构， 权限修饰符，特征修饰符，类名，继承，实现
    public static void main(String[] args) throws Exception {
        //获取class的三种方式
        Class clazz = Class.forName("com.面向对象.javase.UtilClass.反射.类包属性.Demo");
        Class<Demo> clazz1 = Demo.class;
        Class<? extends Demo> clazz2 = new Demo().getClass();

        class1();//Class类常用的方法（描述class 类本身）
        field();// Field 常用方法	（描述类中的属性）
    }

    /*
     * Field 常用方法	（描述类中的属性）
     * */
    public static void field() throws Exception {
        //Field 常用方法	（描述类中的属性）
        Class clazz = Class.forName("com.面向对象.javase.UtilClass.反射.类包属性.Demo");
        //操作公共的属性
        {
            Field[] fields = clazz.getFields();//获取所有的属性
            Field name1 = clazz.getField("name");//获取类中公共的属性

            {
                //给属性赋值
                Demo d = (Demo) clazz.newInstance();
                name1.set(d, "邹浩宇");//指定对象，属性
                String nameValue = (String) name1.get(d);
                System.out.println(nameValue);//打印
            }
            String name2 = name1.getName();//获取属性名字
            int modifiers = name1.getModifiers();//获取的修饰符
            Class<?> type = name1.getType();//获取属性的类型
        }

        //操作私有的属性
        {
            Field address = clazz.getDeclaredField("address");//获取类中私有的属性
            Demo d = (Demo) clazz.newInstance();
            address.setAccessible(true);//表示私有的属性允许被修改
            address.set(d, "chine");
            String addressValue = (String) address.get(d);
            System.out.println(addressValue);
        }
    }

    /*
     * Class类常用的方法（描述class 类本身）
     * */
    public static void class1() throws Exception {
        Class clazz = Class.forName("com.面向对象.javase.UtilClass.反射.类包属性.Demo");
        //Class类常用的方法（描述class 类本身）
        Object o1 = clazz.newInstance();//调用当前类的空的构造方法创建对象,如果重写构造方法会报错，找不到
        Field name11 = clazz.getField("name");//获取类中的属性
        int method = clazz.getModifiers();//获取类的 权限修饰符，特征修饰符，
        String name = clazz.getName();//获取类的名字
        String simpleName = clazz.getSimpleName();//获取类的简单名字
        Package aPackage = clazz.getPackage();//获取类所在包名
        Class superclass = clazz.getSuperclass();//获取父类
        Class[] interfaces = clazz.getInterfaces();//获取父接口
    }
}

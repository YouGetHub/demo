package com.test.面向对象.类和类的关系.修饰符;

public class TestFinal {
/*    final String string = new String("123");
    string = 12;//地址指向另一个字符数据对象le.

    final int a;//被final修饰必须赋值，不然编译报错*/

    public void test(final int a){
//        a = 10;//报错
     /* 方法要被对象调用才会执行，在调用方法的时候已经赋值了
        然后被final修饰了，所以下面再一次赋值就会报错。
        对象再一次调用是不同的传参过程，所以不报错：
        就比如说你早上吃饭就相当于调用一次方法，传的参就是你要吃的饭，
        早上你选择的饭是粥，就不能在吃米饭了，就相当于不能在方法内再一次赋值。
        对象这一次调用方法时，就相当于你中午吃饭，传的参就是你要吃的饭，
        中午你选择的饭是米饭，就不能在吃粥了，就相当于不能在方法内再一次赋值。
        */
    }



    public final void cc(){

    }
    public final void cc(int a){

    }
    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal();
//        testFinal.a =11;

        testFinal.test(1);
        testFinal.test(2);
    }


 /*       final int[] arr = new int[]{12,32,12};
        *//*没有报错，因为arr存的是堆中数组的地址（hashcode）,
        arr的地址在栈中不可修改，但数据在堆中，所以可以修改*//*
        arr[0] = 12;*/

}

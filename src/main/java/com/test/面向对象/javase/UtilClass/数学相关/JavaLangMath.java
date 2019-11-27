package com.test.面向对象.javase.UtilClass.数学相关;

public class JavaLangMath {
    /*java的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数，对数，平方根和三角函数
      Math的方法都被定义为 static 形式,通过 Math 类可以在主函数中直接调用。*/
    public static void main(String[] args) {
        print();//Math
    }

    /*
    * Math
    */
    public static void print() {

        //random()方法 返回一个0 - 1 的随机数
        System.out.println("返回0 - 1的随机数" + Math.random());
        int random = (int)(Math.random()*100) ;
        System.out.println("返回0 - 100的随机数" + random);

        //abs() 返回参数的绝对值
        Integer a = -10;
        System.out.println("返回的绝对值 " + Math.abs(a));

        //ceil() 方法可对一个数进行上舍入，返回double类型，返回值大于或等于给定的参数，类型为双精度浮点型
        double c = 10.12;
        System.out.println("对一个上舍入，大于或等于源参数" + Math.ceil(c));

        //floor()方法 客队一个数进行下舍入，返回double类型数组，小于或等于给定的参数
        double f = 10.12;
        System.out.println("对一个下舍入，小于或等于源参数" + Math.floor(f));

        //rint()方法 返回一个最接近原参数的整数
        double m = 99.8;
        System.out.println("返回一个最接近源参数的整数" + Math.rint(m));

        //四舍五入
        double t = 1.5;
        System.out.println("四舍五入" + Math.round(t));

        //返回两个参数的最小值，最大值
        int e = 1;
        int r = 2;
        System.out.println("两个参数的最小值" +Math.min(e,r));
        System.out.println("两个参数的最大值" +Math.max(e,r));

    }
}

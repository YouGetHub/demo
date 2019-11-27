package com.test.kaoshi;


public class Demo {

    public static void main(String[] args) {
        test();//画星星
        test1();//会员注册
    }

    public static void test1(){
        int size =0;
        String account ="15611202171";
        String password ="15611202171";

        String[] a = new String[100];
        String[] b = new String[100];
        for (int i=1;i<size;i++){
            if (a[i].equals(account)){
                System.out.println("用户名已存在");
                break;
            }
        }
        a[size] = account;
        b[size] = password;
        ++size;
    }

    public static void test(){
        //三角形
        for (int i =1;i<=4;i++){
            //左边空格
            for (int q =1;q<=4-i;q++){
                System.out.print(" ");
            }
            //右边的*
            for (int w =1;w<=i*2-1;w++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }

}

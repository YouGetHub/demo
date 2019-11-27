package com.test.面向对象.语言基础.练习;

/**
 * @Author: 我是啥比
 * @Date: 2019/5/13 10:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

    }
}
/*
    int sum =1020;
    int sum1 = 0;
    int count =0;

    while (sum1<=sum){
        count++;
        sum1 = ((sum/2)+2)*count;
        System.out.println(sum1);
    }
    System.out.println(count);
*/
/*

    int i =1;
    while (i<=4){

        //空格
        int q = 1;
        while (q<=4-i){
            System.out.print(" ");
            q++;
        }
        //星星
        int w = 1;
        while (w<=i*2-1){
            System.out.print("*");
            w++;
        }

        i++;
        System.out.println();
    }
      *
     ***
    *****
   *******
*/

/*

        for (int i =1;i<=4;i++){
            //打印空格
            for (int q =1; q<=4-i;q++){
                System.out.print(" ");
            }
            //先打印左半部分
            for(int w = 1;w<=i;w++){
                System.out.print(w);
            }
            //右半部分
            for(int e = i-1; e>=1;e--){
                System.out.print(e);
            }
            System.out.println();
        }


   1
  121
 12321
1234321
*/
/*
        //自定义竖列
        int input =5;
        for (int i =1;i<=input;i++){
            //第一排星星
            if (i==1){
                for (int q = 1; q<=(input*2)-1; q++){
                    System.out.print("*");
                }
            }else {
                //左边部分星星
                for (int w =1; w<=(input+1)-i; w++){
                    System.out.print("*");
                }
                //中间空格
                for (int e =1; e<=2*i-3; e++){
                    System.out.print(" ");
                }
                //右边部分星星
                for(int r = 1; r<=(input+1)-i; r++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

*******
*** ***
**   **
*     *


*/
/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */

/*
        for (int i =1; i<=9; i++){
            for (int q =1;q<=i; q++){
                System.out.print(q +"*" +i +"=" + q*i + " ");
            }
            System.out.println();
        }
*/

/*
&&**
&***
****
        for (int i=1; i<=4; i++){
            for (int q = 1; q<=4-i;q++){
                System.out.print(" ");
            }
            for (int w =1; w<=i;w++){
                System.out.print("*");
            }
            System.out.println();
        }

*/
/*
    *
   ***
  *****
 *******
  *****
   ***
    *
*/

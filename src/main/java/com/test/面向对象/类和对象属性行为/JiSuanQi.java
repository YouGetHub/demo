package com.test.面向对象.类和对象属性行为;

import java.util.Scanner;

public class JiSuanQi {
    public static void main(String[] args) {
        JiSuanQi jiSuanQi = new JiSuanQi();
        Scanner input = new Scanner(System.in);
        while (true){
              System.out.println("请输入第1个数");
              double a  = input.nextDouble();
              System.out.println("请输入符号");
              String b  = input.next();
              if (!(b.equals("+")) & !(b.equals("-")) && !(b.equals("*"))  & !(b.equals("/"))){
                  System.out.println("你是啥比？");
                  break;
              }else{
                  System.out.println("请输入第2个数");
                  double c  = input.nextDouble();
                  if (b.equals("+")){
                      System.out.println(jiSuanQi.Jia(a,b,c));
                  }else if (b.equals("-")){
                      System.out.println(jiSuanQi.jian(a,b,c));
                  }else if (b.equals("*")){
                      System.out.println(jiSuanQi.cheng(a,b,c));
                  }else{
                      System.out.println(jiSuanQi.chu(a,b,c));
                  }
              }
        }
    }


    public String Jia(double a ,String b, double c){
        return a +"+" +c +"=" +(a+c);
    }
    public String jian(double a ,String b, double c){
        return a +"-" +c +"=" +(a-c);
    }
    public String cheng(double a ,String b, double c){
        return a +"*" +c +"=" +(a*c);
    }
    public String chu(double a ,String b, double c){
        return a +"/" +c +"=" +(a/c);
    }
}

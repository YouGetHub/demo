package com.test.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 加密解密 {

    public static void main(String[] args) {
//        test();//加密
        test1();//解密
    }

    public static void test1(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("C:\\Users\\zouha\\Pictures\\Camera Roll\\zdt.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\zouha\\Pictures\\Camera Roll\\zdt1.jpg"));
            int read = bis.read();
            while (read != -1){
                bos.write(read ^ 88);// 解密 ^ 异或 和88
                read = bis.read();
            }
            bos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*
        加密
     */
    public static void test(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("C:\\Users\\zouha\\Pictures\\Camera Roll\\zdt.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\zouha\\Pictures\\Camera Roll\\zdt.jpg"));
            int read = bis.read();
            while (read != -1){
                bos.write(read * 88);// 加密 ^ 异或 和88结算得到另一个值
                read = bis.read();
            }
            bos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

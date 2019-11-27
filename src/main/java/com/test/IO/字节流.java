package com.test.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流 {

    public static void main(String[] args) {
//        FileInputStream();//读取文件内容
//        FileOutputStream();//写入文件内容
//        FileInputStreamAndFileOutputStream();//文件复制

    }
    /*
        文件复制
     */
    public static void  FileInputStreamAndFileOutputStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\cc.txt");
            fos = new FileOutputStream("D:\\bb.txt");
            byte[] arr = new byte[1024];
            int read = fis.read(arr);
            while (read != -1){
                fos.write(arr,0,read);
                read = fis.read(arr);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /*
        写入文件内容
     */
    public static void FileOutputStream(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\字节流.java",true);
            byte[] bytes = "FileOutputStream".getBytes();
            fos.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /*
        读取文件内容
     */
    public static void FileInputStream(){
        FileInputStream fis= null;
        try {
            fis = new FileInputStream("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\字节流.java");
            byte[] arr = new byte[1024];
            int read = fis.read(arr);
            while (read != -1){
                System.out.println(new String(arr,0,read));
                read = fis.read(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
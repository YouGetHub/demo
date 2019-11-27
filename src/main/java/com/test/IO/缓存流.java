package com.test.IO;

import java.io.*;

public class 缓存流 {

    public static void main(String[] args) {
//        BufferedReader();//缓存字符流读文件
//        BufferedWriter();//缓存字符流读文件
//        BufferedReaderAndBufferedWriter();//使用缓存字符流复制文件
//        BufferedInputStreamAndBufferedOutputStream();//使用缓存字节流复制文件
    }
    public static void BufferedReaderAndBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("E:\\图片\\照片\\cc.jpg"));
            bw = new BufferedWriter(new FileWriter("E:\\图片\\照片\\bb.jpg"));
            String readLine = br.readLine();
            while (readLine != null){
                bw.write(readLine);
                readLine = br.readLine();
            }
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*
        缓存字符流读文件
     */
    public static void BufferedWriter(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\缓存流.java",true));
            bw.write("哈哈");
            bw.newLine();//换行写入
            bw.write("哈哈");
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*
        缓存字符流读文件
     */
    public static void BufferedReader(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\缓存流.java"));
            String readLine = br.readLine();//一次读取一行
            while (readLine != null){
                System.out.println(readLine);
                readLine = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*
        使用缓存字节流复制文件
     */
    public static void BufferedInputStreamAndBufferedOutputStream(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:\\bb.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\cc.txt"));
            int read = bis.read();
            while (read != -1){
                bos.write(read);
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

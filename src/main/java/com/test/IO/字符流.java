package com.test.IO;

import java.io.FileReader;
import java.io.FileWriter;

public class 字符流 {

    public static void main(String[] args) {
//        FileReader();//读取文件内容
//        FileWriter();//写入文件内容
//        FileReaderAndFileWriter();//文件复制
    }

    /*
        文件复制
     */
    public static void FileReaderAndFileWriter() {
        FileReader fd = null;
        FileWriter fw = null;
        try {
            fd = new FileReader("D:\\bb.txt");
            fw = new FileWriter("D:\\c.txt");
            char[] arr = new char[1024];
            int read = fd.read(arr);
            while (read != -1) {
                fw.write(arr, 0, read);
                read = fd.read(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fd.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
        写入文件内容
     */
    public static void FileWriter() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\字符流.java", true);
            String str = "傻逼";
            fw.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
        读取文件内容
     */
    public static void FileReader() {
        FileReader fd = null;
        try {
            fd = new FileReader("C:\\Users\\zouha\\IdeaProjects\\demo\\src\\test\\java\\com\\io\\字符流.java");
            char[] arr = new char[1024];
            int read = fd.read(arr);
            while (read != -1) {
                System.out.println(arr);
                read = fd.read(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fd.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

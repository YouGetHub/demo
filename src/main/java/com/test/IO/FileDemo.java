package com.test.IO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        FileAPI();//File常用方法
    }
    /*
    * File 的常用方法
    * */
    public static void FileAPI(){
        //绝对路径
        File file = new File("E:\\IOs");
        file.getAbsolutePath();//获取文件的绝对路径
        file.exists();//文件是否存在
        file.isDirectory();//是否是个文件夹
        file.isFile();//是否是非文件夹
        file.length();//获取文件的长度

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long l = file.lastModified();//获取文件最后修改的时间
        Date date = new Date(l);
        String format = dateFormat.format(date);

        file.renameTo(new File(""));//文件重命名
        file.list();//以字符串数组的格式返回文件夹下的文件
        file.listFiles();//以文件数组的格式返回文件夹下的文件
        file.getParent();//以字符串的格式返回文件夹的路径
        file.getParentFile();//以文件形式返回文件夹的路径
        file.mkdirs();//创建目标文件夹
        file.listRoots();//以文件数组格式返回所有盘符
        file.delete();//删除文件
        file.deleteOnExit();//JVM结束的时候删除文件，用于删除临时文件

    }
}

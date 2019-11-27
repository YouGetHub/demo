package com.test.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 数据流 {

    public static void main(String[] args) {
        DataInputStream();//数据输入流
//        DataOutputStream();//数据输出流
    }

    public static void DataInputStream (){
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("D:\\cc.txt"));
            String s = dataInputStream.readUTF();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();
            System.out.println(s+ "  --" + i + "----" + b);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void DataOutputStream (){
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("D:\\cc.txt"));
            dataOutputStream.writeUTF("123");
            dataOutputStream.writeInt(123);
            dataOutputStream.writeBoolean(true);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}

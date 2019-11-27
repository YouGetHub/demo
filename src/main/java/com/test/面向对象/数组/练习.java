package com.test.面向对象.数组;

import java.util.Arrays;

/**
 * @Author: 我是啥比
 * @Date: 2019/2/13 15:25
 * @Version 1.0
 */
public class 练习 {
    public static void main(String[] args) {
        test7();//将数组中的元素不是0添加到新数组里
        test6();//给数组中的最大值位置，将数组拆分成两个数组 max left = left[] ;;;max right = right[]
        test5();//数组元素合并
        test4();//数组元素的最大值最小值
        test3();//计算数组元素的平均值
        test2();//数组元素头尾会换位置
        test1();//两个数组中的元素互换
        test();//存储1-100的奇数
        print();//数组的扩容
        print1();//获取数组最大的值
        print3();//数组元素颠倒
        print4();//冒泡排序
        print5();//计算数组总和
        print6();//数组的拷贝
    }

    public static void test8() {
        int count = 0;
        for (int i = 2; i <= 200; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int index = 0;
        for (int q = 200; q >= 2; q--) {
            if (q % 2 == 0) {
                arr[index] = q;
                index++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void test7() {
        int[] arr = new int[]{1, 2, 44, 54, 0, 6, 0};
        int count = 0;//统计0有几个然后给新数组初始化长度
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int coun = 0;//新数组的索引
        for (int q = 0; q < arr.length; q++) {
            if (arr[q] != 0) {
                newArr[coun] = arr[q];
                coun++;
            }
        }
        arr = null;
        System.out.println(Arrays.toString(newArr));
    }


    public static void test6() {
        int[] b = new int[]{5, 6, 7, 98, 2, 3, 5, 12, 3123, 123, 123, 12, 12, 3, 3, 44, 44444, 444};
        int[] c = new int[b.length];
        int[] f = new int[b.length];
        int ff = 0;
        int l = 0;
        int max = 0;
        int index = 0;
        int index1 = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("max ===" + max);
        for (int i = 0; i < b.length; i++) {
            int value = b[i];
            if (value == max) {
                index = i;
                index1 = i;
                index--;
                for (; index >= 0; index--) {
                    c[l] = b[index];
                    l++;
                }
                index1++;
                for (; index1 < b.length; index1++) {
                    f[ff] = b[index1];
                    ff++;
                }
            }
        }
        System.out.println("max  Left==" + Arrays.toString(c));
        System.out.println("max  Right==" + Arrays.toString(f));
    }

    public static void test5() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{5, 6, 7, 8};
        int[] newArr = new int[a.length + b.length];
        int i = 0;
        for (; i < a.length; i++) {
            newArr[i] = a[i];
        }
        for (int q = 0; q < b.length; q++) {
            newArr[i] = b[q];
            i++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void test4() {

        {
            /*
             * 最小值
             * */
            int[] arr = new int[]{2, 3, 4, 12, 8};
            long min = Long.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println(min);

        }
        {
            /*
             * 最大值
             * */
            int[] arr = new int[]{2, 3, 4, 12, 8};
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }

    public static void test3() {
        int[] arr = new int[]{1, 2, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int result = arr[i];
            sum = result + sum;
        }
        System.out.println(sum / arr.length);
    }

    public static void test2() {
        int[] arr = new int[]{1, 2, 3, 43, 12};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void test1() {
        int[] a = new int[]{1, 2, 3, 12, 12, 14};
        int[] b = new int[]{5, 6, 7, 8};
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        //通过中间数组
        int[] c = a;
        a = b;
        b = c;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }

    public static void test() {
        int[] arr = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                arr[i] = i;
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
    }

    /*
        数组的拷贝
     */
    public static void print6() {
        String[] str = {"aa", "bb", "cc"};
        String[] str1 = new String[str.length];
        System.arraycopy(str, 0, str1, 0, 2);// str被复制的数组,0str从第几个元素的下标开始,str1复制到的数组,0str1从第几个下标开始存储，
        System.out.println(Arrays.toString(str1));
    }

    /*
        计算数组总和
     */
    private static void print5() {
        int[] arr = {1, 2, 32};
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println(count);
    }

    /*
        冒泡排序
     */
    public static void print4() {
        int[] arr = new int[]{1, 3, 43, 3, 12};
        for (int q = 1; q <= arr.length; q++) { //要比较的次数，每个元素都比较
            for (int i = arr.length - 1; i >= 1; i--) {//最后一个元素和前一个元素，比较，第一次是4次，第二次是3,第三次是2，第四次是1
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        System.out.println("======" + Arrays.toString(arr));
    }

    /*
        数组元素颠倒
     */
    public static void print3() {
        int[] arr = {2, 4, 54, 23, 4};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
        数组的最大值
     */
    public static void print1() {
        int[] arr = {1, 4, 23, 5, 6};
        int max = arr[0];//假设数组第一个值位最大
        for (int i = 1; i < arr.length; i++) {//第一个元素去和其他元素去比较
            if (max < arr[i]) max = arr[i]; //max小于其他元素时 就将值赋给max
        }
        System.out.println(max);
    }

    /*
        数组的扩容
    */
    public static void print() {
        int[] arr = {12, 45, 12, 32, 33};
        //定义更大的数组
        arr = Arrays.copyOf(arr, arr.length * 2);
        //让原来的数组指定新的数组
        System.out.println(Arrays.toString(arr));
     /*
        int[] arr = {12,45,12,32,33};
        //定义更大的数组
        int[] arr1 = new int[arr.length*2];
        //把原来数组的内容复制到新数组
        System.arraycopy(arr,0,arr1,0,arr.length);
        //让原来的数组指定新的数组
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    */
    }
}

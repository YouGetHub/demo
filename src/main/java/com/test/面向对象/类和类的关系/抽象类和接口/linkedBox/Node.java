package com.test.面向对象.类和类的关系.抽象类和接口.linkedBox;

public class Node {
    //双向链表的组件
    public Node top;//指向上一个节点的指针存储的地址
    public int node;//数据
    public Node next;//指向下一个节点的指针存储的地址

    public Node(Node top, int node, Node next) {
        this.top = top;
        this.node = node;
        this.next = next;
    }
}

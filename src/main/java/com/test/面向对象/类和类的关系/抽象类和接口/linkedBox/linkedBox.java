package com.test.面向对象.类和类的关系.抽象类和接口.linkedBox;

public class linkedBox implements Box{
    private Node topNode;//记录头节点
    private Node nextNode;//记录尾节点

    //记录链表元素的个数
    private static int size = 0;

    /*
    *将data添加在链表的尾部
    * */
    private void addA(int data){
        //获取链表的尾节点
        Node nextNode = this.nextNode;
        //创建Node对象，将数据包装
        Node newNode = new Node(nextNode,data,null);
        //将新节点对象设置成尾节点
        nextNode = newNode;
        if (newNode ==null){//如果尾节点为null.说明链表还没有被使用，
            //将这个Node设为首节点
            topNode = newNode;
        }else{//说明用过，
            //将这个节点存放尾节点只想下一个的指针
            newNode.next = newNode;
        }
        //添加一次，size++
        size ++;
    }

    /*
    * 判断输入的索引是否规范
    * */
    private void getIndexIf(int index){
        if ((index>=0) & (index<size-1)){
        }else {
            throw new IndexOutOfBoundsException("下表超出");
        }
    }

    /*
    * 找出指定index的Node对象
    * */
    public void indexOf(int index){
        //用来存储找到的元素
        Node resultData;
        if(index<(size/2)){
            resultData =  topNode;
            for (int i =0 ;i<size;i++){
              resultData = topNode;
            }
        }
    }

    /*
    * 添加数据
    * */
    @Override
    public boolean add(int data) {
        //把data存放到新的Node对象里，放置链表的尾部
        this.addA(data);
        return true;
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int update(int index, int data) {
        return 0;
    }

    /*
    * 获取元素
    * */
    @Override
    public int get(int index) {
        //判断输入的索引是否规范
        this.getIndexIf(index);
        //找出index的元素
        this.indexOf(index);
        return 0;
    }

    @Override
    public void getAll() {

    }

}

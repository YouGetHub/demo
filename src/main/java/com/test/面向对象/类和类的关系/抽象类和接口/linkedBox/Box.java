package com.test.面向对象.类和类的关系.抽象类和接口.linkedBox;

public interface Box {
    public boolean add(int data);

    public int remove(int index);

    public int update(int index, int data);

    public int get(int index);

    public void getAll();

}

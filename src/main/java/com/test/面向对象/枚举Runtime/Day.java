package com.test.面向对象.枚举Runtime;

public enum Day {
    //相当于描述了
    yi("星期一",1),er("星期二",2),san("星期三",3),
    si("星期四",4),wu("星期五",5),liu("星期六",6),qi("星期日",7);

    //自定义属性
    private String name;
    private int index;
    private Day(){};
    private Day(String name,int index){
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

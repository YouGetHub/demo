package com.test.kaoshi.Che;

public enum shu {
    hdlwl("海底两万里", 25.1), zfr("追风人", 20);
    //自定义属性
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    shu() {
    }

    shu(String name, double money) {
        this.name = name;
        this.money = money;
    }
}

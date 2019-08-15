/*
* 笔记本电脑
*
* */

package com.java.domain;

public class NoteBook implements Equipment {
    // 实例变量
    private String model;
    private double price;

    // 构造器
    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // 方法
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 0 && model.length() <= 36) {
            this.model = model;
        } else {
            System.out.println("NoteBooke model字段长度为[1- 36]");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("thie notebooke computer price must be greater than 0");
        }
    }

    @Override
    public String getDescription() {
        String des = "NoteBooke{ " +
                "model: '" + model + '\'' +
                ", price: " + price +
                " }";
        return null;
    }
}
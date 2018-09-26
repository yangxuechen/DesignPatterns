package com.test;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("删除圆形");
    }
}

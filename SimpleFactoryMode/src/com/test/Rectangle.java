package com.test;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    @Override
    public void erase() {
        System.out.println("删除矩形");
    }
}

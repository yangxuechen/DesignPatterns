package com.test;

public class Test {
    public static void main(String[] args) {
        try{
            Shape shape=ShapeFactory.createShape("r");
            shape.draw();
            shape.erase();
        }catch (UnsupportedShapeException e){
            e.printStackTrace();
        }
    }
}

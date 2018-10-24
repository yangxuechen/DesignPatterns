package com.test;

public class Test {
    public static void main(String[] args) {
        ActorController ac=new ActorController();  //实例化角色创建控制器
        ActorBuilder ab;
        ab=new AngelBuilder();  //实例化角色建造器（天使）
        Actor angel;
        angel=ac.construct(ab); //角色创建控制器通过天使建造器构造天使对象

        String type=angel.getType();
        System.out.println(type+"的外观");
        System.out.println("性别："+angel.getSex());
        System.out.println("面容："+angel.getFace());
        System.out.println("服装："+angel.getCostume());
        System.out.println("发型："+angel.getHairstyle());
    }
}

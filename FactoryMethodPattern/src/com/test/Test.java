package com.test;

/**
 * 工厂方法模式实例之日志记录器
 * 增加新的具体产品只需对应增加新的具体工厂即可
 */
public class Test {
    public static void main(String[] args) {
        LogFactory factory;
        Log log;
        factory=new FileLogFactory();
        log=  factory.createLog();
        log.writeLog();
    }
}

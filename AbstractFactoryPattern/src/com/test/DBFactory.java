package com.test;

/**
 * 数据库工厂接口：抽象工厂
 */
public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}

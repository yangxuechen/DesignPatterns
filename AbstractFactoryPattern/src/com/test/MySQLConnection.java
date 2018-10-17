package com.test;

/**
 * MySQL数据库连接类：具体产品
 */
public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("连接MySQL数据库");
    }
}

package com.test;

/**
 * Oracle数据库连接类：具体产品
 */
public class OracleConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("连接Oracle数据库");
    }
}

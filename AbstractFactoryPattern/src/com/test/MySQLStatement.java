package com.test;

/**
 * MySQL数据库语句类：具体产品
 */
public class MySQLStatement implements Statement{
    @Override
    public void executeStatement() {
        System.out.println("执行MySQL数据库语句");
    }
}

package com.test;

/**
 * Oracle数据库语句类：具体产品
 */
public class OracleStatement implements Statement{
    @Override
    public void executeStatement() {
        System.out.println("执行Oracle数据库语句");
    }
}

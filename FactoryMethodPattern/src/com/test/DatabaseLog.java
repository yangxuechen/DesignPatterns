package com.test;

/**
 * 数据库日志记录器
 */
public class DatabaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}

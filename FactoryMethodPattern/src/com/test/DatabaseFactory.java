package com.test;

/**
 * 数据库日志记录器工厂
 */
public class DatabaseFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}

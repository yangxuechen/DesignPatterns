package com.test;

/**
 * 文件日志记录器工厂
 */
public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
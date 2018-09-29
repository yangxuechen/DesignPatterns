package com.test;

/**
 * 文件日志记录器
 */
public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}

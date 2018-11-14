package test;

/**
 * 原型模式实例之快速创建工作周报
 *
 * 通过复制原有工作周报来进行局部修改快速创建新工作周报
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous=new WeeklyLog();
        log_previous.setName("张三");
        log_previous.setDate("2018-11-14");
        log_previous.setContent("这周工作很忙！");

        System.out.println("************周报***********");
        System.out.println(log_previous.getName());
        System.out.println(log_previous.getContent());
        System.out.println(log_previous.getDate());

        WeeklyLog log_now;
        log_now= (WeeklyLog) log_previous.clone();

        log_now.setDate("2018-11-15");

        System.out.println("************周报***********");
        System.out.println(log_now.getName());
        System.out.println(log_now.getContent());
        System.out.println(log_now.getDate());
    }
}

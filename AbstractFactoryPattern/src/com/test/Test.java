package com.test;

/**
 * 在更换数据库时，只需要更换数据库工厂
 *
 * eg: factory = new OracleFactory() //获得Oracle工厂对象
 *     factory = new MySQLFactory()  //获得MySQL工厂对象
 */
public class Test {
    public static void main(String[] args) {
        DBFactory factory;    //工厂
        Connection connection; //连接对象
        Statement statement;   //数据库语句对象

        factory=new OracleFactory();  //获得Oracle数据库工厂实例对象
        connection=factory.createConnection();//获得factory对象提供的连接对象
        statement=factory.createStatement();  //获得factory对象提供的数据库语句对象

        connection.connect();
        statement.executeStatement();
    }
}

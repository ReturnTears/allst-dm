package com.allst.dm.dp.factory;

/**
 * 抽象工厂模式 : 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 * 变化： 数据库(mysql, oracle...)
 *
 *
 * @author June
 * @since 2021年07月
 */
public class AbstractFactory {
    public static void main(String... args) {
        IDatabaseUtils iDatabaseUtils = new OracleDatabaseUtils();
        IConnection connection = iDatabaseUtils.getConnection();
        connection.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.command();
    }
}

// ---------------------------- 变化 --------------------------------
interface IConnection {
    void connect();
}

interface ICommand {
    void command();
}

/**
 * 一组工厂方法的接口
 */
interface IDatabaseUtils {
    IConnection getConnection();
    ICommand getCommand();
}

class MysqlConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("...MySQL connection...");
    }
}

class OracleConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("...Oracle connection...");
    }
}

class MysqlCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("。。。MySQL Command...");
    }
}

class OracleCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("...Oracle Command...");
    }
}

class MySQLDatabaseUtils implements IDatabaseUtils {
    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }
    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}

class OracleDatabaseUtils implements IDatabaseUtils {
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }
    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
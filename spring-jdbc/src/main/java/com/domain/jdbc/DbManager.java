package com.domain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author mbaranowicz
 */
public class DbManager {
    private Connection connection;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException{
        Properties connectionProps = new Properties();
        connectionProps.put("user","database_user");
        connectionProps.put("password","database_password");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/example_database?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }
    public static DbManager getInstance()throws SQLException{
        if(dbManagerInstance == null){
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }
    public Connection getConnection(){
        return connection;
    }
}

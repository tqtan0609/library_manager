package service;

import java.sql.DriverManager;

public class Connection {
    String hostName;
    String dbName;
    String userName;
    String password;
    String jdbc;
    String port;
    String className;
    String connURL;
    private static Connection instance;

    private Connection() {
        try {
            hostName = "localhost:";
            dbName = "databaseName=library_manager;";
            userName = "sa";
            password = "sinhnhat17";
            jdbc = "jdbc:sqlserver://";
            port = "1433;";
            className = "className";
            connURL = jdbc + hostName + port + dbName + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            System.out.println(connURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    public java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            //khai báo driver->mysql
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connURL, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean closeConnection(java.sql.Connection conn) {
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
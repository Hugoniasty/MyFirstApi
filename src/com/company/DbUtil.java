package com.company;

import java.sql.*;

public class DbUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/MyFirstApi?useSSL=false&characterEncoding=utf8&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "coderslab";


    public static Connection getConnection () throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }
}

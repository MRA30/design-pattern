package com.bvk.singleton;

public class DatabaseHelper {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection("localhost", "8080", "root", "root");
        }
        return  connection;
    }

}

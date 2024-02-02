package com.bvk.objectpool;

import com.bvk.singleton.DatabaseHelper;

public class OrderService {

    public void save(String orderId) {
        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ................");
        DatabasePool.close(connection);
    }
}

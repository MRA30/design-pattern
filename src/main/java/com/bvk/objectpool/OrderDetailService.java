package com.bvk.objectpool;

public class OrderDetailService {

    public void save(String orderId,String product) {
        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ................");
        DatabasePool.close(connection);
    }

}

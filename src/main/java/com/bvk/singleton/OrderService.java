package com.bvk.singleton;

public class OrderService {

    public void save(String orderId) {
        DatabaseHelper.getConnection().sql("INSERT INTO ................");
    }
}

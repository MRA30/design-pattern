package com.bvk.singleton;

public class OrderDetailService {

    public void save(String orderId,String product) {
        DatabaseHelper.getConnection().sql("INSERT INTO ................");
    }

}

package com.bvk.singleton;

public class SingletonApp {
    public static void main(String[] args) {

        // Buat 1 object untuk digunakan di bagian kode manapun jika ada yang mebutuhkan objek tersebut maka akan di balikkan objek yang sama kalo objek tersebut sebelumnya sudah pernah dibuat.
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "Indomie");
        orderDetailService.save("0001", "Ultra Jaya");
        orderDetailService.save("0001", "Ciptadent");

    }
}
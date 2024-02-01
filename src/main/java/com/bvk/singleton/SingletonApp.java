package com.bvk.singleton;

public class SingletonApp {
    public static void main(String[] args) {

        // Pola desain yang memastikan bahwa sebuah kelas memiliki hanya satu instance dan menyediakan cara untuk mengakses instance tersebut dari titik mana pun dalam aplikasi.
        // Prinsipnya adalah bahwa singleton mengontrol pembuatan objek tunggal untuk kelasnya, sehingga memastikan bahwa setiap kali kelas tersebut diinstansiasi, hanya satu instance yang dibuat dan instance tersebut dapat diakses secara global.
        // Dapat menghindari pemborosan memori dan konflik akses ke sumber daya Bersama.

        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "Indomie");
        orderDetailService.save("0001", "Ultra Jaya");
        orderDetailService.save("0001", "Ciptadent");

    }
}
package com.bvk.prototype;

public class PrototypeApp {

    public static void main(String[] args) throws Exception {

        // Pola desain yang memungkinkan pembuatan objek baru dengan mengkloning objek yang sudah ada.
        // Dengan menggunakan prototipe, kita dapat membuat objek baru dengan nilai awal yang sama tanpa harus mengetahui rincian implementasi kelasnya.

        Store store1 = new Store("Toko Z", "Jakarta", "Indonesia", "Gadget");

        Store store2 = store1.clone();
        store2.setName("Toko Y");

        Store store3 = store2.clone();
        store3.setName("Toko X");
        store3.setCity("Bandung");

        Store store4 = store3.clone();
        store4.setName("Toko W");
        store4.setCategory("Fashion");

    }

}

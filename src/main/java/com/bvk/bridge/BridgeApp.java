package com.bvk.bridge;

import java.util.Arrays;
import java.util.List;

public class BridgeApp {

    public static void main(String[] args) {

        // jika concrete class ada groupingnya maka lebih bagus menggunakan brigde daripada implementasikan sendiri sendiri

        List<Binatang> binatangList = Arrays.asList(
                new Kambing(),
                new Anjing(),
                new Ayam(),
                new Lele(),
                new Koi(),
                new Hiu()
        );

        binatangList.forEach( binatang -> {
            if (binatang instanceof BinatangAir) {
                BinatangAir binatangAir = (BinatangAir) binatang;
                System.out.println(binatangAir.getName() + " hidup di air");
            } else if (binatang instanceof BinatangDarat) {
                BinatangDarat binatangDarat = (BinatangDarat) binatang;
                System.out.println(binatangDarat.getName() + " hidup di darat dengan kaki " + binatangDarat.jumlahKaki());
            }
        });

    }

}

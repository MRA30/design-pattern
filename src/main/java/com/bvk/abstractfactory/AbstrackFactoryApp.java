package com.bvk.abstractfactory;

public class AbstrackFactoryApp {
    public static void main(String[] args) {

        // Pola desain yang memungkinkan pembuatan sekelompok objek terkait tanpa harus menentukan kelas konkretnya.
        // Memungkinkan klien untuk membuat objek tanpa perlu mengetahui detail implementasi kelas konkret yang digunakan.
        // Pola ini membantu memisahkan logika pembuatan objek dari klien yang menggunakannya, dan memfasilitasi penambahan varian produk atau platform baru tanpa mengganggu kode klien.

        Game gameEasy = new Game(new GameFactoryEasy());
        gameEasy.start();
        Game gameMedium = new Game(new GameFactoryMedium());
        gameMedium.start();
        Game gameHard = new Game(new GameFactoryHard());
        gameHard.start();


    }
}

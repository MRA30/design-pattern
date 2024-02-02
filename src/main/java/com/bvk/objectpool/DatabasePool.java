package com.bvk.objectpool;

import java.util.ArrayList;
import java.util.List;

public class DatabasePool {

    // Sebuah desain perangkat lunak yang digunakan dalam pemrograman komputer untuk meningkatkan kinerja dan efisiensi dengan mengurangi biaya pembuatan objek yang mahal secara berulang-ulang.
    // Dalam praktiknya, Object Pool menyimpan objek-objek yang dibuat sebelumnya dalam suatu struktur data seperti array atau daftar.
    // Ketika aplikasi membutuhkan objek, ia tidak membuat objek baru, tetapi mengambil salah satu objek yang ada dalam pool.
    // Setelah objek selesai digunakan, ia dikembalikan ke dalam pool untuk digunakan kembali.

    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            Connection connection = new Connection("localhost", "8080", "root", "root");
            pool.add(connection);
        }
    }

    public static Connection getConnection() {
        if (pool.isEmpty()) {
            throw new RuntimeException("Koneksi habis");
        }else {
            Connection connection = pool.remove(0);
            return connection;
        }
    }

    public static void close(Connection connection) {
        pool.add(connection);
    }

}

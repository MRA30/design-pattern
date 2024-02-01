package com.bvk.builder;

public class BuilderApp {
    public static void main(String[] args) {

        // Memisahkan pembuatan objek yang complex dengan membuat kelas builder.
        // Jadi ketika ada penambahan di atribut objek tidak akan membuat kode yang sudah dibuat menjadi error.

        Customer customer1 = new Customer("001", "Eko", "Kurniawan", "ekokurniawan@gmail.com", "082222222");
        Customer customer2 = new CustomerBuilder()
                .setId("id")
                .setFirstName("Eko")
                .setLastName("Kurniawan")
                .build();
    }
}

package com.bvk.repository;

public class RepositoryApp {

    public static void main(String[] args) {

        // untuk mengelompokkan semua yang perlu akses ke database dan tidak boleh direct akses ke database di class lain
        // juga bisa disebut dao atau data access object

        Product product = new Product();
        product.setName("Indomie");
        product.setPrice(3500);

        ProductRepository productRepository = new ProductRepository();
        productRepository.insert(product);

        productRepository.insert(product);

        productRepository.delete(product);

        productRepository.selectAll();

    }

}

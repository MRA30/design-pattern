package com.bvk.repository;

import com.bvk.objectpool.DatabasePool;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void insert(Product product) {
        DatabasePool.getConnection().sql("INSERT INTO product(id, name, price) VALUES (?, ?, ?)", product);
    }

    public void update(Product product) {
        DatabasePool.getConnection().sql("UPDATE product SET name = ? WHERE id = ?", product.getId());
    }

    public void delete(Product product) {
        DatabasePool.getConnection().sql("DELETE FROM product WHERE id = ?", product.getId());
    }

    public List<Product> selectAll() {
        List<Object[]> select = DatabasePool.getConnection().select("SELECT * FROM product");
        List<Product> products = new ArrayList<>();
        for (Object[] objects : select) {
            Product product = new Product();
            product.setId((String) objects[0]);
            product.setName((String) objects[0]);
            product.setPrice((Integer) objects[0]);
        }
        return products;
    }

}

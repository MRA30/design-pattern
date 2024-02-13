package com.bvk.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {

        // jika struktur data dalam bentuk tree jadi object mempunyai collection objek

        List<Category> categoryList = Arrays.asList(
                new CompositeCategory("HandPhone", Arrays.asList(
                        new Category("Android"),
                        new Category("iOS")
                )),
                new CompositeCategory("Computer", Arrays.asList(
                        new Category("PC"),
                        new Category("Notebook")
                )),
                new CompositeCategory("Fashion", Arrays.asList(
                        new CompositeCategory("Fashion Pria", Arrays.asList(
                                new CompositeCategory("Baju Pria", Arrays.asList(
                                        new Category("Kaos"),
                                        new Category("Kemeja")
                                )),
                                new CompositeCategory("Celana", Arrays.asList(
                                        new Category("Celana Pendek"),
                                        new Category("Celana Panjang")
                                ))
                        )),
                        new CompositeCategory("Fashion Wanita", Arrays.asList(
                                new CompositeCategory("Baju Wanita", Arrays.asList(
                                        new Category("Gamis"),
                                        new Category("Daster")
                                )),
                                new CompositeCategory("Celana Wanita", Arrays.asList(
                                        new Category("Celana Jeans"),
                                        new Category("Rok Panjang")
                                ))
                        ))
                ))
        );

        categoryList.forEach(CompositeApp::printCategory);

    }
    private static void printCategory(Category category) {
        System.out.println(category.getNama());

        if (category instanceof CompositeCategory) {
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(CompositeApp::printCategory);
        }
    }

}

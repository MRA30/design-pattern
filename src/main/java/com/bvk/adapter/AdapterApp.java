package com.bvk.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {

    public static void main(String[] args) {

        // Adaptor Design Pattern memungkinkan objek dengan antarmuka yang tidak cocok untuk bekerja bersama dengan menggunakan adaptor sebagai perantara.
        // Memungkinkan integrasi antara dua antarmuka yang tidak kompatibel.

        List<CatalogAdapter> catalogList = new ArrayList<>();

        catalogList.add(new BookCatalogAdapter(new Book("Pemograman Java", "Fajar")));
        catalogList.add(new BookCatalogAdapter(new Book("Pemograman PHP", "Eka")));
        catalogList.add(new BookCatalogAdapter(new Book("Pemograman Python", "Arnold")));

        catalogList.add(new SceencastCatalogAdapter(new Screencast("Tutorial PHP Pemula", "Krisna", 1000000L)));
        catalogList.add(new SceencastCatalogAdapter(new Screencast("Tutorial Java Pemula", "Danar", 2000000L)));
        catalogList.add(new SceencastCatalogAdapter(new Screencast("Tutorial Phyton Pemula", "Kasino", 3000000L)));

        catalogList.forEach(item -> System.out.println(item.getCatalogTitle()));

//        catalogList.forEach(item -> {
//            if (item instanceof Book) {
//                Book book = (Book) item;
//                System.out.println(book.getTitle() + " by " + book.getAuthor());
//            }else if (item instanceof Screencast) {
//                Screencast screencast = (Screencast) item;
//                System.out.println(screencast.getTitle() + " by " + screencast.getAuthor());
//            }
//        });
    }



}

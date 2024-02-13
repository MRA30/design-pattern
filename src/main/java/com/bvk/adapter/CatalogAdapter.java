package com.bvk.adapter;

public interface CatalogAdapter {

    String getCatalogTitle();

}

class BookCatalogAdapter implements CatalogAdapter {

    private final Book book;

    @Override
    public String getCatalogTitle() {
        return book.getTitle() + " by " + book.getAuthor();
    }

    public BookCatalogAdapter(Book book) {
        this.book = book;
    }
}

class SceencastCatalogAdapter implements CatalogAdapter {

    private final Screencast screencast;

    @Override
    public String getCatalogTitle() {
        return screencast.getTitle() + " by " + screencast.getAuthor();
    }

    public SceencastCatalogAdapter(Screencast screencast) {
        this.screencast = screencast;
    }
}

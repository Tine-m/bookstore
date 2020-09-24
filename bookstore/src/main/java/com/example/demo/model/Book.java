package com.example.demo.model;

public class Book {
    private String title;
    private int year;
    private boolean ebook;

    public Book(String title, int year, boolean ebook) {
        this.title = title;
        this.year = year;
        this.ebook = ebook;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getEbook(){
        return this.ebook;
    }

    public void setEbook(boolean ebook){
        this.ebook = ebook;
    }
}

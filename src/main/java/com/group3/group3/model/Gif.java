package com.group3.group3.model;

public class Gif {

    private String author;
    private String name;
    private String file;
    private String comment;
    private int idCategory;
    private boolean favorite;


    public Gif() {
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public Gif(String file) {
        this.file = file;
        this.name="Przykładowa nazwa";
        this.author="Przykładowy autor";
        this.comment="Przykładowy komentarz";
    }

    public Gif(String author, String name, String file, String comment) {
        this.author = author;
        this.name = name;
        this.file = file;
        this.comment = comment;
    }

    public Gif(String author, String name, String file, String comment, int idCategory, boolean favorite) {
        this.author = author;
        this.name = name;
        this.file = file;
        this.comment = comment;
        this.idCategory = idCategory;
        this.favorite = favorite;
    }


    public Gif(String author, String name, String file, String comment, int idCategory) {
        this.author = author;
        this.name = name;
        this.file = file;
        this.comment = comment;
        this.idCategory = idCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", comment='" + comment + '\'' +
                ", favorite=" + favorite +
                '}';
    }
}

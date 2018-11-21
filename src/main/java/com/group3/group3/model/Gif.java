package com.group3.group3.model;

public class Gif {

    private String author;
    private String name;
    private String file;
    private String comment;

    public Gif() {
    }

    public Gif(String file) {
        this.file = file;
        this.name="Przykładowa nazwa";
        this.author="Przykładowy autor";
        this.comment="Przykładowy komentarz";
    }

    public Gif(String author, String title, String file, String comment) {
        this.author = author;
        this.name = title;
        this.file = file;
        this.comment = comment;
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

    @Override
    public String toString() {
        return "Gif{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

}

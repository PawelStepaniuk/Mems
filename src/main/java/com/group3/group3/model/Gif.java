package com.group3.group3.model;

import com.group3.group3.dao.GifDao;

public class Gif {

    private String author;
    private String title;
    private String file;
    private String comment;

    public Gif() {
    }

    public Gif(String file) {
        this.file = file;
    }

    public Gif(String author, String title, String file, String comment) {
        this.author = author;
        this.title = title;
        this.file = file;
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                ", title='" + title + '\'' +
                ", file='" + file + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

}

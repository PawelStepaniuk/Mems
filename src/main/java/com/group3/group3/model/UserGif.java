package com.group3.group3.model;

public class User {
    private String name;
    Favorites favorites;


    public User(String name) {
        this.name = name;
        this.favorites = new Favorites(name);
    }

    public User() {
        this.name = name;
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorites favorites) {
        this.favorites = favorites;
    }

    public void addGifToFavoritesList(Gif gif){
        favorites.getFavoritesGif().add(gif);
    }
}

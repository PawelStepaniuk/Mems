package com.group3.group3.model;

import java.util.ArrayList;
import java.util.List;

public class UserGif {
    private String name;
    List<Gif> gifList;


    public UserGif(String name) {
        this.name = name;
        this.gifList = new ArrayList<>();
    }

    public void addGifToGifList(Gif gif) {
        gifList.add(gif);
    }

    public List<Gif> getAllGifs() {
        return gifList;
    }

    public List<Gif> getAllFavoriteGifs() {
        try {
            for (int i = 0; i < gifList.size(); i++) {
                if (gifList.get(i).isFavorite())
                    gifList.add(gifList.get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("UserGif.GetAllFavoriteGifs() NullPointerException");
        }
        return gifList;
    }

    public void setGifAsFavorite(Gif gif, boolean favorite) {
        gif.setFavorite(favorite);
    }

    public void setGifAsFavorite(String name, boolean favorite) {
        for (int i = 0; i < gifList.size(); i++) {
            if (gifList.get(i).getTitle().equals(name))
                gifList.get(i).setFavorite(favorite);
            else System.out.println("Użytkownik nie ma takiego gifu");
        }
    }

    public UserGif() {
        this.name = name;
        this.gifList = gifList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package com.group3.group3.model;

import com.group3.group3.dao.GifDaoImpl;
import com.group3.group3.dao.GifsFromFiles;

import java.util.ArrayList;
import java.util.List;

public class UserGif {
    private String name;
   static List<Gif> gifList = new ArrayList<>();

   public void generateExampleData(){
       GifDaoImpl gifDao = new GifDaoImpl();
       gifList.add(gifDao.generateGifs().get(0));
       gifList.add(gifDao.generateGifs().get(1));
       gifList.add(gifDao.generateGifs().get(2));
       gifList.add(gifDao.generateGifs().get(3));
       gifList.add(gifDao.generateGifs().get(4));
   }

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
       List<Gif> favoriteList = new ArrayList<>();
        try {
            for (int i = 0; i < gifList.size(); i++) {
                if (gifList.get(i).isFavorite())
                    favoriteList.add(gifList.get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("UserGif.GetAllFavoriteGifs() NullPointerException");
        }
        return favoriteList;
    }

    public void setGifAsFavorite(Gif gif, boolean favorite) {
        gif.setFavorite(favorite);
    }

    public void setGifAsFavorite(String name, boolean favorite) {
        for (int i = 0; i < gifList.size(); i++) {
            if (gifList.get(i).getName().equals(name))
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

    public List<Gif> generatedUserGifList(){
        List<Gif> gifList = new ArrayList<>();
    return gifList;
    }
}

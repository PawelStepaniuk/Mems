package com.group3.group3.dao;

import com.group3.group3.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDao {

    static List<Gif> gifList = new ArrayList<>();

    @Override
    public void add(Gif gif) {
        gifList.add(gif);
    }

    @Override
    public Gif findGif(String name) {
        Gif gif = new Gif();
        return gif;
    }

    @Override
    public List<Gif> generateGifs() {

        gifList.add(new Gif("tomasz","kodowanie","android-explosion","Konkurs", 1,true));
        gifList.add(new Gif("paweł","potem napisze","ben-and-mike","Koncert", 2,true));
        gifList.add(new Gif("ilona","cokolowiek","book-dominos","Akademia",1,true));
        gifList.add(new Gif("tomasz","kodowanie","compiler-bot","Konkurs",1));
        gifList.add(new Gif("paweł","potem napisze","cowboy-coder","Koncert", 2));
        gifList.add(new Gif("ilona","cokolowiek","infinite-andrew","Akademia", 3));
        return gifList;
    }



}


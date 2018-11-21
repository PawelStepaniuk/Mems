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
    public List<Gif> findAll() {
        return gifList;
    }

    @Override
    public List<Gif> generateGifs() {
        gifList.add(new Gif("tomasz","kodowanie","android-explosion","Konkurs"));
        gifList.add(new Gif("paweł","potem napisze","ben-and-mike","Koncert"));
        gifList.add(new Gif("ilona","cokolowiek","book-dominos","Akademia"));
        gifList.add(new Gif("tomasz","kodowanie","compiler-bot","Konkurs"));
        gifList.add(new Gif("paweł","potem napisze","cowboy-coder","Koncert"));
        gifList.add(new Gif("ilona","cokolowiek","infinite-andrew","Akademia"));
return gifList;
    }




}


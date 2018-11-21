package com.group3.group3.dao;

import com.group3.group3.model.Gif;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.group3.group3.dao.GifDaoImpl.gifList;

public class GifsFromFiles implements GifDao {
    static List<Gif> gifList = new ArrayList<>();
    @Override
    public void add(Gif gif) {

    }

    @Override
    public List<Gif> findAll() {
        return gifList;
    }

    @Override
    public List<Gif> generateGifs() {
        List<Gif> fileList = new ArrayList<>();

        return fileList;
    }

    public List<String> fileList(){
        File f = new File("src\\main\\resources\\static\\gifs");
        List<String> fileList = new ArrayList<>();

        for (int i = 0; i < f.list().length; i++) {
            if (f.list()[i].endsWith(".gif")) {
                fileList.add(f.list()[i]);
            }
        }
        return fileList;
    }

    public List<Gif> gifsFromFile(){

        for (int i = 0; i < fileList().size(); i++) {
           findAll().add(new Gif(fileList().get(i)));
        }
        return gifList;
    }

}


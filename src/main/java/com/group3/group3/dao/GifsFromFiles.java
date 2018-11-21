package com.group3.group3.dao;

import com.group3.group3.model.Gif;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.group3.group3.dao.GifDaoImpl.gifList;
//Klasa odpowiada za odczytanie plików z folderu Gifs
public class GifsFromFiles implements GifDao {
    static List<Gif> gifList = new ArrayList<>();

    @Override
    public void add(Gif gif) {

    }

    @Override
    public List<Gif> findAll() {
        return gifList;
    }


    //Pobieramy nazwy plików z katalogu gifs, sprawdzamy rozszerzenie, jeżeli plik jest rozszerzenia .gif to z nazwy
    //pliku usuwany rozszerzenie i dodajemy do listy
    @Override
    public List<Gif> generateGifs() {
        List<Gif> nameList = new ArrayList<>();
        File f = new File("src\\main\\resources\\static\\gifs");

        for (int i = 0; i < f.list().length; i++) {
            if (f.list()[i].endsWith(".gif")) {
                int len = f.list()[i].length();
                String nameGif = f.list()[i].substring(0, len - 4);
                nameList.add(new Gif(nameGif));
            }

        }
        return nameList;
    }

}


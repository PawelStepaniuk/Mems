package com.group3.group3.dao;

import com.group3.group3.model.Gif;
import lombok.Builder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static com.group3.group3.dao.GifDaoImpl.gifList;

//Klasa odpowiada za odczytanie plików z folderu Gifs
public class GifsFromFiles implements GifDao {
    static List<Gif> gifList = new ArrayList<>();

    @Override
    public void add(Gif gif) {

    }

    //Pobieramy nazwy plików z katalogu gifs, sprawdzamy rozszerzenie, jeżeli plik jest rozszerzenia .gif to z nazwy
    //pliku usuwany rozszerzenie i dodajemy do listy
    @Override
    public List<Gif> generateGifs() {
        List<Gif> nameList = new ArrayList<>();
        File f = new File("src\\main\\resources\\static\\gifs");
        try {
            for (int i = 0; i < f.list().length; i++) {
                if (f.list()[i].endsWith(".gif")) {
                    int len = f.list()[i].length();
                    String nameGif = f.list()[i].substring(0, len - 4);
                    nameList.add(new Gif(nameGif));
                }

            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "Folder jest pusty");
        }
        return nameList;
    }
        @Override
    public Gif findGif(String name) {
        Gif foundGif = new Gif();
        try {
            for (int i = 0; i < generateGifs().size(); i++) {
                if (generateGifs().get(i).getFile().equals(name)) {
                    foundGif = generateGifs().get(i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "NullPointerException founded");
        }
        return foundGif;
    }

}


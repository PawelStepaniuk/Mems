package com.group3.group3.controller;


import com.group3.group3.dao.CategoryDaoImpl;
import com.group3.group3.dao.GifDaoImpl;
import com.group3.group3.dao.GifsFromFiles;
import com.group3.group3.model.Category;
import com.group3.group3.model.Gif;
import com.group3.group3.model.UserGif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
// Po wpisaniu ścieżki głównej wyświetla wszystkie memy. Warto skorzystać z pliku home.html
// Powinien zostać utworzony model Gif oraz interfejs GifDao,
// który zwraca statyczną nazwę plików z katalogu gifs. Zaprojektować tak rozwiązanie,
// aby w przyszłości można było w łatwy sposób przejść na Spring JPA.

@Controller
public class HomeController {

    // CategoryDaoImpl category = new CategoryDaoImpl();

    private GifDaoImpl gifDao = new GifDaoImpl();
    private GifsFromFiles gifsFromFiles = new GifsFromFiles();
    private UserGif userGif = new UserGif();
    static List<Category> category = new CategoryDaoImpl().generateCategories();
    CategoryDaoImpl categoryFromImpl = new CategoryDaoImpl();




    @GetMapping("/categories")
    public String showCategories(ModelMap map) {
        map.addAttribute("categories", category);
        return "categories";
    }

    @GetMapping("/")
    public String home(ModelMap map) {

        map.put("gifs", gifsFromFiles.generateGifs());
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gif(@PathVariable String name, ModelMap map) {


        Gif gif = gifsFromFiles.findGif(name);
        map.put("gif", gif);
        return "gif";
    }

    @GetMapping("/category/{id}")
        public String categoryById(@PathVariable int id, ModelMap map) {
        Category category = categoryFromImpl.generateCategories().get(id);
        List<Gif> listGif = new GifDaoImpl().generateGifs();
        List<Gif> newListGif = new ArrayList<>();

        for(int i = 0; i < listGif.size(); i++){
            if(listGif.get(i).getIdCategory() == id)
            {
                newListGif.add(listGif.get(i));
            }
        }
        map.put("category", category);
        map.put("gif", newListGif);
        return "category";
    }


    @GetMapping("/favorites")
    public String favorites(ModelMap map, String userName) {

        map.put("gifs", userGif.getAllFavoriteGifs());
        return "favorites";
    }



}





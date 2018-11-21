package com.group3.group3.controller;

import com.group3.group3.dao.CategoryDaoImpl;
import com.group3.group3.dao.GifDao;
import com.group3.group3.dao.GifDaoImpl;
import com.group3.group3.dao.GifsFromFiles;

import com.group3.group3.model.Category;
import com.group3.group3.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;



import java.util.List;
// Po wpisaniu ścieżki głównej wyświetla wszystkie memy. Warto skorzystać z pliku home.html
// Powinien zostać utworzony model Gif oraz interfejs GifDao,
// który zwraca statyczną nazwę plików z katalogu gifs. Zaprojektować tak rozwiązanie,
// aby w przyszłości można było w łatwy sposób przejść na Spring JPA.

@Controller
public class HomeController {

    GifsFromFiles gifsFromFiles = new GifsFromFiles();
   // CategoryDaoImpl category = new CategoryDaoImpl();
    static List<Category> category = new CategoryDaoImpl().generateCategories();



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
    public String gif(@PathVariable String name, ModelMap map){

        Gif gif = gifsFromFiles.findGif(name);
     //   System.out.println("Szukamy gifu o nazwie "+ name + " i znalazło: " + gif.toString());
     //   System.out.println("----------------------");
     //   System.out.println("Gif który przekazujemy do html"+gif.toString());
        map.put("gif",gif);
        return "gif";

    }
}

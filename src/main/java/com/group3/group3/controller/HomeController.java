package com.group3.group3.controller;

import com.group3.group3.dao.GifDao;
import com.group3.group3.dao.GifDaoImpl;
import com.group3.group3.dao.GifsFromFiles;
import com.group3.group3.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
// Po wpisaniu ścieżki głównej wyświetla wszystkie memy. Warto skorzystać z pliku home.html
// Powinien zostać utworzony model Gif oraz interfejs GifDao,
// który zwraca statyczną nazwę plików z katalogu gifs. Zaprojektować tak rozwiązanie,
// aby w przyszłości można było w łatwy sposób przejść na Spring JPA.

@Controller
public class HomeController {

   // List<Gif> gifs = new GifDaoImpl().generateGifs();
   GifsFromFiles gifsFromFiles = new GifsFromFiles();

    @GetMapping("/")
    public String home(ModelMap map) {

        map.put("gifs",gifsFromFiles.generateGifs());
        return "home";
    }

}

// Memy powinny być wyświetlone z katalogu Gifs.
//        Po wpisaniu ścieżki głównej wyświetla wszystkie memy. Warto skorzystać z pliku home.html
//        Powinien zostać utworzony model Gif oraz interfejs GifDao, który zwraca statyczną nazwę
// plików z katalogu gifs. Zaprojektować tak rozwiązanie, aby w przyszłości można było w łatwy sposób przejść na Spring JPA.

package com.group3.group3.dao;

import com.group3.group3.model.Gif;

import java.util.List;

public interface GifDao {
    void add(Gif gif);
    List<Gif> findAll();
    List<Gif> generateGifs();
}


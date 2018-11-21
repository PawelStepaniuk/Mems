package com.group3.group3.dao;

import com.group3.group3.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    static List<Category> listCategories = new ArrayList<>();

    @Override
    public void add(Category category) {
        listCategories.add(category);
    }

    @Override
    public List<Category> findAll() {
        return listCategories;
    }

    @Override
    public List<Category> generateCategories() {
        listCategories.add(new Category(1L, "Android"));
        listCategories.add(new Category(2L, "Funny"));
        listCategories.add(new Category(3L, "Programming"));
        return listCategories;
    }

    public List<Category> returnList(){
        return listCategories;
    }

}

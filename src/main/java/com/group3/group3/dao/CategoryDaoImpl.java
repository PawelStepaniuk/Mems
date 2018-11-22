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
        listCategories.add(new Category(1, "Android"));
        listCategories.add(new Category(2, "Funny"));
        listCategories.add(new Category(3, "Programming"));
        return listCategories;
    }

    public List<Category> returnList(){
        return listCategories;
    }


    public Category findCategory(int id) {
        Category foundCategory = new Category();
        try {
            for (int i = 0; i < generateCategories().size(); i++) {
                if (generateCategories().get(i).getId() == id) {
                    foundCategory = generateCategories().get(i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "NullPointerException founded");
        }
        return foundCategory;
    }


}

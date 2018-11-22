package com.group3.group3.dao;

import com.group3.group3.model.Category;

import java.util.List;

public interface CategoryDao {

        void add(Category category);
        List<Category> findAll();
        List<Category> generateCategories();


}

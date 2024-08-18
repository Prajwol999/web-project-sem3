package com.example.prajwol.service;
import com.example.prajwol.entity.Category;
import com.example.prajwol.pojo.CategoryPojo;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    void saveCategory(CategoryPojo categoryPojo);

    List<Category> getAllData();

    Optional<Category> getById(Integer id);

    void deleteById(Integer id);
}

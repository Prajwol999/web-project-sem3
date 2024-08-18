package com.example.prajwol.service.impl;

import com.example.prajwol.entity.Category;
import com.example.prajwol.pojo.CategoryPojo;
import com.example.prajwol.repository.CategoryRepository;
import com.example.prajwol.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public void saveCategory(CategoryPojo categoryPojo) {

        Category category = new Category();

        if(categoryPojo.getId()!=null){
            category=categoryRepository.findById(categoryPojo.getId())
                    .orElseThrow(()-> new NoSuchElementException("No data found"));
        }

        category.setCategoryName(categoryPojo.getCategoryName());

        category.setCategoryDescription(categoryPojo.getCategoryDescription());


        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllData() {
        return categoryRepository.findAll(); // select * from users
    }

    @Override
    public Optional<Category> getById(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        categoryRepository.deleteById(id);
    }
}


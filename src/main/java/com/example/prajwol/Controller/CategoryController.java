package com.example.prajwol.Controller;
import com.example.prajwol.entity.Category;
import com.example.prajwol.pojo.CategoryPojo;
import com.example.prajwol.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/category")
@RestController
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/save")
    public String saveCategory(@Valid @RequestBody CategoryPojo categoryPojo){
        categoryService.saveCategory(categoryPojo);
        return "data created successfully";
    }

    @GetMapping("/getAll")
    public List<Category> getAllData(){
        return categoryService.getAllData();
    }

    @GetMapping("/getById/{id}")
    public Optional<Category> getDataBtId(@PathVariable("id") Integer id){
        return categoryService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        categoryService.deleteById(id);
    }

}

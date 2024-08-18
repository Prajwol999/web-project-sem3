package com.example.prajwol.service;
import com.example.prajwol.entity.Brand;
import com.example.prajwol.pojo.BrandPojo;

import java.util.List;
import java.util.Optional;


public interface BrandService {
    void saveBrand(BrandPojo brandPojo);

    List<Brand> getAllData();

    Optional<Brand> getById(Integer id);

    void deleteById(Integer id);
    List<Brand> searchByName(String brandName);
}

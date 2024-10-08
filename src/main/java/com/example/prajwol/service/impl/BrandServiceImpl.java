package com.example.prajwol.service.impl;

import com.example.prajwol.entity.Brand;
import com.example.prajwol.pojo.BrandPojo;
import com.example.prajwol.repository.BrandRepository;
import com.example.prajwol.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    @Override
    public void saveBrand(BrandPojo brandPojo) {

        Brand brand = new Brand();

        if(brandPojo.getId()!=null){
            brand=brandRepository.findById(brandPojo.getId())
                    .orElseThrow(()-> new NoSuchElementException("No data found"));
        }

        brand.setBrandName(brandPojo.getBrandName());

        brand.setBrandDescription(brandPojo.getBrandDescription());


        brandRepository.save(brand);
    }

    @Override
    public List<Brand> getAllData() {
        return brandRepository.findAll(); // select * from users
    }

    @Override
    public Optional<Brand> getById(Integer id) {
        return brandRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        brandRepository.deleteById(id);
    }

    @Override
    public List<Brand> searchByName(String brandName) {
        return null;
    }
}


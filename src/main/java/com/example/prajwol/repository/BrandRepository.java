package com.example.prajwol.repository;
import com.example.prajwol.entity.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
    Optional<Brand> findByBrandName(String name);


}

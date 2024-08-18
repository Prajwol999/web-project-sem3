package com.example.prajwol.repository;
import com.example.prajwol.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    Optional<Category> findByCategoryName(String name);

}

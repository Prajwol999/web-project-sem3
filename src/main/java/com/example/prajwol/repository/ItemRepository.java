package com.example.prajwol.repository;

import com.example.prajwol.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    List<Item> findByItemNameIgnoreCase(String name);

    List<Item> getItemsByBrandBrandName(String brandName);

    List<Item> getItemsByCategoryCategoryName(String categoryName);
}

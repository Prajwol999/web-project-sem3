package com.example.prajwol.repository;

import com.example.prajwol.entity.WishlistItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WishlistItemRepository extends JpaRepository<WishlistItem, Integer> {

    List<WishlistItem>  findByUserId(Integer userId);
}


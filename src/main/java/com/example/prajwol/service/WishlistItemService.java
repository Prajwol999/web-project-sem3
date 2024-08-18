package com.example.prajwol.service;

import com.example.prajwol.entity.WishlistItem;
import com.example.prajwol.pojo.WishlistItemPojo;
import java.util.List;
import java.util.Optional;

public interface WishlistItemService {

    void saveWishlistItem(WishlistItemPojo wishlistItemPojo);

    List<WishlistItem> findAll();


    Optional<WishlistItem> findById(Integer id);

    List<WishlistItem> findByUserId(Integer userId);


    void deleteById(Integer id);
}



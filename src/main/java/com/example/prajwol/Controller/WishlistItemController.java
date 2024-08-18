package com.example.prajwol.Controller;

import com.example.prajwol.entity.WishlistItem;
import com.example.prajwol.pojo.WishlistItemPojo;
import com.example.prajwol.service.WishlistItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/wishlist-item")
@RestController
@RequiredArgsConstructor
public class WishlistItemController {
    private final WishlistItemService wishlistItemService;

    @PostMapping("/save")
    public String saveWishlistItem(@Valid @RequestBody WishlistItemPojo wishlistItemPojo){
        wishlistItemService.saveWishlistItem(wishlistItemPojo);
        return "data created successfully yoh wishlist-item";
    }
    @GetMapping("/getAll")
    public List<WishlistItem> findAll(){
        return wishlistItemService.findAll();
    }

    @GetMapping("/getByUserId/{userId}")
    public List<WishlistItem> findByUserId(@PathVariable("userId") Integer userId) {
        return wishlistItemService.findByUserId(userId);
    }

    @GetMapping("/getById/{id}")
    public Optional<WishlistItem> findById(@PathVariable("id") Integer id){
        return wishlistItemService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        wishlistItemService.deleteById(id);
    }

}



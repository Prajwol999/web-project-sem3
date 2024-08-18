package com.example.prajwol.pojo;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class WishlistItemPojo {
    private Integer id;
    @NotNull
    private Integer itemId;
    @NotNull
    private Integer userId;
}
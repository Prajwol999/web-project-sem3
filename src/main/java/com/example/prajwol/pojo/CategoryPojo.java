package com.example.prajwol.pojo;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CategoryPojo {
    private Integer id;
    @NotEmpty
    private String categoryName;
    @NotEmpty
    private String categoryDescription;
}

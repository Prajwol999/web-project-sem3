package com.example.prajwol.pojo;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BrandPojo {
    private Integer id;
    @NotEmpty
    private String brandName;
    @NotEmpty
    private String brandDescription;
}

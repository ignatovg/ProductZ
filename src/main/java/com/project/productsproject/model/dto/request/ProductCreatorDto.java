package com.project.productsproject.model.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCreatorDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Long categoryId;
}

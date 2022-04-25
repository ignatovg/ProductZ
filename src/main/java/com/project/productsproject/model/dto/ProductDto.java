package com.project.productsproject.model.dto;

import com.project.productsproject.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;

    public ProductDto(Product product) {
        setId(product.getId());
        setTitle(product.getTitle());
        setDescription(product.getDescription());
        setPrice(product.getPrice());
    }
}

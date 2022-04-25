package com.project.productsproject.service;

import com.project.productsproject.model.dto.ProductDto;
import com.project.productsproject.model.dto.request.ProductCreatorDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductsForCategory(Long categoryId);

    List<ProductDto> getAllProductsForCategoryTitle(String title);

    ProductDto createProduct(ProductCreatorDto product);
}

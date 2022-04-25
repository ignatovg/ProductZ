package com.project.productsproject.service;

import com.project.productsproject.model.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryDto createCategory(CategoryDto category);
}

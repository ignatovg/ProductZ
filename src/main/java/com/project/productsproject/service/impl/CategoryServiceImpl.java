package com.project.productsproject.service.impl;

import com.project.productsproject.model.Category;
import com.project.productsproject.model.dto.CategoryDto;
import com.project.productsproject.repository.CategoryRepository;
import com.project.productsproject.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(CategoryDto::new).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public CategoryDto createCategory(CategoryDto category) {
        Category category1 = Category.builder()
                .title(category.getTitle())
                .build();
        return new CategoryDto(categoryRepository.save(category1));
    }
}

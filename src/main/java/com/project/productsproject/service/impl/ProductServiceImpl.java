package com.project.productsproject.service.impl;

import com.project.productsproject.model.Product;
import com.project.productsproject.model.dto.ProductDto;
import com.project.productsproject.model.dto.request.ProductCreatorDto;
import com.project.productsproject.repository.CategoryRepository;
import com.project.productsproject.repository.ProductRepository;
import com.project.productsproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductDto::new).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getAllProductsForCategory(Long categoryId) {
        return null;
    }

    @Override
    public List<ProductDto> getAllProductsForCategoryTitle(String title) {
        return null;
    }

    @Override
    public ProductDto createProduct(ProductCreatorDto product) {
        Product product1 = Product.builder()
                .title(product.getTitle())
                .description(product.getDescription())
                .price(product.getPrice())
                .category(categoryRepository.getById(product.getCategoryId()))
                .build();
        return new ProductDto(productRepository.save(product1));
    }
}

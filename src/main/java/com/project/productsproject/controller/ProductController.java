package com.project.productsproject.controller;

import com.project.productsproject.model.dto.ProductDto;
import com.project.productsproject.model.dto.request.ProductCreatorDto;
import com.project.productsproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductCreatorDto productCreatorDto) {
        return productService.createProduct(productCreatorDto);
    }
}

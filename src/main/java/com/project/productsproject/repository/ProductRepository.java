package com.project.productsproject.repository;

import com.project.productsproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryId(long id);

    List<Product> findAllByCategoryTitle(String title);
}

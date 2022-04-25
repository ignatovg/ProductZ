package com.project.productsproject.model.dto;

import com.project.productsproject.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String title;
    private String createdBy;

    public CategoryDto(Category category) {
        setId(category.getId());
        setTitle(category.getTitle());
        setCreatedBy(null);
    }
}

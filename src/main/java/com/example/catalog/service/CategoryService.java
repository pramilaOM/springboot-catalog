package com.example.catalog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.catalog.dto.CategoryRequestDTO;
import com.example.catalog.dto.CategoryResponseDTO;
import com.example.catalog.entity.Category;
import com.example.catalog.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryResponseDTO createCategory(CategoryRequestDTO dto) {
        if (categoryRepository.existsByName(dto.getName())) {
            throw new IllegalArgumentException("Category with this name already exists.");
        }

        Category category = Category.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .build();

        Category saved = categoryRepository.save(category);

        return new CategoryResponseDTO(saved.getId(), saved.getName(), saved.getDescription());
    }

    public List<CategoryResponseDTO> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(cat -> new CategoryResponseDTO(cat.getId(), cat.getName(), cat.getDescription()))
                .collect(Collectors.toList());
    }
}

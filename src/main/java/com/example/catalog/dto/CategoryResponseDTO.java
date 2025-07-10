package com.example.catalog.dto;
// @NoArgsConstructor
// @AllArgsConstructor
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private String description;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryResponseDTO(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
}

 public CategoryResponseDTO(){
    
 }
}

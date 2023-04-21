package by.dubrovsky.backendspringboot.controller;

import by.dubrovsky.backendspringboot.entity.CategoryEntity;
import by.dubrovsky.backendspringboot.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/test")
    public List<CategoryEntity> test() {
        List<CategoryEntity> list = categoryRepository.findAll();
        System.out.println("list = " + list);
        return list;
    }
}

package by.dubrovsky.backendspringboot.service;

import by.dubrovsky.backendspringboot.entity.CategoryEntity;
import by.dubrovsky.backendspringboot.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryEntity add(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    public CategoryEntity update(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<CategoryEntity> findByTitle(String title) {
        return categoryRepository.findByTitle(title);
    }

    public CategoryEntity findById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public List<CategoryEntity> findAll() {
        return categoryRepository.findAllByOrderByTitleAsc();
    }
}

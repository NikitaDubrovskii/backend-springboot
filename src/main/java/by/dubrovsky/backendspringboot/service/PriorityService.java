package by.dubrovsky.backendspringboot.service;

import by.dubrovsky.backendspringboot.entity.PriorityEntity;
import by.dubrovsky.backendspringboot.repository.PriorityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PriorityService {
    private final PriorityRepository priorityRepository;

    public PriorityService(PriorityRepository PriorityRepository) {
        this.priorityRepository = PriorityRepository;
    }

    public PriorityEntity add(PriorityEntity category) {
        return priorityRepository.save(category);
    }

    public PriorityEntity update(PriorityEntity category) {
        return priorityRepository.save(category);
    }

    public void deleteById(Long id) {
        priorityRepository.deleteById(id);
    }

    public List<PriorityEntity> findByTitle(String title) {
        return priorityRepository.findByTitle(title);
    }

    public PriorityEntity findById(Long id) {
        return priorityRepository.findById(id).get();
    }

    public List<PriorityEntity> findAll() {
        return priorityRepository.findAllByOrderByIdAsc();
    }
}

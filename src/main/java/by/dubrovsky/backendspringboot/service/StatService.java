package by.dubrovsky.backendspringboot.service;

import by.dubrovsky.backendspringboot.entity.StatEntity;
import by.dubrovsky.backendspringboot.repository.StatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StatService {
    private final StatRepository statRepository;

    public StatService(StatRepository statRepository) {
        this.statRepository = statRepository;
    }

    public StatEntity findById(Long id) {
        return statRepository.findById(id).get();
    }
}

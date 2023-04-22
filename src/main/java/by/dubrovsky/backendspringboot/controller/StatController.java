package by.dubrovsky.backendspringboot.controller;

import by.dubrovsky.backendspringboot.entity.StatEntity;
import by.dubrovsky.backendspringboot.repository.StatRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stat")
public class StatController {

    private StatRepository statRepository;

    private final Long defaultId = 1L;

    public StatController(StatRepository statRepository) {
        this.statRepository = statRepository;
    }

    @GetMapping()
    public ResponseEntity<StatEntity> findById() {
        return ResponseEntity.ok(statRepository.findById(defaultId).get());
    }

}

package by.dubrovsky.backendspringboot.controller;

import by.dubrovsky.backendspringboot.entity.StatEntity;
import by.dubrovsky.backendspringboot.service.StatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stat")
public class StatController {

    private final StatService statService;

    private final Long defaultId = 1L;

    public StatController(StatService statService) {
        this.statService = statService;
    }

    @GetMapping()
    public ResponseEntity<StatEntity> findById() {
        return ResponseEntity.ok(statService.findById(defaultId));
    }

}

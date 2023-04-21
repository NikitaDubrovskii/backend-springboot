package by.dubrovsky.backendspringboot.controller;

import by.dubrovsky.backendspringboot.entity.PriorityEntity;
import by.dubrovsky.backendspringboot.repository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityController {

    private PriorityRepository priorityRepository;

    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @GetMapping("/test")
    public List<PriorityEntity> test() {
        List<PriorityEntity> list = priorityRepository.findAll();
        System.out.println("list = " + list);
        return list;
    }

}

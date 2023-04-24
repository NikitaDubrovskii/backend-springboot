package by.dubrovsky.backendspringboot.service;

import by.dubrovsky.backendspringboot.entity.TaskEntity;
import by.dubrovsky.backendspringboot.repository.TaskRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskEntity add(TaskEntity task) {
        return taskRepository.save(task);
    }

    public TaskEntity update(TaskEntity task) {
        return taskRepository.save(task);
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

    public Page<TaskEntity> findByParams(String text, Integer completed, Long priorityId, Long categoryId, PageRequest paging) {
        return taskRepository.findByParams(text, completed, priorityId, categoryId, paging);
    }

    public TaskEntity findById(Long id) {
        return taskRepository.findById(id).get();
    }
}

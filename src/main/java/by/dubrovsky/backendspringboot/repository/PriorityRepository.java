package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.CategoryEntity;
import by.dubrovsky.backendspringboot.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriorityRepository extends JpaRepository<PriorityEntity, Long> {

    List<PriorityEntity> findAllByOrderByIdAsc();

}

package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends JpaRepository<PriorityEntity, Long> {

}

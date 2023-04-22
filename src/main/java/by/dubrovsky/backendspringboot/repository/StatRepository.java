package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.StatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends JpaRepository<StatEntity, Long> {
}

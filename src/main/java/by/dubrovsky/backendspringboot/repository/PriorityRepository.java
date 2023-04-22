package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriorityRepository extends JpaRepository<PriorityEntity, Long> {

    List<PriorityEntity> findAllByOrderByIdAsc();

    @Query("SELECT p FROM PriorityEntity p WHERE " +
            "(:title IS NULL OR :title='' OR LOWER(p.title) LIKE LOWER(CONCAT('%', :title, '%'))) " +
            "ORDER BY p.title ASC")
    List<PriorityEntity> findByTitle(@Param("title") String title);

}

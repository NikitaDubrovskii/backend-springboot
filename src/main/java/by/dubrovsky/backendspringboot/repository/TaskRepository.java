package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.TaskEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    @Query("SELECT t FROM TaskEntity t WHERE " +
            "(:title IS NULL OR :title='' OR LOWER(t.title) LIKE LOWER(CONCAT('%', :title, '%'))) AND " +
            "(:completed IS NULL OR t.completed=:completed) AND " +
            "(:priorityId IS NULL OR t.priorityId=:priorityId) AND " +
            "(:categoryId IS NULL OR t.categoryId=:categoryId)")
    Page<TaskEntity> findByParams(@Param("title") String title,
                                  @Param("completed") Integer completed,
                                  @Param("priorityId") Long priorityId,
                                  @Param("categoryId") Long categoryId,
                                  Pageable pageable);
}

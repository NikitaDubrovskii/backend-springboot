package by.dubrovsky.backendspringboot.repository;

import by.dubrovsky.backendspringboot.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    List<CategoryEntity> findAllByOrderByTitleAsc();

    @Query("SELECT c FROM CategoryEntity c WHERE " +
            "(:title IS NULL OR :title='' OR LOWER(c.title) LIKE LOWER(CONCAT('%', :title, '%'))) " +
            "ORDER BY c.title ASC")
    List<CategoryEntity> findByTitle(@Param("title") String title);

}

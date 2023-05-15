package by.dubrovsky.backendspringboot.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category", schema = "public", catalog = "todo_db")
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "completed_count")
    private Long completedCount;
    @Basic
    @Column(name = "uncompleted_count")
    private Long uncompletedCount;
}
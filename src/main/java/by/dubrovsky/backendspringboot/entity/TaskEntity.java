package by.dubrovsky.backendspringboot.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "task", schema = "public", catalog = "todo_db")
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class TaskEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "completed")
    private Integer completed;
    @Basic
    @Column(name = "date_time")
    private Date dateTime;
    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    private PriorityEntity priorityId;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity categoryId;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCompleted() {
        return completed;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public PriorityEntity getPriorityId() {
        return priorityId;
    }

    public CategoryEntity getCategoryId() {
        return categoryId;
    }
}

package by.dubrovsky.backendspringboot.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "priority", schema = "public", catalog = "todo_db")
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class PriorityEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "color")
    private String color;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }
}
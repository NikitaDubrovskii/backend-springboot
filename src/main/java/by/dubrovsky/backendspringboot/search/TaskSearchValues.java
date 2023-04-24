package by.dubrovsky.backendspringboot.search;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TaskSearchValues {
    private String title;
    private Integer completed;
    private Long priorityId;
    private Long categoryId;
}

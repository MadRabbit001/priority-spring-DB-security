package madrabbit.priority.priorityspring.pojo;

import jakarta.persistence.*;
import lombok.*;
import madrabbit.priority.priorityspring.pojo.enums.SolutionType;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Content{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Solution;
    @Enumerated(EnumType.STRING)
    private SolutionType solutionType;



}

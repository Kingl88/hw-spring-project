package by.it.academy.spring.homework.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"department"})
@ToString(exclude = {"department"})
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @CreationTimestamp
    private LocalDateTime date;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;
}

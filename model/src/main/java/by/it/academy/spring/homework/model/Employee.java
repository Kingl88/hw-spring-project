package by.it.academy.spring.homework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
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
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) @JoinColumn(name = "departmentId")
    @JsonIgnore
    private Department department;

}
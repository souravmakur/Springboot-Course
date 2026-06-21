package Employee.App.Springboot.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity //ths will tell the hibernate that this class is what you need to convert it into a db
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class EmployeeEntity {
    @Id //this will automatically generate an id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Email;
    private Integer Age;
    private LocalDate DateOfJoining;
    private Boolean IsActive;


}

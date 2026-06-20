package Employee.App.Springboot.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private Long id;
    private String Name;
    private String Email;
    private Integer Age;
    private LocalDate DateOfJoining;
    private Boolean IsActive;

    public EmployeeDto() {

    }

    public EmployeeDto(Long id, Boolean isActive, Integer age, LocalDate dateOfJoining, String email, String name) {
        this.id = id;
        IsActive = isActive;
        Age = age;
        DateOfJoining = dateOfJoining;
        Email = email;
        Name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return Email;
    }

    public Integer getAge() {
        return Age;
    }

    public LocalDate getDateOfJoining() {
        return DateOfJoining;
    }

    public Boolean getActive() {
        return IsActive;
    }
}

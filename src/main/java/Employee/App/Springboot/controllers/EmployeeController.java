package Employee.App.Springboot.controllers;

import Employee.App.Springboot.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path ="/employees")
public class EmployeeController {

    @GetMapping(path = "/employees/{employeeId}")
    public EmployeeDto getEmployeeId(@PathVariable Long employeeId) {
        return new EmployeeDto(employeeId, true, 23, LocalDate.of(2025, 11, 20), "sourav@example.com", "Sourav Makur");
    }
    @GetMapping(path = "/employees")
    public String getEmployees(@RequestParam Integer age,
                               @RequestParam String sortBy){
        return "Hi my age is " + age + " " + sortBy;
    }

    @PostMapping
    public String createNewEmployee() {
        return "Hello From Post";
    }
}
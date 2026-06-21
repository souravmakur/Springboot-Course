package Employee.App.Springboot.controllers;

import Employee.App.Springboot.dto.EmployeeDto;
import Employee.App.Springboot.entities.EmployeeEntity;
import Employee.App.Springboot.repository.EmployeeRepository;
import Employee.App.Springboot.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping
    public List<EmployeeDto> getAllEmployees(@RequestParam(required = false , name = "inputAge") Integer age,
                                                @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }
}
package Employee.App.Springboot.services;

import Employee.App.Springboot.dto.EmployeeDto;
import Employee.App.Springboot.entities.EmployeeEntity;
import Employee.App.Springboot.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    // Functions:-

    public EmployeeDto getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDto.class);
    }

    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    public EmployeeDto createNewEmployee(EmployeeDto inputEmployee) {
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(toSaveEntity);
        return modelMapper.map(savedEmployeeEntity, EmployeeDto.class);
    }
}
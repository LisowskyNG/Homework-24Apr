package pro.sky.Homework24Apr;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee max(int dept) {
        return (Employee) employeeService.getEmployees();
        .stream()

    }




}

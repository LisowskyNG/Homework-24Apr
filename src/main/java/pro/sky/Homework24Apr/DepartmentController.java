package pro.sky.Homework24Apr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")

public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public Employee max(@RequestParam int departmentId) {
        return service.max(departmentId);

    }

    @GetMapping("/min-salary")
    public Employee min(@RequestParam int departmentId) {
        return service.min(departmentId);
    }

    @GetMapping(value = "/all", params = "departmentId")
    public Collection<Employee> allByDebt(@RequestParam int departmentId) {
        return service.allByDebt(departmentId);

    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> all(){
        return service.all();
    }


}

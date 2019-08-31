package tws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    @GetMapping("")
//    public ResponseEntity<List<Employee>> getAll() {
//        return ResponseEntity.ok(employeeMapper.selectAll());
//    }
//
//    @PostMapping("")
//    public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
//        employeeMapper.insert(employee);
//        return ResponseEntity.created(URI.create("/employees/" + employee.getId())).body(employee);
//    }
}


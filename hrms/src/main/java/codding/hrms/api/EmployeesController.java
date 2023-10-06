package codding.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codding.hrms.business.abstracts.EmployeeService;
import codding.hrms.entities.concretes.Employee;
import codding.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/emplooyes")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAll")
	List<Employee> getAll(){
		return this.employeeService.getAll();
	}
	
}

package codding.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codding.hrms.business.abstracts.EmployeeService;
import codding.hrms.dataAccess.abstracts.EmployeeDao;
import codding.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}



	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

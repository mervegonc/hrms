package codding.hrms.business.abstracts;

import java.util.List;

import codding.hrms.entities.concretes.Employer;
import codding.hrms.entities.concretes.User;

public interface EmployerService {
	List<Employer> getAll();
}

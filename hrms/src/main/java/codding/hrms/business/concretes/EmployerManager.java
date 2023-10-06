package codding.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codding.hrms.business.abstracts.EmployerService;
import codding.hrms.dataAccess.abstracts.EmployerDao;
import codding.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDAo;
	
	@Autowired
	public EmployerManager(EmployerDao employerDAo) {
		super();
		this.employerDAo = employerDAo;
	}


	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

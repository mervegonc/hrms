package codding.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codding.hrms.business.abstracts.NewWorkerService;
import codding.hrms.dataAccess.abstracts.NewWorkerDao;
import codding.hrms.entities.concretes.NewWorker;

@Service
public class NewWorkerManager implements NewWorkerService{

	private NewWorkerDao newWorkerDao;
	
	
	
	@Autowired
	public NewWorkerManager(NewWorkerDao newWorkerDao) {
		super();
		this.newWorkerDao = newWorkerDao;
	}




	@Override
	public List<NewWorker> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

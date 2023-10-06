package codding.hrms.business.abstracts;

import java.util.List;

import codding.hrms.entities.concretes.NewWorker;
import codding.hrms.entities.concretes.User;

public interface NewWorkerService {
	List<NewWorker> getAll();
}

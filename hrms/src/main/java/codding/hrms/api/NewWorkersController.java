package codding.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codding.hrms.business.abstracts.NewWorkerService;
import codding.hrms.entities.concretes.NewWorker;
import codding.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/newWorkers")
public class NewWorkersController {

	private NewWorkerService newWorkerService;

	@Autowired
	public NewWorkersController(NewWorkerService newWorkerService) {
		super();
		this.newWorkerService = newWorkerService;
	}
	
	@GetMapping("/getAll")
	List<NewWorker> getAll(){
		return this.newWorkerService.getAll();
	}
}

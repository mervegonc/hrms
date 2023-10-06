package codding.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codding.hrms.entities.concretes.NewWorker;

public interface NewWorkerDao extends JpaRepository<NewWorker, Integer>{

}

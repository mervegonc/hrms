package codding.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codding.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}

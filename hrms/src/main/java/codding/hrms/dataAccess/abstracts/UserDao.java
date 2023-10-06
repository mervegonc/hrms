package codding.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codding.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}

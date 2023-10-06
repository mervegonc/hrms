package codding.hrms.business.abstracts;

import java.util.List;

import codding.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}

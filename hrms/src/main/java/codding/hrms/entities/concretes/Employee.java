package codding.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	int userId;
	@Column(name = "employeeId")
	int employeeId;
	@Column(name = "firstName")
	String firstName;
	@Column(name = "lastName")
	String lastName;
	
}

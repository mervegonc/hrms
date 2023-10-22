package codding.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakartq.persistence.Id;
import jakarta.persistence.Table;

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

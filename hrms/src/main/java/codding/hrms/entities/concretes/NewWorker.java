package codding.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "newWorker")
public class NewWorker {

	@Id
	@GeneratedValue
    @Column(name = "userId")
	int userId;
	@Column(name = "newWorkerId")
	int newWorkerId;
	@Column(name = "identityNumber")
	int identityNumber;
	@Column(name = "newWorkerRegisterId")
	int newWorkerRegisterId;
	@Column(name = "firstName")
	String firstName;
	@Column(name = "lastName")
	String lastName;
	@Column(name = "birthYear")
	String birthYear;
}

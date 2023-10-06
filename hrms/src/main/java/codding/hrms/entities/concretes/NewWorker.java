package codding.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

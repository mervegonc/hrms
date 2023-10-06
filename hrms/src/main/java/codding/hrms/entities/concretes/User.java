package codding.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
    @Column(name = "userId")
	int userId;
	@Column(name = "eMail")
	String eMail;
	@Column(name = "passwordHash")
	String passwordHash;
}

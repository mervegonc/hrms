package codding.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

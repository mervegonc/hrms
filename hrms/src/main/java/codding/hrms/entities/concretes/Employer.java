package codding.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emoloyer")
public class Employer {

	@Id
	@GeneratedValue
    @Column(name = "userId")
	int userId;
	@Column(name = "employerId")
	int employerId;
	@Column(name = "companyName")
	String companyName;
	@Column(name = "webSiteAddresses")
	String webSiteAddresses;
	@Column(name = "phoneNumber")
	int phoneNumber;
	@Column(name = "eMail")
	String eMail;
	@Column(name = "passwordHash")
	String passwordHash;
	
}

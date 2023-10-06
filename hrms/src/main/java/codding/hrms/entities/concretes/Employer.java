package codding.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

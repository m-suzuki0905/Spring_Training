package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {
	@Id
	private String userId;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
	
	
}

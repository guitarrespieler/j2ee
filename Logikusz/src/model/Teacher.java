package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	private String userName;
	
	private String name;
	
	private String password;
	
	private String role;
	
	@OneToMany(mappedBy="teacher")
	private List<Group> groups;

}

package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Group {
	
	@Id
	private int groupId;
	
	@OneToMany(mappedBy="group")
	private List<Student> students;
	
	@ManyToOne
	@JoinColumn(name="user_name")
	private Teacher teacher;
	
	private String groupName;

}

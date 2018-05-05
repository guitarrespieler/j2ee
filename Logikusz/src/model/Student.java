package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int studentId;
	
	private String name;
	
	private int birthYear;
	
	@ManyToOne
	@JoinColumn(name="group_id")
	private Group group;

}

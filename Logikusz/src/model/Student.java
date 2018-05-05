package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = -673486789269598613L;

	@Id
	private int studentId;
	
	private String name;
	
	private int birthYear;
	
	@ManyToOne
	@JoinColumn(name="group_id")
	private Group group;

}

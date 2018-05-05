package model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher implements Serializable{
	
	public static final String TEACHER_ROLE = "TEACHER";
	public static final String DIRECTOR_ROLE = "DIRECTOR";
	
	private static final long serialVersionUID = -7383591971998361292L;

	@Id
	private String userName;
	
	private String name;
	
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> roles = new HashSet<>();
	
	@OneToMany(mappedBy="teacher")
	private List<Group> groups = new LinkedList<>();
	
	public Teacher() {
		roles.add(TEACHER_ROLE);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRoles() {
		return Collections.unmodifiableSet(roles);
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public boolean isDirector() {
		return roles.contains(DIRECTOR_ROLE);
	}

	public boolean hasRole(String role) {
		return roles.contains(role);
	}

	public void addRole(String role) {
		roles.add(role);
	}

	public void removeRole(String role) {
		roles.remove(role);
	}
	
}

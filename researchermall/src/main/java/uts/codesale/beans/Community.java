package uts.codesale.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import uts.codesale.commons.AGenericObject;

@Entity
@Table(name = "community")
public class Community extends AGenericObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3382524371709543864L;
	private Long id;
	private String name;
	private String description;
	private String admin;
	private Set<User> users = new HashSet<User>();
	private Set<User> admins = new HashSet<User>();
	private Set<AlgorithmTest> algorithms = new HashSet<AlgorithmTest>();
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, length = 512)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 5000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(targetEntity = User.class, fetch = FetchType.LAZY)
	// cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "userCommunity", joinColumns = { @JoinColumn(name = "comm_id") }, inverseJoinColumns = @JoinColumn(name = "user_id"))
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@ManyToMany(targetEntity = User.class, fetch = FetchType.LAZY)
	// cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "adminCommunity", joinColumns = { @JoinColumn(name = "comm_id") }, inverseJoinColumns = @JoinColumn(name = "user_id"))
	public Set<User> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<User> admins) {
		this.admins = admins;
	}

	@OneToMany(fetch = FetchType.LAZY,targetEntity = AlgorithmTest.class)
	public Set<AlgorithmTest> getAlgorithms() {
		return algorithms;
	}

	public void setAlgorithms(Set<AlgorithmTest> algorithms) {
		this.algorithms = algorithms;
	}

	@Column(nullable = false, length = 512)
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}

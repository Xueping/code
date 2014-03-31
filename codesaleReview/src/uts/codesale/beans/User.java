package uts.codesale.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import uts.codesale.commons.AGenericObject;


@Entity
@Table(name = "users")
public class User extends AGenericObject implements Serializable {
	private static final long serialVersionUID = 3832345162173359411L;

	private Long id;
	private String username; // required
	private String password; // required
	private String confirmPassword;
	private String firstName; // required
	private String lastName; // required
	private String email; // required; unique
	private String phoneNumber;
	private String website;
	private String createTime;
	private String previosVisitTime;
	private String currontVisitTime;
	private Integer version;
	private String admin;
	private String publisher;
	private String research;
	private String organization;
	private String country;
	private Set<Algorithm> algorithms = new HashSet<Algorithm>();
	private Set<Review> reviews = new HashSet<Review>();
	private Set<Testing> testings = new HashSet<Testing>();
	private String disable;
	private Set<Community> communities_user = new HashSet<Community>();
	private Set<Community> communities_admin = new HashSet<Community>();
	private Set<Role> roles = new HashSet<Role>();

	public User() {
	}

	public User(String username) {
		this.username = username;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	@Column(nullable = false, length = 128, unique = true)
	public String getUsername() {
		return username;
	}

	@Column(nullable = false)
	public String getPassword() {
		return password;
	}

	@Transient
	public String getConfirmPassword() {
		return confirmPassword;
	}	

	@Column(length = 128)
	public String getFirstName() {
		return firstName;
	}

	@Column(length = 128)
	public String getLastName() {
		return lastName;
	}

	@Column(length = 128)
	public String getEmail() {
		return email;
	}

	@Column(length = 20)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Column(length = 256)
	public String getWebsite() {
		return website;
	}

	/**
	 * Returns the full name.
	 * 
	 * @return firstName + ' ' + lastName
	 */
	@Transient
	public String getFullName() {
		return firstName + ' ' + lastName;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public String getCurrontVisitTime() {
		return currontVisitTime;
	}

	public void setCurrontVisitTime(String currontVisitTime) {
		this.currontVisitTime = currontVisitTime;
	}

	public String getPreviosVisitTime() {
		return previosVisitTime;
	}

	public void setPreviosVisitTime(String previosVisitTime) {
		this.previosVisitTime = previosVisitTime;
	}
	
	@Version
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "users", targetEntity = Algorithm.class)
	public Set<Algorithm> getAlgorithms() {
		return algorithms;
	}

	public void setAlgorithms(Set<Algorithm> algorithms) {
		this.algorithms = algorithms;
	}

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Review.class)
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Testing.class)
	public Set<Testing> getTestings() {
		return testings;
	}

	public void setTestings(Set<Testing> testings) {
		this.testings = testings;
	}

	@Column(length = 20) 
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		final User user = (User) o;
		return !(username != null ? !username.equals(user.getUsername()) : user
				.getUsername() != null);
	}

	public int hashCode() {
		return (username != null ? username.hashCode() : 0);
	}

	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\''
				+ ", password='" + password + '\'' + ", confirmPassword='"
				+ confirmPassword + '\''
				+ '\'' + ", firstName='" + firstName + '\'' + ", lastName='"
				+ lastName + '\'' + ", email='" + email + '\''
				+ ", phoneNumber='" + phoneNumber + '\'' + ", website='"
				+ website + '\'' + ", enabled=" +
				'}';
	}
	@Column(length = 1024)
	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	@Column(length = 255)
	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Column(length = 50)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(length = 20) 
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Transient
	public String getDisable() {
		return disable;
	}

	public void setDisable(String disable) {
		this.disable = disable;
	}

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "users", targetEntity = Community.class)
	public Set<Community> getCommunities_user() {
		return communities_user;
	}

	public void setCommunities_user(Set<Community> communities_user) {
		this.communities_user = communities_user;
	}

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "users", targetEntity = Community.class)
	public Set<Community> getCommunities_admin() {
		return communities_admin;
	}

	public void setCommunities_admin(Set<Community> communities_admin) {
		this.communities_admin = communities_admin;
	}

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "users", targetEntity = Role.class)
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}

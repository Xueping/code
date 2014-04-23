package uts.codesale.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import uts.codesale.commons.AGenericObject;


@Entity
@Table(name = "review")
public class Review extends AGenericObject implements Serializable {
	
	private Long id;
	private User user = new User();
	private Algorithm alg = new Algorithm();
	private String status;
	private String results;
	private String reviewFile;
	private String reviewFile_server;
	private String isTester;
	private String price;
	private String dueDate;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(targetEntity = User.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_ID", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(targetEntity = Algorithm.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "alg_ID", nullable = false)
	public Algorithm getAlg() {
		return alg;
	}

	public void setAlg(Algorithm alg) {
		this.alg = alg;
	}

	@Column(nullable = false, length = 64)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Lob 
	@Column(nullable = false, length = 64000)
	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	@Column(length = 1024)
	public String getReviewFile() {
		return reviewFile;
	}

	public void setReviewFile(String reviewFile) {
		this.reviewFile = reviewFile;
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

	@Column(length = 10)
	public String getIsTester() {
		return isTester;
	}

	public void setIsTester(String isTester) {
		this.isTester = isTester;
	}

	@Column()
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(length = 100)
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Column(length = 100)
	public String getReviewFile_server() {
		return reviewFile_server;
	}

	public void setReviewFile_server(String reviewFile_server) {
		this.reviewFile_server = reviewFile_server;
	}

}

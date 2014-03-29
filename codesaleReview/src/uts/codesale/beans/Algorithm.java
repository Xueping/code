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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uts.codesale.commons.AGenericObject;

@Entity
@Table(name = "algorithms")
public class Algorithm extends AGenericObject implements Serializable {

	private static final long serialVersionUID = -3764991193546606095L;
	protected Long alg_ID;
	protected String alg_name;
	protected String alg_category;
	protected String alg_tags;
	protected String alg_title;
	protected String alg_description;
	protected String alg_related_papers;
	protected String alg_related_algs;
	private String alg_picture;
	protected String alg_filepath;
	protected String alg_codepath;
	private String alg_picture_server;
	protected String alg_filepath_server;
	protected String alg_codepath_server;
	private String author;
	private String alg_price;
	private String copyright;
	private String publish;
	private String saleOption;
	private String resubmit;
	private String resubmit_date;
	protected String submit_date;
	protected String current_status;
	protected String review_result;
	protected String test_results;
	protected String admin_result;
	protected String admin_comment;
	protected String author_comment;
	protected Set<User> users = new HashSet<User>();
	private Set<Review> reviews = new HashSet<Review>();
	private Community community;
	private Review review;
	private Testing testing;
	private Set<Testing> testings = new HashSet<Testing>();
	private String disable;

	
	
	@ManyToMany(targetEntity = User.class, fetch = FetchType.LAZY)
	// cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "userAlgorithm", joinColumns = { @JoinColumn(name = "alg_id") }, inverseJoinColumns = @JoinColumn(name = "user_id"))
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getAlg_ID() {
		return alg_ID;
	}
	
	public void setAlg_ID(Long alg_ID) {
		this.alg_ID = alg_ID;
	}

	@Column(nullable = false, length = 512)
	public String getAlg_name() {
		return alg_name;
	}

	public void setAlg_name(String alg_name) {
		this.alg_name = alg_name;
	}

	@Column(nullable = false, length = 512)
	public String getAlg_category() {
		return alg_category;
	}

	public void setAlg_category(String alg_category) {
		this.alg_category = alg_category;
	}

	@Column(nullable = false, length = 512)
	public String getAlg_tags() {
		return alg_tags;
	}

	public void setAlg_tags(String alg_tags) {
		this.alg_tags = alg_tags;
	}

	@Column(nullable = false, length = 512)
	public String getAlg_title() {
		return alg_title;
	}

	public void setAlg_title(String alg_title) {
		this.alg_title = alg_title;
	}

	@Column(nullable = false, length = 1024)
	public String getAlg_related_papers() {
		return alg_related_papers;
	}

	public void setAlg_related_papers(String alg_related_papers) {
		this.alg_related_papers = alg_related_papers;
	}

	@Column(nullable = false, length = 1024)
	public String getAlg_related_algs() {
		return alg_related_algs;
	}

	public void setAlg_related_algs(String alg_related_algs) {
		this.alg_related_algs = alg_related_algs;
	}

	@Column(nullable = false, length = 1024)
	public String getAlg_filepath() {
		return alg_filepath;
	}

	public void setAlg_filepath(String alg_filepath) {
		this.alg_filepath = alg_filepath;
	}

	public String getSubmit_date() {
		return submit_date;
	}

	public void setSubmit_date(String submit_date) {
		this.submit_date = submit_date;
	}

	@Column(nullable = false, length = 64)
	public String getCurrent_status() {
		return current_status;
	}

	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}

	@Column(nullable = false, length = 64)
	public String getReview_result() {
		return review_result;
	}

	public void setReview_result(String review_result) {
		this.review_result = review_result;
	}

	@Column(nullable = false, length = 64)
	public String getTest_results() {
		return test_results;
	}

	public void setTest_results(String test_results) {
		this.test_results = test_results;
	}

	@Column(nullable = false, length = 64)
	public String getAdmin_result() {
		return admin_result;
	}

	public void setAdmin_result(String admin_result) {
		this.admin_result = admin_result;
	}

	public Algorithm() {
	}

	@Lob 
	@Column(nullable = false, length = 64000)
	public String getAlg_description() {
		return alg_description;
	}

	public void setAlg_description(String alg_description) {
		this.alg_description = alg_description;
	}
	
	@OneToMany(fetch = FetchType.LAZY,targetEntity = Review.class)
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@OneToMany(fetch = FetchType.LAZY,targetEntity = Testing.class)
	public Set<Testing> getTestings() {
		return testings;
	}

	public void setTestings(Set<Testing> testings) {
		this.testings = testings;
	}

	@Override
	public int hashCode() {
		return alg_ID.hashCode();
	}

	@Override
	public String toString() {
		return "File{" + "id=" + alg_ID + ", name='" + alg_name + "}";
	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(nullable = false, length = 1024)
	public String getAlg_picture() {
		return alg_picture;
	}

	public void setAlg_picture(String alg_picture) {
		this.alg_picture = alg_picture;
	}

	@Column(nullable = false, length = 100)
	public String getAlg_price() {
		return alg_price;
	}

	public void setAlg_price(String alg_price) {
		this.alg_price = alg_price;
	}

	@Column(nullable = false, length = 100)
	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@Column(nullable = false, length = 100)
	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	@Column(nullable = false, length = 100)
	public String getSaleOption() {
		return saleOption;
	}

	
	public void setSaleOption(String saleOption) {
		this.saleOption = saleOption;
	}

	@Column(length = 1024)
	public String getAdmin_comment() {
		return admin_comment;
	}

	public void setAdmin_comment(String admin_comment) {
		this.admin_comment = admin_comment;
	}

	@Column( length = 100)
	public String getResubmit() {
		return resubmit;
	}

	public void setResubmit(String resubmit) {
		this.resubmit = resubmit;
	}
	
	@Column( length = 100)
	public String getResubmit_date() {
		return resubmit_date;
	}

	public void setResubmit_date(String resubmit_date) {
		this.resubmit_date = resubmit_date;
	}

	@Column(nullable = false, length = 100)
	public String getAlg_codepath() {
		return alg_codepath;
	}

	public void setAlg_codepath(String alg_codepath) {
		this.alg_codepath = alg_codepath;
	}

	@Transient
	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Transient
	public Testing getTesting() {
		return testing;
	}

	public void setTesting(Testing testing) {
		this.testing = testing;
	}

	@Column(length = 1024)
	public String getAuthor_comment() {
		return author_comment;
	}

	public void setAuthor_comment(String author_comment) {
		this.author_comment = author_comment;
	}

	@Column(nullable = false, length = 100)
	public String getAlg_picture_server() {
		return alg_picture_server;
	}

	public void setAlg_picture_server(String alg_picture_server) {
		this.alg_picture_server = alg_picture_server;
	}

	@Column(nullable = false, length = 100)
	public String getAlg_filepath_server() {
		return alg_filepath_server;
	}

	public void setAlg_filepath_server(String alg_filepath_server) {
		this.alg_filepath_server = alg_filepath_server;
	}

	@Column(nullable = false, length = 100)
	public String getAlg_codepath_server() {
		return alg_codepath_server;
	}

	public void setAlg_codepath_server(String alg_codepath_server) {
		this.alg_codepath_server = alg_codepath_server;
	}

	@Transient
	public String getDisable() {
		return disable;
	}

	public void setDisable(String disable) {
		this.disable = disable;
	}

	@ManyToOne(targetEntity = Community.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "comm_ID", nullable = false)
	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

}

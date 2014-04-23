package uts.codesale.dao;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericDao;
import uts.codesale.exception.NotFoundException;


public interface UserDao extends IGenericDao<User, Long> {

	@Transactional
	public User loadUserByUsername(String username)
			throws UsernameNotFoundException;

	public List<User> getUsers();

	public void saveUser(User user);

	public boolean isUserExists(String username);

	public boolean isEmailExists(String email);
	
	public List<Algorithm> loadAlgorithmsByUserID(Long UserID) ;
	
	public List<Algorithm> loadReviewAlgorithmsByUserID(Long UserID);
	
	public List<Algorithm> loadTestingAlgorithmsByUserID(Long UserID);
	
	public List<Review> loadReviewsByUserID(Long UserID);
	public List<Testing> loadTestingsByUserID(Long UserID);

	public List<User> loadUsersByFuzzyName(String fuzzyName)
			throws UsernameNotFoundException;

	public List<User> loadUsersByAuthority() throws UsernameNotFoundException;
	
	public List<User> loadUsersByStartAndEndTime(String startTime, String endTime)throws NotFoundException;
}

package uts.codesale.dao;

import java.util.List;
import java.util.Set;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericDao;
import uts.codesale.exception.NotFoundException;


public interface CommunityDao extends IGenericDao<User, Long> {

	@Transactional
	public User loadUserByUsername(String username)
			throws UsernameNotFoundException;

	public List<User> getUsers();

	public void saveUser(User user);

	public boolean isUserExists(String username);

	public boolean isEmailExists(String email);
	
	public Set<Algorithm> loadAlgorithmsByUserID(Long UserID) ;
	
	public List<Algorithm> loadReviewAlgorithmsByUserID(Long UserID);
	
	public List<Algorithm> loadTestingAlgorithmsByUserID(Long UserID);
	
	public Set<Review> loadReviewsByUserID(Long UserID);
	public Set<Testing> loadTestingsByUserID(Long UserID);

	public List<User> loadUsersByFuzzyName(String fuzzyName)
			throws UsernameNotFoundException;

	public List<User> loadUsersByAuthority() throws UsernameNotFoundException;
	
	public List<User> loadUsersByStartAndEndTime(String startTime, String endTime)throws NotFoundException;
}

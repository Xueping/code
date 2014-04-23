package uts.codesale.service;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericService;
import uts.codesale.exception.NotFoundException;
import uts.codesale.exception.UserExistsException;


public interface UserService extends IGenericService<User, Long> {

	public User getUser(String userId);

	public User getUserByUsername(String username)
			throws UsernameNotFoundException;

	public List<User> getUsersByFuzzyName(String fuzzyName)
			throws UsernameNotFoundException;

	public List<User> getUsers(User user);

	public void saveUser(User user) throws UserExistsException;

	public void removeUser(String userId);

	public boolean isUserExists(String username);

	public boolean isEmailExists(String email);

	public boolean userValide(User user);

	public boolean userPrivilegeValide(User user, String pageLink);
	
	public List<Algorithm> getAlgorithmsByUserID(Long UserID);

	public List<User> getUsersByAuthority() throws UsernameNotFoundException;
	
	public List<User> getUsersByStartAndEndTime(String startTime, String endTime)throws NotFoundException;
	
	public List<Algorithm> getReviewAlgorithmsByUserID(Long UserID);
	
	public List<Algorithm> getTestingAlgorithmsByUserID(Long UserID);
	
	public List<Review> getReviewsByUserID(Long UserID);
	public List<Testing> getTestingsByUserID(Long UserID);
}

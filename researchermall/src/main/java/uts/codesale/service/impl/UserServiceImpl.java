package uts.codesale.service.impl;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;

import uts.codesale.beans.AlgorithmTest;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.UserDao;
import uts.codesale.exception.NotFoundException;
import uts.codesale.exception.UserExistsException;
import uts.codesale.service.UserService;


public class UserServiceImpl extends GenericServiceImpl<User, Long> implements
		UserService {
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super(userDao);
		this.userDao = userDao;
	}

	public User getUser(String userId) {
		return userDao.get(new Long(userId));
	}

	public List<User> getUsers(User user) {
		return userDao.getUsers();
	}

	public void saveUser(User user) throws UserExistsException {
		// if new user, lowercase userId
		if (user.getVersion() == null) {
			user.setUsername(user.getUsername().toLowerCase());
		}

		try {
			userDao.saveUser(user);
		} catch (DataIntegrityViolationException e) {
			throw new UserExistsException("User '" + user.getUsername()
					+ "' already exists!");
		} catch (EntityExistsException e) { // needed for JPA
			throw new UserExistsException("User '" + user.getUsername()
					+ "' already exists!");
		}
	}

	public void removeUser(String userId) {
		log.debug("removing user: " + userId);
		userDao.remove(new Long(userId));
	}

	public User getUserByUsername(String username)
			throws UsernameNotFoundException {
		return (User) userDao.loadUserByUsername(username);
	}

	public List<User> getUsersByFuzzyName(String fuzzyName)
			throws UsernameNotFoundException {
		return userDao.loadUsersByFuzzyName(fuzzyName);
	}

	public boolean userValide(User user) {
		User u = getUserByUsername(user.getUsername());
		if (u == null)
			return false;
		else {
			if (u.getPassword().equals(user.getPassword()))
				return true;
			else
				return false;
		}
	}

	public boolean isUserExists(String username) {
		return userDao.isUserExists(username);
	}

	public boolean isEmailExists(String email) {
		return userDao.isEmailExists(email);
	}

	public List<User> getUsersByAuthority() throws UsernameNotFoundException {
		return this.userDao.loadUsersByAuthority();
	}
	
	public List<User> getUsersByStartAndEndTime(String startTime, String endTime)throws NotFoundException{
		return this.userDao.loadUsersByStartAndEndTime(startTime, endTime);
	}

	@Override
	public boolean userPrivilegeValide(User user, String pageLink) {
		// TODO Auto-generated method stub
		return false;
	}
	

	public List<AlgorithmTest> getAlgorithmsByUserID(Long UserID){
	
		return  this.userDao.loadAlgorithmsByUserID(UserID);
	}
	
	public List<AlgorithmTest> getReviewAlgorithmsByUserID(Long UserID){
		return this.userDao.loadReviewAlgorithmsByUserID(UserID);
	}
	
	public List<AlgorithmTest> getTestingAlgorithmsByUserID(Long UserID){
		return this.userDao.loadTestingAlgorithmsByUserID(UserID);
	}
	
	public List<Testing> getTestingsByUserID(Long UserID){
		return this.userDao.loadTestingsByUserID(UserID);
	}

	@Override
	public List<Review> getReviewsByUserID(Long UserID) {
		return this.userDao.loadReviewsByUserID(UserID);
	}
}

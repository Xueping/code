package uts.codesale.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.hibernate.Session;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.UserDao;
import uts.codesale.exception.NotFoundException;


public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {
	public UserDaoImpl() {
		super(User.class);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return getHibernateTemplate().find(
				"from User u order by upper(u.username)");
	}

	public void saveUser(final User user) {
		log.debug("user's id: " + user.getId());
		getHibernateTemplate().saveOrUpdate(user);
		getHibernateTemplate().flush();
	}

	@SuppressWarnings("unchecked")
	public boolean isUserExists(String username) {
		List<User> list = getHibernateTemplate().find(
				"from User where username=?", username);
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	public boolean isEmailExists(String email) {
		List<User> list = getHibernateTemplate().find(
				"from User where email=?", email);
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	/**
	 * Overridden simply to call the saveUser method. This is happenening
	 * because saveUser flushes the session and saveObject of BaseDaoHibernate
	 * does not.
	 */
	@Override
	public void save(User user) {
		this.saveUser(user);
	}

	public User loadUserByUsername(String username)
			throws UsernameNotFoundException {
		List users = getHibernateTemplate().find("from User where username=?",
				username);
		if (users == null || users.isEmpty()) {
			throw new UsernameNotFoundException("user '" + username
					+ "' not found...");
		} else {
			return (User) users.get(0);
		}
	}
	
	

	@SuppressWarnings("unchecked")
	public List<User> loadUsersByFuzzyName(String fuzzyName)
			throws UsernameNotFoundException {
		String queryString = null;
		if(fuzzyName.equals(null)||fuzzyName.equals(""))
			queryString = "from User order by createTime desc";
		else
			queryString = "from User where username like '%" + fuzzyName + "%'  order by createTime desc";
		List<User> users = getHibernateTemplate().find(queryString);
		if (users == null || users.isEmpty()) {
			throw new UsernameNotFoundException("user '" + fuzzyName
					+ "' not found...");
		} else {
			return users;
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> loadUsersByAuthority() throws UsernameNotFoundException {
		List<User> users = getHibernateTemplate().find(
				"from User where authorizable=?", true);
		if (users == null || users.isEmpty()) {
			throw new UsernameNotFoundException(
					"authorizable user not found...");
		} else {
			return users;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<User> loadUsersByStartAndEndTime(String startTime, String endTime)throws NotFoundException{
		List<User> users = new ArrayList<User>();
		
			String querySql = "from User where currontVisitTime >'" + startTime
					+"' and currontVisitTime< '" + endTime+"'";
			users = getHibernateTemplate().find(querySql);
			if (users == null || users.isEmpty()) {
				throw new NotFoundException("user not found...");
			} else {
				return users;
			}
	}
	
	public Set<Algorithm> loadAlgorithmsByUserID(Long UserID)  {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, UserID); 
        Set<Algorithm> sets=user.getAlgorithms();
		
		return sets;
		
	}
	
	public List<Algorithm> loadReviewAlgorithmsByUserID(Long UserID){
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, UserID); 
		Set<Review> reviewSets=user.getReviews();
		
        List<Algorithm> sets = new ArrayList<Algorithm>();
        for(Review review : reviewSets){
        	Algorithm alg = review.getAlg();
        	alg.setReview(review);
        	sets.add(alg);
        }
		return sets;
	}
	
	public List<Algorithm> loadTestingAlgorithmsByUserID(Long UserID){
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, UserID); 
		Set<Testing> testingSets=user.getTestings();
		
        List<Algorithm> sets = new ArrayList<Algorithm>();
        for(Testing test : testingSets){
        	Algorithm alg = test.getAlg();
        	alg.setTesting(test);
        	sets.add(alg);
        }
		return sets;
	}
	
	public Set<Testing> loadTestingsByUserID(Long UserID){
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, UserID); 
		Set<Testing> testingSets=user.getTestings();
		
		return testingSets;
	}

	@Override
	public Set<Review> loadReviewsByUserID(Long UserID) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, UserID); 
		Set<Review> reviewSets=user.getReviews();
		
		return reviewSets;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAll(){
		List<User> users = getHibernateTemplate().find("from User where admin='no'");
		
			return users;
	}
}

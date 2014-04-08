package uts.codesale.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.AlgorithmDao;
import uts.codesale.exception.NotFoundException;

public class AlgorithmDaoImpl extends GenericDaoImpl<Algorithm, Long> implements
		AlgorithmDao {

	public AlgorithmDaoImpl() {
		super(Algorithm.class);
	}

	@SuppressWarnings("unchecked")
	public boolean isAlgorithmExists(String title) {
		List<Algorithm> list = getHibernateTemplate().find(
				"from Algorithm where name=?", title);
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	
	

	@SuppressWarnings("unchecked")
	public Algorithm loadAlgorithmByName(String title) throws NotFoundException {
		List<Algorithm> items = getHibernateTemplate().find(
				"from Algorithm where name = ? order by submit_date desc , alg_ID DESC ", title);
		if (items == null || items.isEmpty()) {
			throw new NotFoundException("item '" + title + "' not found...");
		} else {
			return items.get(0);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Algorithm> loadAlgorithmByUser(Set<User> users) throws NotFoundException {
		List<Algorithm> items = getHibernateTemplate().find(
				"from Algorithm where users = ? order by submit_date desc , alg_ID DESC ", users);
		if (items == null || items.isEmpty()) {
			throw new NotFoundException("item '" + users + "' not found...");
		} else {
			return items;
		}
	}

	
	public List<Algorithm> loadWaitingAdminAlgorithms(){
		
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where admin_result ='Waiting' and current_status='New' order by submit_date desc , alg_ID DESC ");
		
		return files;
	}
	
	@Override
	public List<Algorithm> loadReviewAlgorithms(String status) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where admin_result ='Accept' and review_result='"+status+"' order by submit_date desc , alg_ID DESC ");
		
		return files;
	}
	
	@Override
	public List<Algorithm> loadReviewAlgorithms(String status, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where admin_result ='Accept' and review_result='"+status+"'  and comm_id= "+ comm_id+" order by submit_date desc , alg_ID DESC ");
		
		return files;
	}

	
	@Override
	public List<Algorithm> loadTestingAlgorithms(String status) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where review_result ='Accept' and test_results='"+status+"' order by submit_date desc , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<Algorithm> loadTestingAlgorithms(String status, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where review_result ='Accept' and test_results='"+status+"' and comm_id= "+ comm_id+" order by submit_date desc , alg_ID DESC ");
		return files;
	}



	@Override
	public Set<Review> loadReviewByAlg_Id(Long alg_id) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		Algorithm alg =(Algorithm)session.load(Algorithm.class, alg_id); 
		Set<Review> review =alg.getReviews();

		return review;
	}

	@Override
	public Set<Testing> loadTestingByAlg_Id(Long alg_id) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		Algorithm alg =(Algorithm)session.load(Algorithm.class, alg_id); 
		Set<Testing> testing =alg.getTestings();
		return testing;
	}
	
	public List<Algorithm> loadResubmitAlgorithms(){
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where resubmit ='true' ORDER BY resubmit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<Algorithm> getAll() {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm ORDER BY submit_date DESC, alg_ID DESC ");
		return files;
	}

	@Override
	public List<Algorithm> loadPublishAlgorithms(String published) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where test_results ='Accept' and publish='"+published+"' ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<Algorithm> loadPublishAlgorithms(String published, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where test_results ='Accept' and publish='"+published+"' and comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

	@Override
	public List<Algorithm> loadRejectAlgorithms() {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where test_results ='Reject' or review_result='Reject' ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<Algorithm> loadRejectAlgorithms(Long comm_id) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where (test_results ='Reject' or review_result='Reject') and comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

	@Override
	public List<Algorithm> loadAlgorithmsByCommunity(Long comm_id) {
		@SuppressWarnings("unchecked")
		List<Algorithm> files = getHibernateTemplate().find(
				"from Algorithm where comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

}

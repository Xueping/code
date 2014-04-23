package uts.codesale.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import uts.codesale.beans.AlgorithmTest;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.AlgorithmDao;
import uts.codesale.exception.NotFoundException;

public class AlgorithmDaoImpl extends GenericDaoImpl<AlgorithmTest, Long> implements
		AlgorithmDao {

	public AlgorithmDaoImpl() {
		super(AlgorithmTest.class);
	}

	@SuppressWarnings("unchecked")
	public boolean isAlgorithmExists(String title) {
		List<AlgorithmTest> list = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where name=?", title);
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	
	

	@SuppressWarnings("unchecked")
	public AlgorithmTest loadAlgorithmByName(String title) throws NotFoundException {
		List<AlgorithmTest> items = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where name = ? order by submit_date desc , alg_ID DESC ", title);
		if (items == null || items.isEmpty()) {
			throw new NotFoundException("item '" + title + "' not found...");
		} else {
			return items.get(0);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<AlgorithmTest> loadAlgorithmByUser(Set<User> users) throws NotFoundException {
		List<AlgorithmTest> items = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where users = ? order by submit_date desc , alg_ID DESC ", users);
		if (items == null || items.isEmpty()) {
			throw new NotFoundException("item '" + users + "' not found...");
		} else {
			return items;
		}
	}

	
	public List<AlgorithmTest> loadWaitingAdminAlgorithms(){
		
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where admin_result ='Waiting' and current_status='New' order by submit_date desc , alg_ID DESC ");
		
		return files;
	}
	
	@Override
	public List<AlgorithmTest> loadReviewAlgorithms(String status) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where admin_result ='Accept' and review_result='"+status+"' order by submit_date desc , alg_ID DESC ");
		
		return files;
	}
	
	@Override
	public List<AlgorithmTest> loadReviewAlgorithms(String status, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where admin_result ='Accept' and review_result='"+status+"'  and comm_id= "+ comm_id+" order by submit_date desc , alg_ID DESC ");
		
		return files;
	}

	
	@Override
	public List<AlgorithmTest> loadTestingAlgorithms(String status) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where review_result ='Accept' and test_results='"+status+"' order by submit_date desc , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<AlgorithmTest> loadTestingAlgorithms(String status, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where review_result ='Accept' and test_results='"+status+"' and comm_id= "+ comm_id+" order by submit_date desc , alg_ID DESC ");
		return files;
	}



	@Override
	public List<Review> loadReviewByAlg_Id(Long alg_id) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		AlgorithmTest alg =(AlgorithmTest)session.load(AlgorithmTest.class, alg_id); 
		Set<Review> review =alg.getReviews();
		List<Review> list = new ArrayList<Review>();
		list.addAll(review);
		return list;
	}

	@Override
	public List<Testing> loadTestingByAlg_Id(Long alg_id) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		AlgorithmTest alg =(AlgorithmTest)session.load(AlgorithmTest.class, alg_id); 
		Set<Testing> testing =alg.getTestings();
		List<Testing> list = new ArrayList<Testing>();
		list.addAll(testing);
		return list;
	}
	
	public List<AlgorithmTest> loadResubmitAlgorithms(){
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where resubmit ='true' ORDER BY resubmit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<AlgorithmTest> getAll() {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm ORDER BY submit_date DESC, alg_ID DESC ");
		return files;
	}

	@Override
	public List<AlgorithmTest> loadPublishAlgorithms(String published) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where test_results ='Accept' and publish='"+published+"' ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<AlgorithmTest> loadPublishAlgorithms(String published, Long comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where test_results ='Accept' and publish='"+published+"' and comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

	@Override
	public List<AlgorithmTest> loadRejectAlgorithms() {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where test_results ='Reject' or review_result='Reject' ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}
	
	@Override
	public List<AlgorithmTest> loadRejectAlgorithms(Long comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where (test_results ='Reject' or review_result='Reject') and comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

	@Override
	public List<AlgorithmTest> loadAlgorithmsByCommunity(Long comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmTest> files = (List<AlgorithmTest>)getHibernateTemplate().find(
				"from Algorithm where comm_id= "+ comm_id+" ORDER BY submit_date DESC , alg_ID DESC ");
		return files;
	}

}

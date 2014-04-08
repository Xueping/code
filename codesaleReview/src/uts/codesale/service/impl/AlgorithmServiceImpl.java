package uts.codesale.service.impl;

import java.util.List;
import java.util.Set;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.AlgorithmDao;
import uts.codesale.exception.NotFoundException;
import uts.codesale.service.AlgorithmService;

public class AlgorithmServiceImpl extends GenericServiceImpl<Algorithm, Long>
		implements AlgorithmService {

	private AlgorithmDao itemDao;

	public AlgorithmServiceImpl(AlgorithmDao itemDao) {
		super(itemDao);
		this.itemDao = itemDao;
	}

	public List<Algorithm> getAllAlgorithms() {
		return itemDao.getAll();
	}

	public Algorithm getAlgorithmByName(String name) throws NotFoundException {
		return itemDao.loadAlgorithmByName(name);
	}


	public boolean isAlgorithmExists(String name) {
		return itemDao.isAlgorithmExists(name);
	}

	@Override
	public List<Algorithm> getAlgorithmByUser(Set<User> users) throws NotFoundException {
		return itemDao.loadAlgorithmByUser(users);
	}
	
	public List<Algorithm> getWaitingAdminAlgorithms() {
		return this.itemDao.loadWaitingAdminAlgorithms();
	}
	
	public List<Algorithm> getReviewAlgorithms(String status) {
		return this.itemDao.loadReviewAlgorithms(status);
	}
	public List<Algorithm> getTestingAlgorithms(String status) {
		return this.itemDao.loadTestingAlgorithms(status);
	}

	@Override
	public List<Review> getReviewByAlg_Id(Long alg_id) {
		return (List<Review>) this.itemDao.loadReviewByAlg_Id(alg_id);
	}

	@Override
	public List<Testing> getTestingByAlg_Id(Long alg_id) {
		return (List<Testing>) this.itemDao.loadTestingByAlg_Id(alg_id);
	}
	public List<Algorithm> getWaitingResubmitAlgorithms(){
		return this.itemDao.loadResubmitAlgorithms();
	}

	@Override
	public List<Algorithm> getPublishAlgorithms(String published) {
		return this.itemDao.loadPublishAlgorithms(published);
	}

	@Override
	public List<Algorithm> getRejectAlgorithms() {
		return this.itemDao.loadRejectAlgorithms();
	}

	@Override
	public List<Algorithm> getAlgorithmsByCommunity(Long comm_id) {
		return this.itemDao.loadAlgorithmsByCommunity(comm_id);
	}

	@Override
	public List<Algorithm> getPublishAlgorithms(String published, Long comm_id) {
		return this.itemDao.loadPublishAlgorithms(published, comm_id);
	}

	@Override
	public List<Algorithm> getRejectAlgorithms(Long comm_id) {
		return this.itemDao.loadRejectAlgorithms(comm_id);
	}

	@Override
	public List<Algorithm> getReviewAlgorithms(String status, Long comm_id) {
		return this.itemDao.loadReviewAlgorithms(status, comm_id);
	}

	@Override
	public List<Algorithm> getTestingAlgorithms(String status, Long comm_id) {
		return this.itemDao.loadTestingAlgorithms(status, comm_id);
	}

}

package uts.codesale.dao.impl;

import uts.codesale.beans.Review;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.ReviewDao;

public class ReviewDaoImpl extends GenericDaoImpl<Review, Long> implements ReviewDao {

	public ReviewDaoImpl() {
		super(Review.class);
	}

}

package uts.codesale.service.impl;

import uts.codesale.beans.Review;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.ReviewDao;
import uts.codesale.service.ReviewService;

public class ReviewServiceImpl extends GenericServiceImpl<Review, Long>
		implements ReviewService {

	public ReviewServiceImpl(ReviewDao itemDao) {
		super(itemDao);
	}

	
}

package com.researchermall.dao.impl;


import com.researchermall.bean.CategoryEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.CategoryDao;



public class CategoryDaoImpl extends GenericDaoImpl<CategoryEntity, Integer> implements CategoryDao {
	public CategoryDaoImpl() {
		super(CategoryEntity.class);
	}

	

}

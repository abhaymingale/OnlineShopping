package com.nanowebhub.shoppingbackend.dao;

import java.util.List;

import com.nanowebhub.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category getcategory(int id);

}

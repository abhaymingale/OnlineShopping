package com.nanowebhub.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nanowebhub.shoppingbackend.dao.CategoryDAO;
import com.nanowebhub.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
   private static  List <Category> categorylist = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
	    category.setDescription("This is Television Description");
	    category.setImageURL("CAT_1.png");
	    
	    categorylist.add(category);
	    
	    //Second Category
	    category = new Category();
		category.setId(2);
		category.setName("Mobile");
	    category.setDescription("This is Mobile Description");
	    category.setImageURL("CAT_2.png");
	    categorylist.add(category);
	    //Third Category
	    category = new Category();
		category.setId(3);
		category.setName("Laptop");
	    category.setDescription("This is Laptop Description");
	    category.setImageURL("CAT_3.png");
	    categorylist.add(category);
	    
	  //Third Category
	    category = new Category();
		category.setId(4);
		category.setName("Clothing");
	    category.setDescription("This is Cloth Description");
	    category.setImageURL("CAT_4.png");
	    categorylist.add(category);
	}
   
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categorylist;
	}


	@Override
	public Category getcategory(int id) {
		// TODO Auto-generated method stub
		for (Category category : categorylist) {
			if(category.getId() == id ) return category;
		}
		return null;
	}

}

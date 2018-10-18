package com.nanowebhub.onlineshopping.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nanowebhub.shoppingbackend.dao.CategoryDAO;
import com.nanowebhub.shoppingbackend.dto.Category;


@Controller
public class pageController {

    @Autowired
    private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/","/home","index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing list of category
		
		mv.addObject("categories" , categoryDAO.list());;
		mv.addObject("userclickHome", true);
		return mv;
	}
	@RequestMapping(value = {"/about"})
	public ModelAndView aboutus()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userclickAbout", true);
		return mv;
	}
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userclickContact", true);
		return mv;
	}
	
	//method to load all producyt
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showallproducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("categories" , categoryDAO.list());
		mv.addObject("title", "All Products");
		
		//passing list of category
		
		
		mv.addObject("userclickAllProducts", true);
		return mv;
	}
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showcategoryproducts(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("page");
		//show  category
		Category category =null;
		category = categoryDAO.getcategory(id);
		mv.addObject("categories" , categoryDAO.list());
		mv.addObject("title", category.getName());
		//passing list of category
		mv.addObject("userclickCategory", true);
		return mv;
	}
}

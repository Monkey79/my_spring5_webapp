package com.mdangelo.spring5_webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdangelo.spring5_webapp.services.IAuthorService;

@Controller
public class AuthorController {
	
	@Autowired
	private IAuthorService authorSrvc;
	
	
	@RequestMapping("/authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", authorSrvc.getAllAuthors());		
		return "authors/list";
	}

}

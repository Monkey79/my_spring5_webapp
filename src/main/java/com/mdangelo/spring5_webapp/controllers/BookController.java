package com.mdangelo.spring5_webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdangelo.spring5_webapp.services.IBookService;

@Controller
public class BookController {
	
	@Autowired
	private IBookService bookSrvc;
	
	@RequestMapping("/books")
	public String getBooks(Model model) {		
		model.addAttribute("books", bookSrvc.getAllBooks());
		return "books/list";		
	}

}

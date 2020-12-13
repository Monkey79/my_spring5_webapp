package com.mdangelo.spring5_webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdangelo.spring5_webapp.services.IPublisherService;

@Controller
public class PublisherController {
	
	@Autowired
	private IPublisherService publisherSrvc;
	
	
	@RequestMapping("/publishers")
	public String getAllPublishers(Model model) {
		model.addAttribute("publishers", publisherSrvc.getAllPublishers());	
		return "publishers/list";
	}

}

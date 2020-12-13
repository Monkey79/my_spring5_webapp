package com.mdangelo.spring5_webapp.services;

import java.util.List;

import com.mdangelo.spring5_webapp.dto.PublisherDto;

public interface IPublisherService {
	
	public List<PublisherDto> getAllPublishers();

}

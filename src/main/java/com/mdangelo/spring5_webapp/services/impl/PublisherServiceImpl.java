package com.mdangelo.spring5_webapp.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdangelo.spring5_webapp.dto.PublisherDto;
import com.mdangelo.spring5_webapp.model.PublisherEntity;
import com.mdangelo.spring5_webapp.repositories.PublisherRepository;
import com.mdangelo.spring5_webapp.services.IPublisherService;

@Service
public class PublisherServiceImpl implements IPublisherService {
	
	@Autowired
	private PublisherRepository publisherRepo;

	@Override
	public List<PublisherDto> getAllPublishers() {
		ModelMapper modelMapper = new ModelMapper();
		
		List<PublisherEntity> publisherEntList = new ArrayList<>();
		publisherRepo.findAll().forEach(publisherEntList::add);
		
		return publisherEntList.stream().map(pubEnt -> modelMapper.map(pubEnt, PublisherDto.class))
		.collect(Collectors.toList());	
	}

}

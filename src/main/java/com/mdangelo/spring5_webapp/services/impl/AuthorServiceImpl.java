package com.mdangelo.spring5_webapp.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdangelo.spring5_webapp.dto.AuthorDto;
import com.mdangelo.spring5_webapp.model.AuthorEntity;
import com.mdangelo.spring5_webapp.repositories.AuthorReposiroty;
import com.mdangelo.spring5_webapp.services.IAuthorService;

@Service
public class AuthorServiceImpl implements IAuthorService {
	@Autowired
	private AuthorReposiroty authorRepo;

	@Override
	public List<AuthorDto> getAllAuthors() {
		ModelMapper modelMapper = new ModelMapper();
		
		List<AuthorEntity> authorEntList = new ArrayList<>();
		authorRepo.findAll().forEach(authorEntList::add);
		
		return authorEntList.stream().map(authEnt -> modelMapper.map(authEnt, AuthorDto.class))
		.collect(Collectors.toList());	
	}

}

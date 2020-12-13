package com.mdangelo.spring5_webapp.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdangelo.spring5_webapp.dto.BookDto;
import com.mdangelo.spring5_webapp.model.BookEntity;
import com.mdangelo.spring5_webapp.repositories.BookRepository;
import com.mdangelo.spring5_webapp.services.IBookService;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public List<BookDto> getAllBooks() {
		ModelMapper modelMapper = new ModelMapper();
		
		List<BookEntity> booksEntList = new ArrayList<>();
		bookRepo.findAll().forEach(booksEntList::add);
		
		return booksEntList.stream().map(bookEnt -> modelMapper.map(bookEnt, BookDto.class))
		.collect(Collectors.toList());		
	}

}

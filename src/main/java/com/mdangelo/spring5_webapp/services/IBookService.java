package com.mdangelo.spring5_webapp.services;

import java.util.List;

import com.mdangelo.spring5_webapp.dto.BookDto;

public interface IBookService {
	public List<BookDto> getAllBooks();

}

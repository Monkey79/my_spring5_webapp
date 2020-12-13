package com.mdangelo.spring5_webapp.services;

import java.util.List;

import com.mdangelo.spring5_webapp.dto.AuthorDto;

public interface IAuthorService {
	public List<AuthorDto> getAllAuthors();
}

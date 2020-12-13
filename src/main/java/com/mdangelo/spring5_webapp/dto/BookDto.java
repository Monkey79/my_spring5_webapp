package com.mdangelo.spring5_webapp.dto;

import java.util.HashSet;
import java.util.Set;

public class BookDto {
		
	private String title;	
	private String isbn;
	
	private Set<AuthorDto> authors = new HashSet<>();	
	private PublisherDto publisher;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<AuthorDto> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<AuthorDto> authors) {
		this.authors = authors;
	}
	public PublisherDto getPublisher() {
		return publisher;
	}
	public void setPublisher(PublisherDto publisher) {
		this.publisher = publisher;
	}
	
}

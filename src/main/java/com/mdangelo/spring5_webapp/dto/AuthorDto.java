package com.mdangelo.spring5_webapp.dto;

import java.util.HashSet;
import java.util.Set;

public class AuthorDto {
	private String authorId;
	private String firstName;
	private String lastName;	
	
	private Set<BookDto> books = new HashSet<>();

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<BookDto> getBooks() {
		return books;
	}

	public void setBooks(Set<BookDto> books) {
		this.books = books;
	}
	
}

package com.mdangelo.spring5_webapp.dto;

import java.util.HashSet;
import java.util.Set;

public class PublisherDto {

	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;

	private Set<BookDto> books = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Set<BookDto> getBooks() {
		return books;
	}

	public void setBooks(Set<BookDto> books) {
		this.books = books;
	}

}

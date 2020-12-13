package com.mdangelo.spring5_webapp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "publishers")
public class PublisherEntity implements Serializable {
	private static final long serialVersionUID = 4085195268007619710L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "pb_name", length = 50, nullable = false)
	private String name;
	@Column(name = "pb_address", length = 50, nullable = false)
	private String address;

	@Column(name = "pb_city")
	private String city;
	@Column(name = "pb_state")
	private String state;
	@Column(name = "pb_zip")
	private String zip;

	@OneToMany
	@JoinColumn(name="publisher_id") //-->Hibernate pone en Book el FK publisher_id
	private Set<BookEntity> books = new HashSet<>();
	
	
	public PublisherEntity() {
	
	}

	public PublisherEntity(String name, String address, String city, String state, String zip) {
		
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Set<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(Set<BookEntity> books) {
		this.books = books;
	}

}

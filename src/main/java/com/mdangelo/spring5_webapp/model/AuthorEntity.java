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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class AuthorEntity implements Serializable {
	private static final long serialVersionUID = -3724990166411775968L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "aut_id", length = 30, nullable = false, unique = true)
	private String authorId;
	
	@Column(name = "aut_first_name", length = 30, nullable = false)
	private String firstName;
	@Column(name = "aut_last_name", length = 50, nullable = false)
	private String lastName;
	
	@ManyToMany
	@JoinTable(name = "authors_books",
			joinColumns = @JoinColumn(name="author_id"),
			inverseJoinColumns = @JoinColumn(name="book_id"))
	private Set<BookEntity> books = new HashSet<>();
	
	
	public AuthorEntity() {
	
	
	}

	public AuthorEntity(String authorId, String firstName, String lastName) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Set<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(Set<BookEntity> books) {
		this.books = books;
	}
}

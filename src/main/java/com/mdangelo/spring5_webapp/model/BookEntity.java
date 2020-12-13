package com.mdangelo.spring5_webapp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity implements Serializable {
	private static final long serialVersionUID = -3630956269720308429L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "bk_title", length = 50, nullable = false)
	private String title;
	@Column(name = "bk_isbn", length = 50, nullable = false, unique = true)
	private String isbn;

	@ManyToMany(mappedBy = "books")
	private Set<AuthorEntity> authors = new HashSet<>();

	@ManyToOne
	private PublisherEntity publisher;

	public BookEntity() {

	}

	public BookEntity(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Set<AuthorEntity> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<AuthorEntity> authors) {
		this.authors = authors;
	}

	public PublisherEntity getPublisher() {
		return publisher;
	}

	public void setPublisher(PublisherEntity publisher) {
		this.publisher = publisher;
	}

}

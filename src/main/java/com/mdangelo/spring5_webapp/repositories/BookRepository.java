package com.mdangelo.spring5_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mdangelo.spring5_webapp.model.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity,Long> {

}

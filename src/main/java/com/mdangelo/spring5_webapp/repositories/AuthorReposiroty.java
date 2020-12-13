package com.mdangelo.spring5_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mdangelo.spring5_webapp.model.AuthorEntity;

public interface AuthorReposiroty extends CrudRepository<AuthorEntity, Long> {

}

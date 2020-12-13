package com.mdangelo.spring5_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mdangelo.spring5_webapp.model.PublisherEntity;

public interface PublisherRepository extends CrudRepository<PublisherEntity, Long>{

}

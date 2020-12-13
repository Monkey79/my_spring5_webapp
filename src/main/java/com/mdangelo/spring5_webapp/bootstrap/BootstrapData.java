package com.mdangelo.spring5_webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mdangelo.spring5_webapp.model.AuthorEntity;
import com.mdangelo.spring5_webapp.model.BookEntity;
import com.mdangelo.spring5_webapp.model.PublisherEntity;
import com.mdangelo.spring5_webapp.repositories.AuthorReposiroty;
import com.mdangelo.spring5_webapp.repositories.BookRepository;
import com.mdangelo.spring5_webapp.repositories.PublisherRepository;


@Component
public class BootstrapData implements CommandLineRunner {
	private final AuthorReposiroty authRepo;
	private final BookRepository bookRepo;
	private final PublisherRepository pubRepo;
	

	public BootstrapData(AuthorReposiroty authRepo, BookRepository bookRepo, PublisherRepository pubRepo) {		
		this.authRepo = authRepo;
		this.bookRepo = bookRepo;
		this.pubRepo = pubRepo;
	}

	@Override
	public void run(String... args) throws Exception {		
		//TODO NOT WORKING-----
		
		/*PublisherEntity pub1 = new PublisherEntity("Editorial Guernica","Viamonte 232","CABA","Buenos Aires","AB565");
		pubRepo.save(pub1);

		AuthorEntity auth1 = new AuthorEntity("RANDOMID_1","Edgar","Poe");			
		BookEntity book11 = new BookEntity("Black Cat","ISBN4646464");
		BookEntity book12 = new BookEntity("Dead Sleep","ISB8989898");		
		
		auth1.getBooks().add(book11);
		auth1.getBooks().add(book12);
		book11.getAuthors().add(auth1);
		book12.getAuthors().add(auth1);
		
		book11.setPublisher(pub1);
		book12.setPublisher(pub1);
		pub1.getBooks().add(book11);
		pub1.getBooks().add(book12);
		
		//---repo
		authRepo.save(auth1);
		bookRepo.save(book11);
		bookRepo.save(book12);
		pubRepo.save(pub1);
				
		
		
		//---------------Entity 2
		AuthorEntity auth2 = new AuthorEntity("RANDOMID_2","David","Dickens");		
		BookEntity book21 = new BookEntity("Bridge","ISBN5656565");
		
		auth2.getBooks().add(book21);
		book21.getAuthors().add(auth2);		
		book21.setPublisher(pub1);
		pub1.getBooks().add(book21);
		
		//---repo	
		authRepo.save(auth2);
		bookRepo.save(book21);
		pubRepo.save(pub1);*/

	}

}

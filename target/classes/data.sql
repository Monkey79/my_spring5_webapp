-- ===Publisher 1
insert into publishers(pb_name,
					  pb_address,
                      pb_city,
                      pb_state,
                      pb_zip)
		values('Editorial Navarro',
			   'Viamones 222',
               'CABA',
               'Buenos Aires',
               '2323'      
        );
-- ===Author 1
insert into authors 
(aut_id,aut_first_name,aut_last_name)
values ('random_id_1',
		'Edgar',
        'Poe');        
        
insert into books (bk_isbn,bk_title,publisher_id)
values('ISBN-89989898',
	   'Dark Material',
       1);
       
insert into books (bk_isbn,bk_title,publisher_id)
values('ISBN-56466566',
	   'Increase Power',
       1);
       
insert into authors_books (author_id,book_id)
values(1,1);
insert into authors_books (author_id,book_id)
values(1,2);

-- ===Author 2
insert into authors 
(aut_id,aut_first_name,aut_last_name)
value ('random_id_2',
		'David',
        'Dickens');

insert into books (bk_isbn,bk_title,publisher_id)
values('ISBN-887811111',
	   'X-Men',
       1);

insert into authors_books (author_id,book_id)
values(2,3);


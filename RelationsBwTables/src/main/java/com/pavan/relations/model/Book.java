package com.pavan.relations.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.pavan.relations.model.primary.BookId;

@Entity
public class Book {
	
	@EmbeddedId
	private BookId bookId;

}

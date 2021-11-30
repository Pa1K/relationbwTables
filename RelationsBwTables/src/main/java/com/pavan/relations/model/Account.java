package com.pavan.relations.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.pavan.relations.model.primary.AccountId;

@Entity
@IdClass(value = AccountId.class)
public class Account {
	
	@Id
	private String accountNumber;
	
	@Id
	private String accountType;
}

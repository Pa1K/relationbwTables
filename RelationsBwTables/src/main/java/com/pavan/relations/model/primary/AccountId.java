package com.pavan.relations.model.primary;

import java.io.Serializable;

public class AccountId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountNumber;
	private String accountType;
	
	public AccountId(String accountNumber, String accountType) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	
	

}

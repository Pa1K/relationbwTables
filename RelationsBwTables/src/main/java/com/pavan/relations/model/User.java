package com.pavan.relations.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 private String username;
	 
	 /**
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn
	 private Address address;
	 */
	 
	 /**
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinTable(name="user_address")
	 private Address address;
	 */
	 
	 
	 @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	 @PrimaryKeyJoinColumn
	 private Address address;
	 
	 
	/** 
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	*/
	
	 
	 /** 
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn
		private List<Address> address = new ArrayList<>();
		*/
		
	/** @JoinColumn or @JoinColumn(name="address_id") creates address_id in the address table*/
	
	 
		/*
		 * @OneToMany(cascade = CascadeType.ALL,mappedBy = "user") private List<Address>
		 * address = new ArrayList<>();
		 */
	 
		/*
		 * @ManyToMany(cascade = CascadeType.ALL) private Set<Address> address = new
		 * HashSet<>();
		 */
	
	
		/*
		 * @ManyToMany(cascade = CascadeType.ALL)
		 * 
		 * @JoinTable(name="user_address", joinColumns = {@JoinColumn(name="user_id1")},
		 * inverseJoinColumns = {@JoinColumn(name="addressId1")}) private Set<Address>
		 * address = new HashSet<>();
		 */
	 	
		/*
		 * @ManyToMany(cascade = CascadeType.ALL) private Set<Address> address = new
		 * HashSet<>();
		 */
	 	
	 
		/*
		 * public List<Address> getAddress() { return address; } public void
		 * setAddress(List<Address> address) { this.address = address; }
		 */
	
	 
	/*
	 * public Set<Address> getAddress() { return address; } public void
	 * setAddress(Set<Address> address) { this.address = address; }
	 */
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	  public Address getAddress() { return address; } public void
	  setAddress(Address address) { this.address = address; }
	 
	
	
	public User() {
		super();
	}
	
	public User(String username) {
		this.username = username;
	}
	 
	
	 
}

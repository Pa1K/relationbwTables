package com.pavan.relations.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	 */
	
	@Id
	private Long id;
	private String street;
	private String city;

	/*
	 * @OneToOne(mappedBy = "address",cascade = CascadeType.ALL) private User user;
	 */

	
	@OneToOne
	 @MapsId
	@JoinColumn(name="user_id") 
	private User user;
	

	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn private User user;
	 */
			 
	/*
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "address") private
	 * Set<User> user = new HashSet<>();
	 */
	
	/*
	 * public Set<User> getUser() { return user; }
	 * 
	 * public void setUser(Set<User> user) { this.user = user; }
	 */

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public Address() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	 public User getUser() { return user; }
	 
	 public void setUser(User user) { this.user = user; }
	 
	
	

}

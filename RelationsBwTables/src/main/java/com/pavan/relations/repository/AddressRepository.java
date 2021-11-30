package com.pavan.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.relations.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}

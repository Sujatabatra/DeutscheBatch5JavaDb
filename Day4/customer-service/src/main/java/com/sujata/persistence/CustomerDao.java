package com.sujata.persistence;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Customer;

/*
 * JpaRepository<Entity,type of primary key>
 */
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	/*
	 * While writing the query, use JPQL ( Java Persistence query language) syntax,
	 * As per JPQL syntax, make use of class name instead of table name 
	 * and make use of class property name instead of column name while writing the query
	 */
	@Query("from Customer where customerId=:cId ")
	ArrayList<Customer> findCustomerByCustomerId(@Param("cId")String customerId);
	

}

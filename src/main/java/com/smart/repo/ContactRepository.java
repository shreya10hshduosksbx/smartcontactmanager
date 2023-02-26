package com.smart.repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.Entities.Contacts;
import com.smart.Entities.User;

public interface ContactRepository extends JpaRepository<Contacts,Integer>{
//pegination
	
	
	@Query("from Contacts as c where c.user.id =:UserId")
	//current page
	//contact per page
	public Page<Contacts> findContactsByUser(@Param("UserId") int UserId, Pageable pePageable );
	
	
	
}

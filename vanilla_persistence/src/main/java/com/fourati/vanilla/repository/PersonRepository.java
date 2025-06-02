package com.fourati.vanilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourati.vanilla.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}

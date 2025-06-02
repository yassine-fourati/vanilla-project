package com.fourati.vanilla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourati.vanilla.entity.Person;
import com.fourati.vanilla.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;

    public Person savePerson(Person person) {
        return repository.save(person);
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

}

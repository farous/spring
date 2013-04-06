package fr.fares.service;

import java.util.Collection;

import fr.fares.domain.Person;

public interface PersonService {

	Person get(Integer id);

	Collection<Person> getAll();

}

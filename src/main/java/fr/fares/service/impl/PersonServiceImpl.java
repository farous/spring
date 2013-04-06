package fr.fares.service.impl;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import fr.fares.dao.PersonDao;
import fr.fares.domain.Person;
import fr.fares.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Inject
	private PersonDao personDao;

	Collection<Person> persons;

	@PostConstruct
	public void init() {
		persons = personDao.getAll();
	}

	@Override
	public Person get(Integer id) {
		for (Person person : persons) {
			if (person.getId().equals(id))
				return person;
		}
		return null;
	}

	@Override
	public Collection<Person> getAll() {
		return persons;
	}
}

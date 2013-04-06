package fr.fares.dao.impl;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import fr.fares.dao.PersonDao;
import fr.fares.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	public Collection<Person> getAll() {
		Person p1 = new Person();
		p1.setId(1);
		p1.setFirstName("fares");
		p1.setLastName("mokhtari");
		Person p2 = new Person();
		p2.setId(2);
		p2.setFirstName("toto");
		p2.setLastName("titi");
		return Arrays.asList(p1, p2);
	}

}

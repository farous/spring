package fr.fares.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.fares.service.PersonService;

@Controller
public class PersonController {

	private PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/")
	public String list(ModelMap model) {
		model.put("persons", personService.getAll());
		return "list";
	}

	@RequestMapping("/person/{id}")
	public String detail(@PathVariable(value = "id") Integer personId,
			ModelMap model) {
		model.put("person", personService.get(personId));
		return "detail";
	}
}

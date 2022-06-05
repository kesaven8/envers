package com.learnSpring.envers.controller;

import com.learnSpring.envers.entity.Person;
import com.learnSpring.envers.repository.PersonRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("delete-person")
    public void deletePerson() {
        personRepository.deleteAll();
    }

    @PostMapping("add-person")
    public void addperson() {
        Person person = Person.builder()
                .name("kesaven")
                .surname("vulliamy")
                .build();
        personRepository.save(person);
    }
}

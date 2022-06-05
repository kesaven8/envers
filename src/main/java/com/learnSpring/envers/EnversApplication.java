package com.learnSpring.envers;

import com.learnSpring.envers.entity.Person;
import com.learnSpring.envers.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@SpringBootApplication
@Transactional
public class EnversApplication implements CommandLineRunner {

    private final PersonRepository personRepository;

    public EnversApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EnversApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Person person = Person.builder()
                .name("kesaven")
                .surname("vulliamy")
                .build();

            personRepository.save(person);

    }

    @Override
    public void run(String... args) throws Exception {

    }
}

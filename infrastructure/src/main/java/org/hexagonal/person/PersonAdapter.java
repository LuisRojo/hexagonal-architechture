package org.hexagonal.person;

import lombok.AllArgsConstructor;
import org.hexagonal.person.document.PersonDocument;
import org.hexagonal.person.mapper.PersonAdapterMapper;
import org.hexagonal.person.model.Person;
import org.hexagonal.person.ports.ioutbound.PersonPort;
import org.hexagonal.person.repository.PersonRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonAdapter implements PersonPort {

    private final PersonRepository repository;

    private final PersonAdapterMapper mapper;

    @Override
    public Person findPerson() {

        PersonDocument result = repository.findByName("Luis");
        return mapper.toDomain(result);
    }
}

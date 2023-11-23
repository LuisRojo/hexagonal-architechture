package org.hexagonal.person;

import lombok.AllArgsConstructor;
import org.hexagonal.person.model.Person;
import org.hexagonal.person.ports.inbound.FindPersonUseCase;
import org.hexagonal.person.ports.ioutbound.PersonPort;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindPersonUseCaseImpl implements FindPersonUseCase {

    private final PersonPort personPort;
    @Override
    public Person findPerson() {
        return personPort.findPerson();
    }
}

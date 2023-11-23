package org.hexagonal.person.ports.inbound;

import org.hexagonal.person.model.Person;

public interface FindPersonUseCase {

    Person findPerson();

}

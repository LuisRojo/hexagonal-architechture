package org.hexagonal.person.ports.ioutbound;

import org.hexagonal.person.model.Person;

public interface PersonPort {

    Person findPerson();
}

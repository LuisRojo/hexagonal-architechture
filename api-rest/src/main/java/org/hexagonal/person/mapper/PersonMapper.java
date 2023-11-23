package org.hexagonal.person.mapper;

import org.hexagonal.openapi.model.PersonResponse;
import org.hexagonal.person.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonResponse toResponse(Person person);

}

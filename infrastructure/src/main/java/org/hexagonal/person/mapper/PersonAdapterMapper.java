package org.hexagonal.person.mapper;

import org.hexagonal.person.document.PersonDocument;
import org.hexagonal.person.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonAdapterMapper {

    @Mapping(target = "id",source = "personId")
    Person toDomain(PersonDocument personDocument);
}

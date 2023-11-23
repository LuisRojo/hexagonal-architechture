package org.hexagonal.person.controller;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.PersonApi;
import org.hexagonal.openapi.model.PersonResponse;
import org.hexagonal.person.mapper.PersonMapper;
import org.hexagonal.person.model.Person;
import org.hexagonal.person.ports.inbound.FindPersonUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController implements PersonApi {

    private final FindPersonUseCase findPersonUseCase;

    private final PersonMapper mapper;

    @Override
    public ResponseEntity<PersonResponse> personInfo() {

        Person result = findPersonUseCase.findPerson();
        return ResponseEntity.ok(mapper.toResponse(result));
    }
}

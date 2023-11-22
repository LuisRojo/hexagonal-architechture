package org.hexagonal;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.PersonApi;
import org.hexagonal.openapi.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController implements PersonApi {

    @Override
    public ResponseEntity<Person> personInfo() {
        Person person = new Person();
        person.setId(1);
        person.setName("Luis");
        return ResponseEntity.ok(person);
    }
}

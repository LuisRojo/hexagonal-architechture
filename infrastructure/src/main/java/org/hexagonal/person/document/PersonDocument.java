package org.hexagonal.person.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "persons")
public class PersonDocument {

    @Id
    private String id;

    private String personId;

    private String name;
}

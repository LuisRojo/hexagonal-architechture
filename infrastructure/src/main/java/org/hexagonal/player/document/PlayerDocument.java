package org.hexagonal.player.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "players")
public class PlayerDocument {

    @Id
    private String id;

    @Indexed(unique = true)
    private UUID identification;

    private String name;

    private String position;
}

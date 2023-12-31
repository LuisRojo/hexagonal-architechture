package org.hexagonal.player.repository;

import org.hexagonal.player.document.PlayerDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PlayerRepository extends MongoRepository<PlayerDocument, String> {

    Optional<PlayerDocument> findByName(String name);

    Optional<PlayerDocument> findByPosition(String surname);

    Optional<PlayerDocument> findByIdentification(UUID id);

}

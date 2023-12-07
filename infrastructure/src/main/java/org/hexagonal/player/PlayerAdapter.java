package org.hexagonal.player;

import lombok.AllArgsConstructor;
import org.hexagonal.player.document.PlayerDocument;
import org.hexagonal.player.exception.PlayerNotFoundException;
import org.hexagonal.player.mapper.PlayerAdapterMapper;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.ioutbound.PlayerPort;
import org.hexagonal.player.repository.PlayerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class PlayerAdapter implements PlayerPort {

    private final PlayerRepository repository;

    private final PlayerAdapterMapper mapper;

    @Override
    public List<Player> findAll() {
        return mapper.toDomain(repository.findAll(Sort.by("name").ascending()));
    }

    @Override
    public Player findPlayer(UUID playerID) {
        Optional<PlayerDocument> result = repository.findByIdentification(playerID);
        return result.map(mapper::toDomain).orElseThrow(() -> new PlayerNotFoundException("Player not found"));
    }

    @Override
    public void save(Player player) {
        repository.save(mapper.toDocument(player));
    }


}

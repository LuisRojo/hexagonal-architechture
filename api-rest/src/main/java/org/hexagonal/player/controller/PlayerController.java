package org.hexagonal.player.controller;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.PlayerApi;
import org.hexagonal.openapi.model.PlayerRequest;
import org.hexagonal.openapi.model.PlayerResponse;
import org.hexagonal.player.mapper.PlayerMapper;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.inbound.FindAllPlayerUseCase;
import org.hexagonal.player.ports.inbound.FindPlayerUseCase;
import org.hexagonal.player.ports.inbound.SavePlayerUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class PlayerController implements PlayerApi {

    private static final Logger LOG = LoggerFactory.getLogger(PlayerController.class);

    private final FindPlayerUseCase findPlayerUseCase;

    private final SavePlayerUseCase savePlayerUseCase;

    private final FindAllPlayerUseCase findAllPlayerUseCase;

    private final PlayerMapper mapper;

    @Override
    public ResponseEntity<List<PlayerResponse>> allPlayers() {
        return ResponseEntity.ok(mapper.toResponse(findAllPlayerUseCase.findAllPlayers()));
    }

    @Override
    public ResponseEntity<PlayerResponse> playerInfo(String playerIdPathParam) {
        LOG.info("Player Id to Find => {}",playerIdPathParam);
        Player result = findPlayerUseCase.findPlayer(UUID.fromString(playerIdPathParam));
        return ResponseEntity.ok(mapper.toResponse(result));
    }


    @Override
    public ResponseEntity<Void> savePlayer(PlayerRequest player) {
        LOG.info("Requested to save player with this parameters => {}", player.toString());
        savePlayerUseCase.savePlayer(mapper.toDomain(player));
        return ResponseEntity.ok().build();
    }
}

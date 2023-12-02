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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController implements PlayerApi {

    private final FindPlayerUseCase findPlayerUseCase;

    private final SavePlayerUseCase savePlayerUseCase;

    private final FindAllPlayerUseCase findAllPlayerUseCase;

    private final PlayerMapper mapper;

    @Override
    public ResponseEntity<List<PlayerResponse>> allPlayers() {
        return ResponseEntity.ok(mapper.toResponse(findAllPlayerUseCase.findAllPlayers()));
    }

    @Override
    public ResponseEntity<PlayerResponse> playerInfo() {

        Player result = findPlayerUseCase.findPlayer();
        return ResponseEntity.ok(mapper.toResponse(result));
    }

    @Override
    public ResponseEntity<Void> savePlayer(PlayerRequest player) {
        savePlayerUseCase.savePlayer(mapper.toDomain(player));
        return ResponseEntity.ok().build();
    }
}

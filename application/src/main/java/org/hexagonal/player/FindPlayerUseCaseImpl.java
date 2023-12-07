package org.hexagonal.player;

import lombok.AllArgsConstructor;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.inbound.FindPlayerUseCase;
import org.hexagonal.player.ports.ioutbound.PlayerPort;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class FindPlayerUseCaseImpl implements FindPlayerUseCase {

    private final PlayerPort playerPort;
    @Override
    public Player findPlayer(UUID playerId) {
        return playerPort.findPlayer(playerId);
    }
}

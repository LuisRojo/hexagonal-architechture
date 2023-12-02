package org.hexagonal.player;

import lombok.AllArgsConstructor;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.inbound.FindPlayerUseCase;
import org.hexagonal.player.ports.ioutbound.PlayerPort;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindPlayerUseCaseImpl implements FindPlayerUseCase {

    private final PlayerPort playerPort;
    @Override
    public Player findPlayer() {
        return playerPort.findPlayer();
    }
}

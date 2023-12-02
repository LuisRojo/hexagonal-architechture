package org.hexagonal.player;

import lombok.AllArgsConstructor;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.inbound.FindAllPlayerUseCase;
import org.hexagonal.player.ports.ioutbound.PlayerPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FindAllPlayerUseCaseImpl implements FindAllPlayerUseCase {

    private final PlayerPort playerPort;

    @Override
    public List<Player> findAllPlayers() {
        return playerPort.findAll();
    }
}

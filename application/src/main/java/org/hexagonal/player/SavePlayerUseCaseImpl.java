package org.hexagonal.player;

import lombok.AllArgsConstructor;
import org.hexagonal.player.model.Player;
import org.hexagonal.player.ports.inbound.SavePlayerUseCase;
import org.hexagonal.player.ports.ioutbound.PlayerPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class SavePlayerUseCaseImpl implements SavePlayerUseCase {

    private final PlayerPort playerPort;
    @Override
    public void savePlayer(Player player) {
        playerPort.save(generateIdentification(player));
    }

    private Player generateIdentification(Player player){
        return new Player(UUID.randomUUID(), player.name(), player.position());
    }
}

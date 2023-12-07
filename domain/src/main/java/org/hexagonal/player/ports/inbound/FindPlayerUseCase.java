package org.hexagonal.player.ports.inbound;

import org.hexagonal.player.model.Player;

import java.util.UUID;

public interface FindPlayerUseCase {

    Player findPlayer(UUID playerId);

}

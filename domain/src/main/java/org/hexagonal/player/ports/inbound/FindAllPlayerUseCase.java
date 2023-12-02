package org.hexagonal.player.ports.inbound;

import org.hexagonal.player.model.Player;

import java.util.List;

public interface FindAllPlayerUseCase {

    List<Player> findAllPlayers();
}

package org.hexagonal.player.ports.inbound;

import org.hexagonal.player.model.Player;

public interface SavePlayerUseCase {

    void savePlayer(Player player);
}

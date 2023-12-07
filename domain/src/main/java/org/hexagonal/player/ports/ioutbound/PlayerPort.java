package org.hexagonal.player.ports.ioutbound;

import org.hexagonal.player.model.Player;
import java.util.List;
import java.util.UUID;

public interface PlayerPort {

    List<Player> findAll();

    Player findPlayer(UUID playerID);

    void save(Player player);
}

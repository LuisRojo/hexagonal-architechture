package org.hexagonal.player.ports.ioutbound;

import org.hexagonal.player.model.Player;
import java.util.List;

public interface PlayerPort {

    List<Player> findAll();

    Player findPlayer();

    void save(Player player);
}

package org.hexagonal.player.mapper;

import org.hexagonal.openapi.model.PlayerRequest;
import org.hexagonal.openapi.model.PlayerResponse;
import org.hexagonal.player.model.Player;
import org.mapstruct.Mapper;
import java.util.List;


@Mapper(componentModel = "spring")
public interface PlayerMapper {

    List<PlayerResponse> toResponse(List<Player> player);

    PlayerResponse toResponse(Player player);

    Player toDomain(PlayerRequest player);
}

package org.hexagonal.player.mapper;

import org.hexagonal.openapi.model.PlayerRequest;
import org.hexagonal.openapi.model.PlayerResponse;
import org.hexagonal.player.model.Player;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerResponse toResponse(Player player);

    Player toDomain(PlayerRequest player);
}

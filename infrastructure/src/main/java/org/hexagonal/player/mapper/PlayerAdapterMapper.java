package org.hexagonal.player.mapper;

import org.hexagonal.player.document.PlayerDocument;
import org.hexagonal.player.model.Player;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerAdapterMapper {

    PlayerAdapterMapper mapper = Mappers.getMapper(PlayerAdapterMapper.class);

    List<Player> toDomain(List<PlayerDocument> playerDocument);

    Player toDomain(PlayerDocument playerDocument);

    PlayerDocument toDocument(Player player);

}

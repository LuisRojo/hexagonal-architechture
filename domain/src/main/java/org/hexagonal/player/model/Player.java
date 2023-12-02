package org.hexagonal.player.model;

import java.util.UUID;

public record Player(UUID identification, String name, String position) {}

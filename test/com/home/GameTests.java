package com.home;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GameTests {
    private Game game = new Game();

    @Test
    public void spawnMonsterTest() {
        assertNotNull("Couldn't spawn a monster", game.spawnMonster());
    }
}

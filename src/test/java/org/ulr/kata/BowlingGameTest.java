package org.ulr.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setup() {
        game = new BowlingGame();
    }

    @Test
    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());

    }

    @Test
    public void allOnesGame() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }


}
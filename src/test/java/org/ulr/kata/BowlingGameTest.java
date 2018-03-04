package org.ulr.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    // listes
    // + test gouttieres
    // + test que des 1
    // + nommage i
    // + duplication dans tests
    // + nommage code // i
    // + commentaire moche code //spare
    // + commentaire test //spare
    // + test 1 spare
    // + test 1 strike
    // + comment code //strike
    // + comment test //strike
    // + code frameIndex pas parlant
    // + test perfect game

    private BowlingGame g;

    @Before
    public void setUp() {
        g = new BowlingGame();
    }

    @Test
    public void testGutterGame() {
        // when
        rollMany(20, 0);

        // then
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() {
        // when
        rollMany(20, 1);

        // then
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);

        rollMany(17, 0);

        // then
        assertEquals(16, g.score());
    }

    @Test
    public void testOneSrike() {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);

        // then
        assertEquals(24, g.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, g.score());
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }
}
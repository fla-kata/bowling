package org.ulr.kata;

/**
 * Exigences :
 * Ecrire deux méthodes :
 * 1- une methode roll(pins : int) où pins = nombre de quilles tombées
 * 2- score(): int laquelle est appelée à la fin de la partie et retourne le score
 */
public class BowlingGame {

    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < rolls.length; i++) {
            score += rolls[i];
        }
        return score;
    }
}

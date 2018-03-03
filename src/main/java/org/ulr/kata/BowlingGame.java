package org.ulr.kata;

/**
 * Exigences :
 * Ecrire deux méthodes :
 * 1- une methode roll(pins : int) où pins = nombre de quilles tombées
 * 2- score(): int laquelle est appelée à la fin de la partie et retourne le score
 */
public class BowlingGame {

    private int score;

    public void roll(int i) {
        score += i;
    }

    public int score() {
        return score;
    }
}

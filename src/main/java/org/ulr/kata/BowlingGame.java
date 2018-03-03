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
        // 1) on pourrait utiliser un flag pour marquer le spare
        // 2) ou se dire que la conception est mauvaise ...
        // roll = calcul le score mais le nom n'indique pas ca
        score += i;
    }

    public int score() {
        // score ne calcule pas le score
        return score;
    }
}

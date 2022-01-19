package model.game;

public class Tile {

    private static int points;
    private char letter;

    public Tile(char letter, int points){
        this.letter = letter;
        this.points = points;
    }

    public char getLetter() {
        return letter;
    }

    public static int getPoints() {
        return points;
    }
}

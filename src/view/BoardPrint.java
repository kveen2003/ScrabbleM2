package view;

import model.game.Board;
import model.game.Square;
import model.game.Tile;
import utils.ANSI;


public class BoardPrint {

    public static void main(String[] args) {

    }

    public static String makeBoard(Board board){
        java.lang.StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("   ");


        for(int i = 0; i < Board.SIZE; i++){
            stringBuilder.append("  " + ((char) (65 + i)) + "  ");
        }
        stringBuilder.append("\n");
        stringBuilder.append("   ╔");

        for (int i = 0; i < Board.SIZE; i++) {
            stringBuilder.append("═══╦");
        }
        stringBuilder.append("═══╗");
        stringBuilder.append("\n");

        for (int j = 0; j < Board.SIZE; j++) {
            stringBuilder.append(" " + (j < 9? " " : "") + (j+1) + " ");
            stringBuilder.append("║");
            for (int i = 0; i < Board.SIZE; i++) {
                Square square = board.getSquare(i, j);
                switch (square.getSpecialType()){
                    case CENTRE :
                        stringBuilder.append(ANSI.CYAN_BACKGROUND_BRIGHT);
                        break;
                    case TRIPLE_LETTER:
                        stringBuilder.append(ANSI.BLUE_BACKGROUND);
                        break;
                    case DOUBLE_LETTER:
                        stringBuilder.append(ANSI.PURPLE_BACKGROUND);
                        break;
                    case TRIPLE_WORD:
                        stringBuilder.append(ANSI.RED_BACKGROUND);
                        break;
                    case DOUBLE_WORD:
                        stringBuilder.append(ANSI.YELLOW_BACKGROUND);
                        break;
                    default:

                }

                Tile tile = square.getTile();
                stringBuilder.append("   " + (tile != null ? tile.getLetter() : " ") + " ");
                stringBuilder.append(ANSI.RESET);
                stringBuilder.append("║");
            }
            stringBuilder.append("\n   ");
            if(j < Board.SIZE-1){
                stringBuilder.append("╠");
            } else {
                stringBuilder.append("╚");
            }
            for (int i = 0; i < Board.SIZE; i++) {
                if(j == Board.SIZE - 1 && i < Board.SIZE-1){
                    stringBuilder.append("═══╩");
                } else if(j == Board.SIZE-1 && i == Board.SIZE-1){
                    stringBuilder.append("═══╝");
                } else if(j < Board.SIZE -1 && i == Board.SIZE-1){
                    stringBuilder.append("═══╣");
                } else {
                    stringBuilder.append("═══╬");
                }
            }
            stringBuilder.append("\n");
        }
        stringBuilder.append(ANSI.RESET);
        return stringBuilder.toString();

    }

}

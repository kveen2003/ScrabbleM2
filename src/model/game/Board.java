package model.game;

public class Board {

    public static final int SIZE = 15;
    private Square[][] field;


    public Board(Square[][] field){
        field = new Square[SIZE][SIZE];
        for(int col = 0; col < SIZE; col++){
            for (int row = 0; row < SIZE; row++) {
                if(field[row][col] == null){
                    field[row][col] = new Square();
                }
            }
        }
    }

    public Square placeTile(int x, int y, Tile tile){
        this.field[x][y].setTile(tile);
        return this.field[x][y];
    }

    public Square getSquare(int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return null;
        }
        return this.field[x][y];
    }

    public Board clone(){
        Square[][] newSquare = new Square[SIZE][SIZE];
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                newSquare[x][y] =  field[x][y].clone();
            }
        }
        return new Board(newSquare);
    }



}

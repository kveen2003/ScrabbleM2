package model.game;

public class Board {

    public static final int SIZE = 15;
    private Square[][] squares;


    public Board(Square[][] squares){
        this.squares = squares;
    }

    public Square placeTile(int x, int y, Tile tile){
        this.squares[x][y].setTile(tile);
        return this.squares[x][y];
    }

    public Square getSquare(int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return null;
        }
        return this.squares[x][y];
    }

    public Board clone(){
        Square[][] newSquare = new Square[SIZE][SIZE];
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                newSquare[x][y] =  squares[x][y].clone();
            }
        }
        return new Board(newSquare);
    }



}

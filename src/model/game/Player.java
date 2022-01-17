package model.game;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

//    public int determineMove[](Model.Board board){
//        int choice[] = determineMove;
//        //board.getSquare(choice, placeTile());
//        return determineMove[];
//    }

}

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int determineMove(Board board) {
        int choice = determineMove(board);
        //board.getSquare(choice, placeTile());
        return 0;
    }

}

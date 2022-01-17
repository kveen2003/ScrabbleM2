package model.game;

import java.util.*;

public class Game {

    public static final int MAX_NUMBER_PLAYERS = 4;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 0;

    private List<Tile> availableTiles;
    private Board board;
    private List<Player> players;

    private Map<Player, List<Tile>> decks = new HashMap<>();
    private Map<Player, Integer> scores = new HashMap<>();
    private int currentPlayerIndex;

    //private ScrabbleWordChecker scrabbleWordChecker = new InMemoryScrabbleWordChecker();

    public Game(List<Player> players){
        //Generate and shuffle tiles
        //this.availableTiles = TilesGenerator.generateTiles();
        //Collections.shuffle(this.availableTiles);

        //Generate board
        //this.board = BoardGenerator.generateBoard();

        //Assign players to game
        //this.players = players;
        Random random = new Random();
        currentPlayerIndex = random.nextInt(players.size());

        //Assign tiles to players
        for(Player player : players){
            List<Tile> handout = availableTiles.subList(0,7);
            decks.put(player, new ArrayList<>(handout));
            availableTiles.removeAll(handout);
        }
    }

    public Board getBoard() {
        return this.board;
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }

    public int doMove(/*List<TilePlacement> placements, */Player player){
        return 0;
    }

//    public int calculateScore(List<TilePlacement> placements){
//        return 0;
//    }

//    public static List<Tile> generateTiles(){
//        //List<TileDescription> input = new ArrayList<>();
//        return null;
//
//    }






}

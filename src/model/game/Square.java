package model.game;

public class Square {

    private Tile tile;
    private SpecialType specialType;
    private int[] location;

    public enum SpecialType {
        CENTRE, DOUBLE_WORD, TRIPLE_WORD, DOUBLE_LETTER, TRIPLE_LETTER
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public Tile getTile() {
        return this.tile;
    }

    public SpecialType getSpecialType() {
        return this.specialType;
    }

    public void setSpecialType(SpecialType specialType) {
        this.specialType = specialType;
    }

    public int[] getLocation() {
        return this.location;
    }

    public Square clone(){
        //implement method here
        return null;
    }

//    public Model.Square(int x, int y, Model.Square.type type){
//
//    }

}

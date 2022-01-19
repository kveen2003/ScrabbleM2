package model.services;

import model.game.Tile;

public class TileDescription extends Tile{

        int initialCapacity;
        Tile letter;
        int quantity;
        Tile points;

        public TileDescription(char letter, int quantity, int points){
                super(letter, points);
                this.quantity = quantity;
        }

        public int getQuantity() {
                return this.quantity;
        }

}

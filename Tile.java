/**
 * file header
 * Handles the abstract class Tile
 */
package sakordekar_mangesh;

/**
 * public abstract class Tile
 * Tile forms the building blocks of the city Four classes are derived from tile.
 * It also has an abstract function for its children to override.
 */
public abstract class Tile {

    //Symbol defaults to empty
    private String symbol="▫";

    /*
        public abstract void Accept(Visitor v)
        abstract function the visits each class and carry out various tasks.
     */
    public abstract void Accept(Visitor v);

    //Setter for the symbol
    public void setTile(String x) {
        symbol = x;
    }

    public String getTile()
    {
        return symbol;
    }
}

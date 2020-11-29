/**
 * File Header
 * this file handles empty tiles
 */
package sakordekar_mangesh;

/**
 * public class Empty
 * class empty extends tile. It handles an empty tile.
 */
public class Empty extends Tile {

    //constructor
    Empty() {
        setTile("▫");
    }

    //Overrides accept function
    @Override
    public void Accept(Visitor v) {
        v.visitEmpty(this);
    }
}

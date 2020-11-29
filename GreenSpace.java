/**
 * file header
 * This file handles the  Green spaces in the java city
 */
package sakordekar_mangesh;

/**
 * public class GreenSpace
 * class GreenSpace extends Tile. It handles the green spaces in the java city
 */
public class GreenSpace extends Tile {

    //Constructor
    GreenSpace() {
        setTile("⚵");
    }

    //Overrides accept function
    @Override
    public void Accept(Visitor v) {
        v.visitGreenSpace(this);
    }
}

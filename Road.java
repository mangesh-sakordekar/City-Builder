/**
 * file Header
 * this file handles the road tiles
 */
package sakordekar_mangesh;

/**
 * public class Road
 * class Road extends Tile. It sets a tile to road in the java city
 */
public class Road extends Tile {

    //Constructor
    Road() {
        setTile("━");
    }

    //Overrides accept function
    @Override
    public void Accept(Visitor v) {
        v.visitRoad(this);
    }
}

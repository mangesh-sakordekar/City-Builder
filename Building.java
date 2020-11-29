/**
 * File Header
 * The file contains class Building which extends class Tile.
 */

package sakordekar_mangesh;

/**
 * class Building
 * class Building extends Tile. It stores the buildinngs in the city
 *
 * functions:
 * Building()
 * public void Accept(Visitor v)
 */
public class Building extends Tile {

    //Sets an empty tile to building
    Building() {
        setTile("⌂");
    }

    @Override
    public void Accept(Visitor v) {

        v.visitBuilding(this);
    }
}

/**
 * file header
 * handle functions to determine if a tile is road of=r not
 */
package sakordekar_mangesh;

/**
 * public class IsRoad
 * class IsRoad implements Visitor. It checks if the tile passed in is a road or not
 */
public class IsRoad implements Visitor {

    //Variables
    private boolean is_road;

    //Checks for each type of tile
    public void visitEmpty(Empty tile){is_road = false;}

    public void visitBuilding(Building tile){is_road = false;}

    //Sets is road true if it encounters a road
    public void visitRoad(Road tile){is_road = true;}

    public void visitGreenSpace(GreenSpace tile){is_road = false;}

    //Returns the is_road
    public boolean isRoad(){ return is_road;}
}

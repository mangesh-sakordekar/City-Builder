/**
 * file header
 * File contains class count which counts each type of tile
 */
package sakordekar_mangesh;

/**
 * class Count
 * Class Count implements the interface Visitor.
 * It defines the abstract functions in the interface and has its own functions
 * It handles the tasks of counting number of each type of tile.
 *
 */
public class Count implements Visitor {

    //Counters
    private int empty_count=0;
    private int road_count=0;
    private int building_count=0;
    private int green_count=0;

    //intrement empty counter
    public void visitEmpty(Empty tile){empty_count++;}

    //Increment Building counter
    public void visitBuilding(Building tile){building_count++;}

    //Increments Road counter
    public void visitRoad(Road tile){road_count++;}

    //Increments green space counter
    public void visitGreenSpace(GreenSpace tile){green_count++;}


    //Getters for counters
    public int getEmptyCount(){return empty_count;}

    public int getRoadCount(){return road_count;}

    public int getBuildingCount(){return building_count;}

    public int getGreenSpaceCount(){return green_count;}

}

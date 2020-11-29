/**
 * file header
 * The file contains the interface visitor
 */
package sakordekar_mangesh;

/**
 * public interface Visitor
 * The visitor goes through each tile in the city and carry out taks likr counting
 * changing colour, fixing tiles .
 */
public interface Visitor {

    /*
         void visitEmpty(Empty tile)
         Visits the empty classes and gethers information.
         a tile in passed in the function
     */
     void visitEmpty(Empty tile);

    /*
        void visitBuilding(Empty tile)
        Visits the building tiles and gethers information.
        a tile in passed in the function
    */
     void visitBuilding(Building tile);


    /*
        void visitRoad(Empty tile)
        Visits the Road tiles and gethers information and fixes them.
        a tile in passed in the function
    */
     void visitRoad(Road tile);


    /*
        void visitGreenSpace(Empty tile)
        Visits the grrenspace tiles for0 information.
        a tile in passed in the function
    */
     void visitGreenSpace(GreenSpace tile);

}

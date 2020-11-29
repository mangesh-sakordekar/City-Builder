/**
 * File Header
 * File City.java contains class City and the functions that
 * control the city array.
 */

package sakordekar_mangesh;

import java.lang.*;

/**
 * class City
 * Class city mimics a city. It is represented by a 5 by 5 array of Tiles.
 * It handles the tasks like adding a building or road or greenspace.
 *
 * functions
 * City()
 * public void printCity()
 * public void defaultCity()
 * public void countTile()
 * public void fixRoads()
 * public void setColor(int t, int colour)
 *
 * variables
 * private Tile[][] town = new Tile[5][5]
 *
 */
public class City {

    //arrra of tiles holds a city
    private Tile[][] town = new Tile[5][5];

    //constructor makes an empty city
    City() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                town[i][j] = new Empty();
                //count_tiles.visitEmpty((Empty)town[i][j]);
            }
        }
    }

    /*
        public void printCity()
        Prints the city to console
     */
    public void printCity()
    {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(town[i][j].getTile());
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }


    /*
        public void defaultCity()
        Makes the given default city.
     */
    public void defaultCity(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                town[i][j] = new Road();
            }
        }

        town[0][3] = new GreenSpace();
        town[0][4] = new GreenSpace();
        town[1][3] = new GreenSpace();
        town[4][4] = new GreenSpace();

        town[2][3] = new Building();
        town[3][3] = new Building();
    }


    /*
        public void setTile(int x, int y, Tile t)
        sets a tile in a city;
     */
    public void setTile(int x, int y, Tile t){
        town[x][y]= t;
    }


    /*
        public void removeTile(int x, int y)
        removes a tile from the city
     */
    public void removeTile(int x, int y){
        town[x][y] = new Empty();
    }


    /*
        public void countTile()
        counts the number of tiles of each format.
     */
    public void countTile(){

        Count cnt = new Count();
        for ( int i =0; i<5;i++){
            for ( int j =0;j<5;j++){
                town[i][j].Accept(cnt);
            }
        }
        System.out.println("Empty: " + cnt.getEmptyCount());
        System.out.println("Greenspace: " + cnt.getGreenSpaceCount());
        System.out.println("Roads: " + cnt.getRoadCount());
        System.out.println("Buildings: " + cnt.getBuildingCount());
    }


    /*
        public void fixRoads()
        Joins the adjoining roads
     */
    public void fixRoads(){

        //Array fo store locations of the road
        IsRoad is_road = new IsRoad();
        boolean[][] arr = new boolean[7][7];

        for(int i=0;i<7;i++)
            for(int j=0;j<7;j++)
                arr[i][j]=false;

        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                town[i][j].Accept(is_road);
                arr[i+1][j+1] = is_road.isRoad();
            }
        }

        //Check each road tile
        Fix fix_tile = new Fix();
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                fix_tile.setTop(arr[i-1][j]);
                fix_tile.setBottom(arr[i+1][j]);
                fix_tile.setRight(arr[i][j+1]);
                fix_tile.setLeft(arr[i][j-1]);
                town[i-1][j-1].Accept(fix_tile);
                town[i-1][j-1].setTile(fix_tile.getSym());
            }
        }
    }

    /*
        public void setColor(int t, int colour)
        Sets the colour of the tile.
     */
    public void setColor(int t, int colour){

        Color col = new Color();
        col.setColor_id(colour);
        col.setTile_choice(t);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                town[i][j].Accept(col);
                town[i][j].setTile(col.getString());
            }
        }
    }
}

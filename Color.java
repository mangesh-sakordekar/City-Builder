/**
 * File Header
 * the file handles the color of the tile
 */
package sakordekar_mangesh;

/**
 * public class Color
 * class Color implements Visitor. It handles the color of the tile.
 */
public class Color implements Visitor {

    //Variables
    private int color_id;
    private String colour;
    private int tile_choice;
    ColorText CT = new ColorText();

    //Handles Empty Class
    public void visitEmpty(Empty tile){

        String temp ="";
        temp += tile.getTile();
        colour = temp;
        if(tile_choice > 0 && tile_choice < 4 )
            return;
        switch(color_id) {
            case 1:
                colour = CT.colorString(temp, ColorText.Color.RED, false, false);
                break;
            case 2:
                colour = CT.colorString(temp, ColorText.Color.YELLOW, false, false);
                break;
            case 3:
                colour = CT.colorString(temp, ColorText.Color.BLUE, false, false);
                break;
            case 4:
                colour = CT.colorString(temp, ColorText.Color.GREEN, false, false);
                break;
            default:
                colour = CT.colorString(temp, ColorText.Color.BLACK, false, false);
                break;
        }
    }


    //Handles Building tile
    public void visitBuilding(Building tile){
        String temp ="";
        temp += tile.getTile();
        colour = temp;
        if(tile_choice != 2)
            return;
        switch(color_id){
            case 1:
                colour = CT.colorString(temp, ColorText.Color.RED, false, false);
                break;
            case 2:
                colour = CT.colorString(temp, ColorText.Color.YELLOW, false, false);
                break;
            case 3:
                colour = CT.colorString(temp, ColorText.Color.BLUE, false, false);
                break;
            case 4:
                colour = CT.colorString(temp, ColorText.Color.GREEN, false, false);
                break;
            default:
                colour = CT.colorString(temp, ColorText.Color.BLACK, false, false);
                break;
        }
    }


    //Handles Road tiles
    public void visitRoad(Road tile){
        String temp ="";
        temp += tile.getTile();
        colour =temp;
        if(tile_choice != 3)
            return;
        switch(color_id) {
            case 1:
                colour = CT.colorString(temp, ColorText.Color.RED, false, false);
                break;
            case 2:
                colour = CT.colorString(temp, ColorText.Color.YELLOW, false, false);
                break;
            case 3:
                colour = CT.colorString(temp, ColorText.Color.BLUE, false, false);
                break;
            case 4:
                colour = CT.colorString(temp, ColorText.Color.GREEN, false, false);
                break;
            default:
                colour = CT.colorString(temp, ColorText.Color.BLACK, false, false);
                break;
        }
    }


    //Handles green spaces
    public void visitGreenSpace(GreenSpace tile){
        String temp ="";
        temp += tile.getTile();
        colour = temp;
        if(tile_choice != 1)
            return;
        switch(color_id){
            case 1:
                colour = CT.colorString(temp, ColorText.Color.RED, false, false);
                break;
            case 2:
                colour = CT.colorString(temp, ColorText.Color.YELLOW, false, false);
                break;
            case 3:
                colour = CT.colorString(temp, ColorText.Color.BLUE, false, false);
                break;
            case 4:
                colour = CT.colorString(temp, ColorText.Color.GREEN, false, false);
                break;
            default:
                colour = CT.colorString(temp, ColorText.Color.BLACK, false, false);
                break;
        }
        //System.out.print(colour);
    }

    //Sets color id
    public void setColor_id(int ind){color_id =ind;}


    //returns the formatted string
    public String getString(){return colour;}


    //sets tile id
    public void setTile_choice(int x){tile_choice = x;}

}

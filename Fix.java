/**
 * file Header
 * The file contains the functions to handle joining of roads
 */

package sakordekar_mangesh;

/**
 * public class Fix
 * class Fix implements Visitor. It handles the joining fo adjoining roads
 * by using appropriate symbols
 */
public class Fix implements Visitor {

    //Variables
    private String sym;
    private boolean left, top, bot, right;

    //Handles empty tile
    public void visitEmpty(Empty tile){sym = tile.getTile();}

    //handles Buildings tile
    public void visitBuilding(Building tile){sym = tile.getTile();}

    //Handles road tile
    public void visitRoad(Road tile){
        setAdjacencies();
    }

    //Handles green space tile
    public void visitGreenSpace(GreenSpace tile){sym = tile.getTile();}

    //Setters for directions
    public void setRight(boolean x){right = x;}
    public void setLeft(boolean x){left = x;}
    public void setTop(boolean x){top = x;}
    public void setBottom(boolean x){bot = x;}

    /**
     * \brief Indicate the road tiles adjacent to this one
     *
     * The road time image chosen is dependent on the tiles around
     * it. This is where the adjacency of road tiles is indicated.
     *
     * \param left True if road tile to upper left
     * \param top True if road tile to upper right
     * \param bot True if road tile to lower left
     * \param right True if road tile to lower right
     */
    public void setAdjacencies()
    {
        sym="";
        // Create the adjacency code
        int code = (left ? 1 : 0) | (top ? 2 : 0) | (bot ? 4 : 0) | (right ? 8 : 0);

        //unicode list
        char symbols[] = {
                '━',      // 0 right
                '━',      // 1 right
                '┃',      // 2 ud
                '┛',      // 3 lu
                '┃',      // 4 ud
                '┓',      // 5 ld
                '┃',      // 6 ud
                '┫',     // 7 lud
                '━',      // 8 right
                '━',      // 9 right
                '┗',      // 10 top
                '┻',     // 11 lur
                '┏',      // 12 dr
                '┳',    // 13 ldr
                '┣',     // 14 udr
                '╋'    // 15 ludr
        };

        // symbols[code] now is the correct symbol
        //TODO set this
        sym += symbols[code];

    }

    //returns the generated symbol
    public String getSym(){return sym;}
}

/**
 * File Header
 * The file CityProgram handles the main and the menus of the program
 */

package sakordekar_mangesh;

import java.util.*;


/**
 * name:      Java City Program
 *
 * author:    Mangesh Sakordekar
 *
 * course:    CSC 461 Programming Languages
 * section:   M001
 * date:      09/27/2018
 *
 * version:  java10
 *
 * Description :
 * The Java City Program mimics a city with buildings, roads, green spaces
 * and empty spaces. The program uses visitors to manage the data handling.
 * It adds a tile, removes a tile.
 * It also colors tiles as given in the project description.
 * It also joins the adjoining roads.
 *
 * Classes :
 * public class CityProgram
 * public class City
 *
 * Bugs:
 * The road colour goes when they are fixed
 */


/**
 * class CityProgram
 * class citProgram handles the eorkking of the program.
 * It checks for exceptions and handles all the menus in the program.
 *
 * functions
 * public static void printMenu()
 * public static Tile makeTile()
 * public static Tile makeTile()
 * public static int selectColor()
 * public static int tileNum()
 * public static void main(String[] args)
 */

public class CityProgram {

    /*
        public static void printMenu()
        Prints the menu to promt the user.
     */
    public static void printMenu() {
        System.out.println("0) Make default City");
        System.out.println("1) Set Tile");
        System.out.println("2) Remove Tile");
        System.out.println("3) Count zones");
        System.out.println("4) Set tile color");
        System.out.println("5) Fix Roads");
        System.out.println("6) Quit");
        System.out.print("\nChoice:");
    }


    /*
        public static Tile makeTile()
        Promt the user to selct the tile type and makes an instance of it.
     */
    public static Tile makeTile(){
        Tile t = new Empty();
        int choice=0;
        do{
            System.out.print("Input tile type 1) greenspace 2) building 3) road #) empty: ");
            Scanner sc = new Scanner(System.in);
            try {
                choice = sc.nextInt();


                switch (choice) {
                    case 1:
                        t = new GreenSpace();
                        break;
                    case 2:
                        t = new Building();
                        break;
                    case 3:
                        t = new Road();
                        break;
                    default:
                        t = new Empty();
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("invalid input");
                choice = -1;
            }
        }while(choice == -1);
        return t;
    }


    /*
        public static int selectColor()
        Promts the user to select a color and does error checking.
     */
    public static int selectColor() {
        int choice;
        try{
            System.out.print("Input color 1) red 2) yellow 3) blue 4) green #) black: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("invalid input");
            System.out.println();
            choice = 7;
        }
        return choice;
    }

    /*
       public static int tileNum()
       promts the user to select a tlie type and does error checking.
     */
    public static int tileNum()
    {
        int choice;
        try{
            System.out.print("Input tile type 1) greenspace 2) building 3) road #) empty:  ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("invalid input");
            System.out.println();
            choice = 7;
        }
        return choice;
    }

    /*
        public static void main(String[] args)
        Main handles the program and drives though the menu
     */
    public static void main(String[] args){
        int choice;
        int x_pt=0, y_pt=0;
        Tile t1 ;
        City java_city = new City();

        do{
            java_city.printCity();
            printMenu();
            Scanner sc = new Scanner(System.in);
            try {
                choice = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("invalid input");
                System.out.println();
                choice = 7;
            }
            switch(choice) {
                case 0:
                    java_city.defaultCity();
                    break;
                case 1:
                    t1 = makeTile();
                    do {
                        System.out.print("Input location (x y): ");
                        try {
                            sc = new Scanner(System.in);
                            x_pt = sc.nextInt();
                            y_pt = sc.nextInt();
                        }
                        catch(InputMismatchException e ){
                            System.out.println("invalid input");
                            sc.nextLine();
                            x_pt = -1;
                            y_pt = -1;
                        }
                    }while(x_pt>=5 || x_pt<0 || y_pt>=5 || y_pt<0);
                    java_city.setTile(x_pt, y_pt, t1);
                    break;
                case 2 :

                    do {
                        System.out.print("Input location (x y): ");
                        try {
                            sc = new Scanner(System.in);
                            x_pt = sc.nextInt();
                            y_pt = sc.nextInt();
                        }
                        catch(InputMismatchException e){
                            System.out.println("invalid input");
                            sc.nextLine();
                            x_pt = -1;
                            y_pt = -1;
                        }
                    } while (x_pt >= 5 || x_pt < 0 || y_pt >= 5 || y_pt < 0);

                    java_city.removeTile(x_pt,y_pt);
                    break;
                case 3 :
                    java_city.countTile();
                    break;
                case 4 :
                    int tchoice = tileNum();
                    int ind = selectColor();
                    java_city.setColor(tchoice, ind);
                    break;
                case 5 :
                    java_city.fixRoads();
                    break;
                default:
                    break;
            }

        }while(choice!=6);
    }
}

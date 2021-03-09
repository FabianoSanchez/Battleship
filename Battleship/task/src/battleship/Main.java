package battleship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] battlefield = new char[10][10];

        char fogOfWar = '~';
        char cellOfShip = 'O';
        char shipWasHit = 'X';
        char miss = 'M';
        char letterCoordinates = 'A';


        int aircraftCarrier = 5;
        String aircraftCarrierCoordinates1;
        String aircraftCarrierCoordinates2;
        int battleship = 4;
        int submarine = 3;
        int cruiser = 3;
        int destroyer = 2;



        /**
         * Fills the array with fog of war.
         */
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield.length; j++) {
                battlefield[i][j] = fogOfWar;
            }
        }

        /**
         * prints battlefield
         */
        System.out.print("  ");
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(1 + i + " ");
        }
        System.out.println();
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(letterCoordinates++);
            for (int j = 0; j < battlefield.length; j++) {
                System.out.print(" " + battlefield[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):\n");

        String AircraftPos1 = scanner.next();
        String AircraftPos2 = scanner.next();


        while(scanner.hasNext()){




        }


        String test = "f6";
        coordinates(test,test);


        //     String aircraftCarrierStart = scanner.next();
        //     String aircraftCarrierEnd = scanner.next();

    }

    public static int coordinates(String position1, String position2) {

        String substr1;
        String substr2;
        substr1 = position1.substring(0, 1);
        substr2 = position1.substring(1, 2);
        int convert1 = 0;
        int convert2 = Integer.parseInt(substr2);

        substr1 = substr1.toUpperCase();

        System.out.println("split substring " + substr1+" "+substr2);

        switch (substr1) {
            case "A":
                substr1 = "1";
                convert1 = Integer.parseInt(substr1);
                break;
            case "B":
                substr1 = "2";
                convert1 = Integer.parseInt(substr1);
                break;
            case "C":
                substr1 = "3";
                convert1 = Integer.parseInt(substr1);
                break;
            case "D":
                substr1 = "4";
                convert1 = Integer.parseInt(substr1);
                break;
            case "E":
                substr1 = "5";
                convert1 = Integer.parseInt(substr1);
                break;
            case "F":
                substr1 = "6";
                convert1 = Integer.parseInt(substr1);
                break;
            case "G":
                substr1 = "7";
                convert1 = Integer.parseInt(substr1);
                break;
            case "H":
                substr1 = "8";
                convert1 = Integer.parseInt(substr1);
                break;
            case "I":
                substr1 = "9";
                convert1 = Integer.parseInt(substr1);
                break;
            case "J":
                substr1 = "10";
                convert1 = Integer.parseInt(substr1);
                break;
        }

        System.out.println(convert1 + " " + convert2);

        return convert1 + convert2;
    }


}

package com.codewars.kyu5;

import java.util.*;

public class DirReduction {

    enum Directions {SOUTH, EAST, WEST, NORTH}



   static  List<String> newList;

    static Map<Directions, Directions> map = new HashMap<>();


    public static void main(String[] args) {



        String [] testArr =  new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};

        System.out.println(Arrays.toString(dirReduc(testArr)));


    }


    public static String[] dirReduc(String[] arr) {

        map.put(Directions.EAST, Directions.WEST); //EAST = WEST
        map.put(Directions.SOUTH, Directions.NORTH);// SOUTH = NORTH
        map.put(Directions.WEST, Directions.EAST); // WEST = EAST
        map.put(Directions.NORTH, Directions.SOUTH); //NORTH = SOUTH
        boolean finish = false;

        newList = new LinkedList<>(Arrays.asList(arr));
    int counter = newList.size();
        while (counter > 0) {

            for (int i = newList.size() - 1; i > 0; i--) {

                finish = false;
                Directions currDirection = Directions.valueOf(newList.get(i));
                Directions nextDirection = Directions.valueOf(newList.get(i - 1));

                if (nextDirection == map.get(currDirection))  {
                        newList.remove(i);
                        newList.remove(i - 1);
                        i--;
                }


            }

            counter--;
        }

       String[] newArr = new String[newList.size()];

        for (int i = 0; i < newList.size(); i++ ) {
                newArr[i] = (String) newList.get(i);
        }


        return newArr;
    }

}
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {





    }






        public static int[] walls () {
            System.out.println("please enter the number of walls you want to paint");
            Scanner scanner = new Scanner(System.in);

            int numberOfWalls = scanner.nextInt();
            int[] height = new int[numberOfWalls];
            int[] width = new int[numberOfWalls];

            //creating an array from the number the user puts in


            for (int i = 0; i < numberOfWalls; i++) {
                System.out.println("please input the height of the wall ");
                height[i] = scanner.nextInt();
                System.out.println("now input print the width");
                width[i] = scanner.nextInt();

                System.out.println();
                System.out.println("the height and width of the wall is " + height[i] * width[i]);
                System.out.println();
            }
            int[] result = times(height, width);

            System.out.println("the height of walls from 1 to " + numberOfWalls + " is " + Arrays.toString(height) + "" + " the width of walls from 1 to " + numberOfWalls + " is " + Arrays.toString(width));

            System.out.println("The area for each of the walls from 1 to " + numberOfWalls + " is " + Arrays.toString(result));

            System.out.println("=======================================================================");

            return result;
        }

        public static void doors () {
        System.out.println("please enter the number of doors you have inside the walls you want to paint ");
        Scanner scanner = new Scanner(System.in);

        int numberOfDoors = scanner.nextInt();
        int[] height = new int[numberOfDoors];
        int[] width = new int[numberOfDoors];

        //creating an array from the number the user puts in


        for (int i = 0; i < numberOfDoors; i++) {
            System.out.println("please input the height of the door ");
            height[i] = scanner.nextInt();
            System.out.println("now please input the width");
            width[i] = scanner.nextInt();

            System.out.println();
            System.out.println("the height and width of the door is " + height[i] * width[i]);
            System.out.println();
        }
        int[] result = times(height, width);

        System.out.println("the height of doors from 1 to " + numberOfDoors + " is " + Arrays.toString(height) + "" + " the width of doors from 1 to " + numberOfDoors + " is " + Arrays.toString(width));

        System.out.println("The area for each of the doors from 1 to " + numberOfDoors + " is " + Arrays.toString(result));

        System.out.println("=======================================================================");
    }

        public static void windows () {
        System.out.println("please enter the number of windows you have inside the walls you want to paint ");
        Scanner scanner = new Scanner(System.in);

        int numberOfWindows = scanner.nextInt();
        int[] height = new int[numberOfWindows];
        int[] width = new int[numberOfWindows];

        //creating an array from the number the user puts in


        for (int i = 0; i < numberOfWindows; i++) {
            System.out.println("please input the height of the window ");
            height[i] = scanner.nextInt();
            System.out.println("now please input the width");
            width[i] = scanner.nextInt();

            System.out.println();
            System.out.println("the height and width of the door is " + height[i] * width[i]);
            System.out.println();
        }
        int[] result = times(height, width);

        System.out.println("the height of window from 1 to " + numberOfWindows + " is " + Arrays.toString(height) + "" + " the width of window from 1 to " + numberOfWindows + " is " + Arrays.toString(width));

        System.out.println("The area for each of the window from 1 to " + numberOfWindows + " is " + Arrays.toString(result));

        System.out.println("=======================================================================");
    }



        //this multiplies 2 arrays, starts with [0]*[0] then the for loop will add 1 to each and go again
        public static int[] times(int[] first, int [] second) {
            int length = Math.min(first.length, second.length);
            int[] result = new int[length];

            for (int i = 0; i < length; i++) {
                result[i] = first[i] * second[i];
            }

            return result;
        }

         public static int[] add(int[] first, int [] second) {
            int length = Math.min(first.length, second.length);
            int[] result = new int[length];

            for (int i = 0; i < length; i++) {
                result[i] = first[i] * second[i];
        }

            return result;
    }
}

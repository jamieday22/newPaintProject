package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    }
        public static void walls () {
            System.out.println("please enter the number of walls you want to paint");
            Scanner scanner = new Scanner(System.in);

            int numberOfWalls = scanner.nextInt();
            int[] height = new int[numberOfWalls];
            int[] width = new int[numberOfWalls];

            //creating an array from the number the user puts in


            for (int i = 0; i < numberOfWalls; i++) {
                System.out.println("please input the height of all the wall ");
                height[i] = scanner.nextInt();
                System.out.println("now please print the width");
                width[i] = scanner.nextInt();

                System.out.println();
                System.out.println("the height and width of the wall is " + height[i] * width[i]);
                System.out.println();
            }
            int[] result = times(height, width);

            System.out.println("the height of walls from 1 to " + numberOfWalls + " is " + Arrays.toString(height) + "" + " the width of walls from 1 to " + numberOfWalls + " is " + Arrays.toString(width));

            System.out.println("The area for each of the walls from 1 to " + numberOfWalls + " is " + Arrays.toString(result));

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
}

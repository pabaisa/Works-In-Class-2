package flowLoopsArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NineExercises {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arrayOfInts = {rnd.nextInt(100), rnd.nextInt(100), rnd.nextInt(100), rnd.nextInt(100), rnd.nextInt(100)};
        System.out.println(Arrays.toString(arrayOfInts));
        int max = arrayOfInts[0];
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (max < arrayOfInts[i]) {
                max = arrayOfInts[i];
            }
        }
        System.out.println("Max value - " + max);
        System.out.println("please write the max value ");
        Scanner textScanner = new Scanner(System.in);

        if (textScanner.nextInt() == max) {
            System.out.println("Yes the max value is " + max);
        } else System.out.println("No - you are wrong! " + max + ">" + textScanner.nextInt());
    }
}

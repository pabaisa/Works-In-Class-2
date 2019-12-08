package flowLoopsArrays;

import java.util.Scanner;

public class EightExercises {
    public static void main(String[] args) {

        boolean repeat = true;
        do {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner textScanner = new Scanner(System.in);
            System.out.println("Iveskite teksta");
            stringBuilder.append(textScanner.nextLine());

            System.out.println(stringBuilder.reverse());
            System.out.println("Ar norite testi? taip - 'continue', ne - quit");
            String a = textScanner.nextLine();
            if (a.equals("continue")) {
                repeat = true;
            }
            if (a.equals("quit")) {
                repeat = false;
                System.out.println("Good bye!");
            }
        } while (repeat);
    }
}


package flowLoopsArrays;

public class FiveExercises {
    public static void main(String[] args) {
        String symbol = "*";
        String space = " ";
        System.out.println("Print rectangle");

        for (int x = 0; x < 5; x++) {

            for (int x2 = 0; x2 < 9; x2++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println("Print triangle");

        for (int i = 0; i < 5; i++) {

            for (int x = 0; x < 9; x++) {
               // if (x=0){
                 //   System.out.println(space+space);

                //}
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

}

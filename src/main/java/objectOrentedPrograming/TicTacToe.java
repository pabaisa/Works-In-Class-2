package objectOrentedPrograming;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static Scanner in;
    static String[] board;
    static String turn;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        board = new String[9];
        populateEmptyBoard();

        System.out.println("Welcome to 'Tic Tac Toe'");
        System.out.println("-----------------------");
        printBoard();

        turn = "X";
        String winner = null;
        Scanner inputText = new Scanner(System.in);

        System.out.println("Game start!\nUser(X) will play first. Enter a position number to place X in:");

        while (winner == null) {
            int numInput = 0;
            try {
                numInput = inputText.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input, please re-enter position number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                String bad_input = inputText.next();
                System.out.println("Invalid input, please re-enter position number:");
                continue;
            }
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                if (turn.equals("X")) {
                    printBoard();
                    turn = "O";
                    winner = checkWinner();
                    if (winner == null) {
                        computer(numInput);
                        printBoard();
                        turn = "X";
                        winner = checkWinner();
                    }
                }
            } else {
                System.out.println("Position already taken; re-enter position number:");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println(winner + "'s have won! Thanks for playing.");
        }
    }

    public static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "draw";
        }
        if (turn.equals("X"))
            System.out.println(turn + "'s turn; enter a position number to place " + turn + " in:");
        return null;
    }

    public static void computer(int a) {
        System.out.println("computer's move:");
        String checkForValidNum = null;
        while (checkForValidNum == null) {
            int position = -1;
            int place = -1;
            switch (a) {
                case 1:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 2;
                            break;
                        case 2:
                            place = 4;
                            break;
                        case 3:
                            place = 5;
                            break;
                    }
                    break;
                case 2:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 1;
                            break;
                        case 2:
                            place = 3;
                            break;
                        case 3:
                            place = 5;
                            break;
                    }
                    break;
                case 3:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 2;
                            break;
                        case 2:
                            place = 5;
                            break;
                        case 3:
                            place = 6;
                            break;
                    }
                    break;
                case 4:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 1;
                            break;
                        case 2:
                            place = 5;
                            break;
                        case 3:
                            place = 7;
                            break;
                    }
                    break;
                case 5:
                    position = (int) (Math.random() * 8 + 1);
                    place = position;
                    break;
                case 6:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 3;
                            break;
                        case 2:
                            place = 5;
                            break;
                        case 3:
                            place = 9;
                            break;
                    }
                    break;
                case 7:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 4;
                            break;
                        case 2:
                            place = 5;
                            break;
                        case 3:
                            place = 8;
                            break;
                    }
                    break;
                case 8:
                    position = (int) (Math.random() * 3 + 1);
                    switch (position) {
                        case 1:
                            place = 5;
                            break;
                        case 2:
                            place = 7;
                            break;
                        case 3:
                            place = 9;
                            break;
                    }
                    break;
                case 9:
                    position = (int) (Math.random() * 4 + 5);
                    switch (position) {
                        case 1:
                            place = 5;
                            break;
                        case 2:
                            place = 6;
                            break;
                        case 3:
                            place = 8;
                            break;
                    }
                    break;
            }


            if (board[place - 1].equals(String.valueOf(place))) {
                board[place - 1] = "O";
                checkForValidNum = "a";
            } else {
                continue;
            }
        }
    }

    public static void printBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }

    public static void populateEmptyBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }
}

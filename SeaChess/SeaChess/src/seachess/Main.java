/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seachess;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in); // scanner
    public static char[][] desk = new char[3][3]; // nashata dyska za igra
    public static int player; // nomera na poredniqt igrach (1vi ili 2ri)
    public static int result = -1; // dali igrata e svyrshila
    public static String choice; // izbor na pole ot dyskata

    public static void main(String[] args) {
        // TODO code application logic here
        char userChoice;

        //izpylnqvame dokato potrebitelq vyvede "n" na Another game?
        do {
            play();
            System.out.print("Another game ? (y/n) : ");
            userChoice = input.next().charAt(0);
            //iziskvame veren vhod
            while (userChoice != 'y' && userChoice != 'n') {
                System.out.println(" Only (y/n) !!! ");
                System.out.print("Another game ? (y/n) : ");
                userChoice = input.next().charAt(0);
            }
        } while (userChoice == 'y');
        System.out.println("Bye :* ");

    }

    public static void play() {

        System.out.println("Game starts !");
        System.out.println();
        System.out.println("Player 1 plays with \"X\"");
        System.out.println("Player 2 plays with \"O\"");

        //inicializirame dyskata i q printirame
        init();
        print();

        // izpylnqvai dokato se nameri pobeditel ili dokato se zapylni matricata na dyskata
        player = 0;
        do {
            System.out.println();
            //potrebitelski izbor na pole i inicializiraneto mu
            select(player);
            //print
            print();
            //smqna na igrach
            player = (player + 1) % 2;
            //proverka za pobeditel ili zapylvane na poletata
            result = check();
        } while (result == -1);

        // printirame izhoda
        System.out.println();
        if (result == 1) {
            System.out.println("Player 1 wins the game !");
        } else if (result == 2) {
            System.out.println("Player 2 wins the game !");
        } else if (result == 3) {
            System.out.println("No winers in this game !");
        }
        System.out.println();

    }

    //inicializaciq na dyskata s prazni poleta
    public static void init() {
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                desk[i][j] = ' ';

            }

        }
    }

    //printirane na dyskata
    public static void print() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("-");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("|");
                    } else {
                        if (desk[(i - 1) / 2][(j - 1) / 2] == ' ') {
                            System.out.print(" ");
                        } else if (desk[(i - 1) / 2][(j - 1) / 2] == 'X') {
                            System.out.print("X");
                        } else if (desk[(i - 1) / 2][(j - 1) / 2] == 'O') {
                            System.out.print("O");
                        }
                    }
                }

            }
            System.out.println();

        }

    }

    /*
     * iziskvane ot potrebitelq da vyvede kordinatite na iskanoto ot nego pole, razdeleni sys zapetaika
     * v zavisimost ot porednostta na potrebitelq (1vi ili 2ri)
     * inicializira izbranoto pole syotvetno s X ili s O
     */
    public static void select(int player) {
        String[] ch;
        int a, b;

        System.out.print("Player " + (player + 1) + "'s turn! Select coordinates : ");
        choice = input.next();
        //System.out.println(choice);
        ch = choice.trim().split(",");
        a = Integer.parseInt(ch[0]) - 1;
        b = Integer.parseInt(ch[1]) - 1;

        //karame go da vyvejda dokato ne vyvede nezaeta kletka , koqto e v razmernostta na dyskata ni
        while (ch.length != 2 || a < 0 || a > 2 || b < 0 || b > 2 || desk[a][b] != ' ') {
            System.out.println("Invalid input !");
            System.out.print("Player " + (player + 1) + "'s turn! Select coordinates : ");
            choice = input.next();
            ch = choice.trim().split(",");
            a = Integer.parseInt(ch[0]) - 1;
            b = Integer.parseInt(ch[1]) - 1;
        }
        
        //System.out.println(a);
        //System.out.println(b);
        if (player == 0) {
            desk[a][b] = 'X';
        } else {
            desk[a][b] = 'O';

        }

    }

    //proverka za pobeditel
    /*
     * tova moje da stane i po - elegantno
     */
    public static int check() {

        //System.out.println("Check");

        if (desk[0][0] == 'X' && desk[0][1] == 'X' && desk[0][2] == 'X'
                || desk[1][0] == 'X' && desk[1][1] == 'X' && desk[1][2] == 'X'
                || desk[2][0] == 'X' && desk[2][1] == 'X' && desk[2][2] == 'X'
                || desk[0][0] == 'X' && desk[1][0] == 'X' && desk[2][0] == 'X'
                || desk[0][1] == 'X' && desk[1][1] == 'X' && desk[2][1] == 'X'
                || desk[0][2] == 'X' && desk[1][2] == 'X' && desk[2][2] == 'X'
                || desk[0][0] == 'X' && desk[1][1] == 'X' && desk[2][2] == 'X'
                || desk[0][2] == 'X' && desk[1][1] == 'X' && desk[2][0] == 'X') {
            //ako pobeditelqt e 1viq igrach
            return 1;
        }

        if (desk[0][0] == 'O' && desk[0][1] == 'O' && desk[0][2] == 'O'
                || desk[1][0] == 'O' && desk[1][1] == 'O' && desk[1][2] == 'O'
                || desk[2][0] == 'O' && desk[2][1] == 'O' && desk[2][2] == 'O'
                || desk[0][0] == 'O' && desk[1][0] == 'O' && desk[2][0] == 'O'
                || desk[0][1] == 'O' && desk[1][1] == 'O' && desk[2][1] == 'O'
                || desk[0][2] == 'O' && desk[1][2] == 'O' && desk[2][2] == 'O'
                || desk[0][0] == 'O' && desk[1][1] == 'O' && desk[2][2] == 'O'
                || desk[0][2] == 'O' && desk[1][1] == 'O' && desk[2][0] == 'O') {
            //ako pobeditelqt e 2riq igrach
            return 2;
        }

        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                if (desk[i][j] == ' ') {
                    //ako ima nezapylneni kletki
                    return -1;

                }
            }
        }
        //kogato vsichki kletki sa zapylneni i nqmame pobeditel
        return 3;

    }
}

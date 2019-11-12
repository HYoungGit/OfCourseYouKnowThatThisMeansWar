/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;
import java.util.Scanner;

/**
 *
 * @author hayou1838
 */

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean restart = true;
        while (restart != false)
        {        
        int rounds;
        int a = (int)Math.round(Math.random()*9 + 1); 
        int b = (int)Math.round(Math.random()*9 + 1); 
        Scanner r = new Scanner (System.in);
        Scanner choice = new Scanner (System.in);
        System.out.println("░▒▓▒░▒▓▒░▒▓▒░▒▓▒░▒▓");
        System.out.println("▒                           ▒");
        System.out.println("▓    Ye Olde Game Of War    ░");
        System.out.println("▒                           ▒");
        System.out.println("░▒▓▒░▒▓▒░▒▓▒░▒▓▒░▒▓");
        System.out.println("How Many Rounds Would You Like To Play?");
        rounds = choice.nextInt();
        rounds = rounds - 1;
        for (int i = 0; i <= rounds;i++)
        {
            System.out.println("P1 Card ▬► " + a + " P2 Card ▬► " + b);
        }
        if (a > b)
        {
            System.out.println("P1 Wins A Round");
        }
        else if(a == b)
        {
            System.out.println("A Tie! that's Groovy");
        }
        else if (a < b)
        {
            System.out.println("P2 Wins This One");
        }
        System.out.println("Would You like to Play Again? (true or false question btw)");
        restart = r.nextBoolean();
        }
    }
}
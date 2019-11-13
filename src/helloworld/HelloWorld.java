/*
 * Like Many Spies in the war this program is attempting to decieve you!
 * it may look like a pleasant simple "Hello World!" program, when in fact it's 
 * the brutal game of war!
 */

package helloworld;
import java.util.Scanner;

/**
 *
 * @author King Harper, Emperor of War and Overblown titles!
 */

public class HelloWorld {
    private static int rounds;
    
     private static int random;{
        int rPick;
        int rHelp;
        int prev = 0;
        rPick = (int)Math.round(Math.random()*9 + 1); 
        rHelp = (int)Math.round(Math.random()*9 + 1);
        int [] rNums = new int [10];
        rNums[0] = (int)Math.round(Math.random()*9 + 1);
        rNums[1] = (int)Math.round(Math.random()*9 + 1);
        rNums[2] = (int)Math.round(Math.random()*9 + 1);
        rNums[3] = (int)Math.round(Math.random()*9 + 1);
        rNums[4] = (int)Math.round(Math.random()*9 + 1);
        rNums[5] = (int)Math.round(Math.random()*9 + 1);
        rNums[6] = (int)Math.round(Math.random()*9 + 1);
        rNums[7] = (int)Math.round(Math.random()*9 + 1);
        rNums[8] = (int)Math.round(Math.random()*9 + 1);
        rNums[9] = (int)Math.round(Math.random()*9 + 1);
        if (rPick == 0)
        {        
            if (prev == 0){
                rPick = rPick + rHelp; 
            }
            random = rNums[7];
            prev = 0;
        }
        else if (rPick == 1)
        {   
            if (prev == 1){
                rPick = rPick + rHelp; 
            }
            random = rNums[2];
            prev = 1;
        }
        else if (rPick == 2)
        {
            if (prev == 2){
                rPick = rPick + rHelp; 
            }
            random = rNums[9];
            prev = 2;
        }
        else if (rPick == 3)
        {
            if (prev == 3){
                rPick = rPick + rHelp; 
            }
            random = rNums[0];
            prev = 3;
        }
        else if (rPick == 4)
        {
            if (prev == 4){
                rPick = rPick + rHelp; 
            }
            random = rNums[0];
            prev = 4;
        }
        else if (rPick == 5)
        {
            if (prev == 5){
                rPick = rPick + rHelp; 
            }
            random = rNums[1];
            prev = 5;
        }
        else if (rPick == 6)
        {
            if (prev == 6){
                rPick = rPick + rHelp; 
            }
            random = rNums[3];
            prev = 6;
        }
        else if (rPick == 7)
        {
            if (prev == 7){
                rPick = rPick + rHelp; 
            }
            random = rNums[4];
            prev = 7;
        }
        else if (rPick == 8)
        {
                        if (prev == 8){
                rPick = rPick + rHelp; 
            }
            random = rNums[5];
            prev = 8;
        }
        else if (rPick == 9)
        {
                        if (prev == 9){
                rPick = rPick + rHelp; 
            }
            random = rNums[6];
            prev = 9;
        }
//    private static void OptionA(int a){
//        for (int i = 0; i < rounds; i++){
//        a = (int)Math.round(Math.random()*9 + 1);
//        }
//    }
//    private static void OptionB(int b){
//        for (int i = 0; i < rounds; i++){
//        b = (int)Math.round(Math.random()*9 + 1);
//        }
//    }

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean restart = true;
        while (restart != false)
        {        
//        int rounds;
        
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
            System.out.println("P1 Card ▬► " + random + " P2 Card ▬► " + random);
        }
        if (random > random)
        {
            System.out.println("P1 Wins A Round");
        }
        else if(random == random)
        {
            System.out.println("A Tie! that's Groovy");
        }
        else if (random < random)
        {
            System.out.println("P2 Wins This One");
        }
        System.out.println("Would You like to Play Again? (true or false question btw)");
        restart = r.nextBoolean();
        }
    }
}
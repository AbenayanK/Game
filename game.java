//1. Make a dice roller, that allows you to roll 5 dice, 4 times
// 2. When you roll the dice you have 3 options
     // 1. Reroll
    //  2. Swap
    //  3. Get Points
// 3. If you reroll, it allows you to reroll the dice you have rerollen, if u swap, then you choose the dice/dices you wish to keep, 
    //then you will get to reroll the ones you didn't

//4. Repeat until user chooses Get Points or reaches 4 spins
// 5. When user does so they will be given a menu with the possible combinations they can recieve
// 6. The user will select the combination they wish to recieve
//7. The second user goes
//8. Game repeats, each time the user's have points in the same combinations, whoever has the higher points will recieve a chance to spin a wheel of fortune wheel.
//9. The Wheel is spun and the user collects cash/lose a turn/bankrupt
//10. Game continues until all combinations have been filled
// 11. The user with the highes cash left moves onto bonus round.
// 12. Give the user 50 words that they need to guess(Wheel of fortune)

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] dice = new int[5];
        int[] hand = new int[5];
        int rollCount = 1;

        while (rollCount <= 3) {
            System.out.println("Roll " + rollCount);
            for (int i = 0; i < dice.length; i++) {
                dice[i] = rand.nextInt(6) + 1;
                System.out.print(dice[i] + " ");
            }
            System.out.println();
            System.out.print("Would you like to roll again? ");
            String rollagain= input.next();
            if (rollagain.equalsIgnoreCase("No")){
              rollCount = 4;
            }
            else{
              System.out.print("Please enter the number of dice you would like to hold: ");
              int numOfdiceHeld = input.nextInt();
              for(int i = 0;i<numOfdiceHeld;i++){
                int indexOfDie;
                do{
                System.out.print("Enter the index of the dice that you would like to hold: ");
                indexOfDie = input.nextInt();
                }while(indexOfDie>=0 && indexOfDie <=5);
                hand[i] = dice[indexOfDie];
              }
              for(;i<5;i++){
                hand[i] = rand.nextInt(7)+1;
              }
            }
            // prompt user to enter which dice to re-roll
            // code to re-roll selected dice here

            rollCount++;
        }

        // code to calculate score and determine winner here
    }
}

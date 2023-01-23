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

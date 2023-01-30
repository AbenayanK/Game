
//Author: Abenayan Kathirgamanathan
//Date: 20/01/2023
//Description: 
	import java.util.Random;
	import java.util.Scanner;

	public class Yahtzee {

	    public static void main(String[] args) {
	    	  Scanner input = new Scanner(System.in);

	    	    System.out.print("WELCOME TO YAHTZY!!");
	    	    System.out.println("");

	    	    //Ask User if they would like to play//
	    	    System.out.print("Would you like to play?(Yes/No): ");


	    	    String start_play = input.next();

	    	    //Loop is set so that unless the user gives a proper answer, the question will be asked again
	    	    while (!(start_play.equalsIgnoreCase("Yes")|| start_play.equalsIgnoreCase("No"))) {
	    	        System.out.print("Please Enter a valid response(Yes/No)");
	    	        System.out.print("Would you like to play?: ");
	    	        start_play = input.next();
	    	    }
	    		System.out.println("\nTo See Instructions: Press 1 \nTo Begin Playing: Press 2 \n");			
				
	    	    while (!(start_play.equalsIgnoreCase("1")|| start_play.equalsIgnoreCase("2"))) {
	    			System.out.print("Enter: ");			
	    			start_play = input.next();

	    		if (start_play.equals("1")) {
	    			instructions();
	    			//yahtzee(playDie, points, finalPoints, booleanArr, turnTracker, counterScore);
	    		}
	    		
	    		if (start_play.equals("1")) {
	    			//yahtzee(playDie, points, finalPoints, booleanArr, turnTracker, counterScore);
	    		}
	    	}
	    }	    
	    
	    public static void instructions(){
	    	System.out.println("\nInstructions:\n"
					+ "\nYou will begin the game by rolling five dice. "
					+ "\nChoose which dice you want to reroll and click the \"Reroll\" button. You can do this four times. "
					+ "\nOnce you do so, you will choose a catergory to score, from the options avlaible\n"
					+"\n\t\t Upper section combinations"
					+ "\n\t1. Ones: Get as many ones as possible.\n"
					+ "\n\t2. Twos: Get as many twos as possible.\n"
					+ "\n\t3. Threes: Get as many threes as possible.\n"
					+ "\n\t4. Fours: Get as many fours as possible.\n"
					+ "\n\t5. Fives: Get as many fives as possible.\n"
					+ "\n\t6. Sixes: Get as many sixes as possible.\n"
					+ "\n\t3. Three of a kind: Get three dice with the same number. Points are the sum all dice (not just the three of a kind).\n"
					+ "\n\t4. Four of a kind: Get four dice with the same number. Points are the sum all dice (not just the four of a kind).\n"
					+ "\n\t5. Small Straight: Get four sequential dice, 1,2,3,4 or 2,3,4,5 or 3,4,5,6. Scores 30 points.\n"
					+ "\n\t6. Large Straight: Get five sequential dice, 1,2,3,4,5 or 2,3,4,5,6. Scores 40 points.\n"
					+ "\n\t7. Chance: You can put anything into chance. The score is the sum of the dic.\n"
					+ "\n\t8. Yahtzee: Five of a kind. Scores 50 points. You can optionally get multiple Yahtzees, see below for details.\n"
					+ "\t\t\n"
					+ "\nOnce all scoring categories have been used, your final score will determine the outcome of the game.\n"
					+ "\nOnce the score for both categories are met in the upper combinations or in the Four of a kind, Three of a kind or Chance categories\n"
					+ "\nThey get a chance to spin the wheel, which will have cash amounts and may have lose a turn or bankruptcy \n"
					+ "\n\tLose a turn: When recieved, the player who spun will not be able to go for their next turn\n"
					+ "\n\tBankruptcy: The player loses the current amount of money they have \n"
					+ "\nAt the very end, whoever has the most amount of money will move on to the bonus round)\n"
					+ "\t\t\n"
					+ "\tBonus Round\n"
					+ "\t\t\n"
					+ "\tIn this round you will be given a word to solve, if you get the word then you will recieve the cash prize and your grand total will be displayed\n"
					+ "\nGood luck and let the games begin!");
		}

		private static void userChoices(int[] playDie, int[] points, int[] finalPoints, boolean[] booleanArr,
				int turnTracker, int rollCount, int[] playingCounter) {
					Scanner sc = new Scanner(System.in);
					int option = 0;
					displayDice(playDie);
					System.out.println(" \nMoves:"
							+ "\n 1 - Score Now"
							+ "\n 2 - Reroll\n");
}
	}
	
	//Explain the rules of the game //
	
	//BONUS Round//
	
	/*    Scanner input = new Scanner(System.in);

    //Mystery word, medicine, is intialized

    String mysteryWord = "medicine";
    String guess;

    //Guesscount- the counter for the number of guesses is set to 0.

    int guessCount = 0;

    //Make the limit for the number of guesses 5.

    int guessLimit = 5;

    boolean outOfGuesses = false;
    boolean correctGuess = false;
    System.out.println("* note the word is all lowercase and doesn't contain special characters");

    // While the user is not out of guesses and the user has not guessed the word correctly, the user will be able to guess the word
    while(!outOfGuesses && !correctGuess){
       // if the guessCount is less than the guessLimit then the user can guess the word
        if(guessCount < guessLimit){
            System.out.println("You have " + (guessLimit - guessCount) + " guesses left. Enter guess: ");
            guess = input.nextLine();
            guessCount++;
            if(guess.length() > mysteryWord.length()){
                System.out.println("Guess too long");
            } else if(guess.length() < mysteryWord.length()){
                System.out.println("Guess too short");
            } else {
           
                for(int i = 0; i < guess.length(); i++){
                    if(guess.charAt(i) == mysteryWord.charAt(i)){
                        System.out.print("!");
                    } else if(mysteryWord.contains(String.valueOf(guess.charAt(i)))){
                        System.out.print("?");
                    } else {
                        System.out.print("-");
                    }
                }
           
                System.out.println();
            // if the guess is equal to the mystery word then the user wins

                if(guess.equals(mysteryWord)){
                    correctGuess = true;
            //if the unicode value of the guess is less than mystery, meaning it will return a number less than zero then the word is after
                } else if(guess.compareTo(mysteryWord) < 0){
                    System.out.println("Mystery word is after your last guess");
                } else {
            //if the unicode value of the guess is greater than the mystery word, then it will return a number greater than zero, meaning the word is before the  guess
                    System.out.println("Mystery word is before your last guess");
                }
            }
            // if the guessCount is greater than the guessLimit then the user loses
        } else {
            outOfGuesses = true;
        }
    }
 //if the user is out of guesses, there are told so and they are told what the word is 
    if(outOfGuesses){
        System.out.println("You are out of guesses. The word was " + mysteryWord);
    } else {
//if the user makes the correct guess, they are told so and they are thanked 

        System.out.println("You are correct! \nThank you for playing");
    }*/	

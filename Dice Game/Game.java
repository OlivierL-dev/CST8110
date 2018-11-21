/*Olivier Lauzon
 * CST8110-301
 * Jason Mombourquette
 * This class has all of the input checking and game logic
 * Assignment 3
 * April 6, 2018
 */
import java.util.Scanner;

public class Game {
	private int potAmount;
	private int betAmount;
	private String betType;
	private Scanner input = new Scanner(System.in);
	private Scanner strings = new Scanner(System.in);
	Die play = new Die();
	public Game() {
		potAmount = 100;
		betAmount = 1;
		betType = "";
	}
	public void getBetFromUser() {
		//get bet amount
		System.out.print("Enter your bet amount: ");
		betAmount = input.nextInt();
		//check for valid bet amount
		while(betAmount <= 0 || betAmount > potAmount) {
			if(betAmount == 0) {
				return;
			}
			System.out.print("Error - cannot bet less than 0 or more than " + potAmount + "...Enter your bet amount: ");
			betAmount = input.nextInt();
		}
		//get bet type
		System.out.print("Enter your bet type: ");
		betType = strings.nextLine();
		betType = betType.toLowerCase();
		//check for valid bet type
		while(true){
			if (betType.equals("odd") || betType.equals("even") || betType.equals("low") || betType.equals("high")) { 
				break;
			}
			System.out.print("Please enter odd, even, high, or low ....Enter your bet type: ");
			betType = strings.nextLine();	
			betType = betType.toLowerCase();	
		}
		 
	}
	public void playGame() {
		while( potAmount > 0 && betAmount != 0) {
			System.out.println("Your current pot is " + potAmount);
			getBetFromUser();
			if(betAmount != 0) {
				play.rollDie();
				play.displayDie();
				if(play.getValue() <= 9 && betType.equals("low")) {
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else if(play.getValue() >= 10 && betType.equals("high")) {
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else if((play.getValue() % 2) == 0 && betType.equals("even")) {
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else if((play.getValue() % 2) == 1 && betType.equals("odd")) {
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else {
					System.out.println("You LOSE....your bet\n");
					potAmount -= betAmount;
				}
			}
		}
		System.out.println("You end the game with pot of " + potAmount);
	}
}
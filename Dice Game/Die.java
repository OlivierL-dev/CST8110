/*Olivier Lauzon
 * CST8110-301
 * Jason Mombourquette
 * This class rolls, shows, and return dice values
 * Assignment 3
 * April 6, 2018
 */
import java.util.Random;

public class Die {
	//initialize variables
	private int dieValue;
	private Random randomNumbers = new Random();
	int [] dieArray = new int[3];
	//default constructor
	public Die() {
		dieValue = 0;
	}
	//roller method
	public void rollDie() {
		dieValue = randomNumbers.nextInt(6)+1;
	}
	public void displayDie() {
		for (int i = 0; i <= 2; i++) {
			rollDie();
			dieArray[i] = dieValue;
		}
		System.out.println("Your dies are: " + dieArray[0] + " and " + dieArray[1] + " and " + dieArray[2]);
	}
	public int getValue() {
		int sum = 0;
		for(int i = 0; i <= 2; i++) {
			sum += dieArray[i];
		}
		return sum;
	}
}
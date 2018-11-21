/*Olivier Lauzon
 * CST8110-301
 * Jason Mombourquette
 * This class runs the game with an introduction message
 * Assignment 3
 * April 6, 2018
 */
public class Assign3 {

	public static void main(String[] args) {
		System.out.print("Welcome to Double or Nothing Dice Game..bet an amount and type\n"
				+ "\t-if you are correct, you win twice your bet,\n"
				+ "\t-otherwise you lose your bet\n"
				+ "A bet of 0 ends the game\n\n");
		Game play = new Game();
		play.playGame();
	} 
}

import java.util.Scanner;

public class FibonacciNumbers {
	//initialize variables
	private int numberOfNumbers;
	private int a;
	private int b;
	int [] fbNumbers;
	private Scanner input = new Scanner(System.in);
	//default constructor
	FibonacciNumbers() {
		a = 1;
		b = 1;
	}
	//get info from users
	public void getNumberFromUser(){
		System.out.print("How many Fibonacci numbers do you want? ");
		numberOfNumbers = input.nextInt();
		while(numberOfNumbers < 2) {
			System.out.println("You need to generate at least two");
			System.out.print("How many Fibonacci numbers do you want? ");
			numberOfNumbers = input.nextInt();
		}
		fbNumbers = new int[numberOfNumbers];
	}
	private int nextNumber() {
		int temp;
		temp = b;
		b += a;
		a = temp;
		return b;
	}
	public void createFibonacciNumbers() {
		fbNumbers[0] = a;
		fbNumbers[1] = b;
		for (int i = 2; i < numberOfNumbers; i++) {
			fbNumbers[i] = nextNumber();
		}
	}
	public void printFibonacciNumbers() {
		System.out.println("\nThe first " + numberOfNumbers + " Fibonacci numbers in reverse order are:");
		for (int i = (numberOfNumbers - 1); i >= 0; i--) {
			System.out.println(fbNumbers[i]);;
		}
	}
}

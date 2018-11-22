package Lab6;

import java.util.Scanner;

public class Lab6 {
	//declare variables
	private int value1;
	private int value2;
	private int gcf;
	//add scanner
	private Scanner input = new Scanner(System.in);
	//method to obtain values
	public void getValues() {
		System.out.println("Please enter the first value: ");
		value1 = input.nextInt();
		
		while(true){
			if(value1 > 0) {
				break;
			}
			System.out.println("Please enter a value grater than 0: ");
			value1 = input.nextInt();
		}
		
		System.out.println("Please enter the second value: ");
		value2 = input.nextInt();
		
		while(true){
			if(value2 > 0) {
				break;
			}
			System.out.println("Please enter a value grater than 0: ");
			value2 = input.nextInt();
		}
	}
	//
	public void calculateGcf() {
		int a = value1;
		int b = value2;
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		gcf = a;
	}
	public void display() {
		System.out.println("The greatest common factor of " + value1 + " and " + value2 + " is " + gcf);
	}
}

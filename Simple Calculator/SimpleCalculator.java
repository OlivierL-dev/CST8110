package Lab5;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		//declare variables
		double numb1 = 0;
		double numb2 = 0;
		double result = 0;
		String operator = new String();
		//add scanner
		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		//get first number
		System.out.println("First number:");
		numb1 = input.nextDouble();
		//get operator
		System.out.println("Please enter an operation:");
		operator = string.nextLine();
		//loop to check for valid operator
		while(true){
			if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")){
				break;
			}
			System.out.println("Please enter a valid operation:");
			operator = string.nextLine();
		}
		//get second number
		System.out.println("Second number:");
		numb2 = input.nextDouble();
		//loop to check for non-zero denominator
		while(true) {
			if(numb2 != 0) {
				break;
			}
			System.out.println("Please pick a non-zero number:");
			numb2 = input.nextDouble();
		}
		//calculate result
		if(operator.equals("+")) {
			result = numb1 + numb2;
		}
		if(operator.equals("-")) {
			result = numb1 - numb2;
		}
		if(operator.equals("*")) {
			result = numb1 * numb2;
		}
		if(operator.equals("/")) {
			result = numb1 / numb2;
		}
		if(operator.equals("%")) {
			result = numb1 % numb2;
		}
		//display result
		System.out.println(numb1 + " " + operator + " " + numb2 + " = " + result);
	}
}
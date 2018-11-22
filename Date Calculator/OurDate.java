/*Olivier Lauzon
 * CST8110-301
 * Jason Mombourquette
 * This program calculates the gap between 2 given dates
 * Assignment 2
 * March 12, 2018
 */
package DateCalculator;

import java.util.Scanner;

public class OurDate {
	//initialize variables
	private int year;
	private int month;
	private int day;
	//add scanner
	private Scanner input = new Scanner(System.in);
	//constructor
	public OurDate() {
		year = 0;
		month = 0;
		day = 0;
	}
	
	public OurDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	//collect input data
	public void inputYear() {
		System.out.println("Enter a year:");
		year = input.nextInt();
	}
	
	public void inputMonth() {
		System.out.println("Enter a month:");
		month = input.nextInt();
	}
	
	public void inputDay() {
		System.out.println("Enter a day:");
		day = input.nextInt();
	}
	//show date
	public void displayDate() {
		System.out.print(year+"/"+month+"/"+day);
	}
	//calculate days past
	public int calcDays() {
		return (((year)*360)+((month-1)*30)+(day-1));
	}
}



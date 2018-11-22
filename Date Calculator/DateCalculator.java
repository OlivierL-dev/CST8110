/*Olivier Lauzon
 * CST8110-301
 * Jason Mombourquette
 * This program calculates the gap between 2 given dates
 * Assignment 2
 * March 12, 2018
 */
package DateCalculator;

public class DateCalculator {
	private OurDate firstDate;
	private OurDate secondDate;
	private String message;
	
	//calculate date
	public DateCalculator() {
		firstDate = new OurDate();
		secondDate = new OurDate();
		message = "";
		System.out.println("Date Calculator - This tagline is dated");
	}
	
	public void inputDates() {
		System.out.println("Enter the first date");
		inputDate(firstDate);
		System.out.println("Enter the second date");
		inputDate(secondDate);
	}
	
	private void inputDate(OurDate date) {
		date.inputYear();
		date.inputMonth();
		date.inputDay();
	}
	
	public void calculateDifference() {
		//instance variables
		 int result = firstDate.calcDays() - secondDate.calcDays();
		 String plural = "";
		 //assure result is positive
		 if (result<0) {
			 result = result * (-1);
		 }
		 //nomenclature for the days
		 if(result < 7) {
			 //check for plural
			 if (result != 1) {
				 plural = "s";
			 }
			 //Conditions for equality
			 if (firstDate.calcDays()>secondDate.calcDays()) {
				message = " is " + result + " day" + plural + " later than ";
			 }
			 if (firstDate.calcDays()<secondDate.calcDays()) {
				 message = " is " + result + " day" + plural + " earlier than ";
			 }
			 if (firstDate.calcDays()==secondDate.calcDays()) {
				message = " is the same as ";
			 }
		 }
		//nomenclature for the week
		 if(result >= 7 && result < 30) {
			 result = result / 7;
			 if (result != 1) {
				 plural = "s";
			 }
			 if (firstDate.calcDays()>secondDate.calcDays()) {
				 message = " is " + result + " week" + plural + " later than ";
			 }
			 if (firstDate.calcDays()<secondDate.calcDays()) {
				 message = " is " + result + " week" + plural + " earlier than ";
			 }
			 if (firstDate.calcDays()==secondDate.calcDays()) {
				message = " is the same as ";
			 } 
		 }
		//nomenclature for the month
		 if(result >= 30 && result < 360) {
			 result = result / 30;
			 if (result != 1) {
				 plural = "s";
			 }
			 if (firstDate.calcDays()>secondDate.calcDays()) {
				 message = " is " + result + " month" + plural + " later than ";
			 }
			 if (firstDate.calcDays()<secondDate.calcDays()) {
				 message = " is " + result + " month" + plural + " earlier than ";
			 }
			 if (firstDate.calcDays()==secondDate.calcDays()) {
				message = " is the same as ";
			 } 
		 }
		//nomenclature for the year
		 if(result >= 360) {
			 result = result / 360;
			 if (result != 1) {
				 plural = "s";
			 }
			 if (firstDate.calcDays()>secondDate.calcDays()) {
				 message = " is " + result + " year" + plural + " later than ";
			 }
			 if (firstDate.calcDays()<secondDate.calcDays()) {
				 message = " is " + result + " year" + plural + " earlier than ";
			 }
			 if (firstDate.calcDays()==secondDate.calcDays()) {
				message = " is the same as ";
			 } 
		 }
	}
	public void display() {
		firstDate.displayDate();
		System.out.print(message);
		secondDate.displayDate();
	}
}

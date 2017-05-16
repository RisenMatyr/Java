package inchestofeet;
import java.util.Scanner;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		final int INCHES_IN_FEET =12;
		int inches;
		int feet;
		int inchesLeft;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many inches there are >>");
		inches = input.nextInt();
		
		
		feet = inches / INCHES_IN_FEET;
		inchesLeft = inches % INCHES_IN_FEET;
		
		
		System.out.println(inches + " inches is " + feet + " feet and " + inchesLeft + " inches");
		
		
	
		

	}

}

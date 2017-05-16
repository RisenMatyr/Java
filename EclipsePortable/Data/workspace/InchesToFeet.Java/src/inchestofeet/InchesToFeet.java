package inchestofeet;

public class InchesToFeet 
{

	public static void main(String[] args) 
	{
		final int INCHES_IN_FEET =12;
		int inches = 86;
		int feet;
		int inchesLeft;
		
		feet = inches / INCHES_IN_FEET;
		inchesLeft = inches % INCHES_IN_FEET;
		
		System.out.println(inches + " inches is " + feet + " feet and " + inchesLeft + " inches");
	}

}

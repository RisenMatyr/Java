package quartstogallons;

public class QuartsToGallons 
{

	public static void main(String[] args) 
	{
		int Quarts_To_Gallon = 4;
		int quartsNeeded = 18;
		int quartsShow;
		int gallonShow;
		
		gallonShow = quartsNeeded / Quarts_To_Gallon;
		
		quartsShow = quartsNeeded % Quarts_To_Gallon;
		
System.out.println("Number of gallons needed = " + gallonShow + " Quarts left over " + quartsShow);
	}

}

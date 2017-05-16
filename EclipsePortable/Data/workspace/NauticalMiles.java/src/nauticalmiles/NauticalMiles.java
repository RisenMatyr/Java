package nauticalmiles;

public class NauticalMiles {

	public static void main(String[] args) 
	{
		double Kilometer_To_Mile = 1.150779;
		double kilometerNeeded = 1.825;
		double kilometerShow;
		double milesShow; 
		
		milesShow = kilometerNeeded / Kilometer_To_Mile;
		
		kilometerShow = kilometerNeeded % Kilometer_To_Mile;
		
System.out.println("Number of kilometers needed = " + milesShow + " miles left over " + kilometerShow);

	}

}

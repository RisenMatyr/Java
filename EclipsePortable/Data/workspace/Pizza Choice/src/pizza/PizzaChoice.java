package pizza;
import java.util.Scanner;

public class PizzaChoice {

	public static void main(String[] args)
	{
		String choiceYes;
		String toppingChoice;
		String size;
		String pizzaKind = null;
		String sodaType = null;
		String choiceHotDog;
		String choiceSoda;
		double mediumcost = 9.99; 
		double largecost = 12.99;
		double smallcost = 6.99;
		
		Scanner input = new Scanner(System.in);
		
		
	
		
		System.out.print("Would you like a pizza? Yes or No? >>");
		choiceYes = input.nextLine();
		//If you want a pizza or not.
		if("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes))
				{
					System.out.println("You said " + choiceYes + " to have a pizza.");
					System.out.println("Please choose a size small, medium, or large. >>");
				size = input.nextLine();
			//Size of the pizza.
					if("small".equals(size) || "Small".equals(size) || "medium".equals(size) ||"Medium".equals(size) || "large".equals(size) ||"Large".equals(size))
			{
					System.out.println("You said " + size + " pizza size");
					System.out.print("What kind of pizza do you want? Pepperoni, Sausage, Meat Lovers, Cheese, Veggie. >>");
					pizzaKind = input.nextLine();
			}
			//Toppings on the pizza.
					//if("Pepperoni".equals(pizzaKind) || "pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "sausage".equals(pizzaKind) || "Meat Lovers".equals(pizzaKind) || "meat lovers".equals(pizzaKind) || "Cheese".equals(pizzaKind) || "cheese".equals(pizzaKind) || "Veggie".equals(pizzaKind) || "veggie".equals(pizzaKind))
			{
				System.out.println("You said " + pizzaKind + " that sounds good.");
				//System.out.println("Your order consists of " + size + " pizza, with the toppings of " + pizzaKind);
			 of the pizza		
				//if("small".equals(size) || "Small".equals(size))
					{
						//System.out.println("The cost of your pizza is $" + smallcost);
						//System.out.print("Would you like a soda? Yes or No >>");
						//sodaType = input.nextLine();
					}
				
				//if("medium".equals(size) || "Medium".equals(size))
				{
					//System.out.println("The cost of your pizza is $" + mediumcost);
					//System.out.print("Would you like a soda? Yes or No >>");
					//sodaType = input.nextLine();//
				}
				
				//if("large".equals(size) || "Large".equals(size))
				{
				//	System.out.println("The cost of your pizza is $" + largecost);
				//	System.out.print("Would you like a soda? Yes or No >>");
				//	sodaType = input.nextLine();
				}
				//If you wanted a soda.
				//if("yes".equals(sodaType) || "Yes".equals(sodaType))
				{
					
					
				}
					
				
			}
					
					
					
		//user chose hotdogs
		//else
		{
			//System.out.println("You said " + choiceYes + " to eating a pizza,");
			//System.out.print("Would you like a Hot dog? Yes or No? >>");
			//choiceHotDog = input.nextLine();
			
		}
				}
	}
}

				



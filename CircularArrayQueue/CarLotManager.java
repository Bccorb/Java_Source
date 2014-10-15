/**
 * 
 * @author bcorbett
 * @version 1.0
 */
import java.util.*;
public class CarLotManager 
{
	Scanner in;
	
	public CarLotManager() 
	{
		
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		CircularArrayQueue<String> CarLot = new CircularArrayQueue<String>(3);
		String another = "y", car;
		
		System.out.println("Welcome to the Car Lot Management Application \n"
				+ "Please follow the directions so that we may log the purchase\n"
				+ "and sale of vechiles correctly.");
		System.out.println();
		System.out.println();
		
		do
		{
		System.out.println("Type the car info followed the return key:\n(For example: Nissian:Pathfinder)");
		car = in.nextLine();
		CarLot.enqueue(car);
		System.out.println("Enter in another car? (Y/N)");
		another = in.nextLine();
		}
		while(another.equalsIgnoreCase("y"));
		
		in.close();
		
		System.out.println("Ok. Everything is in order. Your Lot has " + CarLot.size() + " cars.");
		System.out.println("The last car in is the " + CarLot.first());
		
		System.out.println("We sell the earliest added cars first, so I will remove the first car that needs to be sold, that is the " + CarLot.dequeue());
		
		System.out.println("The remain cars are \n" + CarLot.toString());
		
	}

}

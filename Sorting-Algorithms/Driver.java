/**
 * Driver class creates a sorter object and several arrays. The user is then presents with a menu to choose which
 * type of sorting that would like to use on the arrays. The program returns the time (in milliseconds) it takes
 * to sort the array. 
 * 
 * @author bcorbett
 * @version 1.0
 */
import java.util.*;

public class Driver
{
	public Driver() 
	{
	}

	public static void main(String[] args) 
	{	
		Random generator;
		int[] small, medium, big;
	
		//*********************************************************
		//Establishes the random object and fills the three arrays
		//*********************************************************
		generator = new Random();
		small = new int[100];
		medium = new int[250];
		big = new int[500];
		int selection;
				
		//Fills the small array with random numbers
		for(int i=0; i<small.length; i++)
		{
				small[i] = generator.nextInt(1000);
		}
				
		//Fills the medium array with random numbers
		for(int i=0; i<medium.length; i++)
		{
			medium[i] = generator.nextInt(1000);
		}
				
		//Fills the big array with random numbers
		for(int i=0; i<big.length; i++)
		{
			big[i] = generator.nextInt(1000);
		}
		System.out.println("\t\tNUMBER SORTER COMPARISON PROGRAM\n"
				+ "\t-------------------------------------------------------");
		selection = Sorter.displayMenu();//gains the user sort algorithm choice
		
		while(selection != 0)
		{
			//Creating duplicates of the arrays to perform the sort on
			int[] one = new int[small.length];
			int[] two = new int[medium.length];
			int[] three = new int[big.length];
			
			for(int i=0; i<one.length; i++)
			{
					one[i] = small[i];
			}
			
			for(int i=0; i<one.length; i++)
			{
					two[i] = medium[i];
			}
			
			for(int i=0; i<one.length; i++)
			{
					three[i] = big[i];
			}
			while(selection != 0)
			{
				Sorter.runSortStats(selection, one, two, three);
				selection = Sorter.displayMenu();
			}
		}
		System.out.println();
		System.out.print("Thank you for using the program.");
	}
}

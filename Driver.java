//******************************************************************************************************
//Program:		Driver.Java
//Programmer:		Brandon Corbett
//Date:			Sept 17, 2014
//Description:		Creates an object that is capable of several different types of loops and algorithms
//*******************************************************************************************************
package lab2;

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Welcom to a Algorithm test system. You can have a better understanding of BigO notation and the effect it has on \n"
				+ "the time it takes to complete a task through this system(measured in milliseconds).");
		
		System.out.println();
		
		//Creates a loop object
		loop1 loop = new loop1();
		
		loop.menu();	
	}
}

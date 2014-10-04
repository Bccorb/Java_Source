//******************************************************************************************************
//Program:		Loop1.Java
//Programmer:		Brandon Corbett
//Date:			Sept 17, 2014
//Description:		Creates an object that is capable of several different types of loops and algorithms
//*******************************************************************************************************
package lab2;
import java.util.*;

public class loop1 
{
	public loop1() 
	{
	}
	
	public static void menu()
	{
		Scanner scan = new Scanner(System.in);
		
		int n, m, b;
		
		System.out.print("1.Simple O(n^2) \n"
				+ "2.O(n log n) \n"
				+ "3.O(n^3) \n"
				+ "4.Base Conversion \n"
				+ "5.The Ackerman Function \n"
				+ "9.Ends the program \n");
		System.out.print("Enter in the number of the type of algorithm you would like to run: ");
		int response = scan.nextInt();
		System.out.println();
		
		while(response != 9)
		{
			
			switch(response)
			{
			case 1:
				System.out.print("Enter the number of iterations you would like for this loop: ");
				n = scan.nextInt();
				
				long startTime = System.currentTimeMillis();
				run(n);
				long endTime = System.currentTimeMillis();
				long totalTime = endTime - startTime;
				System.out.println("The total time in milliseconds is : " + totalTime);
				break;
				
			case 2:
				System.out.print("Enter the number of iterations you would like for this loop: ");
				n = scan.nextInt();
				
				startTime = System.currentTimeMillis();
				run2(n);
				endTime = System.currentTimeMillis();
				totalTime = endTime - startTime;
				System.out.println("The total time in milliseconds is : " + totalTime);
				break;
				
			case 3:
				System.out.print("Enter the number of iterations you would like for this loop: ");
				n = scan.nextInt();
				
				startTime = System.currentTimeMillis();
				run3(n);
				endTime = System.currentTimeMillis();
				totalTime = endTime - startTime;
				System.out.println("The total time in milliseconds is : " + totalTime);
				break;
				
			case 4:
				System.out.print("Enter a number: "); 
				n = scan.nextInt();
				System.out.print("Enter a base number(MUST BE LESS THAN 10): ");
				b = scan.nextInt();
				
				System.out.println(convert(n,b));
				// System.out.println(n + " converted into base " + b + " " + remainder);
				break;
				
			case 5:
				System.out.print("Enter a number for m: "); 
				m = scan.nextInt();
				System.out.print("Enter a number for n: ");
				n = scan.nextInt();
				
				
				System.out.println(acker(m,n));
				break;

			default: 
				System.out.println("Whoa, Whoa, Whoa! Something went wrong. Let's Try again!");
				break;
			}
			System.out.println();
			System.out.print("1.Simple O(n^2) \n"
					+ "2.O(n log n) \n"
					+ "3.O(n^3) \n"
					+ "4.Base Conversion \n"
					+ "5.The Ackerman Function \n"
					+ "9.Ends the program \n");
			System.out.print("Enter in the number of the type of algorithm you would like to run: ");
			response = scan.nextInt();
		}
	}
	//----------------------------------------------------------------
	//First loop method is a BigO(n^2) order.
	//----------------------------------------------------------------
	public static int run(int n) 
	{
		int sum = 0;
			for (int i = 0; i < n; i++)
				for(int j=0; j<n; j++)
		
		sum++;
		
		return sum;	
	}
	
	//-----------------------------------------------------------------
	//Second loop method is a BigO(n log n)
	//-----------------------------------------------------------------
	public static int run2(int n)
	{
		int sum = 0;
		for (int i=0; i<n; i++)
			for(int j=0; j<n * n; j++)
				
		sum++;
		return sum;
	}
	
	//-------------------------------------------------------
	//Third loop method is a BigO(n^3)
	//-------------------------------------------------------
	public static int run3(int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
			for(int j=0; j<n; j++)
				for(int k=0; k<n; k++)
					
		sum++;
	
	return sum;	
	}

	//-------------------------------------------------------
	//Converts a base 10 number into a base b number.
	//-------------------------------------------------------
	public static String convert(int n, int b)
	{
		int quotient = n/b;
		int remainder = n%b;
		
		if(quotient == 0)
		{
			return  n + " converted into base " + b + " is " + remainder;
		}
		else 
			{	
			return convert(quotient, b) + remainder;
			}
	}
	
	//-------------------------------------------------------
	//Represents the Ackermann function
	//-------------------------------------------------------
	 public static int acker(int m, int n) 
	 {
		      if (m == 0) return n + 1;
		      if (n == 0) return acker(m - 1, 1);
		      return acker(m - 1, acker(m, n - 1));
	 }
}


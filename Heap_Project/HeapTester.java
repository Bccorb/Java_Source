package lab7;


import java.util.Scanner;

public class HeapTester
{
	private LinkedHeap<Integer> displayHeap = new LinkedHeap<Integer>();
	
	public HeapTester() 
	{
	}

	//-----------------------------------------------------------------
	//  Collects 20 numbers from the user and then shows heap functions.
	//-----------------------------------------------------------------
	public void collectNumbers()
	{
	  Scanner scan = new Scanner(System.in);
	  int[] usrNums = new int[20];
	  Object[] sortList = new Object[20];
	  System.out.println ("Please Enter 20 numbers for our Heap display!");
	  for(int i = 0; i < 20; i++)
	  {
		 System.out.print("Enter a number: ");
		 usrNums[i] = scan.nextInt();
		 sortList[i] = usrNums[i];
		 displayHeap.addElement(usrNums[i]);
		 System.out.println();
		 System.out.println("Okay got it! You entered " + usrNums[i]);
	  }
	  scan.close();
	  
	  System.out.println("Let me show off some heap functions");
	  System.out.println("The smallest number you entered is " + displayHeap.findMin());
	  displayHeap.removeMin();
	  System.out.println();
	  System.out.println("After removing the smallest value, the next smallest value is " + displayHeap.findMin());
	  //HeapSort<Object> sorter = new HeapSort<Object>();
	  //sorter.sort(sortList);
	  //System.out.println("The all of the numbers you entered sorted are: ");
	  System.out.println();
	  System.out.println("Thank you for using the program. GoodBye");
	}
}

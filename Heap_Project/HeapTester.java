package lab7;


import java.util.Scanner;

public class HeapTester 
{
	private LinkedBinaryTree<Integer> tree;
	
	public HeapTester() 
	{
	}

	//-----------------------------------------------------------------
	//  
	//-----------------------------------------------------------------
	public void collectNumbers()
	{
	  Scanner scan = new Scanner(System.in);
	  int[] original = new int[20];
	  System.out.println ("Please Enter 20 numbers for our Heap display!");
	  for(int i = 0; i < 20; i++)
	  {
		 System.out.print("Enter a number: ");
		 original[i] = scan.nextInt();
		 
		 System.out.println();
		 System.out.println("Okay got it! You entered " + original[i]);
	  }
	  int entry1, entry2, entry3, entry4, entry5, entry6, entry7, entry8, entry9, entry10,
		entry11, entry12, entry13, entry14, entry15, entry16, entry17, entry18, entry19, entry20;
	  
	  scan.close();
	  entry1 = original[0];
	  entry2 = original[1];
	  entry3 = original[2];
	  entry4 = original[4];
	  entry5 = original[5];
	  entry6 = original[6];
	  entry7 = original[7];
	  entry8 = original[8];
	  entry9 = original[9];
	  entry10 = original[10];
	  entry11 = original[11];
	  entry12 = original[12];
	  entry13 = original[13];
	  entry14 = original[14];
	  entry15 = original[15];
	  entry16 = original[16];
	  entry17 = original[17];
	  entry18 = original[18];
	  entry19 = original[19];
	  entry20 = original[20];
	  
	}
}

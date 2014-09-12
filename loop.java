//*********************************************************************************
//Loop.Java
//
//Creates an object that is capable of several different types of loops
//*********************************************************************************
package lab2;

public class loop1 
{

	public loop1() 
	{
	}
	
	//----------------------------------------------------------------
	//First loop method is a BigO(n^2) order.
	//----------------------------------------------------------------
	public int run(int n) 
	{
		int sum = 0;
			for (int i = 0; i < n; i++)
				for(int j=0; j<n; j++)
					sum++;
		
		return sum;	
	}
	
	//-----------------------------------------------------------------
	//Second loop method
	//-----------------------------------------------------------------
	public int run2(int n)
	{
		int sum = 0;
		for (int i=0; i<n; i++)
			for(int j=0; j<n * n; j++)
				sum++;
		return sum;
	}
}

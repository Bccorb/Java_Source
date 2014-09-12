package lab2;

public class Driver {

	public static void main(String[] args) 
	{
		//Creates a loop object
		loop1 alg = new loop1();
		
		//Sets up the beginning variables for the first loop test and runs loop one.
		long startTime = System.currentTimeMillis();
		alg.run(5484);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		System.out.println();
		
		//Sets up the variables for the second loop test and runs loop two.
		startTime = System.currentTimeMillis();
		alg.run2(5484);
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
	}
}

/**
 * 
 * @author bcorbett
 * @version 1.0
 */
import java.util.*;

public class TicketCounter 
{
	Scanner in;
	
	public TicketCounter(String name, int number) 
	{	
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String name;
		
		LinkedQueue<String> TicketCounter = new LinkedQueue<String>();
		
		System.out.println("Welcome to ticket counter system. \n\n"
				+ "We can only handle 3 customers at a time so once we"
				+ "have 3 we will begin to serve. \n\n"
				+ " Please Enter your name to be added to the waitline.");
		do
		{
			name = in.nextLine(); 
			TicketCounter.enqueue(name);
			System.out.println();
		}
		while(TicketCounter.size() != 3);
		
		while(!TicketCounter.isEmpty())
		{
			System.out.println("The next person is: " + TicketCounter.first());
			TicketCounter.dequeue();
			System.out.println("Thank you for your service!");
		}
		System.out.println("All done!");
		in.close();
	}

}

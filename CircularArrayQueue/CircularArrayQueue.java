public class CircularArrayQueue<T> implements QueueADT<T> 
{
	private final static int DEFAULT_CAPACITY = 50;
	private int front, rear, count;
	private T[] queue;
	
	public CircularArrayQueue(int initialCapacity) 
	{
		front = rear = count = 0;
		queue = (T[])(new Object[initialCapacity]);
	}
	
	public CircularArrayQueue()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public void enqueue (T element)
	{
		if (size() == queue.length)
			 expandCapacity();
		
		queue[rear] = element;
		rear = (rear + 1) % queue.length;
		
		count++;
	}
	
	private void expandCapacity()
	{
		T[] larger = (T[]) (new Object[queue.length * 2]);
		
		for (int scan = 0; scan < count; scan++)
		{
			larger[scan] = queue[front];
			front = (front + 1) % queue.length;
		}
		front = 0;
		rear = count;
		queue = larger;
	}
	
	public T dequeue()
	{
		T result = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		
		count--;
		
		return result;
	}

	@Override
	public T first() 
	{
		return queue[front];
	}

	@Override
	public boolean isEmpty() 
	{
		return count == 0;
	}

	@Override
	public int size() 
	{
		return count;
	}
	
	public String toString()
	{
		String result = "";
		
		for(int i=0; i<queue.length; i++)
		{
			if (queue[i] != null)
				result += queue[i] + " \n" + "----------------\n";
		}
		return result;
		
	}

}

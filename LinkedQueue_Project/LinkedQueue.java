
/**
 * 
 * @author Brandon Corbett
 *
 */

public class LinkedQueue<T> implements QueueADT<T> 
{
	private int count;
	private LinearNode<T> head, tail;
	
	public LinkedQueue() 
	{
		count = 0;
		head = tail = null;
	}

	/**
	 * 
	 * @Override
	 * @param element element to be added to the queue
	 */
	
	public void enqueue(T element) 
	{
		LinearNode<T> node = new LinearNode<T>(element);
		
		if (isEmpty())
			head = node;
		else
			tail.setNext(node);
		
		tail = node;
		count++;
	}
	
	/**
	 * 
	 * @Override
	 * removes the first element in the queue
	 */ 
	public T dequeue() 
	{
		
		T result = head.getElement();
		head = head.getNext();
		count--;
		
		if(isEmpty())
			tail= null;
		
		return result;
	}

	@Override
	public T first() 
	{
		T value = head.getElement();
		
		return value;
	}

	@Override
	public boolean isEmpty() 
	{	
		
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package lab7;

public class ArrayHeap<T> extends ArrayBinaryTree<T> implements HeapADT<T>
{
	/**
	 * ArrayHeap provides an array implementation of a minHeap.
	 * 
	 * @author Brandon Corbett
	 * @version 1.0
	 */
	public ArrayHeap() 
	{
		super();
	}

	/**
	 * Adds the specified element to this heap in the appropriate position according to it's key value.
	 * 
	 * @param obj the element to be added to the heap
	 */
	public void addElement(T obj) 
	{
		if (count == tree.length)
			expandCapacity();
		
		tree[count] = obj;
		count++;
		modCount++;
		
		if(count > 1)
			heapifyAdd();
	}

	@SuppressWarnings("unchecked")
	public void expandCapacity()
	{
		T[] temp = tree;
		tree = (T[]) new Object[tree.length * 2];
		for(int i = 0; i < temp.length; i++)
			tree[i] = temp[i];
	}
	
	/**
	 * Reorders the heap to maintain the ordering property after adding a node
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void heapifyAdd()
	{
		T temp;
		int next = count - 1;
		
		temp = tree[next];
		
		while((next != 0) && (((Comparable)temp).compareTo(tree[(next - 1)/2]) < 0))
		{
			tree[next] = tree[(next - 1) / 2];
			next = (next - 1) / 2;
		}
		tree[next] = temp;
	}
	/**
	 * Remove the element with the lowest value in this heap and returns a reference to that value.
	 * Throws an exception is the heap is empty.
	 * 
	 * @return a reference to the element with the lowest value in this heap
	 * @throws EmptyCollectionException if the heap is empty
	 */
	public T removeMin() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("ArrayHeap");
		
		T minElement = tree[0];
		tree[0] = tree[count - 1];
		heapifyRemove();
		count--;
		modCount--;
		
		return minElement;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void heapifyRemove()
	{
		T temp;
		int node = 0;
		int left = 1;
		int right = 2;
		int next;
		
		if((tree[left] == null) && (tree[right] == null))
			next = count;
		else if(tree[right] == null)
			next = left;
		else if(((Comparable)tree[left]).compareTo(tree[right]) < 0)
			next = left;
		else
			next = right;
		temp = tree[node];
		
		while((next < count) && (((Comparable)tree[next]).compareTo(temp) < 0))
		{
			tree[node] = tree[next];
			node = next;
			left = 2 * node + 1;
			right = 2 * (node + 1);
			if ((tree[left] == null) && (tree[right]) == null)
				next = count;
			else if (tree[right] == null)
				next = left;
			else if (((Comparable)tree[left]).compareTo(tree[right]) < 0)
				next = left;
			else
				next = right;
		}
		tree[node] = temp;
	}
	
	public T findMin() 
	{
		return tree[0];
	}
	
}

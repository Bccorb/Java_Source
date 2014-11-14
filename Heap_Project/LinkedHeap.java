package lab7;

public class LinkedHeap<T> extends LinkedBinaryTree<T>
{
	protected int modCount;
	protected HeapNode<T> lastNode;
	
	public LinkedHeap() 
	{
		super();
	}
	
	public LinkedHeap(T obj)
	{
		root = new HeapNode<T>(obj);
	}

	/**
	 * Adds the specified element to this heap in the appropriate
	 * position according to its key value.
	 * 
	 * @param obj the element to be added to the heap
	 */
	public void addElement(T obj)
	{
		HeapNode<T> node = new HeapNode<T>(obj);
		
		if (root == null)
			root = node;
		else
		{
			HeapNode<T> nextParent = getNextParentAdd();
			if(nextParent.getLeft() == null)
				nextParent.setLeft(node);
			else
				nextParent.setRight(node);
			
			node.setParent(nextParent);
		}
		lastNode = node;
		modCount++;
		if (size() > 1)
			heapifyAdd();
	}
	/**
	 * Returns the node that will be the parent of the new node
	 * 
	 * @return the node that will be the parent of the new node
	 */
	private HeapNode<T> getNextParentAdd()
	{
		HeapNode<T> result = lastNode;
		
		while((result != root) && (result.getParent().getLeft() != result))
			result = result.getParent();
		
		if (result != root)
			if (result.getParent().getRight() == null)
				result = result.getParent();
			else
			{
				result = (HeapNode<T>)result.getParent().getRight();
				while (result.getLeft() != null)
					result = (HeapNode<T>)result.getLeft();
			}
		else
			while(result.getLeft() != null)
				result = (HeapNode<T>)result.getLeft();
		
		return result;
	}
	
	/**
	 * Reorders the heap after adding a node.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void heapifyAdd()
	{
		T temp;
		HeapNode<T> next = lastNode;
		temp = next.getElement();
		while ((next != root) && (((Comparable)temp).compareTo(next.getParent().getElement()) < 0))
		{
			next.setElement(next.getParent().getElement());
			next = next.parent;
		}
		next.setElement(temp);
	}
	
	/**
	 * Removes the element with the lowest value in this heap and returns a reference to it. 
	 * 
	 * @return the element with the lowest value in the heap
	 * @throws EmptyCollectionException if the heap is empty
	 */
	public T removeMin() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("LinkedHeap");
		T minElement = root.getElement();
		if (size() == 1)
		{
			root = null;
			lastNode = null;
		}
		else
		{
			HeapNode<T> nextLast = getNewLastNode();
			if (lastNode.getParent().getLeft() == lastNode)
				lastNode.getParent().setLeft(null);
			else
				lastNode.getParent().setElement(lastNode.getElement());
			
			((HeapNode<T>)root).setElement(lastNode.getElement());
			lastNode = nextLast;
			heapifyRemove();
		}
		modCount++;
		
		return minElement;
	}
	
	/**
	 * Returns the node that will be the new last node after a remove.
	 * 
	 * @return the node that will be the new last node after a remove
	 */
	private HeapNode<T> getNewLastNode()
	{
		HeapNode<T> result = lastNode;
		
		while ((result != root) && (result.getParent().getLeft() == result))
			result = result.getParent();
		
		if (result != root)
			result = (HeapNode<T>)result.getParent().getLeft();
		
		while (result.getRight() != null)
			result = (HeapNode<T>)result.getRight();
		
		return result;
	}
	
	/**
	 * Reorders the heap after removing the root element. 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void heapifyRemove()
	{
		T temp;
		HeapNode<T> node = (HeapNode<T>)root;
		HeapNode<T> left = (HeapNode<T>)node.getLeft();
		HeapNode<T> right = (HeapNode<T>)node.getRight();
		HeapNode<T> next;
		
		if ((left == null) && (right == null))
			next = null;
		else if (right == null)
			next = left;
		else if (((Comparable)left.getElement()).compareTo(right.getElement()) < 0)
			next = left;
		else
			next = right;
		
		temp = node.getElement();
		while((next != null) && (((Comparable)next.getElement()).compareTo(temp) < 0))
		{
			node.setElement(next.getElement());
			node = next;
			left = (HeapNode<T>)node.getLeft();
			right = (HeapNode<T>)node.getRight();
			
			if((left == null) && (right == null))
				next = null;
			else if (right == null)
				next = left;
			else if (((Comparable)left.getElement()).compareTo(right.getElement()) < 0)
				next = left;
			else
				next = right;
		}
		node.setElement(temp);
	}
	public T findMin()
	{
		return root.getElement();
	}
}


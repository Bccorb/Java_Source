package lab7;
/**
 * HeapADT defines the interface to a Heap.
 * 
 * @author B.corbett
 * @version 1.0
 */
public interface HeapADT<T> extends BinaryTreeADT<T> 
{
	/**
	 * Adds an object to this heap
	 * 
	 * @param obj the object to be added
	 */
	public void addElement(T obj);
	
	/**
	 * Removes object with the lowest value form the heap
	 * 
	 * @return the object that was removed
	 */
	public T removeMin();
	
	/**
	 * Returns a reference to the element with the lowest value in this heap.
	 * 
	 * @return a reference to the element with the lowest value in the heap.
	 */
	public T findMin();
}

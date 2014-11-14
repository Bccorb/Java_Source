package lab7;

public class HeapSort<T> 
{
	/**
	 * Sorts the specified array using a heap
	 * 
	 * @param data the data to be sorted via HeapSort
	 */
	public HeapSort()
	{
		
	}
	
	public void sort(T[] data)
	{
		ArrayHeap<T> temp = new ArrayHeap<T>();
		
		// copy the array into a heap
		
		for (int i = 0; i < data.length; i++)
			temp.addElement(data[i]);
		
		// place the sorted elements back into the array
		
		int count = 0;
		while (!(temp.isEmpty()))
		{
			data[count] = temp.removeMin();
			count++;
		}
	}
}

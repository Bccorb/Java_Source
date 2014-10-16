/**
 * Sorter class defines an object that creates 3 arrays of 100, 250 and 500 numbers and various
 * ways to sort through, providing time feed back on each of the arrays time to be sorted.
 * 
 * @author Brandon Corbett
 * @Version 1.0
 */
import java.util.*;

public class Sorter<T extends Comparable<T>> 
{	
	public Sorter() 
	{
	}
	
	//****************************************************************************
	// 							SELECTION SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of numbers using the selection sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] data)
	{
		int min;
		//T temp;
		
		for (int index=0; index< data.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan<data.length; scan++)
			{
				if(data[scan].compareTo(data[min])<0)
					min=scan;
				
				swap(data, min, index);
			}
		}
	}
	
	//****************************************************************************
	// 							INSERTION SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts a given array of objects using an insertion sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] data)
	{
		for (int index = 1; index < data.length; index++)
		{
			T key = data[index];
			int position = index;
			
			//Shifts larger values to the right
			while(position > 0 && data[position-1].compareTo(key)> 0)
			{
				data[position] = data[position-1];
				position--;
			}
		}
	}
	
	//****************************************************************************
	// 							QUICK SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of objects using a quick sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> void quickSort(T [] data)
	{
		quickSort(data, 0, data.length -1);
	}
	
	/**
	 * Uses recursion to sort a range of objects in the specified array using the quick sort algorithm.
	 * 
	 * @param data the array to be sorted
	 * @param min the minimum index in the range to be sorted
	 * @param max the maximum index in the range to be sorted
	 */
	
	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max)
	{
		if (min < max)
		{
			//creates partitions
			int indexofpartition = partition(data, min, max);
			
			//sorts the left side of the partition
			quickSort(data, min, indexofpartition - 1);
			
			//sorts the right side of the partition
			quickSort(data, indexofpartition + 1, max);
		}
	}
	
	//***********************************************************
	// Supporting method for the quick sort algorithm. 
	//
	//***********************************************************
	
	/**
	 * Quick sort supporting method.
	 * 
	 * @param data array to  be sorted
	 * @param min the minimum index in the range sorted
	 * @param max the maximum index in the range sorted
	 * @return
	 */
	private static <T extends Comparable<T>> int partition(T[] data, int min, int max)
	{
		T partitionElement;
		int left, right;
		
		int middle = (min + max) / 2;
		
		// uses the middle data value as the partition element
		
		partitionElement = data[middle];
		
		// moves it out of the way
		
		swap(data, middle, min);
		left = min;
		right = max;
		while(left < max);
		{
			// searches for an element that is greater than the partition element
			
			while(left < right && data[left].compareTo(partitionElement) <= 0)
				left++;
			
			//searches for an element that is less than the partition element
			
			while (data[right].compareTo(partitionElement) > 0)
				right--;
			
			//swaps the elements
			
			if (left < right)
				swap(data, left, right);
		}
		
		// moves the partition element into place
		
		swap(data, min, right);
		return right;
	}
	
	//******************************************************
	// End of supporting method for quick sort
	//******************************************************
	
	
	//****************************************************************************
	// 							BUBBLE SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts a given array of objects using a bubble sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] data)
	{
		int position, scan;
		//T temp;
		
		for(position = data.length; position >= 0; position--)
		{
			for(scan = 0; scan <= position-1; scan++)
			{
				if(data[scan].compareTo(data[scan++]) > 0)
					swap(data, scan, scan + 1);
			}
		}
	}
	
	//****************************************************************************
	// 							MERGE SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of objects using the merge sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] data)
	{
		mergeSort(data, 0, data.length -1);
	}
	
	
	//*********************************************************
	// 							Merge sort support methods
	//*********************************************************
	
	/**
	 * Uses recursion to sort a range of objects in the give array using the merge sort algorithm.
	 * 
	 * @param data the given array to be sorted
	 * @param min the index of the first element
	 * @param max the index of the last element
	 */
	private static <T extends Comparable <T>> void mergeSort(T[]data, int min, int max)
	{
		if (min < max)
		{
			int mid = (min + max) / 2;
			mergeSort(data, min, mid);
			mergeSort(data, mid+1, max);
			merge(data, min, mid, max);
		}
	}
	
	/**
	 * Merges two sorted subarrays of the specified array.
	 * 
	 * @param data the array to be sorted
	 * @param first the beginning index of the first subarry
	 * @param mid the ending index of the first subarray
	 * @param last the ending index of the second subarray
	 */
	@SuppressWarnings("unchecked")
	private static <T extends Comparable<T>> void merge(T [] data, int first, int mid, int last)
	{
		T[] temp = (T[]) (new Comparable[data.length]);
		
		int first1 = first, last1 = mid; //endpoints of the first subarray
		int first2 = mid+1, last2 = last; //endpoints of the second subarry
		int index = first1; //next index open in temp array
		
		//Copy smaller item from each subarray into the temp until one of the subarrays is exhausted
		
		while(first1 <= last1 && first2 <- last2)
		{
			if (data[first].compareTo(data[first2]) < 0)
			{
				temp[index] = data[first1];
				first1++;
			}
			else
			{
				temp[index] = data[first2];
				first2++;
			}
				index++;
		}
		// Copy remaining elements from the first subarray, if any
		
		while(first1 <= last1)
		{
			temp[index] = data[first1];
			first1++;
			index++;
		}
		
		//Copy remaining elements from second subarray, if any
		
		while (first2 <= last2)
		{
			temp[index] = data[first2];
			first2++;
			index++;
		}
		
		//Copy merged data in to original array
		
		for (index = first; index <= last; index++)
			data[index] = temp[index];
	}
	//****************************************************************************
	// 							END OF MERGE SORT METHOD
	//****************************************************************************
	
	
	//****************************************************************************
	// 							RADIX SORT ALGORITHM
	//****************************************************************************
	
	@SuppressWarnings("unchecked")
	public void radixSort(int[] data)
	{
		int[] array = data;
		String temp;
		Integer numObj;
		int digit, num;
		
		Queue<Integer>[] digitQueues = (LinkedList<Integer>[]) (new LinkedList[array.length]);
		for(int digitVal = 0; digitVal <= 9; digitVal++)
			digitQueues[digitVal] = (Queue<Integer>) (new LinkedList<Integer>());
		
		//sorts the list
		
		for (int position = 0; position <= 3; position++)
		{
			for(int scan = 0; scan < array.length; scan++)
			{
				temp = String.valueOf(array[scan]);
				digit = Character.digit(temp.charAt(3-position), 10);
				digitQueues[digit].add(new Integer(data[scan]));
			}
			
			//gather numbers back into list
			
			num = 0;
			for (int digitVal = 0; digitVal <= 9; digitVal++)
			{
				while(!(digitQueues[digitVal].isEmpty()))
				{
					numObj = digitQueues[digitVal].remove();
					data[num] = numObj.intValue();
					num++;
				}
			}
		}
	}
	
	//****************************************************************************
	// 							GNOME SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts an array of objects by comparing objects side by side, but once encountering a 
	 * value that needs to be swapped, it goes backwards through the array to ensure that all values
	 * are sorted all the way back to index 0.
	 * 
	 * @param data the given array to be sorted
	 */
	public static <T extends Comparable<T>> void gnomeSort(T[] data)
	{
		for(int index=1; index < data.length;)
		{
			if (data[index-1].compareTo(data[index]) <= 0)
				index++;
			else
			{
				swap(data, index, (index - 1));
				index--;
				if(index == 0)
					index = 1;
			}	
		}
	}
	
	//****************************************************************************
	// 							BOGO SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Takes a given array checks if it is sorted, if not it randomly shuffles the numbers
	 * and checks again. Bogo is short for bogus, becaus that what this sorting algorithm
	 * is! 
	 * 
	 * @param data the given array to be shuffled. 
	 */
	public static <T extends Comparable<T>> void bogoSort(T[] data)
	{
		while (!isSorted(data))
		{
			shuffle(data);
		}
	}
	//****************************************************************************
	// 							Supporting methods for Bogo Sort
	//****************************************************************************
	
	/**
	 * Checks to see if the given array is sorted.
	 * 
	 * @param data the given array to be sorted
	 * @return true if it is sorted or false if not
	 */
	private static <T extends Comparable<T>> boolean isSorted(T[] data)
	{
		for (int i=0; i<data.length - 1; i++)
		{
			if (data[i].compareTo(data[i]) > 0)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Performs a random shuffle of the values in a given array.
	 * 
	 * @param data the given array to be shuffled
	 */
	public static <T extends Comparable<T>> void shuffle(T[] data)
	{
		for (int i=0; i< data.length - 1; i++)
		{
			int range = data.length - 1 -(i+ 1) + 1;
			int j = (int) (Math.random() * range + (i + 1));
			swap(data, i, j);
		}
	}
	//****************************************************************************
	// 							End of Supporting methods for Bogo Sort
	//****************************************************************************	
	
	
	//****************************************************************************
	// 							COCKTAIL SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Uses a bubble sort to sort through an array linearly, then uses a reverse bubble sort
	 * to sort backwards through the list linearly.
	 * 
	 * @param data the given array to be sorted
	 */
	public static <T extends Comparable<T>> void cocktailSort(T[] data)
	{
		boolean switched = true;
		int i = 0;
		int j = data.length - 1;
		
		while(i < j && switched)
		{
			switched = false;
			for(int k = i; k < j; k++)
			{
				if(data[k].compareTo(data[k + 1]) > 0)
				{
					swap(data, k, (k+1));
					switched = true;
				}
			}
			j--;
			if(switched)
			{
				switched = false;
				for(int k = j; k > i; k++)
				{
					swap(data, k, (k-1));
				}
			}
		}
	}
	
	//****************************************************************************
	// 							SHELL SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts an array of objects by comparing objects at far ends of the array and shorting the 
	 * gap between them.
	 * 
	 * @param data given array to be sorted.
	 */
	public static <T extends Comparable<T>> void shellSort(T[] data)
	{
		for (int gap = data.length/2; gap > 0; gap /= 2)
		{
			for(int i = gap; i < data.length; i++)
			{
				T val = data[i];
				int j;
				for(j = i; j >= gap && data[j - gap].compareTo(val) > 0; j -= gap)
				{
					data[j] = data[j - gap];
				}
				data[j] = val;
				}
			}
	}
	
	//****************************************************************************
	// 							SWAP METHOD USED FOR SWITCHING VALUES
	//****************************************************************************
	
	/**
	 * The swapping method that will be used by various sort algorithms to handle the actually
	 * reposition of values in the array
	 * 
	 * @param data the array in which the element will be swapped
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 */
	private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2)
	{
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
}

/**
 * Sorter class defines an object that creates 3 arrays of 100, 250 and 500 numbers and various
 * ways to sort through, providing time feed back on each of the arrays time to be sorted.
 * 
 * @author Brandon Corbett
 * @Version 1.2
 */
import java.util.*;

public class Sorter 
{	
	static Scanner in;
	
	public Sorter() 
	{
	}
	
	public static int displayMenu()
	{
		in = new Scanner(System.in);

		System.out.print("\t\t1. Selection Sort\n\t\t2. Insertion Sort\n\t\t3. Quick Sort\n\t\t4. Bubble Sort\n\t\t5. Merge Sort\n\t\t"
			+ "6. Radix Sort\n\t\t7. Gnome Sort\n\t\t8. Cocktail Sort\n\t\t9. Shell Sort\n\t\t10.BOGO Sort\n\t\tEnter the type of sort to compare(0 to end): ");
	
		int selection = in.nextInt();
	
		return selection;
	}

	public static void runSortStats(int sortNum, int[] data1, int[] data2, int[] data3)
	{	
		long startTime, endTime, smalltotalTime, mediumtotalTime, bigtotalTime;
		switch(sortNum)
		{
			case 1:
				startTime = System.currentTimeMillis();
				Sorter.selectionSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.selectionSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.selectionSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tSELECTION SORT STATICS\n"
							+ "\t--------------------------------------------\n"
							+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 2:
				startTime = System.currentTimeMillis();
				Sorter.insertionSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.insertionSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.insertionSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tINSERTION SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 3:
				startTime = System.currentTimeMillis();
				Sorter.quickSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.quickSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.quickSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tQUICK SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 4:
				startTime = System.currentTimeMillis();
				Sorter.bubbleSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.bubbleSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.bubbleSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tBUBBLE SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 5:
				startTime = System.currentTimeMillis();
				Sorter.mergeSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.mergeSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.mergeSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tMERGE SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 6:
				startTime = System.currentTimeMillis();
				Sorter.radixSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.radixSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.radixSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tRADIX SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 7:
				startTime = System.currentTimeMillis();
				Sorter.gnomeSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.gnomeSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.gnomeSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tGNOME SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 8:
				startTime = System.currentTimeMillis();
				Sorter.cocktailSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.cocktailSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.cocktailSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tCOCKTAIL SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 9:
				startTime = System.currentTimeMillis();
				Sorter.shellSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.shellSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.shellSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tSHELL SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 10:
				startTime = System.currentTimeMillis();
				Sorter.bogoSort(data1);
				endTime = System.currentTimeMillis();
				smalltotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.bogoSort(data2);
				endTime = System.currentTimeMillis();
				mediumtotalTime = endTime - startTime;
					
				startTime = System.currentTimeMillis();
				Sorter.bogoSort(data3);
				endTime = System.currentTimeMillis();
				bigtotalTime = endTime - startTime;
					
				System.out.println();

				System.out.println("\t\tBOGO SORT STATICS\n"
						+ "\t--------------------------------------------\n"
						+ "\t\tTime for sorting 100 numbers: " + smalltotalTime + "\n\t\tTime for sorting 250 numbers: " + mediumtotalTime + 
							  "\n\t\tTime for sorting 500 numbers: " + bigtotalTime + ".");
				System.out.println();
				break;
			case 0:
				System.out.println();
				break;
			default :
				System.out.println("Error in Entry. Please try again. Must be one of the number selections!");
				System.out.println();
				break;
			}
		}
	//****************************************************************************
	// 	SELECTION SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of numbers using the selection sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static void selectionSort(int[] data)
	{
		int min;
		
		for (int index=0; index < data.length-1; index++)
		{
			min = index;
			for (int scan = index + 1; scan < data.length; scan++)
			{
				if(data[scan] < data[min])
					min=scan;
				
				swap(data, min, index);
			}
		}
	}
	
	//****************************************************************************
	// 	INSERTION SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts a given array of objects using an insertion sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static void insertionSort(int[] data)
	{
		for (int index = 1; index < data.length; index++)
		{
			int key = data[index];
			int position = index;
			
			//Shifts larger values to the right
			while(position > 0 && data[position - 1] > key)
			{
				data[position] = data[position - 1];
				position--;
			}
			data[position] = key;
		}
	}
	
	//****************************************************************************
	// 	QUICK SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of objects using a quick sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static void quickSort(int[] data)
	{
		quickSort(data, 0, data.length - 1);
	}
	
	/**
	 * Uses recursion to sort a range of objects in the specified array using the quick sort algorithm.
	 * 
	 * @param data the array to be sorted
	 * @param min the minimum index in the range to be sorted
	 * @param max the maximum index in the range to be sorted
	 */
	
	private static void quickSort(int[] data, int min, int max)
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
	//***********************************************************
	
	/**
	 * Quick sort supporting method.
	 * 
	 * @param data array to  be sorted
	 * @param min the minimum index in the range sorted
	 * @param max the maximum index in the range sorted
	 * @return
	 */
	private static int partition(int[] data, int min, int max)
	{
		int partitionElement;
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
			
			while(left < right && data[left] <= partitionElement)
				left++;
			
			//searches for an element that is less than the partition element
			
			while (data[right] > partitionElement)
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
	// 	BUBBLE SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts a given array of objects using a bubble sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static void bubbleSort(int[] data)
	{
		int position, scan;
		
		for(position = data.length - 1; position >= 0; position--)
		{
			for(scan = 0; scan <= position - 1; scan++)
			{
				if(data[scan] > data[scan + 1])
					swap(data, scan, scan + 1);
			}
		}
	}
	
	//****************************************************************************
	// 	MERGE SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts the given array of objects using the merge sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static void mergeSort(int[] data)
	{
		mergeSort(data, 0, data.length -1);
	}
	
	
	//*********************************************************
	// Merge sort support methods
	//*********************************************************
	
	/**
	 * Uses recursion to sort a range of objects in the give array using the merge sort algorithm.
	 * 
	 * @param data the given array to be sorted
	 * @param min the index of the first element
	 * @param max the index of the last element
	 */
	private static void mergeSort(int[]data, int min, int max)
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
	private static void merge(int[] data, int first, int mid, int last)
	{
		int[] temp = new int[data.length];
		
		int first1 = first, last1 = mid; //endpoints of the first subarray
		int first2 = mid+1, last2 = last; //endpoints of the second subarry
		int index = first1; //next index open in temp array
		
		//Copy smaller item from each subarray into the temp until one of the subarrays is exhausted
		
		while(first1 <= last1 && first2 <- last2)
		{
			if (data[first] < data[first2])
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
	// END OF MERGE SORT METHOD
	//****************************************************************************
	
	
	//****************************************************************************
	// 	RADIX SORT ALGORITHM
	//****************************************************************************
	
	@SuppressWarnings("unchecked")
	public static void radixSort(int[] data)
	{
		String temp;
		Integer numObj;
		int digit, num;
		
		Queue<Integer>[] digitQueues = (LinkedList<Integer>[]) (new LinkedList[data.length]);
		for(int digitVal = 0; digitVal <= 9; digitVal++)
			digitQueues[digitVal] = (Queue<Integer>) (new LinkedList<Integer>());
		
		//sorts the list
		
		for (int position = 0; position <= 3; position++)
		{
			for(int scan = 0; scan < data.length; scan++)
			{
				temp = String.valueOf(data[scan]);
				digit = Character.digit(temp.charAt(0 + position), 10);
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
	// 	GNOME SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts an array of objects by comparing objects side by side, but once encountering a 
	 * value that needs to be swapped, it goes backwards through the array to ensure that all values
	 * are sorted all the way back to index 0.
	 * 
	 * @param data the given array to be sorted
	 */
	public static void gnomeSort(int[] data)
	{
		for(int index=1; index < data.length;)
		{
			if (data[index-1] <= data[index])
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
	// 	BOGO SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Takes a given array checks if it is sorted, if not it randomly shuffles the numbers
	 * and checks again. Bogus is short for bogus, because that what this sorting algorithm
	 * is! 
	 * 
	 * @param data the given array to be shuffled. 
	 */
	public static void bogoSort(int[] data)
	{
		while (!isSorted(data))
		{
			shuffle(data);
		}
	}
	//****************************************************************************
	//Supporting methods for Bogo Sort
	//****************************************************************************
	
	/**
	 * Checks to see if the given array is sorted.
	 * 
	 * @param data the given array to be sorted
	 * @return true if it is sorted or false if not
	 */
	private static boolean isSorted(int[] data)
	{
		for (int i=0; i < data.length - 1; i++)
		{
			if (data[i] < data[i + 1])
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
	public static void shuffle(int[] data)
	{
		for (int i=0; i < data.length - 1; i++)
		{
			Random gen = new Random();
			int range = gen.nextInt(data.length);
			swap(data, i, range);
		}
	}
	//****************************************************************************
	// End of Supporting methods for Bogus Sort
	//****************************************************************************	
	
	
	//****************************************************************************
	// 	COCKTAIL SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Uses a bubble sort to sort through an array linearly, then uses a reverse bubble sort
	 * to sort backwards through the list linearly.
	 * 
	 * @param data the given array to be sorted
	 */
	public static void cocktailSort(int[] data)
	{
		boolean switched = true;
		int i = 0;
		int j = data.length - 1;
		
		while(i < j && switched)
		{
			switched = false;
			for(int k = i; k < j; k++)
			{
				if(data[k] > data[k + 1])
				{
					swap(data, k, k + 1);
					switched = true;
				}
			}
			j--;
			if(switched)
			{
				switched = false;
				for(int k = j; k > i; k--)
				{
					if(data[k] < data[k - 1])
					{
						swap(data, k, k - 1);
						switched = true;
					}
				}
			}
		}
		i++;
	}
	
	//****************************************************************************
	// 	SHELL SORT ALGORITHM
	//****************************************************************************
	
	/**
	 * Sorts an array of objects by comparing objects at far ends of the array and shorting the 
	 * gap between them.
	 * 
	 * @param data given array to be sorted.
	 */
	public static void shellSort(int[] data)
	{
		for (int gap = data.length/2; gap > 0; gap /= 2)
		{
			for(int i = gap; i < data.length; i++)
			{
				int val = data[i];
				int j;
				for(j = i; j >= gap && data[j - gap] > (val); j -= gap)
				{
					data[j] = data[j - gap];
				}
				data[j] = val;
				}
			}
	}
	
	//****************************************************************************
	// 	SWAP METHOD USED FOR SWITCHING VALUES
	//****************************************************************************
	
	/**
	 * The swapping method that will be used by various sort algorithms to handle the actually
	 * reposition of values in the array
	 * 
	 * @param data the array in which the element will be swapped
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 */
	private static void swap(int[] data, int index1, int index2)
	{
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
}


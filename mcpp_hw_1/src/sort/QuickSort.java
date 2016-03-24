package sort;

public class QuickSort implements Sort
{
	private int[] array;
	private int number;
	public QuickSort() 
	{
		array=new int[0];
	}

	public QuickSort(int[] array)
	{
		init(array);
	}

	@Override
	public void init(int[] ini)
	{
		if (ini == null)
		{
			ini = new int[0];
		}
		array= new int[ini.length];
		for (int i=0; i<ini.length; i++)
		{
			array[i]=ini[i];
		}
	}
	@Override
	public void clear()
	{
		int[] arrOut = {};
		this.array = arrOut;
	}
	@Override
	public int[] toArray()
	{
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) 
		{
			newArray[i]=array[i];
		}

		return newArray;
	}
	@Override
	public void sort() 
	{
		if (array ==null || array.length==0)
			return;
		number = array.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) 
	{
		int i = low, j = high;
		int pivot = array[low + (high-low)/2];
		while (i <= j) // If the current value from the left list is smaller then the pivot element then get the next element from the left list
		{
			while (array[i] < pivot) 
			{
				i++;
			}
			while (array[j] > pivot) // If the current value from the right list is larger then the pivot element then get the next element from the right list
			{
				j--;
			}

			if (i <= j) // If we have found a values in the left list which is larger then the pivot element and if we have found a value in the right list which is smaller then the pivot element then we exchange thevalues.As we are done we can increase i and j
			{
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j)// Recursion
		{
			quicksort(low, j);
		}
		if (i < high)
		{
			quicksort(i, high);
		}
	}

	private void exchange(int i, int j) 
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

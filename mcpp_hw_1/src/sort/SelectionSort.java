package sort;

public class SelectionSort implements Sort
{

	int[] array;


	public SelectionSort() 
	{
		array=new int[0];
	}

	public SelectionSort(int[] array)
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

		for (int i = 0; i < array.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[index])
				{
					index = j;
				}

			int minimum = array[index]; 
			array[index] = array[i];
			array[i] = minimum;
		}
	}
}


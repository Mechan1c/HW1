package sort;

public class MergeSort implements Sort
{

	int[] array;
	int[] tempMergArr;
	int length;

	public MergeSort() 
	{
		array=new int[0];
	}

	public MergeSort(int[] array)
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
		length = array.length;
		tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) 
	{

		if (lowerIndex < higherIndex) 
		{
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) 
	{

		for (int i = lowerIndex; i <= higherIndex; i++) 
		{
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) 
		{
			if (tempMergArr[i] <= tempMergArr[j]) 
			{
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) 
		{
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
}

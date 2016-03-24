
package sort;

public class InsertionSort implements Sort
{

	int[] array;


	public InsertionSort() 
	{
		array=new int[0];
	}

	public InsertionSort(int[] array)
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
		int temp;
		for (int i = 1; i < array.length; i++) 
		{
			for(int j = i ; j > 0 ; j--){
				if(array[j] < array[j-1])
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
}



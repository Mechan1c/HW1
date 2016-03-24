package sort;

public class BubbleSort implements Sort
{

	int[] array;


	public BubbleSort() 
	{
		array=new int[0];
	}

	public BubbleSort(int[] array)
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
		int buffr;
		for(int i=0; i < array.length-1; i++)
		{

			for(int j=1; j < array.length-i; j++)
			{
				if(array[j-1] > array[j])
				{
					buffr=array[j-1];
					array[j-1] = array[j];
					array[j] = buffr;
				}
			}
		}
	}
}

package sort;

public class QuickMy implements Sort
{

	int[] array;


	public QuickMy() 
	{
		array=new int[0];
	}

	public QuickMy(int[] array)
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
		sortA(array);
	}

	public void sortA(int[]arrayA)
	{
		int lind = 0;
		int rind = arrayA.length-1;
		int pivot = (rind-lind)/2;
		int[] left = {};
		int[] right = {};

		for(int i:arrayA)
		{
			if (i<pivot)
			{
				left[lind]=arrayA[i];
				lind++;
			}
			if (i>pivot)
			{
				right[rind] = arrayA[i];
				rind++;
				i++;
			}
		}
		sortA(left);
		sortA(right);
	}
}

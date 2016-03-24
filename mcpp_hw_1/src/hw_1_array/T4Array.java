package hw_1_array;

//Найти индекс максимального элемента массива

public class T4Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {-5,-1,5,-1,5};
		int index = maxIndex(MyArray);
		System.out.println(index);
	}
	public static int maxIndex (int[] MArr)
	{
		int ind=0;
		int max = MArr[ind];
		
		for (int k = 0; k < MArr.length; k++) 
		{
			if (MArr[k] > max) 
			{
				max = MArr[k];
				ind = k;
			}
		}
		return ind;

	}
}
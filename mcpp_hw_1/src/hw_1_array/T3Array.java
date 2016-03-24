package hw_1_array;

//Найти индекс минимального элемента массива

public class T3Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {200,-1000,10,-3,1,-1000,3};
		
		System.out.println(minIndex(MyArray));
	}
	public static int minIndex(int[] MArr)
	{
		
		int ind= 0;
		int min = MArr[ind];
		for (int k = 0; k<=MArr.length-1; k++) 
		{
			if (MArr[k] < min) 
			{
				min =MArr[k];
				ind = k;	
			}
		}
		return ind;

	}
}


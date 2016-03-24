package hw_1_array;

//Посчитать сумму элементов массива с нечетными индексами 

public class T5Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {2,5,10,20,1,0,-3,-27,-101,101};
		int sum = DoArray(MyArray);
		System.out.println(sum);
	}
	public static int DoArray (int[] MArr)
	{

		int summ=0;

		for (int k = 1; k < MArr.length; k+=2) 
		{

			summ+=MArr[k];
		}

		return summ;

	}
}
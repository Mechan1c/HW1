package hw_1_array;
//Посчитать количество нечетных элементов массива

public class T7Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {2,5,10,20,1,0,-3,-27,-102,101};
		int quan = DoArray(MyArray);
		System.out.println(quan);
	}
	public static int DoArray (int[] MArr)
	{
		int q = 0;

		for (int k = 0; k < MArr.length; k++) 
		{
			if (MArr[k]%2!=0) 
			{
				q++;
			}
		}
		return q;

	}
}
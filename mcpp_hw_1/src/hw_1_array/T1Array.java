package hw_1_array;
//Найти минимальный элемент массива
public class T1Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {2,5,10,20,1,0,-3,-27,-102,101};
		int min = findMin(MyArray);
		System.out.println(min);
	}
	public static int findMin (int[] MArr)
	{
		int min = MArr[0];
		for (int k = 0; k < MArr.length; k++) 
		{
			if (MArr[k] < min) 
			{
				min = MArr[k];
			}
		}
		return min;

	}
}


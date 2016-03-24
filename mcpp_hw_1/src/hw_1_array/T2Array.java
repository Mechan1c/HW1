package hw_1_array;
//Найти max элемент массива
public class T2Array 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {2,5,10,20,1,0,-3,-27,-101,101};
		int max = findMax(MyArray);
		System.out.println(max);
	}
	public static int findMax (int[] MArr)
	{
		int max = MArr[0];
		for (int ktr = 0; ktr < MArr.length; ktr++) 
		{
			if (MArr[ktr] > max) 
			{
				max = MArr[ktr];
			}
		}
		return max;

	}
}
package hw_1_array;
//ѕомен€ть местами первую и вторую половину массива, например,

//дл€ массива 1 2 3 4, результат 3 4 1 2

import java.util.Arrays;

public class T8Array
{
	public static void main(String args[])
	{
		int inputArray[] =
		{ 2, 5, 10, 20, 1, 0, -3, -27, -102, 101, 3 };
		int[] mixedArray = replaceArray(inputArray);
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(mixedArray));
	}

	public static int[] replaceArray(int[] origArray)
	{
		int[] mixed = new int[origArray.length];
		int l = 0;
		for (int k = Math.round(origArray.length / 2); k < origArray.length; k++)
		{
			mixed[l] = origArray[k];
			l++;
		}
		for (int k = 0; k < Math.round(origArray.length / 2); k++)
		{
			mixed[l] = origArray[k];
			l++;
		}
		return mixed;

	}
}
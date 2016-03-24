package sort;

import java.util.Arrays;

public class T9ArrSort1 
{
	public static void main (String args[] ) 
	{
		int MyArray [] = {2,5,10,20,1,0,-3,-27,-102,101};


		System.out.println(Arrays.toString(bubbleSort(MyArray)));
		System.out.println(Arrays.toString(selectionSort(MyArray)));
		System.out.println(Arrays.toString(insertionSort(MyArray)));

	}
	public static int[] bubbleSort (int[] origArray)
	{
		int buffr;
		for(int i=0; i < origArray.length-1; i++)
		{

			for(int j=1; j < origArray.length-i; j++)
			{
				if(origArray[j-1] > origArray[j])
				{
					buffr=origArray[j-1];
					origArray[j-1] = origArray[j];
					origArray[j] = buffr;
				}
			}
		}
		return origArray;
	} 
	public static int[] selectionSort(int[] origArray)
	{

		for (int i = 0; i < origArray.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < origArray.length; j++)
				if (origArray[j] < origArray[index])
				{
					index = j;
				}

			int minimum = origArray[index]; 
			origArray[index] = origArray[i];
			origArray[i] = minimum;
		}
		return origArray;
	}
	public static int[] insertionSort(int[] origArray)
	{

		int temp;
		for (int i = 1; i < origArray.length; i++) 
		{
			for(int j = i ; j > 0 ; j--){
				if(origArray[j] < origArray[j-1])
				{
					temp = origArray[j];
					origArray[j] = origArray[j-1];
					origArray[j-1] = temp;
				}
			}
		}
		return origArray;
	}


}
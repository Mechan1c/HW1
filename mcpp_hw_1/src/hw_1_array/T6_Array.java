package hw_1_array;
//Сделать реверс массива (массив в обратном направлении) 
import java.util.Arrays;


public class T6_Array 
{
	public static void main (String args[] ) 
	{
		int inputArray [] = {2,5,10,20,1,0,-3,-27,-102,101};
		int[] reversed = revArray(inputArray);
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(reversed));
	}
	public static int[] revArray (int[] origArray)
	{
		int []reversed=new int[10];

		for (int k = origArray.length-1, i =0; k >=0 ; k--,i++) 
		{
			reversed[i]=origArray[k];
		}
		return reversed;

	}
}
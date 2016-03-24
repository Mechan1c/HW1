package hw_1_array;

public class MergeSort
{

	public static void main(String[] args)
	{
		int [] result = sortMerge(new int[] {3,5,8,4,6,9,-10,0,0,0,4,4});
		for(int i = 0; i <result.length;i++) {
			
		System.out.print(result[i]+" ");
		
		}
	}

	public static int[] sortMerge(int[] input) {
		if (input.length==1) return input;
		
		int a = input.length/2;

		int first[] = new int [a];
		int second[] = new int [input.length-a];
		for(int i=0;i<=input.length-1;i++) {
			if (i<= a-1)
			{
				first[i] = input[i];
			} else
			{
				second[i-a] = input[i];
			}
		}

		int [] sortedFirst = sortMerge(first);
		int [] sortedSecond = sortMerge(second);
		
		int indexFirst = 0;
		int indexSecond = 0;
		int[] result = new int[input.length];
		for(int i=0;i<=result.length-1;i++) {
			
			if(indexFirst<sortedFirst.length&&sortedFirst[indexFirst]<sortedSecond[indexSecond])
			{
				result[i] = sortedFirst[indexFirst];
				indexFirst++;
			} else if (indexSecond<sortedSecond.length)
			{
				result[i] = sortedSecond[indexSecond];
				indexSecond++;
			}
			
		}
		return result;
	}


	
}

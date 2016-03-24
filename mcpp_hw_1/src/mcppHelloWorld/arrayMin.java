package mcppHelloWorld;

public class arrayMin {

	public static void main(String[] args) {
		int[] numbers = {-9, -66, 0, 59,-11};
		
		System.out.println(minInd(numbers));
		int mIndex = minInd(numbers);
	}

	private static int minInd(int[] numbers)
	{
		int min = numbers[0];
		int ind = 0;
		for(int i = 0; i < numbers.length; i++){
			if(min > numbers[i])
			{
				min = numbers[i];
				ind = i;				
			}			
		}
		return ind;
	}
	
}


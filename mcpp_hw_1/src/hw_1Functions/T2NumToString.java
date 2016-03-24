package hw_1Functions;

//¬водим число (0-999), получаем строку с прописью числа.
public class T2NumToString 

{

	public static void main(String[] args) 
	{


		int n= 40;
		String numName = convert(n);
		System.out.println(numName);


	}


	public static String convert(int n) 
	{
		String[] tens = 
			{
					"","","twenty","thirty","forty","fifty",  "sixty","seventy","eighty","ninety"  
			};

		String[] units = 
			{
					"", "one", "two", "three", "four", "five", "six", "seven",
					"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
					"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
			};



		String result = null;	

		if (n == 0) return "zero";
		else if (n < 20) 
		{
			result = units[n];
			return result;
		}

		else if (n < 100) 
		{
			result = tens[n / 10] +((n % 10 != 0) ? " " : "") + units[n % 10];
			return result;
		}

		else if (n>100&&n < 1000) 
		{
			result = units[n / 100] + " hundred"+ ((n % 100 != 0) ? " " : "")+ ((n % 100 != 0) ? convert(n%100) : ""); //
		return result;
		}

		return result;
	}


}
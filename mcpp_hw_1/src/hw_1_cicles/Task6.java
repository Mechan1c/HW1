package hw_1_cicles;
//¬ывести число, которое €вл€етс€ зеркальным отображением последовательности
//цифр заданного числа, например, задано число 123, вывести 321.

public class Task6 
{
	

	public static void main(String[] args) 
	{


		int a = 334426;


		System.out.println("Reverse is " + revrs1(a) ); 
		System.out.println("Reverse is " + revrs2(a) ); 
	}

	public static int revrs1 (Integer x) 
	{
		
		int res = 0;
		String t = x.toString();	 
		StringBuffer str = new StringBuffer(t); 
		str.reverse();            
		t = str.toString();	  
		res = Integer.valueOf(t); 

		return res;

	}

	public static int revrs2 (int n) 
	{
		int reverse = 0;
		while( n != 0 )
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		return reverse;
	}
}
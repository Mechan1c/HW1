package hw_1_cicles;

//Посчитать сумму цифр заданного числа

public class Task5 
{
	static int a;

	public static void main(String[] args) 
	{

		a = 0 ;

		System.out.println("Summ is " + sumNum1(a) ); 
		System.out.println("Summ is " + sumNum2(a) ); 

	}

	public static int sumNum1 (int x) 
	{
		int res = 0;
		for(int n = Math.abs(x); n != 0; n /= 10)
		{ 
			res = res + (n % 10); 
		} 
		return res;
	}

	public static int sumNum2 (int x) 
	{

		int res=0;
		for(; x != 0; x /= 10)
		{ 
			res +=Math.abs(x % 10); 
		} 
		return res;
	}
}

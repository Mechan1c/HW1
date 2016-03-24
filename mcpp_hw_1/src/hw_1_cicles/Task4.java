package hw_1_cicles;
// Вычислить факториал числа n. n! = 1*2*…*n-1*n;!



public class Task4 
{


	public static void main(String[] args) 
	{


		int a = 200;


		System.out.println("Factorial is " + factorial(a) ); 

	}

	public static int factorial (int x) 
	{

		int res=1;
		int minusI=1;
		if (x>0)
		{
		for (int i = 1; i <= x; ++i) 
		{
			if (res<Integer.MAX_VALUE/minusI)
			{
				res *= i;
				minusI=i;
			}
			else throw new IllegalArgumentException();

		}

		return res;
	}
		else throw new IllegalArgumentException();
	}

}

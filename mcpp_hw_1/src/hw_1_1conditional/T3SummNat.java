package hw_1_1conditional;

//Найти суммы только положительных из трех чисел


public class T3SummNat 
{

	

	public static void main(String[] args) 
	{

		int x = -4;
		int y = -4;
		int z = -4;

		System.out.println("result=" + countSumm(x,y,z) ); 

	}

	public static int countSumm (int x, int y, int z) 
	{
		if (x<0)
		{
			x=0;
		}
		if (y<0)
		{
			y=0;
		}
		if (z<0)
		{
			z=0;
		}

		int sum = x+y+z;

		return sum;
	}

}

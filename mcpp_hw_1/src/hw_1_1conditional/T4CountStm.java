package hw_1_1conditional;

//Посчитать выражение макс(а*б*с, а+б+с)+3



public class T4CountStm 
{





	public static void main(String[] args) 
	{

		int x = -1 ;
		int y = -1 ;
		int z = -1 ;

		int result = max(x,y,z);

		System.out.println("result=" +  result); 

	}

	public static int max (int x, int y, int z) 
	{
		int res = 0;

		if ((x*y*z)>(x+y+z))
		{
			res = x*y*z+3;
		} 
		else if ((x*y*z)<(x+y+z))
		{
			res = (x+y+z)+3;
		}
		else throw new IllegalArgumentException();
			return res;
	}

}

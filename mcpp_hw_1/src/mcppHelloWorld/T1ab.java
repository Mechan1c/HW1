package mcppHelloWorld;

public class T1ab 
{

	public static void main(String[] args) 
	{
		int a =5 ;
		int b = 3 ;

		System.out.println(result(a,b));
	}

	public static int result(int x,int y) 
	{
		int res;
		if (x%2==0)
		{
			res = x*y;
		} else
		{
			res = (x+y);
		}
		return res;
	}

}

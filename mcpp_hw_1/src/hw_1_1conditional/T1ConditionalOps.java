package hw_1_1conditional;

//Задание: Если а – четное посчитать а*б, иначе а+б

public class T1ConditionalOps 
{

	public static void main(String[] args) 
	{
	
        int a = 5;
        int b = 3;
        
        System.out.println(count1(a,b) ); 
       
	}
	
	public static int count1 (int x, int y) 
	{
		
		int z = 0;
		if (x%2==0)
		{
			z=x*y;
		} else
		{
			z = x+y;
		}
		return z;
	}
}

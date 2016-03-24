package lesson2;

public class Draw123
{

	public static void main(String[] args)
	{
		System.out.println();
		draw111();
		System.out.println();
		draw777();
		System.out.println();
		draw123();
		System.out.println();
		draw765();
	}
	public static void draw111() 
	{
		int num =1;
		for (int x=0;x<7;x++) 
		{
			for (int y=0;y<7;y++) 
			{
				
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}
	public static void draw777() 
	{
		int num =7;
		for (int x=0;x<7;x++) 
		{
			for (int y=0;y<7;y++) 
			{
				
				System.out.print(num);
			}
			System.out.println();
			num--;
		}
	}
	public static void draw123() 
	{
		
		for (int x=0;x<7;x++) 
		{
			int num =1;
			for (int y=0;y<7;y++) 
			{
				System.out.print(num);
				num++;
			}
			
			System.out.println();
			
		}
	}
	public static void draw765() 
	{
		
		for (int x=0;x<7;x++) 
		{
			int num =7;
			for (int y=0;y<7;y++) 
			{
				System.out.print(num);
				num--;
			}
			
			System.out.println();
			
		}
	}
}

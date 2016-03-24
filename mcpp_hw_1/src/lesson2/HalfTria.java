package lesson2;

public class HalfTria
{

	public static void main(String[] args)
	{
		drawHalfTria1();
		System.out.println();
		drawHalfTria2();
		System.out.println();
		drawHalfTria3(); 
		System.out.println();
		drawHalfTria4(); 

	}
	public static void drawHalfTria1() 
	{
		int a = 0;
		for(int x=0;x<7;x++)
		{

			for(int y= 6-a; y>=0;y--) 
			{
				System.out.print("*");
			}
			a++;
			System.out.println();
		}
	}
	public static void drawHalfTria2() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 0; y<7;y++) 
			{
				if (y>=x)
				{
					
					if (y>=x)
					{
						System.out.print("*");
					}
					
				} else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void drawHalfTria3() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 6; y>=0;y--) 
			{
				if (y<=x)
				{
					System.out.print("*");
				} else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	public static void drawHalfTria4() 
	{
		int a = 7;
		for(int x=0;x<7;x++)
		{
			for(int y=0; y<=7-a;y++)
			{
				System.out.print("*");
			}
			if (x<3)
			{
				a--;
			} else
			{
				a++;
			}
			System.out.println();
		}
	}
}

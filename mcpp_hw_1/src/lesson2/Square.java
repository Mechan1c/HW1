package lesson2;

public class Square
{

	public static void main(String[] args)
	{
		drawSquare();
		System.out.println();
		drawCircuit();
		System.out.println();
		drawTria1();
		System.out.println();
		drawTria2();
		System.out.println();
		drawTria3(); 
		System.out.println();
		drawTria4(); 
	}
	public static void drawSquare() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 0; y<7;y++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void drawCircuit() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 0; y<7;y++) 
			{
				if (y>0&&y<6&&x>0&&x<6)
				{
					System.out.print(" ");
				} else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	public static void drawTria1() 
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
	public static void drawTria2() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 0; y<7;y++) 
			{
				if (y>=x)
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
	public static void drawTria4() 
	{
		int a = 7;
		for(int x=0;x<7;x++)
		{
			for(int y=0; y<=7-a;y++)
			{
				System.out.print("*");
			}
			a--;
			System.out.println();
		}
	}
	public static void drawTria3() 
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
	public static void drawTria11() 
	{
		for(int x=0;x<7;x++)
		{

			for(int y= 0; y<7;y++) 
			{
				if (y>0&&y<6&&x>0&&x<6)
				{
					System.out.print(" ");
				} else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}

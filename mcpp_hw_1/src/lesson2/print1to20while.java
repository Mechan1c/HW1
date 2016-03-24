package lesson2;

public class print1to20while
{

	public static void main(String[] args)
	{
		int i=1;
		while ( i<=20)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();


		int k=-10;
		while  (k<=20)
		{
			System.out.print(k+" ");
			k++;
		}
		System.out.println();


		int l=20;
		while ( l>=-20)
		{
			System.out.print(l+" ");
			l--;
		}
		System.out.println();


		int m=1;
		while (m<=100)
		{
			if (m%7==0)
			{
				System.out.print(m+" ");
				
			}
			m++;
		}
		System.out.println();


		int n=1;
		while (n<=100)
		{
			if (n%3==0&&n%5==0)
			{
				System.out.print(n+" ");
				
			}
			n++;
		}
	}

}

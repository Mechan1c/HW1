package lesson2;

public class print1to20dowhile
{

	public static void main(String[] args)
	{
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}
		while ( i<=20);
		System.out.println();


		int k=-10;
		do
		{
			System.out.print(k+" ");
			k++;
		}
		while (k<=20);
		System.out.println();


		int l=20;

		do
		{
			System.out.print(l+" ");
			l--;
		}
		while ( l>=-20);
		System.out.println();


		int m=1;
		do
		{
			if (m%7==0)
			{
				System.out.print(m+" ");

			}
			m++;
		}
		while (m<=100);
		System.out.println();


		int n=1;
		do

		{
			if (n%3==0&&n%5==0)
			{
				System.out.print(n+" ");

			}
			n++;
		}
		while (n<=100);
	}
}

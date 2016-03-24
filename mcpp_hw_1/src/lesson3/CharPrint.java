package lesson3;

public class CharPrint
{

	public static void main(String[] args)
	{
		printAtoZ();
		printZtoA();
		printCyrillic();
		print0to9();
		printASCII();

	}
	public static void printAtoZ()
	{

		for (char ch = 'A'; ch <= 'Z' ; ch++)
		{
			System.out.print(ch+ " ");
		}
		System.out.println();

	}
	public static void printZtoA()
	{
		for (char ch = 'z'; ch >= 'a' ; ch--)
		{
			System.out.print(ch+ " ");
		}
		System.out.println();
	}
	public static void printCyrillic()
	{
		for (char ch = 'à'; ch <= 'ÿ' ; ch++)
		{
			System.out.print(ch+ " ");
		}
		System.out.println();

	}
	public static void print0to9()
	{
		for (char ch = '0'; ch <= '9' ; ch++)
		{
			System.out.print(ch+ " ");
		}
		System.out.println();
	}
	public static void printASCII()
	{
		for (char i =32;i<=127;i++)
		{
			System.out.print(i+" ");
		}
	}

}

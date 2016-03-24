package hw_1_cicles;

//Найти сумму четных чисел и их количество в диапазоне от 1 до 99



public class Task1 
{


	public static void main(String[] args) 
	{
		
		System.out.println(findSum ());
		System.out.println(findQuantity());
	}

	public static int findSum () 
	{
		int summ = 0;
		for (int i=1;i<100;i++) 
		{
			if (i%2==0) 
			{
				summ+=i;
			}
		}
		return summ;
	}
	public static int findQuantity () 
	{
		int quantity=0;
		for (int i=1;i<100;i++) 
		{
			if (i%2==0) 
			{
				quantity++;
			}
		}
		return quantity;
	}
}

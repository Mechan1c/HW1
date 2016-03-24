package lesson2;

public class calc
{
	public static void main(String[] args)
	{
		int a = 65;
		int b = 2;
		char op = '+';
				 System.out.println("result = "+ calcl(a,b,op));
	}

	public static int calcl(int a, int b, char op)
	{
		int ret = 0;
		if (op == '+')
		{
			ret = a + b;

		}

		else if (op == '-')
		{
			ret = a - b;

		}

		else if (op == '*')
		{
			ret = a * b;
		}
		else if (op == '/')
		{
			ret = a / b;
		} else
			throw new IllegalArgumentException("illegal arg");
 
		return ret;
		
	}
}

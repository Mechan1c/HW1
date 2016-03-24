package lesson4;

public class ÍW5_2_CharsNStrings
{

	public static void main(String[] args)
	{

		System.out.println(intToString(-500)+", otaka huynia");
		//System.out.println(stringToInt("987654321"));

	}
	public static String intToString(int x)
	{
		
		int z = 0;
		if (x<0)
		{
			z= x*(-1);
			System.out.println(z);
		}

		return posIntToString(z);
		
	}
	public static String posIntToString (long x)
	{
		String newString = "";
		if (x == 0) return "0";
		while (x!=0)
		{
			char y = (char)('0'+ x%10);
			//char z =(char)(x%10);
			x /= 10;
			newString=y+newString;
			return newString;
		}

		while (x!=0)
		{
			char y = (char)('0'+ x%10);
			//char z =(char)(x%10);
			x /= 10;
			newString=y+newString;
		}		
		return newString;
	}
	public static int stringToInt(String inputStr)
	{
		int newInt = 0;
		int counter = 0;
		char[] chars = inputStr.toCharArray();
		for(char i:chars)
		{
			newInt+= Character.getNumericValue(i)*Math.pow(10,chars.length-1-counter) ;
			counter++;
		}

		return newInt;
	}
	public static String doubleToString(double x)
	{
		String newString = "";
		while (x>=1)
		{
			char y = (char)('0'+ x%10);
			//char z =(char)(x%10);
			x /= 10;
			newString=y+newString;
		}
		return newString;
	}
}
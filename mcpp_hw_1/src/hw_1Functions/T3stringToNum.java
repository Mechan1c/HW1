package hw_1Functions;

//¬водим строку, котора€ содержит число, написанное прописью (0-999). ѕолучить само число

public class T3stringToNum 
{

	public static void main(String[] args) 
	{
		String InputString = "one hundred six";
		
		int x = convertString(InputString);
		
		System.out.println(x);
	}

	public static int convertString (String InputStr) 
	{
		int result=0;
		String [] textNums=new String [1000];
		for (int a=1;a<1000;a++) 
		{
			 textNums[a] = T2NumToString.convert(a);
		}
		
		for (int a=1;a<1000;a++) 
		{
			
			if ( InputStr.equals(textNums[a])) 
			{
				result = a;
			}
			
		}
		return result;
	}
	
}

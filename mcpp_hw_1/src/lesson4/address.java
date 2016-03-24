package lesson4;
//
public class address
{

	public static void main(String[] args)
	{
		String str= "c:/home/users/data/tmp/x.txt";

		System.out.println(fext(str));
		System.out.println(nameExt(str));
		System.out.println(retAddress(str));
		System.out.println(numInto(str));
	}

	public static String fext (String str)
	{
		String ret = "";
		int pos = str.lastIndexOf(".");
		if (pos!=-1) 
		{
			ret = str.substring(pos);

		}
		return ret;
	}
	
	public static String nameExt (String str) 
	{
		String ret = "";
		int posslash = str.lastIndexOf("/");
		ret = str.substring(posslash+1);
		return ret;
	}
	
	public static String retAddress (String str) 
	{
		String ret = "";
		int posslash = str.lastIndexOf("/");
		ret = str.substring(0, posslash+1);
		return ret;
	}
	
	public static int numInto (String str) 
	{
		int ret = 0;
		String[] arr = str.split("/");
		ret=arr.length-1;
		return ret;
	}
}


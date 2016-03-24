package lesson4;

import java.util.Arrays;

public class hw5_3
{

	public static void main(String[] args)
	{
		String inp = "I was born to, fly, what for were you, guy?";
		String[] wordz = {"I", "was", "there", "giraffe", "mother", "replace", "123456","qwerty"};

		System.out.println(retLengthOfShortest(inp));

		System.out.println(Arrays.asList(replaceBy$(wordz, 7)));

		String withSpaces = addSpaces(inp);
		System.out.println(withSpaces);
		System.out.println(removeDuplicates(inp));
		System.out.println(countWords(inp));
		System.out.println(cutString(inp,5,7));
		String rev = reverseString(inp);
		String st = delLastWord(inp);
		System.out.println(rev);
		
	}

	
	private static String reverseString(String inp)
	{
		  StringBuilder input1 = new StringBuilder();
		  input1.append(inp);
		  String output=input1.reverse().toString(); 
		  
		return output;
	}



	private static String delLastWord(String inp)
	{
		
//String otup = inp.split(inp);
		
return null;
	}

	public static String cutString(String inp, int pos, int leng)
	{
		if (inp.length()>pos) 
		{
			//String toDel = inp.substring(pos, pos+leng);
			//String res = inp.replaceFirst(toDel, "");

			String res = inp.substring(0, pos)+inp.substring(pos+leng);
			return res;
		}
		else throw new IllegalArgumentException("Position out of string length");
	}

	public static int countWords(String inp)
	{
		if (inp == "") throw new IllegalArgumentException("Emply string");
		String[] words = inp.split("\\s+");
		return words.length;
	}

	public static String removeDuplicates(String input){
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if(!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			}
		}
		return result;
	}

	public static String addSpaces(String inp)
	{

		String output = inp.replaceAll("[,.!?;:]", "$0 ").replaceAll("\\s+", " ");
		return output;
	}



	public static String[] replaceBy$(String[] wordz, int len)
	{
		String [] resArr = new String[wordz.length];
		for(int x = 0;x<wordz.length;x++)
		{
			if (len<3) throw new IllegalArgumentException();
			if (wordz[x].length() == len)
			{
				resArr[x]=wordz[x].substring(0, wordz[x].length()-3) +  "$$$";
			} else
			{
				resArr[x]=wordz[x];
			}
		}
		return resArr;
	}



	public static int retLengthOfShortest(String inp)
	{

		String[] words = inp.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}
		int [] lgth = new int[words.length];
		for(int i= 0; i<words.length;i++)
		{
			lgth[i]= words[i].length();
		}
		Arrays.sort(lgth);
		return lgth[0];
	}


}

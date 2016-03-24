package hw_1_cicles;

//Проверить простое ли число? 
//(число называется простым, если оно делится только само на себя и на 1)


public class Task2 
{
	
	
	
	public static void main(String[] args) 
	{
		int a=0;
        
        System.out.println(checkPrime(a)); 
       
	}
	
	public static String checkPrime (int x) 
	{
		
		String res = null;
		if (x==0)
		{
			res="Zero it neither";
			return res;
		}
		if (x==1||x==-1)
		{
			res="Prime";
			return res;
		}
		for (int i=2;i<Math.abs(x);i++) 
		{
		
		if (x % i == 0 ) 
		{
			res = "Compound";
			break;
		} else
		{
			res = "Prime";
			
		}
		}
		 	
		return res;
	}
}
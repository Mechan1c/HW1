package hw_1_cicles;
//Найти корень натурального числа с точностью до целого 
//(рассмотреть вариант последовательного подбора и метод 
//		бинарного поиска)

public class Task3 
{



	public static void main(String[] args) 
	{

		int a = 196;

		System.out.println(selectSqr(a));

		System.out.println(binarySqr(a));
		
		System.out.println(binarySqr2(a));
	}

	public static int selectSqr (int x) 
	{
		int sq = 0;
		for (float i = 0;i<=x;i+=0.01) 
		{
			int pw=(int)(i*i);
			if ( (pw) ==x)	
			{
				sq =(int)(i);
				break;
			}
		}
		return sq;
	}

	public static int binarySqr(int x) 
	{
		int max = x;
		int min = 0;
		int res=0;
		//do while what??? 
		for (;res*res!=x;)
		{
			if (max-min<=1)
				return min;
			else {
				res = (min+max)/2;

				if(res*res>x) 
				{
					max = res;
				} else
				{
					min = res;
				}
			}

		}
		return res;
	}
	
public static int binarySqr2(int x) {
	return internal(x,0,x);
}
public static int internal(int max, int min, int x) {
		int res = (min+max)/2;

		int a;
		if (max-min<=1) return min;
		if(res*res>x) 
		{
			a = internal(res,min,x);
			
		} else
		{
			a = internal(max,res,x);
		}
		return a;
}
}


/*	*/
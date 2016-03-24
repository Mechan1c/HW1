package hw_1Functions;

//Найти расстояние между двумя точками в двумерном декартовом пространстве.

public class T4Distance
{

	public static void main(String[] args)
	{
		int x1 = 1;
		int y1 = 1;
		int x2 =5 ;
		int y2 = 4;
		
		double distance = measure(x1,y1,x2,y2);
		System.out.println(distance);
		
	}

	public static double measure(int x1,int y1,int x2, int y2)
	{
		double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return dist;
	}
}
;
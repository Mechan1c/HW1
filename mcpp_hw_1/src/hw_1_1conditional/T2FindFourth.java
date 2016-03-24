package hw_1_1conditional;

//«адание: ќпределить какой четверти принадлежит точка с координатами (х,у)

public class T2FindFourth 
{


	public static void main(String[] args) 
	{
		int x=6;
		int y=-3;




		System.out.println("result=" + count1(x,y) ); 

	}

	public static String count1 (int x, int y) 
	{

		String str = null;
		if (x>0&&y>0)
		{
			str = "1";
		} 
		else if (x<0&&y>0)
		{
			str = "2";
		} 
		else if (x<0&&y<0)
		{
			str = "3";
		} 
		else if (x>0&&y<0)
		{
			str = "4";
		} 
		else if (x==0||y==0)
			throw new IllegalArgumentException();
		return str;
	}
}





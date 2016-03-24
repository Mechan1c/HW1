package hw_1Functions;

//Получить строковое название дня недели по номеру дня

public class T1DayOfWeek 
{
	public static void main (String args[] ) 
	{
		int DayNumber = 4;
		String nameOfDay = toName(DayNumber);
		System.out.println(nameOfDay);


	}


	public static String toName (int DayNum) 
	{
		String dayName = null;
		switch(DayNum) 
		{

		case  1: 
			dayName ="Sunday";
			 break;
		case  2: 
			dayName ="Monday";
			 break;
		case  3: 
			dayName ="Tuesday";
			 break;
		case  4: 
			dayName ="Thursday";
			 break;
		case  5: 
			dayName ="Friday";
			 break;
		case  6: 
			dayName ="Saturday";
			break;
		case  7:
			dayName ="Sunday";
			break;
		default:
			dayName ="Wrongday";
			
		}
		return dayName;

	}
}

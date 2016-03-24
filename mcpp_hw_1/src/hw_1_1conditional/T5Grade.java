package hw_1_1conditional;

public class T5Grade 
{

	public static void main(String[] args) 
	{
		int score = 3;
		System.out.println(findGrade(score));
	}
	public static char findGrade(int score) 
	{
		char grade;
		if (score>=0&&score<20)
		{
			grade = 'F';
		} else if (score>=20&&score<=39)
		{
			grade = 'E';
		} else if (score>=40&&score<=59)
		{
			grade = 'D';
		} else if (score>=60&&score<=74)
		{
			grade = 'C';
		} else if (score>=75&&score<=89)
		{
			grade = 'B';
		} else if (score>=90&&score<=100)
		{
			grade = 'A';
		} else throw new IllegalArgumentException();
		

		
			return grade;
		
	}
	
}




package lesson3;

import java.util.Random;

public class Randoms
{

	public static void main(String[] args)
	{
		get10Randoms();
		get10Randoms0to10();
		get10Randoms20to50();
		get10RandomsM10to10();
		getRandomOfRandoms();
	}

	public static int getRandom(int leftMargin, int rightMargin)
	{


		if (leftMargin == rightMargin) throw new NullPointerException("Enter range > 0");

		if (rightMargin < leftMargin) 
		{
			int buffer=0;
			buffer = leftMargin;
			leftMargin = rightMargin;
			rightMargin = buffer;
		} 
		Random random = new Random();

		int rnd = random.nextInt((rightMargin - leftMargin) + 1) + leftMargin;
		return rnd;
	}
	
	public static int getRandom(int rightMargin)
	{
		int leftMargin = 0;

		if (leftMargin == rightMargin) throw new NullPointerException("Enter range > 0");

		if (rightMargin < leftMargin) 
		{
			int buffer=0;
			buffer = leftMargin;
			leftMargin = rightMargin;
			rightMargin = buffer;
		} 
		Random random = new Random();

		int rnd = random.nextInt((rightMargin - leftMargin) + 1) + leftMargin;
		return rnd;
	}
	public static int getRandom()
	{
		Random random = new Random();

		return random.nextInt();
	}
	public static void get10Randoms()
	{
		for (int i = 0; i<10; i++)
		{
			System.out.print(getRandom()+" ");
		}
		System.out.println();
	}
	public static void get10Randoms0to10()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.print(getRandom(10)+" ");
		}
		System.out.println();
	}
	public static void get10Randoms20to50()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.print(getRandom(20,50)+" ");
		}
		System.out.println();
	}
public static void get10RandomsM10to10()
{
	for (int i = 0; i < 10; i++)
	{
		System.out.print(getRandom(-10,10)+" ");
	}
	System.out.println();
}
public static void getRandomOfRandoms()
{
	for (int i = 0; i < getRandom(3,15); i++)
	{
		System.out.print(getRandom(-10,35)+" ");
	}
	System.out.println();
}
}

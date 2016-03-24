package lesson3;

public class DistanceConverter
{

	public static void main(String[] args)
	{
		System.out.println(fromMile(1));
		System.out.println(toMile(1));

		System.out.println(fromFoot(1));
		System.out.println(toFoot(1));

		System.out.println(toVersta(1));
		System.out.println(fromVersta(1));

		System.out.println(fromPlethron(1));
		System.out.println(toPlethron(1));

		System.out.println(toInch(1));
		System.out.println(fromInch(1));
	}
	public static double fromMile(double input)
	{

		double inputRate = 1609.344; //conversion from ground mile to meters
		return input*inputRate;
	}

	public static double toMile(double input)
	{
		return 1/(fromMile(1/input));
	}
	public static double fromFoot(double input)
	{
		double inputRate = 0.3048;
		return input*inputRate;
	}
	public static double toFoot(double input)
	{
		return 1/(fromFoot(1/input));
	}
	public static double fromVersta(double input)
	{
		double inputRate = 1066.8;
		return input*inputRate;
	}
	public static double toVersta(double input)
	{
		return 1/(fromVersta(1/input));
	}
	public static double fromPlethron(double input)
	{
		double inputRate = 31;
		return input*inputRate;
	}
	public static double toPlethron(double input)
	{
		return 1/(fromPlethron(1/input));
	}
	public static double fromInch(double input)
	{
		double inputRate = 0.0254;
		return input*inputRate;
	}
	public static double toInch(double input)
	{
		return 1/(fromInch(1/input));
	}
}

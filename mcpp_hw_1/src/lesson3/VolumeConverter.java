package lesson3;

public class VolumeConverter
{

	public static void main(String[] args)
	{

	}
	public static double fromGallon(double input)
	{
		double convRate = 3.7854118; // american gallon to litre
		return input*convRate;
	}
	public static double toGallon(double input)
	{
		return 1/(fromGallon(1/input));
	}
	public static double fromBarrel(double input)
	{
		double convRate = 117.347765;
		return input*convRate;
	}
	public static double toBarrel(double input)
	{
		return 1/(fromBarrel(1/input));
	}
	public static double fromPint(double input)
	{
		double convRate = 0.473176473; // from american pint to litre
		return input*convRate;
	}
	public static double toPint(double input)
	{
		return 1/(fromPint(1/input));
	}
	public static double fromVedro(double input)
	{
		double convRate = 12;
		return input*convRate;
	}
	public static double toVedro(double input)
	{
		return 1/(fromVedro(1/input));
	}
	public static double fromShkalik(double input)
	{
		double convRate = 0.0615006062;
		return input*convRate;
	}
	public static double toShkalik(double input)
	{
		return 1/(fromShkalik(1/input));
	}

}

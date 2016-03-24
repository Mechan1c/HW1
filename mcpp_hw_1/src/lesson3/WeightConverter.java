package lesson3;

public class WeightConverter
{
	public static void main(String[] args)
	{

	}

	public static double fromFunt(double input)
	{
		double convRate = 453.59237;
		return input*convRate;
	}
	public static double toFunt(double input)
	{
		return 1/(fromFunt(1/input));
	}
	public static double fromOz(double input)
	{
		double convRate = 28.3495231;
		return input*convRate;
	}
	public static double toOz(double input)
	{
		return 1/(fromOz(1/input));
	}
	public static double fromKarat(double input)
	{
		double convRate = 0.2;
		return input*convRate;
	}
	public static double toKarat(double input)
	{
		return 1/(fromOz(1/input));
	}
	public static double fromPud(double input)
	{
		double convRate = 16380.4815;
		return input*convRate;
	}
	public static double toPud(double input)
	{
		return 1/(fromOz(1/input));
	}
	public static double fromTalant(double input)
	{
		double convRate = 34020;
		return input*convRate;
	}
	public static double toTalant(double input)
	{
		return 1/(fromOz(1/input));
	}
}

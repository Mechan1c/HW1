package lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeightConverterTest
{

	@Test
	public void testFromFunt0()
	{
		assertEquals(0, WeightConverter.fromFunt(0),0.001); // TODO
	}
	
	@Test
	public void testFromFunt1()
	{
		assertEquals(453.59237, WeightConverter.fromFunt(1),0.001); // TODO
	}
	
	@Test
	public void testFromFuntM1()
	{
		assertEquals(-453.59237, WeightConverter.fromFunt(-1),0.001); // TODO
	}
	@Test
	public void testFromFunt99()
	{
		assertEquals(44905.6446, WeightConverter.fromFunt(99),0.001); // TODO
	}
	@Test
	public void testFromFunt9999()
	{
		assertEquals(45354.7011, WeightConverter.fromFunt(99.99),0.001); // TODO
	}

	@Test
	public void testToFunt0()
	{
		assertEquals(0, WeightConverter.toFunt(0),0.001); // TODO
	}
	
	@Test
	public void testToFunt1()
	{
		assertEquals(0.00220462262, WeightConverter.toFunt(1),0.001); // TODO
	}
	
	@Test
	public void testToFuntM1()
	{
		assertEquals(-0.00220462262, WeightConverter.toFunt(-1),0.001); // TODO
	}
	@Test
	public void testToFunt99()
	{
		assertEquals(0.21825764, WeightConverter.toFunt(99),0.001); // TODO
	}
	@Test
	public void testToFunt9999()
	{
		assertEquals(0.220440216, WeightConverter.toFunt(99.99),0.001); // TODO
	}

	@Test
	public void testFromOz()
	{
		assertEquals(0, WeightConverter.fromOz(0),0.001); // TODO
	}

	@Test
	public void testToOz()
	{
		assertEquals(0, WeightConverter.toOz(0),0.001); // TODO
	}

	@Test
	public void testFromKarat()
	{
		assertEquals(0, WeightConverter.fromKarat(0),0.001); // TODO
	}

	@Test
	public void testToKarat()
	{
		assertEquals(0, WeightConverter.toKarat(0),0.001); // TODO
	}

	@Test
	public void testFromPud()
	{
		assertEquals(0, WeightConverter.fromPud(0),0.001); // TODO
	}

	@Test
	public void testToPud()
	{
		assertEquals(0, WeightConverter.toPud(0),0.001); // TODO
	}

	@Test
	public void testFromTalant()
	{
		assertEquals(0, WeightConverter.fromTalant(0),0.001); // TODO
	}

	@Test
	public void testToTalant()
	{
		assertEquals(0, WeightConverter.toTalant(0),0.001); // TODO
	}

}

package lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistanceConverterTest
{

	@Test
	public void testFromMile0()
	{
		assertEquals(0, DistanceConverter.fromMile(0),0.001); // TODO
	}

	@Test
	public void testFromMile1()
	{
		assertEquals(1609.344, DistanceConverter.fromMile(1),0.001); // TODO
	}

	@Test
	public void testFromMileM1()
	{
		assertEquals(-1609.344, DistanceConverter.fromMile(-1),0.001); // TODO
	}
	@Test
	public void testFromMile99()
	{
		assertEquals(159325.056, DistanceConverter.fromMile(99),0.001); // TODO
	}
	@Test
	public void testFromMile9999()
	{
		assertEquals(160918.307, DistanceConverter.fromMile(99.99),0.001); // TODO
	}

	@Test
	public void testToMile0()
	{
		assertEquals(0, DistanceConverter.toMile(0),0.001); // TODO
	}

	@Test
	public void testToMile1()
	{
		assertEquals(0.000621371192, DistanceConverter.toMile(1),0.001); // TODO
	}

	@Test
	public void testToMileM1()
	{
		assertEquals(-0.000621371192, DistanceConverter.toMile(-1),0.001); // TODO
	}
	@Test
	public void testToMile99()
	{
		assertEquals(0.061515748, DistanceConverter.toMile(99),0.001); // TODO
	}
	@Test
	public void testToMile9999()
	{
		assertEquals(0.0621309055, DistanceConverter.toMile(99.99),0.001); // TODO
	}

	@Test
	public void testFromFoot()
	{
		assertEquals(0, DistanceConverter.fromFoot(0), 0.001);
	}
	@Test
	public void testFromFoot1()
	{
		assertEquals(0.3048, DistanceConverter.fromFoot(1), 0.001);
	}

	@Test
	public void testToFoot1()
	{
		assertEquals(3.2808399, DistanceConverter.toFoot(1), 0.001);
	}

	@Test
	public void testFromVersta()
	{
		assertEquals(0, DistanceConverter.fromVersta(0), 0.001);
	}
	@Test
	public void testFromVersta1()
	{
		assertEquals(1066.8, DistanceConverter.fromVersta(1), 0.001);
	}
	@Test
	public void testToVersta()
	{
		assertEquals(0, DistanceConverter.toVersta(0), 0.001);
	}
	@Test
	public void testToVersta1()
	{
		assertEquals(0.00093738282, DistanceConverter.toVersta(1), 0.001);
	}



	@Test
	public void testFromPlethron()
	{
		assertEquals(0, DistanceConverter.fromPlethron(0), 0.001);
	}
	@Test
	public void testFromPlethron1()
	{
		assertEquals(31, DistanceConverter.fromPlethron(1), 0.001);
	}
	@Test
	public void testToPlethron()
	{
		assertEquals(0, DistanceConverter.toPlethron(0), 0.001);
	}
	@Test
	public void testToPlethron1()
	{
		assertEquals(0.03225806451612903, DistanceConverter.toPlethron(1), 0.001);
	}
	@Test
	public void testFromInch()
	{
		assertEquals(0, DistanceConverter.fromInch(0), 0.001);
	}
	@Test
	public void testFromInch1()
	{
		assertEquals(0.0254, DistanceConverter.fromInch(1), 0.001);
	}
	@Test
	public void testToInch1()
	{
		assertEquals(39.3700787, DistanceConverter.toInch(1), 0.001);
	}

}

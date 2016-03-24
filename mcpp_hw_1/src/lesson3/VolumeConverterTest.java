package lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VolumeConverterTest
{

	@Test
	public void testFromGallon0()
	{
		assertEquals(0, VolumeConverter.fromGallon(0),0.001); // TODO
	}

	@Test
	public void testFromGallon1()
	{
		assertEquals(3.78541178, VolumeConverter.fromGallon(1),0.001); // TODO
	}

	@Test
	public void testFromGallonM1()
	{
		assertEquals(-3.78541178, VolumeConverter.fromGallon(-1),0.001); // TODO
	}
	@Test
	public void testFromGallon99()
	{
		assertEquals(374.755767, VolumeConverter.fromGallon(99),0.001); // TODO
	}
	@Test
	public void testFromGallon9999()
	{
		assertEquals(378.503324, VolumeConverter.fromGallon(99.99),0.001); // TODO
	}

	@Test
	public void testToGallon0()
	{
		assertEquals(0, VolumeConverter.toGallon(0),0.001); // TODO
	}

	@Test
	public void testToGallon1()
	{
		assertEquals(0.264172052, VolumeConverter.toGallon(1),0.001); // TODO
	}

	@Test
	public void testToGallonM1()
	{
		assertEquals(-0.264172052, VolumeConverter.toGallon(-1),0.001); // TODO
	}
	@Test
	public void testToGallon99()
	{
		assertEquals(26.1530332, VolumeConverter.toGallon(99),0.001); // TODO
	}
	@Test
	public void testToGallon9999()
	{
		assertEquals(26.4145635, VolumeConverter.toGallon(99.99),0.001); // TODO
	}


	@Test
	public void testFromBarrel()
	{
		assertEquals(0, VolumeConverter.fromBarrel(0),0.001);	
	}

	@Test
	public void testToBarrel()
	{
		assertEquals(0, VolumeConverter.toBarrel(0),0.001);	
	}

	@Test
	public void testFromPint()
	{
		assertEquals(0, VolumeConverter.fromPint(0),0.001);
	}

	@Test
	public void testToPint()
	{
		assertEquals(0, VolumeConverter.toPint(0),0.001);
	}

	@Test
	public void testFromVedro()
	{
		assertEquals(0, VolumeConverter.fromVedro(0),0.001);
	}

	@Test
	public void testToVedro()
	{
		assertEquals(0, VolumeConverter.toVedro(0),0.001);
	}

	@Test
	public void testFromShkalik()
	{
		assertEquals(0, VolumeConverter.fromShkalik(0),0.001);

	}

	@Test
	public void testToShkalik()
	{
		assertEquals(0, VolumeConverter.toShkalik(0),0.001);

	}

}

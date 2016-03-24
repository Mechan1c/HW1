package lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest
{

	@Test
	public void testCalc_PlusMin()
	{
		int res = calc.calcl(-5, -5, '+');
		assertEquals(-10, res);
	}

	@Test
	public void testCalc_PlusNat()
	{
		int res = calc.calcl(5, 5, '+');
		assertEquals(10, res);
	}

	@Test
	public void testCalc_PlusZer()
	{
		int res = calc.calcl(0, 0, '+');
		assertEquals(0, res);
	}

	@Test
	public void testCalc_MinusMin()
	{
		int res = calc.calcl(-5, -5, '-');
		assertEquals(0, res);
	}

	@Test
	public void testCalc_MinusNat()
	{
		int res = calc.calcl(5, 5, '-');
		assertEquals(0, res);
	}

	@Test
	public void testCalc_MinusZer()
	{
		int res = calc.calcl(0, 0, '-');
		assertEquals(0, res);
	}

	@Test
	public void testCalc_Mult()
	{
		int res = calc.calcl(0, 5, '*');
		assertEquals(0, res);
	}

	@Test
	public void testCalc_Div()
	{
		int res = calc.calcl(6, 2, '/');
		assertEquals(3, res);
	}

	@Test (expected = IllegalArgumentException.class) 
	public void testCalc_Exc()
	{
		calc.calcl(6, 2, '%');
	}
	
}

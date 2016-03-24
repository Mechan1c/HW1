package testNG;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import hw_1Functions.T1DayOfWeek;
import hw_1Functions.T2NumToString;
import hw_1Functions.T3stringToNum;
import hw_1Functions.T4Distance;

public class FunctionsTest
{

	@Test
	public void testToName()
	{
		assertEquals("Monday", T1DayOfWeek.toName(2));
	}
	@Test
	public void testToName2()
	{
		assertEquals("Wrongday", T1DayOfWeek.toName(122));
	}
	@Test
	public void testConvertNS0()
	{
		assertEquals("zero", T2NumToString.convert(0));
	}
	
	@Test
	public void testConvertNS4()
	{
		assertEquals("four", T2NumToString.convert(4));
	}
	@Test
	public void testConvertNS10()
	{
		assertEquals("ten", T2NumToString.convert(10));
	}

	@Test
	public void testConvertNS40()
	{
		assertEquals("forty", T2NumToString.convert(40));
	}
	@Test
	public void testConvertNS47()
	{
		assertEquals("forty seven", T2NumToString.convert(47));
	}
	@Test
	public void testConvertNS400()
	{
		assertEquals("four hundred", T2NumToString.convert(400));
	}
	@Test
	public void testConvertNS405()
	{
		assertEquals("four hundred five", T2NumToString.convert(405));
	}
	@Test
	public void testConvertNS450()
	{
		assertEquals("four hundred fifty", T2NumToString.convert(450));
	}
	@Test
	public void testConvertNS459()
	{
		assertEquals("four hundred fifty nine", T2NumToString.convert(459));
	}
	
	@Test
	public void testConvertNS721()
	{
		assertEquals("seven hundred twenty one", T2NumToString.convert(721));
	}
	@Test
	public void testConvertNS999()
	{
		assertEquals("nine hundred ninety nine", T2NumToString.convert(999));
	}

	@Test
	public void testConvertSN0()
	{
		assertEquals(0, T3stringToNum.convertString("zero"));
	}
	
	@Test
	public void testConvertSN4()
	{
		assertEquals(4, T3stringToNum.convertString("four"));
	}

	@Test
	public void testConvertSN40()
	{
		assertEquals(40, T3stringToNum.convertString("forty"));
	}
	@Test
	public void testConvertSN47()
	{
		assertEquals(47, T3stringToNum.convertString("forty seven"));
	}
	@Test
	public void testConvertSN400()
	{
		assertEquals(400, T3stringToNum.convertString("four hundred"));
	}
	@Test
	public void testConvertSN450()
	{
		assertEquals(450, T3stringToNum.convertString("four hundred fifty"));
	}
	@Test
	public void testConvertSN459()
	{
		assertEquals(459, T3stringToNum.convertString("four hundred fifty nine"));
	}
	@Test
	public void testMeasure()
	{
		double dist = T4Distance.measure(0, 1, 0, 5);
		assertEquals(4, dist, 0.1);
	}
	@Test
	public void testMeasure1()
	{
		double dist = T4Distance.measure(1, 1, 4, 5);
		assertEquals(5, dist, 0.1);
	}
	@Test
	public void testMeasure1m()
	{
		double dist = T4Distance.measure(-1, -1, -4, -5);
		assertEquals(5, dist, 0.1);
	}
	@Test
	public void testMeasure0()
	{
		double dist = T4Distance.measure(1, 1, 1, 1);
		assertEquals(0, dist, 0.1);
	}
}

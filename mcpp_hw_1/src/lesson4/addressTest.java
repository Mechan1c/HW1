package lesson4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class addressTest
{

	@Test
	public void testFext1()
	{
		assertEquals(".txt", address.fext("c:/home/users/data/tmp/xpress.txt"));
	}
	@Test
	public void testFext2()
	{
		assertEquals(".txt", address.fext("c:/x.txt"));
	}@Test
	public void testFext3()
	{
		assertEquals(".txt", address.fext("x.txt"));
	}

	@Test 
	public void testFext4() 
	{
		assertEquals("", address.fext("c:/xterminatus"));
	}
	@Test
	public void testNameExt1()
	{
		assertEquals("xpress.txt", address.nameExt("c:/home/users/data/tmp/xpress.txt"));
	}
	@Test
	public void testNameExt2()
	{
		assertEquals("xpress.txt", address.nameExt("c:/xpress.txt"));
	}
	@Test
	public void testNameExt3()
	{
		assertEquals("xpress.txt", address.nameExt("xpress.txt"));
	}
	@Test
	public void testNameExt4()
	{
		assertEquals("xpress", address.nameExt("c:/xpress"));
	}

	@Test
	public void testRetAddress1()
	{
		assertEquals("c:/home/users/data/tmp/", address.retAddress("c:/home/users/data/tmp/xpress.txt"));
	}
	@Test
	public void testRetAddress2()
	{
		assertEquals("c:/", address.retAddress("c:/xpress.txt"));
	}
	@Test
	public void testRetAddress3()
	{
		assertEquals("", address.retAddress("xpress.txt"));
	}
	@Test
	public void testRetAddress4()
	{
		assertEquals("c:/home/users/data/tmp/", address.retAddress("c:/home/users/data/tmp/xpress"));
	}

	@Test
	public void testNumInto1()
	{
		assertEquals(5, address.numInto("c:/home/users/data/tmp/xpress.txt"));
	}
	@Test
	public void testNumInto2()
	{
		assertEquals(1, address.numInto("c:/xpress.txt"));
	}
	@Test
	public void testNumInto3()
	{
		assertEquals(0, address.numInto("xpress.txt"));
	}
	@Test
	public void testNumInto4()
	{
		assertEquals(1, address.numInto("c:/xpress.txt"));
	}
}

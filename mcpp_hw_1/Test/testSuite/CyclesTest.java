package testSuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hw_1_cicles.Task1;
import hw_1_cicles.Task2;
import hw_1_cicles.Task3;
import hw_1_cicles.Task4;
import hw_1_cicles.Task5;
import hw_1_cicles.Task6;

public class CyclesTest
{

	@Test
	public void testFindSum()
	{
		assertEquals(2450, Task1.findSum());
	}

	@Test
	public void testFindQuantity()
	{
		assertEquals(49, Task1.findQuantity());
	}

	@Test
	public void testCheckPrimeC()
	{
		int z = 12;
		assertEquals("Compound", Task2.checkPrime(z));
	}
	@Test
	public void testCheckPrimeCM()
	{
		int z = -12;
		assertEquals("Compound", Task2.checkPrime(z));
	}
	@Test
	public void testCheckPrimeZ()
	{
		int z = 0;
		assertEquals("Zero it neither", Task2.checkPrime(z));
	}
	@Test
	public void testCheckPrimeP()
	{
		int z = 5;
		assertEquals("Prime", Task2.checkPrime(z));
	}
	@Test
	public void testCheckPrimePM()
	{
		int z = -3;
		assertEquals("Prime", Task2.checkPrime(z));
	}
	@Test
	public void testCheckPrimeP1()
	{
		int z = 1;
		assertEquals("Prime", Task2.checkPrime(z));
	}
	@Test
	public void testBinarySqr0()
	{
		assertEquals(0, Task3.binarySqr(0));
	}
	@Test
	public void testBinarySqr1()
	{
		assertEquals(0, Task3.binarySqr(1));
	}
	@Test
	public void testBinarySqr7()
	{
		assertEquals(2, Task3.binarySqr(7));
	}
	@Test
	public void testBinarySqr16()
	{
		assertEquals(4, Task3.binarySqr(16));
	}
	@Test
	public void testSelectSqr0()
	{
		assertEquals(0, Task3.selectSqr(0));
	}
	@Test
	public void testSelectSqr1()
	{
		assertEquals(0, Task3.selectSqr(1));
	}
	@Test
	public void testtestSelectSqr7()
	{
		assertEquals(2, Task3.selectSqr(7));
	}
	@Test
	public void testtestSelectSqr16()
	{
		assertEquals(4, Task3.selectSqr(16));
	}
	@Test
	public void testBinSqr20()
	{
		assertEquals(0, Task3.binarySqr2(0));
	}
	@Test
	public void testBinSqr21()
	{
		assertEquals(0, Task3.binarySqr2(1));
	}
	@Test
	public void testtestBinSqr27()
	{
		assertEquals(2, Task3.binarySqr2(7));
	}
	@Test
	public void testtestBinSqr216()
	{
		assertEquals(4, Task3.binarySqr2(16));
	}
	@Test
	public void testtestBinSqr2_15()
	{
		assertEquals(3, Task3.binarySqr2(15));
	}
	@Test
	public void testtestBinSqr2_17()
	{
		assertEquals(4, Task3.binarySqr2(17));
	}
	@Test
	public void testFactorial1()
	{
		assertEquals(1, Task4.factorial(1));
	}

	@Test
	public void testFactorial5()
	{
		assertEquals(120, Task4.factorial(5));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial0() 
	{
		Task4.factorial(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialm() 
	{
		Task4.factorial(-5);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial200() 
	{
		Task4.factorial(200);
	}
	@Test
	public void testSumNum1()
	{
		assertEquals(7, Task5.sumNum1(1111111));
	}

	@Test
	public void testSumNum2()
	{
		assertEquals(7, Task5.sumNum2(1111111));
	}
	@Test
	public void testSumNum1m()
	{
		assertEquals(6, Task5.sumNum1(-123));
	}

	@Test
	public void testSumNum2m()
	{
		assertEquals(6, Task5.sumNum2(-123));
	}
	@Test
	public void testSumNum1_0()
	{
		assertEquals(0, Task5.sumNum1(0));
	}

	@Test
	public void testSumNum2_0()
	{
		assertEquals(0, Task5.sumNum2(0));
	}
	@Test
	public void testRevrs1()
	{
		assertEquals(123456, Task6.revrs1(654321));
	}

	@Test
	public void testRevrs2()
	{
		assertEquals(123456, Task6.revrs2(654321));
	}
}

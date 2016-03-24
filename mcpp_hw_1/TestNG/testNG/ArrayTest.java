package testNG;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import hw_1_array.T1Array;
import hw_1_array.T2Array;
import hw_1_array.T3Array;
import hw_1_array.T4Array;
public class ArrayTest
{

	@Test
	public void testfindMin1()
	{
		int[] Arr = {1,4,-100,5};
		assertEquals(-100, T1Array.findMin(Arr));;
	}
	@Test
	public void testfindMin2()
	{
		int[] Arr = {0};
		assertEquals(0, T1Array.findMin(Arr));;
	}
	@Test
	public void testfindMin3()
	{
		int[] Arr = {1,4,10000,5};
		assertEquals(1, T1Array.findMin(Arr));;
	}
	@Test
	public void testfindMin4()
	{
		int[] Arr = {-1,-4,-10000,-5};
		assertEquals(-10000, T1Array.findMin(Arr));;
	}

	@Test
	public void testfindMax1()
	{
		int[] Arr = {1,50,-100,50};
		assertEquals(50, T2Array.findMax(Arr));;
	}
	@Test
	public void testfindMax2()
	{
		int[] Arr = {0};
		assertEquals(0, T2Array.findMax(Arr));;
	}
	@Test
	public void testfindMax3()
	{
		int[] Arr = {1,4,10,5};
		assertEquals(10, T2Array.findMax(Arr));;
	}
	@Test
	public void testfindMax4()
	{
		int[] Arr = {-1,-4,-10,-5};
		assertEquals(-1, T2Array.findMax(Arr));;
	}

	@Test
	public void testMinIndex0()
	{
		assertEquals(2, T3Array.minIndex(new int[]{5,1,-5,-1,0}));
	}
	@Test
	public void testMinIndex2()
	{
		assertEquals(3, T3Array.minIndex(new int[]{5,1,5,-1,0}));
	}
	@Test
	public void testMinIndex4()
	{
		assertEquals(2, T3Array.minIndex(new int[]{5,11,1,1,10}));
	}
	@Test
	public void testMaxIndex0()
	{
		assertEquals(0, T4Array.maxIndex(new int[]{5,1,-5,-1,0}));
	}
	@Test
	public void testMaxIndex2()
	{
		assertEquals(1, T4Array.maxIndex(new int[]{-1,5,1,5,0}));
	}
	@Test
	public void testMaxIndex4()
	{
		assertEquals(4, T4Array.maxIndex(new int[]{5,1,-5,-1,10}));
	}
}

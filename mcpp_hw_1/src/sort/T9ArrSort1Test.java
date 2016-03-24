package sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class T9ArrSort1Test
{
	@Test
	public void testSortNull()
	{
		int[] array = null;
		int [] chechArr = {};
		int [] act = T9ArrSort1.insertionSort(new int[]{})
		assertArrayEquals(,);
	}
	@Test
	public void testSort0()
	{
		assertArrayEquals(new int[]{},T9ArrSort1.insertionSort(new int[]{}));
	}
	@Test
	public void testSort1()
	{
		assertArrayEquals(new int[]{1,2,3},T9ArrSort1.bubbleSort(new int[]{3,1,2}));
	}

	@Test
	public void testSort2()
	{
		assertArrayEquals(new int[]{-3,2,3},T9ArrSort1.bubbleSort(new int[]{-3,3,2}));
	}

	@Test
	public void testSort3()
	{
		assertArrayEquals(new int[]{-3,0,3},T9ArrSort1.bubbleSort(new int[]{0,3,-3}));
	}
	@Test
	public void testSortMany()
	{
		assertArrayEquals(new int[]{-3,0,3,6,7,-20,100},T9ArrSort1.bubbleSort(new int[]{0,3,-3}));
	}
	@Test
	public void testSelectionSort()
	{
		assertArrayEquals(new int[]{-3,0,3},T9ArrSort1.selectionSort(new int[]{0,3,-3}));
	}

}

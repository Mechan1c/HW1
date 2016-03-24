package sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTest
{
	//Sort list = new BubbleSort();
	//Sort list = new QuickSort();
	Sort list = new MergeSort();
	@Test
	public void test_sort0()
	{
		int [] array = {};
		int [] checkArray = {};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort1()
	{
		int [] array = {3};
		int [] checkArray = {3};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort2()
	{
		int [] array = {3,8};
		int [] checkArray = {3,8};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}

	@Test
	public void test_sort_Many()
	{
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {1,2,3,5,7,9};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort_ManyM()
	{
		int [] array = {-3,7,0,1,9,2};
		int [] checkArray = {-3,0,1,2,7,9};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
}

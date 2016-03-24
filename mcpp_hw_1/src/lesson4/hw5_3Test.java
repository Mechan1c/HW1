package lesson4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hw5_3Test
{

	@Test
	public void testCutString1()
	{
		assertEquals("What your name", hw5_3.cutString("What is your name", 4, 3));
	}
	@Test
	public void testCutString2()
	{
		assertEquals("What is your name", hw5_3.cutString("What is your name", 4, 0));
	}
	@Test
	public void testCutString3()
	{
		assertEquals("t is your name", hw5_3.cutString("What is your name", 0, 3));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCutString4() 
	{
		assertEquals("What your name", hw5_3.cutString("What is your name", 102, 3));
	}
	
	@Test
	public void testCountWordsq1()
	{
		assertEquals(4, hw5_3.countWords("What is your name"));
	}
	@Test
	public void testCountWords3()
	{
		assertEquals(4, hw5_3.countWords("What is y'o'u'r name"));
	}
	@Test
	public void testCountWords2()
	{
		assertEquals(3, hw5_3.countWords("What is your,name"));
	}
	@Test  (expected = IllegalArgumentException.class)
	public void testCountWords4()
	{
		assertEquals(0, hw5_3.countWords(""));
	}
	
	@Test
	public void testRemoveDuplicates1()
	{
		assertEquals("qwertyuiop", hw5_3.removeDuplicates("qwertyuiop"));
	}
	@Test
	public void testRemoveDuplicates2()
	{
		assertEquals("qQwer !tyu:iop;", hw5_3.removeDuplicates("qQQqqwwer !!tyu  :iop;"));
	}
	@Test
	public void testRemoveDuplicates3()
	{
		assertEquals("", hw5_3.removeDuplicates(""));
	}
	@Test
	public void testRemoveDuplicates4()
	{
		assertEquals("q", hw5_3.removeDuplicates("q"));
	}
	@Test
	public void testAddSpaces1()
	{
		assertEquals("q; ww; e'r. tyyyy, 1234; 33; 43; ! gg()\\ ", hw5_3.addSpaces("q;ww;e'r.tyyyy,1234; 33;43;!gg()\\ "));
	}
	@Test
	public void testAddSpaces2()
	{
		assertEquals("", hw5_3.addSpaces(""));
	}
	@Test
	public void testAddSpaces3()
	{
		assertEquals(", ", hw5_3.addSpaces(","));
	}
	@Test
	public void testReplaceBy$1()
	{
		assertArrayEquals(new String[] {"froyo", "yoda", "123$$$", "1234567", "asd$$$", "zxc", "rer$$$", "", "int$$$"}, hw5_3.replaceBy$(new String[]{"froyo", "yoda", "123456", "1234567", "asdfgh", "zxc", "rerere", "", "intron"}, 6));
	}
	@Test
	public void testReplaceBy$2()
	{
		assertArrayEquals(new String[] {"fro$$$"}, hw5_3.replaceBy$(new String[]{"froyor"}, 6));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReplaceBy$3()
	{
		assertArrayEquals(new String[] {"froyo", "yoda", "123456", "1234567", "asdfgh", "zxc", "rerere", "", "intron"}, hw5_3.replaceBy$(new String[]{"froyo", "yoda", "123456", "1234567", "asdfgh", "zxc", "rerere", "", "intron"}, 1));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReplaceBy$4()
	{
		assertArrayEquals(new String[] {"froyo", "yoda", "123456", "1234567", "asdfgh", "zxc", "rerere", "", "intron"}, hw5_3.replaceBy$(new String[]{"froyo", "yoda", "123456", "1234567", "asdfgh", "zxc", "rerere", "", "intron"}, 0));
	}
	@Test
	public void testRetLengthOfShortest1()
	{
		assertEquals(2, hw5_3.retLengthOfShortest("What is your name"));
	}
	@Test
	public void testRetLengthOfShortest2()
	{
		assertEquals(4, hw5_3.retLengthOfShortest("What,is your name"));
	}
	@Test
	public void testRetLengthOfShortest3()
	{
		assertEquals(0, hw5_3.retLengthOfShortest(""));
	}
	@Test
	public void testRetLengthOfShortest4()
	{
		assertEquals(1, hw5_3.retLengthOfShortest("W"));
	}

}

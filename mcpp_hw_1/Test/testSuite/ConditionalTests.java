package testSuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hw_1_1conditional.T1ConditionalOps;
import hw_1_1conditional.T2FindFourth;
import hw_1_1conditional.T3SummNat;
import hw_1_1conditional.T4CountStm;
import hw_1_1conditional.T5Grade;

public class ConditionalTests
{

	@Test
	public void testSum()
	{
		int someshit = T1ConditionalOps.count1(-5, 4);
		assertEquals(-1, someshit);
	}
	@Test
	public void testMult()
	{
		int someshit = T1ConditionalOps.count1(6, -5);
		assertEquals(-30, someshit);
	}
	@Test
	public void test1()
	{
		String ts = T2FindFourth.count1(4, 4);
		assertEquals("1", ts);
	}
	@Test
	public void test2()
	{
		String ts = T2FindFourth.count1(-4, 4);
		assertEquals("2", ts);
	}
	@Test
	public void test3()
	{
		String ts = T2FindFourth.count1(-4, -4);
		assertEquals("3", ts);
	}
	@Test
	public void test4()
	{
		String ts = T2FindFourth.count1(4, -4);
		assertEquals("4", ts);
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testZero()
	{
		T2FindFourth.count1(0, 4);
		
	}

	@Test
	public void testSummPPP()
	{
		assertEquals(15, T3SummNat.countSumm(5, 5, 5));
	}
	@Test
	public void testSummPPM()
	{
		assertEquals(10, T3SummNat.countSumm(5, 5, -5));
	}
	@Test
	public void testSummPMM()
	{
		assertEquals(5, T3SummNat.countSumm(5, -5, -5));
	}
	@Test
	public void testSummMPP()
	{
		assertEquals(10, T3SummNat.countSumm(-5, 5, 5));
	}
	@Test
	public void testSummMMP()
	{
		assertEquals(5, T3SummNat.countSumm(-5, -5, 5));
	}
	@Test
	public void testSummMMM()
	{
		assertEquals(0, T3SummNat.countSumm(-5, -5, -5));
	}
	@Test
	public void testSumm()
	{
		assertEquals(0, T3SummNat.countSumm(0, 0, 0));
	}
	@Test
	public void testSummSumm()
	{
		assertEquals(6, T4CountStm.max(1, 1, 1));
	}
	@Test
	public void testSummZero()
	{
		assertEquals(9, T4CountStm.max(0, 3, 3));
	}
	@Test
	public void testSummMult()
	{
		assertEquals(30, T4CountStm.max(3, 3, 3));
	}
	@Test
	public void testSummMinus()
	{
		assertEquals(7, T4CountStm.max(4, 4, -4));
	}
	@Test
	public void testSummZZ3()
	{
		assertEquals(6, T4CountStm.max(0, 0, 3));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSummZZZ()
	{
		T4CountStm.max(0, 0, 0);
	}
	@Test
	public void testFindGradeF1()
	{
		assertEquals('F', T5Grade.findGrade(0));
	}
	@Test
	public void testFindGradeF2()
	{
		assertEquals('F', T5Grade.findGrade(19));
	}
	@Test
	public void testFindGradeE1()
	{
		assertEquals('E', T5Grade.findGrade(20));
	}
	@Test
	public void testFindGradeE2()
	{
		assertEquals('E', T5Grade.findGrade(39));
	}
	@Test
	public void testFindGradeD1()
	{
		assertEquals('D', T5Grade.findGrade(40));
	}
	@Test
	public void testFindGradeD2()
	{
		assertEquals('D', T5Grade.findGrade(59));
	}

	@Test
	public void testFindGradeC1()
	{
		assertEquals('C', T5Grade.findGrade(60));
	}
	@Test
	public void testFindGradeC2()
	{
		assertEquals('C', T5Grade.findGrade(74));
	}
	@Test
	public void testFindGradeB1()
	{
		assertEquals('B', T5Grade.findGrade(75));
	}
	@Test
	public void testFindGradeB2()
	{
		assertEquals('B', T5Grade.findGrade(89));
	}
	@Test
	public void testFindGradeA1()
	{
		assertEquals('A', T5Grade.findGrade(90));
	}
	@Test
	public void testFindGradeA2()
	{
		assertEquals('A', T5Grade.findGrade(100));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindGrade102()
	{
		T5Grade.findGrade(102);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindGradeMinus()
	{
		T5Grade.findGrade(-35);
	}
}

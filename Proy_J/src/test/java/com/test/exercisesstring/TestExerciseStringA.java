package com.test.exercisesstring;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.daloz.j.exercisesstring.ExerciseStringA;

public class TestExerciseStringA
{
	private static ExerciseStringA exerciseStringA;
	
	@BeforeClass
	public static void setUpClass()
	{
		exerciseStringA = new ExerciseStringA();
	}
	
	@Test
	public void testInvestChains()
	{
		Assert.assertEquals("aloh", exerciseStringA.investChains("hola"));
	}
	
	@Test
	public void testCountVocals()
	{
		Assert.assertEquals(new Integer(2), exerciseStringA.countingVowels("hola"));
	}
	
	@Test
	public void testSortVowels()
	{
		Assert.assertEquals("aeiou", exerciseStringA.sortVowels("uoiea"));
	}
	
	@Test
	public void testReplaceVowels()
	{
		Assert.assertEquals("hxlx", exerciseStringA.replaceVowels("hola"));
	}
}

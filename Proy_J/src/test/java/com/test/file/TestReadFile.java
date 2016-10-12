package com.test.file;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.daloz.j.file.ReadFile;

public class TestReadFile
{
	private static ReadFile inputFileReader = new ReadFile();
	private String text = "";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		inputFileReader = new ReadFile();
	}
	
	@After
	public void printText()
	{
		if(text != null)
		{
			System.out.println(text);
		}
	}

	@Test
//	@Ignore
	public void testReadTextFileA()
	{
		text = inputFileReader.readTextFileA("d://textoA.txt");

		Assert.assertNotNull(text);
	}

	@Test
	@Ignore
	public void testReadTextFileB()
	{
		text = inputFileReader.readTextFileB("d://textoB.txt");

		Assert.assertNotNull(text);

	}

}

package com.test.string;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

/**
 * Java:String.valueOf()
 * 
 * Convierte a cadenas los tipos de datos pasados como parámetro. En el caso de
 * que queramos convertir un array de caracteres en una cadena podemos tener una
 * excepción IndexOutOfBoundsException en el caso de que intentemos acceder a un
 * elemento que no exista.
 */
public class TestValueOf
{
	private static Logger logger = Logger.getLogger(TestValueOf.class);

	private String text = "";

	@After
	public void printText()
	{
		if (text != null)
		{
			logger.info(text);
		}
	}

	@Test
	public void testValueOfboolean()
	{
		text = String.valueOf(true);
	}

	@Test
	public void testValueOfchar()
	{
		text = String.valueOf('c');
	}

	@Test
	public void testValueOfint()
	{
		int valor = 5;
		text = String.valueOf(valor);
	}

	@Test
	public void testValueOflong()
	{
		long valor = 4;

		text = String.valueOf(valor);
	}

	@Test
	public void testValueOfArrayChar()
	{
		char[] arrayChar = new char[3];
		arrayChar[0] = 'a';
		arrayChar[1] = 'l';
		arrayChar[2] = 'o';

		text = String.valueOf(arrayChar);
	}

	@Test
	public void testValueOfdouble()
	{
		double valor = 14.5;
		
		text = String.valueOf(valor);
	}
	
	@Test
	public void testValueOffloat()
	{
		float valor = 147;
		
		text = String.valueOf(valor);
	}

	@Test
	public void testValueOfObject()
	{
		Integer integer = new Integer("100");

		text = String.valueOf(integer);
	}
	
	
	@Test
	public void testValueOfArrayCharOffset()
	{
		char[] arrayChar = {'H','o','l','a'};

		/** valueOf(char[] data, int offset, int count) 
			data:  arreglo
			offset: desplazamiento a partir va a empezar la conversión (empieza desde 0).
			count: número de caracteres a convertir de la cadena.
		**/
		text = String.valueOf(arrayChar, 1, 3);
	}

}

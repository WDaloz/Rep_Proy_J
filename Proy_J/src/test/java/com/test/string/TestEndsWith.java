package com.test.string;

import org.junit.Assert;
import org.junit.Test;

public class TestEndsWith
{
	/**
	 * Metodo que verifica si un correo acaba en ".com"
	 */
	@Test
	public void test()
	{
		String email = "cristhianp00@gmail.com";
		/**
		    ** public boolean endsWith(String suffix) **

		    Descripción:
				Comprueba si la cadena termina con el sufijo pasado como parámetro.
				Sintaxis
						
			Parametros:
				suffix, sufijo que va a ser buscado.
				
			Excepciones:
				No lanza.
		 **/
		Assert.assertTrue(email.endsWith(".com"));
	}
}

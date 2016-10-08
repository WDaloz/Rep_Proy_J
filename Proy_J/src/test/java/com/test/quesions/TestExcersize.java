package com.test.quesions;

import org.junit.Ignore;
import org.junit.Test;

public class TestExcersize
{

	@Test
	@Ignore
	public void test01()
	{
		/**
		 * �Que se mostrar�a por pantalla?
		 * 
		 * System.out.println("Hola\nMundo");
		 * 
		 * - "Hola Mundo" 
		 * - "Hola\nMundo" 
		 * - "Hola" y en otra l�nea "Mundo"
		 * - "Hola" un tabulador y "Mundo"
		 * 
		 * Respuesta: 
		 * - "Hola" un tabulador y "Mundo"
		 * 
		 **/

		System.out.println("Hola\nMundo");
	}

	@Test
	@Ignore
	public void test02()
	{
		/**
		 * 
		 * �Qu� muestra el siguiente c�digo fuente por pantalla?
		 * 
		 *		int x = 2;

				switch (x)
				{
				case 1:
					System.out.println("Uno");
					break;
				case 2:
					System.out.println("Dos");
					break;
				case 3:
					System.out.println("Tres");
					break;
				default:
					System.out.println("Otro n�mero");
				}
		 * 
		 * - Uno 
		 * - Dos 
		 * - Tres 
		 * - Otro n�mero
		 * 
		 * Respuesta: - Dos
		 **/

		int x = 2;

		switch (x)
		{
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Otro n�mero");
		}
	}

	@Test
	@Ignore
	public void test03()
	{
		/**
	
		�Cual es el resultado del siguiente programa?

		 int i=1;
		 int j=2;
		 System.out.println ( (i > 1) && (j > 4) ); 
		 
		 - true
		 - false
		 - undefined
		 - No compila el c�digo
		 
		 Respuesta:
		 -false
		 
		 **/
		
		 int i=1;
		 int j=2;
		 
		 System.out.println ( (i > 1) && (j > 4) ); 

	}
	
	@Test
	@Ignore
	public void test04()
	{
		/** �Hace lo mismo el c�digo fuente Uno y el c�digo fuente Dos?
		 
		  - C�digo Uno
		  
			int x= 0;
			do 
			{
			  System.out.println(x);
			  x++;
			} while (x<10);
			
			
			 - C�digo Dos
			 
			int y= 0;
			while (y<10)
			{
			  System.out.println(y);
			  y++;
			}
			
			
			 Alternativas:
			 
			 - No, el primero muestra del 1 al 10 y el segundo del 0 al 9
			 - S�, los dos muestran del 0 al 9
			 - No, el primero muestra del 0 al 9 y el segundo del 1 al 10
			 - S�, los dos muestran del 1 al 10
 
 			Solucion:
			 - S�, los dos muestran del 0 al 9

		 **/
		int x= 0;
		do 
		{
		  System.out.println(x);
		  x++;
		} while (x<10);
		
		int y= 0;
		while (y<10)
		{
		  System.out.println(y);
		  y++;
		}
	}
	
	@Test
	@Ignore
	public void test05()
	{
		/** �Qu� se imprime por pantalla?
		  
		  	int total = 10;
			int contador = 4;
					
			total -= --contador;
			
			System.out.println(total);
		  
		  Alternativas:
		  - 10
		  - 7
		  - 6
		  - 4
		  
		  Solucion:
		  - 7
		  
		  Explicacion:
		  total - =  : representa la cantidad que se le va a descontar a esa variable.
		  --contador : se le va a descontar 1 unidad.
		 **/
	}
	
	@Test
	public void test06()
	{
		System.out.println((10*10)/100);
	}
}

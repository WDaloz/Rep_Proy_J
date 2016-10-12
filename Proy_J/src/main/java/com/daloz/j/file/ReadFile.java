package com.daloz.j.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile
{

	public String readTextFileA(String path)
	{
		StringBuilder text = new StringBuilder();
		String line = "";
		try
		(BufferedReader bufferedReader = new BufferedReader(new FileReader(path)))
		{
			while ((line = bufferedReader.readLine()) != null)
			{
				text.append(line+"\n");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return text.toString();
	}
	
	
	/**
	 * Usando scanner
	 * 
	 * @param path
	 * @return
	 */
	public String readTextFileB(String path)
	{		
		StringBuilder text = new StringBuilder();
		
		//Usando try con recursos
		try
		(Scanner scanner = new Scanner(new File(path)))
		{
			/**
			 * scanner.hasNextLine() =  pregunta si existe una linea de texto despues.
			 * por cada pregunta avanza a la siguiente linea. Devuelve true si existe.
			 * 
			 * scanner.nextLine() = Obtiene el valor de la siguiente linea.
			 */
			while(scanner.hasNextLine())
			{
				text.append(scanner.nextLine()+"\n");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return text.toString();
	}

}

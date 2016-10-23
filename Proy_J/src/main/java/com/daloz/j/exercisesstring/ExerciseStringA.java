package com.daloz.j.exercisesstring;

import java.util.Arrays;

public class ExerciseStringA
{

	public String investChains(String string)
	{
		String chain_ = "";
		
		for (int i = 0; i < string.length(); i++)
		{
			chain_ = string.charAt(i) + chain_;
		}
		
		return chain_;
	}

	public Integer countingVowels(String string)
	{
		string = string.toLowerCase();
		Integer c = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if((string.charAt(i) == 'a') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'o') || (string.charAt(i) == 'u'))
			{
				c++;
			}
		}
		return c;
	}

	public String sortVowels(String string)
	{
		//Convertir la cadena (String) en un arreglo de char.
		char[] vowels = string.toCharArray();
		
		//Ordenamos el arreglo
		Arrays.sort(vowels);
		
		//Convertimos el arreglo de char a cadena.
		return String.valueOf(vowels);
	}

	public String replaceVowels(String string)
	{
		String newString = "";
		
		for (int i = 0; i < string.length(); i++)
		{
			if((string.charAt(i) == 'a') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'o') || (string.charAt(i) == 'u'))
			{
				newString = newString + "x";
			}
			else
			{
				newString = newString + string.charAt(i);
			}
		}
	return newString;
	}
}

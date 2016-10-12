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
		
		char[] vowels = string.toCharArray();
		Arrays.sort(vowels);
		
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

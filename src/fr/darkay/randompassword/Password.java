package fr.darkay.randompassword;

import java.io.IOException;
import java.util.Random;

public class Password
{        
	public static void main(String[] args) throws IOException
	{		    
	    System.out.println(generatePassword(20));
	}
		
	private static char[] generatePassword(int length)
	{
	    String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "&é'(-è_çà)=^$ù*/*-+.!:/;.,?<>µ%£¨";
	    String numbers = "0123456789";
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    
	    Random r = new Random();
	    char[] password = new char[length];
	    
	    password[0] = lowerCaseLetters.charAt(r.nextInt(lowerCaseLetters.length()));
	    password[1] = capitalCaseLetters.charAt(r.nextInt(capitalCaseLetters.length()));
	    password[2] = specialCharacters.charAt(r.nextInt(specialCharacters.length()));
	    password[3] = numbers.charAt(r.nextInt(numbers.length()));
	    
	    for (int i = 4; i < length; i++)
	    {
	        password[i] = combinedChars.charAt(r.nextInt(combinedChars.length()));
	    }
	    
	    return password;
	}
}
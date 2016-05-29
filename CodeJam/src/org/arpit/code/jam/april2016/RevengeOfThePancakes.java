package org.arpit.code.jam.april2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class RevengeOfThePancakes {
	public static String process(BufferedReader br) throws NumberFormatException, IOException {
		String inputString =  br.readLine();
		System.out.println("Input: "+inputString);
		StringBuilder input = new StringBuilder();
		input.append(inputString);
		int i=0;
		while(input.lastIndexOf("-")!=-1 && i<input.length()){
			System.out.println("i="+(++i));
			System.out.println(input);
			flipTillLastBadPancake(input);
		}
		return String.valueOf(i);
	}
	
	private static void flipTillLastBadPancake(StringBuilder input){
		int n = input.lastIndexOf("-");
		System.out.println("Flipping top \""+(n+1)+"\" Pancakes");
		for(int i=0; i<=n ;i++){
			if(input.charAt(i)== '+'){
				input.setCharAt(i, '-');
			}
			else if(input.charAt(i)== '-'){
				input.setCharAt(i, '+');
			}
			else{
				throw new InputMismatchException("input should have only contain +/- but it contained: "+input.charAt(i));
			}
		}
	}
}

package org.arpit.code.jam.april2016;

import java.io.BufferedReader;
import java.io.IOException;

public class CountingSheep {
	
	public static String process(BufferedReader br) throws NumberFormatException, IOException {
		int input = Integer.valueOf(br.readLine());
		System.out.println("Input: "+input);
		boolean digitsHit[] = new boolean[10];
		int i = 1;
		long last = 0;
		long temp = 0;
		if(input==0){
			System.out.println("INSOMNIA");
			return "INSOMNIA";
		}
		while(!checkFalse(digitsHit)){
			temp = input*i++;
			last = temp;
			System.out.println((i-1)+"*N="+last);
			while(temp>0){
				digitsHit[(int) (temp%10)] = true;
				temp = temp/10;
			}
		}
		return String.valueOf(last);
	}

	private static boolean checkFalse(boolean array[]){
		for(int i=0; i<array.length; i++){
			if(array[i]==false){
				return false;
			}
		}
		return true;
	}
}

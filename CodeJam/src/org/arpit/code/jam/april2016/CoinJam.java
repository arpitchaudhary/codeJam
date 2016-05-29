package org.arpit.code.jam.april2016;

import java.io.BufferedReader;
import java.io.IOException;

public class CoinJam {
	public static String process(BufferedReader br) throws NumberFormatException, IOException {
		String inputString =  br.readLine();
		System.out.println("Input: "+inputString);
		String[] temp = inputString.trim().split(" ");
		int N = Integer.valueOf(temp[0]);
		int J = Integer.valueOf(temp[1]);
		StringBuilder outputString = new StringBuilder("\n");
		
		StringBuilder minBinary = new StringBuilder("1");
		StringBuilder maxBinary = new StringBuilder("1");
		for(int i=0; i<N-2; i++){
			minBinary = minBinary.append(0);
			maxBinary = maxBinary.append(1);
		}
		minBinary=minBinary.append(1);
		maxBinary=maxBinary.append(1);	
		
		int min = convertFromBase(minBinary.toString(), 2);
		int max = convertFromBase(maxBinary.toString(), 2);
		int nJamCoinsfound=0;
		
		int intProspectiveJamCoin =0;
		String prospectiveJamCoin = null;
		StringBuilder outputData;
		int divisor = 0;
		int j=2;
		for(int i=min; i<=max; i++){
			prospectiveJamCoin = Integer.toBinaryString(i);
			outputData = new StringBuilder(prospectiveJamCoin);
			divisor = 0;
			j=2;
			for(j =2; j<=10;j++){
				intProspectiveJamCoin = convertFromBase(prospectiveJamCoin,j);
				divisor = findDivisor(intProspectiveJamCoin);
				if(divisor == 0){
					break;
				}
				else{
					outputData.append(" "+divisor);
				}
			}
			if(j>10){
				outputString.append(outputData);
				nJamCoinsfound++;
				if(nJamCoinsfound >=J){
					break;
				}
				else{
					outputString.append("\n");
				}
			}
		}
		
		return outputString.toString();
	}
	
	private static int convertFromBase(String input, int base){
		int output = 0;
		int len = input.length();
		for(int i=0; i<len;i++){
			output = output*base+Character.getNumericValue(input.charAt(i));
		}
		return output;
	}
	
	private static int findDivisor(int input){
		for(int i=2; i<input/2;i++){
			if(input%i==0){
				return i;
			}
		}
		return 0;
	}
}

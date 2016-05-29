package org.arpit.code.jam;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class StoreCredit {
	@SuppressWarnings("unused")
	private static String process(BufferedReader br) throws NumberFormatException, IOException {
		int credit = Integer.valueOf(br.readLine());
		int itemNumber = Integer.valueOf(br.readLine()) ;
		String items = br.readLine();
		String[] itemList = items.trim().split(" ");
		if(itemList.length != itemNumber){
			throw new InputMismatchException("Panga!!--Number of items in list is not equal to item number specified in above line.");
		}
		
		for(int i=0; i<itemNumber-1 ; i++){
			for(int j = i+1; j<itemNumber; j++){
				if(Integer.valueOf(itemList[i])+ Integer.valueOf(itemList[j]) == credit){
					return (i+1)+" "+(j+1);
				}
			}
		}
		return null;
	}

}

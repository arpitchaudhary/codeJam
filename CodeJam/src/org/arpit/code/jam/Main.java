package org.arpit.code.jam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.arpit.code.jam.april2016.CoinJam;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String workingFolder = "C:\\Users\\arpit\\Downloads\\";
		String input = "C-small-attempt0";

		BufferedReader br = new BufferedReader(new FileReader(workingFolder+input + ".in"));
		long testCases = Long.valueOf(br.readLine());

		StringBuilder output = new StringBuilder();
		for(int i =1; i<=testCases; i++){
			System.out.println("=========================Test Case #"+i+"=========================");
			output = output.append("case #"+i+": "+CoinJam.process(br));
			if(i<testCases){
				output.append("\n");
			}
		}
		br.close();
		FileWriter fw = new FileWriter(new File(workingFolder+input+".out"));
		fw.write(output.toString());
		fw.close();

	}
}

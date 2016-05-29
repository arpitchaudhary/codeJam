package org.arpit.code.jam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFiles {

	public static void main(String[] args) throws IOException {
		String workingFolder = "C:\\Users\\arpit\\Downloads\\";
		StringBuilder output = new StringBuilder();
		for(int i=201; i<1000000; i++){
			output.append(i+"\n");
		}
		FileWriter fw = new FileWriter(new File(workingFolder+"temp"+".out"));
		fw.write(output.toString());
		fw.close();
	}

}

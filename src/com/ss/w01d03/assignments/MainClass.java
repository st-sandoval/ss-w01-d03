/**
 * 
 */
package com.ss.w01d03.assignments;

import java.io.File;

/**
 * @author m3
 *
 */
public class MainClass {
	
	static String directoryPath = "./";
	
	static String writeFilePath = "./testtext.txt";
	static String writeText = "this is appended yes yes";

	public static void main(String[] args) {
		DirReader readee = new DirReader();
		
		readee.readDirectory(new File(directoryPath));
		
		Appender appendee = new Appender();
		
		try{
			appendee.appendToFile(writeFilePath, writeText);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

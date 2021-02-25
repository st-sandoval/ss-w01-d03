package com.ss.w01d03.assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;


public class DirReader {
//	String dirName;
//	
//	DirReader(String dirName){
//		try {
//			this.dirName = dirName;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	public String[] readDirectory(final File directory) {
		
		
		ArrayList<String> directoryList = new ArrayList();
		
		for(File entry: directory.listFiles()) {
			System.out.println(entry);
		}
	}
}

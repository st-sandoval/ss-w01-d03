package com.ss.w01d03.assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;


public class DirReader {

	public void readDirectory(File directory) {
		
		ArrayList<String> directoryList = new ArrayList();
		
		for(File entry: directory.listFiles()) {
			System.out.println(entry);
		}
	}
}

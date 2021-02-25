package com.ss.w01d03.assignments;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;

public class Appender {

	public void appendToFile(String filePath, String texto) {
		System.out.println("filePath: " + filePath);
		System.out.println("texto: " + texto);
		
		
		try{
			
			
			
			
			
//			FileWriter writee = new FileWriter(destination);
			FileOutputStream byteOut = new FileOutputStream(filePath);
			OutputStreamWriter writee = new OutputStreamWriter(byteOut);
			writee.write(texto);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

